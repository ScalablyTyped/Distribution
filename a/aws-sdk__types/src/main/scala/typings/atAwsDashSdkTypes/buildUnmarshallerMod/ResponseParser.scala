package typings.atAwsDashSdkTypes.buildUnmarshallerMod

import typings.atAwsDashSdkTypes.buildHttpMod.HttpResponse
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseParser[StreamType] extends js.Object {
  /**
    * Converts the output of an operation into JavaScript types.
    *
    * @param operation The operation model describing the structure of the HTTP
    *                  response received
    * @param input     The HTTP response received from the service
    */
  def parse[OutputType /* <: MetadataBearer */](operation: OperationModel, input: HttpResponse[StreamType]): js.Promise[OutputType]
}

object ResponseParser {
  @scala.inline
  def apply[StreamType](parse: (OperationModel, HttpResponse[StreamType]) => js.Promise[js.Any]): ResponseParser[StreamType] = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse))
  
    __obj.asInstanceOf[ResponseParser[StreamType]]
  }
}

