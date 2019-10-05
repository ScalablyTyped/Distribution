package typings.atAwsDashSdkProtocolDashQuery

import typings.atAwsDashSdkTypes.buildHttpMod.HttpResponse
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.BodyParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.ResponseParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.ServiceExceptionParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.StreamCollector
import typings.atAwsDashSdkTypes.buildUtilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-query/build/QueryParser", JSImport.Namespace)
@js.native
object buildQueryParserMod extends js.Object {
  @js.native
  class QueryParser[StreamType] protected () extends ResponseParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      parseServiceException: ServiceExceptionParser,
      streamCollector: StreamCollector[StreamType],
      utf8Encoder: Encoder
    ) = this()
    val bodyParser: js.Any = js.native
    val parseServiceException: js.Any = js.native
    var resolveBodyString: js.Any = js.native
    val streamCollector: js.Any = js.native
    var updateMetadata: js.Any = js.native
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

