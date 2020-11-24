package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpekeKeyProviderCmaf extends js.Object {
  
  /**
    * If you want your key provider to encrypt the content keys that it provides to MediaConvert, set up a certificate with a master key using AWS Certificate Manager. Specify the certificate's Amazon Resource Name (ARN) here.
    */
  var CertificateArn: js.UndefOr[stringPatternArnAwsUsGovAcm] = js.native
  
  /**
    * Specify the DRM system IDs that you want signaled in the DASH manifest that MediaConvert creates as part of this CMAF package. The DASH manifest can currently signal up to three system IDs. For more information, see https://dashif.org/identifiers/content_protection/.
    */
  var DashSignaledSystemIds: js.UndefOr[listOfStringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.native
  
  /**
    * Specify the DRM system ID that you want signaled in the HLS manifest that MediaConvert creates as part of this CMAF package. The HLS manifest can currently signal only one system ID. For more information, see https://dashif.org/identifiers/content_protection/.
    */
  var HlsSignaledSystemIds: js.UndefOr[listOfStringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.native
  
  /**
    * Specify the resource ID that your SPEKE-compliant key provider uses to identify this content.
    */
  var ResourceId: js.UndefOr[stringPatternW] = js.native
  
  /**
    * Specify the URL to the key server that your SPEKE-compliant DRM key provider uses to provide keys for encrypting your content.
    */
  var Url: js.UndefOr[stringPatternHttps] = js.native
}
object SpekeKeyProviderCmaf {
  
  @scala.inline
  def apply(): SpekeKeyProviderCmaf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpekeKeyProviderCmaf]
  }
  
  @scala.inline
  implicit class SpekeKeyProviderCmafOps[Self <: SpekeKeyProviderCmaf] (val x: Self) extends AnyVal {
    
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
    def setCertificateArn(value: stringPatternArnAwsUsGovAcm): Self = this.set("CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateArn: Self = this.set("CertificateArn", js.undefined)
    
    @scala.inline
    def setDashSignaledSystemIdsVarargs(value: stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12*): Self = this.set("DashSignaledSystemIds", js.Array(value :_*))
    
    @scala.inline
    def setDashSignaledSystemIds(value: listOfStringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12): Self = this.set("DashSignaledSystemIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashSignaledSystemIds: Self = this.set("DashSignaledSystemIds", js.undefined)
    
    @scala.inline
    def setHlsSignaledSystemIdsVarargs(value: stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12*): Self = this.set("HlsSignaledSystemIds", js.Array(value :_*))
    
    @scala.inline
    def setHlsSignaledSystemIds(value: listOfStringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12): Self = this.set("HlsSignaledSystemIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHlsSignaledSystemIds: Self = this.set("HlsSignaledSystemIds", js.undefined)
    
    @scala.inline
    def setResourceId(value: stringPatternW): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    
    @scala.inline
    def setUrl(value: stringPatternHttps): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
}
