package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadServerCertificateResponse extends js.Object {
  /**
    * The meta information of the uploaded server certificate without its certificate body, certificate chain, and private key.
    */
  var ServerCertificateMetadata: js.UndefOr[typings.awsSdk.iamMod.ServerCertificateMetadata] = js.native
}

object UploadServerCertificateResponse {
  @scala.inline
  def apply(ServerCertificateMetadata: ServerCertificateMetadata = null): UploadServerCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (ServerCertificateMetadata != null) __obj.updateDynamic("ServerCertificateMetadata")(ServerCertificateMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadServerCertificateResponse]
  }
}

