package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsWebdavSettings extends StObject {
  
  /**
    * Number of seconds to wait before retrying connection to the CDN if the connection is lost.
    */
  var ConnectionRetryInterval: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * Size in seconds of file cache for streaming outputs.
    */
  var FilecacheDuration: js.UndefOr[integerMin0Max600] = js.undefined
  
  /**
    * Specify whether or not to use chunked transfer encoding to WebDAV.
    */
  var HttpTransferMode: js.UndefOr[HlsWebdavHttpTransferMode] = js.undefined
  
  /**
    * Number of retry attempts that will be made before the Live Event is put into an error state.
    */
  var NumRetries: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
    */
  var RestartDelay: js.UndefOr[integerMin0Max15] = js.undefined
}
object HlsWebdavSettings {
  
  @scala.inline
  def apply(): HlsWebdavSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsWebdavSettings]
  }
  
  @scala.inline
  implicit class HlsWebdavSettingsMutableBuilder[Self <: HlsWebdavSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionRetryInterval(value: integerMin0): Self = StObject.set(x, "ConnectionRetryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionRetryIntervalUndefined: Self = StObject.set(x, "ConnectionRetryInterval", js.undefined)
    
    @scala.inline
    def setFilecacheDuration(value: integerMin0Max600): Self = StObject.set(x, "FilecacheDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilecacheDurationUndefined: Self = StObject.set(x, "FilecacheDuration", js.undefined)
    
    @scala.inline
    def setHttpTransferMode(value: HlsWebdavHttpTransferMode): Self = StObject.set(x, "HttpTransferMode", value.asInstanceOf[js.Any])
    
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
  }
}
