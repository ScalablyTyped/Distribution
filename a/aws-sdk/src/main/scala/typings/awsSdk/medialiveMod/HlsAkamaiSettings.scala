package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsAkamaiSettings extends StObject {
  
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
  implicit class HlsAkamaiSettingsMutableBuilder[Self <: HlsAkamaiSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionRetryInterval(value: integerMin0): Self = StObject.set(x, "ConnectionRetryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionRetryIntervalUndefined: Self = StObject.set(x, "ConnectionRetryInterval", js.undefined)
    
    @scala.inline
    def setFilecacheDuration(value: integerMin0Max600): Self = StObject.set(x, "FilecacheDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilecacheDurationUndefined: Self = StObject.set(x, "FilecacheDuration", js.undefined)
    
    @scala.inline
    def setHttpTransferMode(value: HlsAkamaiHttpTransferMode): Self = StObject.set(x, "HttpTransferMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpTransferModeUndefined: Self = StObject.set(x, "HttpTransferMode", js.undefined)
    
    @scala.inline
    def setNumRetries(value: integerMin0): Self = StObject.set(x, "NumRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumRetriesUndefined: Self = StObject.set(x, "NumRetries", js.undefined)
    
    @scala.inline
    def setRestartDelay(value: integerMin0Max15): Self = StObject.set(x, "RestartDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartDelayUndefined: Self = StObject.set(x, "RestartDelay", js.undefined)
    
    @scala.inline
    def setSalt(value: string): Self = StObject.set(x, "Salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltUndefined: Self = StObject.set(x, "Salt", js.undefined)
    
    @scala.inline
    def setToken(value: string): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "Token", js.undefined)
  }
}
