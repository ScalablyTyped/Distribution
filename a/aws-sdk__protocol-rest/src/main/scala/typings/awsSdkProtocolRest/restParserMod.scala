package typings.awsSdkProtocolRest

import typings.awsSdkTypes.unmarshallerMod.BodyParser
import typings.awsSdkTypes.unmarshallerMod.ResponseParser
import typings.awsSdkTypes.unmarshallerMod.ServiceExceptionParser
import typings.awsSdkTypes.unmarshallerMod.StreamCollector
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-rest/build/RestParser", JSImport.Namespace)
@js.native
object restParserMod extends js.Object {
  @js.native
  class RestParser[StreamType] protected () extends ResponseParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      bodyCollector: StreamCollector[StreamType],
      parseServiceException: ServiceExceptionParser,
      utf8Encoder: Encoder,
      base64Decoder: Decoder
    ) = this()
    val base64Decoder: js.Any = js.native
    val bodyCollector: js.Any = js.native
    val bodyParser: js.Any = js.native
    var parseBody: js.Any = js.native
    var parseHeaders: js.Any = js.native
    var parseScalarBody: js.Any = js.native
    var parseScalarHeader: js.Any = js.native
    val parseServiceException: js.Any = js.native
    var parseStatusCode: js.Any = js.native
    var resolveBody: js.Any = js.native
    var resolveBodyString: js.Any = js.native
    var responseIsSuccessful: js.Any = js.native
    val utf8Encoder: js.Any = js.native
  }
  
}

