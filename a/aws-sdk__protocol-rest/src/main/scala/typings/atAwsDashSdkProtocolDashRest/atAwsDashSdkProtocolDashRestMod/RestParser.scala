package typings.atAwsDashSdkProtocolDashRest.atAwsDashSdkProtocolDashRestMod

import typings.atAwsDashSdkTypes.buildUnmarshallerMod.BodyParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.ServiceExceptionParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.StreamCollector
import typings.atAwsDashSdkTypes.buildUtilMod.Decoder
import typings.atAwsDashSdkTypes.buildUtilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-rest", "RestParser")
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

