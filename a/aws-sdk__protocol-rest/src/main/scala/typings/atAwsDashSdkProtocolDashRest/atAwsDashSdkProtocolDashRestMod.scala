package typings.atAwsDashSdkProtocolDashRest

import typings.atAwsDashSdkTypes.buildHttpMod.HttpEndpoint
import typings.atAwsDashSdkTypes.buildMarshallerMod.BodySerializer
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.BodyParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.ServiceExceptionParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.StreamCollector
import typings.atAwsDashSdkTypes.buildUtilMod.Decoder
import typings.atAwsDashSdkTypes.buildUtilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-rest", JSImport.Namespace)
@js.native
object atAwsDashSdkProtocolDashRestMod extends js.Object {
  @js.native
  class RestParser[StreamType] protected ()
    extends typings.atAwsDashSdkProtocolDashRest.buildRestParserMod.RestParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      bodyCollector: StreamCollector[StreamType],
      parseServiceException: ServiceExceptionParser,
      utf8Encoder: Encoder,
      base64Decoder: Decoder
    ) = this()
  }
  
  @js.native
  class RestSerializer[StreamType] protected ()
    extends typings.atAwsDashSdkProtocolDashRest.buildRestSerializerMod.RestSerializer[StreamType] {
    def this(
      endpoint: HttpEndpoint,
      bodySerializer: BodySerializer[String],
      base64Encoder: Encoder,
      utf8Decoder: Decoder
    ) = this()
  }
  
}

