package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInputSettings extends js.Object {
  
  /**
    * Specifies HLS input settings when the uri is for a HLS manifest.
    */
  var HlsInputSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsInputSettings] = js.native
  
  /**
    * Check HTTPS server certificates. When set to checkCryptographyOnly, cryptography in the certificate will be checked, but not the server's name. Certain subdomains (notably S3 buckets that use dots in the bucket name) do not strictly match the corresponding certificate's wildcard pattern and would otherwise cause the event to error. This setting is ignored for protocols that do not use https.
    */
  var ServerValidation: js.UndefOr[NetworkInputServerValidation] = js.native
}
object NetworkInputSettings {
  
  @scala.inline
  def apply(): NetworkInputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInputSettings]
  }
  
  @scala.inline
  implicit class NetworkInputSettingsOps[Self <: NetworkInputSettings] (val x: Self) extends AnyVal {
    
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
    def setHlsInputSettings(value: HlsInputSettings): Self = this.set("HlsInputSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHlsInputSettings: Self = this.set("HlsInputSettings", js.undefined)
    
    @scala.inline
    def setServerValidation(value: NetworkInputServerValidation): Self = this.set("ServerValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerValidation: Self = this.set("ServerValidation", js.undefined)
  }
}
