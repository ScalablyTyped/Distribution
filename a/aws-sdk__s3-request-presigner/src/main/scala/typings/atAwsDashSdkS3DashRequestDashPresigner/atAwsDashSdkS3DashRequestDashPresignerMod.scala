package typings.atAwsDashSdkS3DashRequestDashPresigner

import typings.atAwsDashSdkS3DashRequestDashPresigner.atAwsDashSdkS3DashRequestDashPresignerMod.Omit
import typings.atAwsDashSdkS3DashRequestDashPresigner.atAwsDashSdkS3DashRequestDashPresignerMod.PartialBy
import typings.atAwsDashSdkS3DashRequestDashPresigner.atAwsDashSdkS3DashRequestDashPresignerStrings.service
import typings.atAwsDashSdkS3DashRequestDashPresigner.atAwsDashSdkS3DashRequestDashPresignerStrings.uriEscapePath
import typings.atAwsDashSdkSignatureDashV4.buildSignatureV4Mod.SignatureV4CryptoInit
import typings.atAwsDashSdkSignatureDashV4.buildSignatureV4Mod.SignatureV4Init
import typings.atAwsDashSdkTypes.buildSignatureMod.RequestPresigner
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/s3-request-presigner", JSImport.Namespace)
@js.native
object atAwsDashSdkS3DashRequestDashPresignerMod extends js.Object {
  @js.native
  class S3RequestPresigner protected () extends RequestPresigner {
    def this(hasServiceUriEscapePathRest: PartialBy[SignatureV4Init with SignatureV4CryptoInit, service | uriEscapePath]) = this()
    val signer: js.Any = js.native
  }
  
  /**
    * PartialBy<T, K> makes properties specified in K optional in interface T
    * see: https://stackoverflow.com/questions/43159887/make-a-single-property-optional-in-typescript
    * */
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type PartialBy[T, K /* <: String */] = (Omit[T, K]) with (Partial[Pick[T, K]])
}

