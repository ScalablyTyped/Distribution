package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServerCertificateRequest extends js.Object {
  /**
    * The new path for the server certificate. Include this only if you are updating the server certificate's path. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var NewPath: js.UndefOr[pathType] = js.native
  /**
    * The new name for the server certificate. Include this only if you are updating the server certificate's name. The name of the certificate cannot contain any spaces. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var NewServerCertificateName: js.UndefOr[serverCertificateNameType] = js.native
  /**
    * The name of the server certificate that you want to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var ServerCertificateName: serverCertificateNameType = js.native
}

object UpdateServerCertificateRequest {
  @scala.inline
  def apply(
    ServerCertificateName: serverCertificateNameType,
    NewPath: pathType = null,
    NewServerCertificateName: serverCertificateNameType = null
  ): UpdateServerCertificateRequest = {
    val __obj = js.Dynamic.literal(ServerCertificateName = ServerCertificateName.asInstanceOf[js.Any])
    if (NewPath != null) __obj.updateDynamic("NewPath")(NewPath.asInstanceOf[js.Any])
    if (NewServerCertificateName != null) __obj.updateDynamic("NewServerCertificateName")(NewServerCertificateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServerCertificateRequest]
  }
}

