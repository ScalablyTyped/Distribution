package typings.atAwsDashSdkProtocolDashRest

import typings.atAwsDashSdkTypes.buildHttpMod.HttpResponse
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.BodyParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.ResponseParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.ServiceExceptionParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.StreamCollector
import typings.atAwsDashSdkTypes.buildUtilMod.Decoder
import typings.atAwsDashSdkTypes.buildUtilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-rest/build/RestParser", JSImport.Namespace)
@js.native
object buildRestParserMod extends js.Object {
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
    /**
      * Converts the output of an operation into JavaScript types.
      *
      * @param operation The operation model describing the structure of the HTTP
      *                  response received
      * @param input     The HTTP response received from the service
      */
    /* CompleteClass */
    override def parse[OutputType /* <: MetadataBearer */](operation: OperationModel, input: HttpResponse[StreamType]): js.Promise[OutputType] = js.native
  }
  
}

