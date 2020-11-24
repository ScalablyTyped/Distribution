package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsAkamaiSettings extends js.Object {
  
  /**
    * Number of seconds to wait before retrying connection to the CDN if the connection is lost.
    */
  var ConnectionRetryInterval: js.UndefOr[integerMin0] = js.native
  
  /**
    * Size in seconds of file cache for streaming outputs.
    */
  var FilecacheDuration: js.UndefOr[integerMin0Max600] = js.native
  
  /**
    * Specify whether or not to use chunked transfer encoding to Akamai. User should contact Akamai to enable this feature.
    */
  var HttpTransferMode: js.UndefOr[HlsAkamaiHttpTransferMode] = js.native
  
  /**
    * Number of retry attempts that will be made before the Live Event is put into an error state.
    */
  var NumRetries: js.UndefOr[integerMin0] = js.native
  
  /**
    * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
    */
  var RestartDelay: js.UndefOr[integerMin0Max15] = js.native
  
  /**
    * Salt for authenticated Akamai.
    */
  var Salt: js.UndefOr[string] = js.native
  
  /**
    * Token parameter for authenticated akamai. If not specified, _gda_ is used.
    */
  var Token: js.UndefOr[string] = js.native
}
object HlsAkamaiSettings {
  
  @scala.inline
  def apply(): HlsAkamaiSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsAkamaiSettings]
  }
  
  @scala.inline
  implicit class HlsAkamaiSettingsOps[Self <: HlsAkamaiSettings] (val x: Self) extends AnyVal {
    
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
    def setConnectionRetryInterval(value: integerMin0): Self = this.set("ConnectionRetryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionRetryInterval: Self = this.set("ConnectionRetryInterval", js.undefined)
    
    @scala.inline
    def setFilecacheDuration(value: integerMin0Max600): Self = this.set("FilecacheDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilecacheDuration: Self = this.set("FilecacheDuration", js.undefined)
    
    @scala.inline
    def setHttpTransferMode(value: HlsAkamaiHttpTransferMode): Self = this.set("HttpTransferMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpTransferMode: Self = this.set("HttpTransferMode", js.undefined)
    
    @scala.inline
    def setNumRetries(value: integerMin0): Self = this.set("NumRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumRetries: Self = this.set("NumRetries", js.undefined)
    
    @scala.inline
    def setRestartDelay(value: integerMin0Max15): Self = this.set("RestartDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestartDelay: Self = this.set("RestartDelay", js.undefined)
    
    @scala.inline
    def setSalt(value: string): Self = this.set("Salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalt: Self = this.set("Salt", js.undefined)
    
    @scala.inline
    def setToken(value: string): Self = this.set("Token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("Token", js.undefined)
  }
}
