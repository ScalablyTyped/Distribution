package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCustomKeyStoreRequest extends js.Object {
  
  /**
    * Identifies the AWS CloudHSM cluster for the custom key store. Enter the cluster ID of any active AWS CloudHSM cluster that is not already associated with a custom key store. To find the cluster ID, use the DescribeClusters operation.
    */
  var CloudHsmClusterId: CloudHsmClusterIdType = js.native
  
  /**
    * Specifies a friendly name for the custom key store. The name must be unique in your AWS account.
    */
  var CustomKeyStoreName: CustomKeyStoreNameType = js.native
  
  /**
    * Enter the password of the  kmsuser crypto user (CU) account in the specified AWS CloudHSM cluster. AWS KMS logs into the cluster as this user to manage key material on your behalf. The password must be a string of 7 to 32 characters. Its value is case sensitive. This parameter tells AWS KMS the kmsuser account password; it does not change the password in the AWS CloudHSM cluster.
    */
  var KeyStorePassword: KeyStorePasswordType = js.native
  
  /**
    * Enter the content of the trust anchor certificate for the cluster. This is the content of the customerCA.crt file that you created when you initialized the cluster.
    */
  var TrustAnchorCertificate: TrustAnchorCertificateType = js.native
}
object CreateCustomKeyStoreRequest {
  
  @scala.inline
  def apply(
    CloudHsmClusterId: CloudHsmClusterIdType,
    CustomKeyStoreName: CustomKeyStoreNameType,
    KeyStorePassword: KeyStorePasswordType,
    TrustAnchorCertificate: TrustAnchorCertificateType
  ): CreateCustomKeyStoreRequest = {
    val __obj = js.Dynamic.literal(CloudHsmClusterId = CloudHsmClusterId.asInstanceOf[js.Any], CustomKeyStoreName = CustomKeyStoreName.asInstanceOf[js.Any], KeyStorePassword = KeyStorePassword.asInstanceOf[js.Any], TrustAnchorCertificate = TrustAnchorCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomKeyStoreRequest]
  }
  
  @scala.inline
  implicit class CreateCustomKeyStoreRequestOps[Self <: CreateCustomKeyStoreRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloudHsmClusterId(value: CloudHsmClusterIdType): Self = this.set("CloudHsmClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomKeyStoreName(value: CustomKeyStoreNameType): Self = this.set("CustomKeyStoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyStorePassword(value: KeyStorePasswordType): Self = this.set("KeyStorePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustAnchorCertificate(value: TrustAnchorCertificateType): Self = this.set("TrustAnchorCertificate", value.asInstanceOf[js.Any])
  }
}
