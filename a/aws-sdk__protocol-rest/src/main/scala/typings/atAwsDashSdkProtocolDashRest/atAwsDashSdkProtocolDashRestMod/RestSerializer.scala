package typings.atAwsDashSdkProtocolDashRest.atAwsDashSdkProtocolDashRestMod

import typings.atAwsDashSdkTypes.buildHttpMod.HttpEndpoint
import typings.atAwsDashSdkTypes.buildMarshallerMod.BodySerializer
import typings.atAwsDashSdkTypes.buildUtilMod.Decoder
import typings.atAwsDashSdkTypes.buildUtilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-rest", "RestSerializer")
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

