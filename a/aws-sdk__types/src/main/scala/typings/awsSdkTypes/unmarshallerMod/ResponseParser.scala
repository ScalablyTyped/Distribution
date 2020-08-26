package typings.awsSdkTypes.unmarshallerMod

import typings.awsSdkTypes.httpMod.HttpResponse
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseParser[StreamType] extends js.Object {
  /**
    * Converts the output of an operation into JavaScript types.
    *
    * @param operation The operation model describing the structure of the HTTP
    *                  response received
    * @param input     The HTTP response received from the service
    */
  def parse[OutputType /* <: MetadataBearer */](operation: OperationModel, input: HttpResponse[StreamType]): js.Promise[OutputType] = js.native
}

object ResponseParser {
  @scala.inline
  def apply[StreamType](parse: (OperationModel, HttpResponse[StreamType]) => js.Promise[js.Any]): ResponseParser[StreamType] = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[ResponseParser[StreamType]]
  }
  @scala.inline
  implicit class ResponseParserOps[Self <: ResponseParser[_], StreamType] (val x: Self with ResponseParser[StreamType]) extends AnyVal {
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
    def setParse(value: (OperationModel, HttpResponse[StreamType]) => js.Promise[js.Any]): Self = this.set("parse", js.Any.fromFunction2(value))
  }
  
}

