package typings.atAwsDashSdkS3DashRequestDashPresigner.atAwsDashSdkS3DashRequestDashPresignerMod

import typings.atAwsDashSdkS3DashRequestDashPresigner.atAwsDashSdkS3DashRequestDashPresignerStrings.service
import typings.atAwsDashSdkS3DashRequestDashPresigner.atAwsDashSdkS3DashRequestDashPresignerStrings.uriEscapePath
import typings.atAwsDashSdkSignatureDashV4.buildSignatureV4Mod.SignatureV4CryptoInit
import typings.atAwsDashSdkSignatureDashV4.buildSignatureV4Mod.SignatureV4Init
import typings.atAwsDashSdkTypes.buildSignatureMod.RequestPresigner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/s3-request-presigner", "S3RequestPresigner")
@js.native
class S3RequestPresigner protected () extends RequestPresigner {
  def this(hasServiceUriEscapePathRest: PartialBy[SignatureV4Init with SignatureV4CryptoInit, service | uriEscapePath]) = this()
  val signer: js.Any = js.native
}

