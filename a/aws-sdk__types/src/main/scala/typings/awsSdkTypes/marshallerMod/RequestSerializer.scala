package typings.awsSdkTypes.marshallerMod

import typings.awsSdkTypes.httpMod.HttpRequest
import typings.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestSerializer[StreamType] extends js.Object {
  /**
    * Converts the provided `input` into an HTTP request
    *
    * @param operation The operation to be executed via the returned HTTP
    *                  request.
    * @param input     The user input to serialize.
    */
  def serialize(operation: OperationModel, input: js.Any): HttpRequest[StreamType]
}

object RequestSerializer {
  @scala.inline
  def apply[StreamType](serialize: (OperationModel, js.Any) => HttpRequest[StreamType]): RequestSerializer[StreamType] = {
    val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction2(serialize))
    __obj.asInstanceOf[RequestSerializer[StreamType]]
  }
}

