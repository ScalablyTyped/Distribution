package typings.awsSdkTypes.marshallerMod

import typings.awsSdkTypes.httpMod.HttpRequest
import typings.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestSerializer[StreamType] extends js.Object {
  /**
    * Converts the provided `input` into an HTTP request
    *
    * @param operation The operation to be executed via the returned HTTP
    *                  request.
    * @param input     The user input to serialize.
    */
  def serialize(operation: OperationModel, input: js.Any): HttpRequest[StreamType] = js.native
}

object RequestSerializer {
  @scala.inline
  def apply[StreamType](serialize: (OperationModel, js.Any) => HttpRequest[StreamType]): RequestSerializer[StreamType] = {
    val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction2(serialize))
    __obj.asInstanceOf[RequestSerializer[StreamType]]
  }
  @scala.inline
  implicit class RequestSerializerOps[Self <: RequestSerializer[_], StreamType] (val x: Self with RequestSerializer[StreamType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSerialize(value: (OperationModel, js.Any) => HttpRequest[StreamType]): Self = this.set("serialize", js.Any.fromFunction2(value))
  }
  
}

