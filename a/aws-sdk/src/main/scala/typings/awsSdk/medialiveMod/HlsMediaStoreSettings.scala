package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsMediaStoreSettings extends StObject {
  
  /**
    * Number of seconds to wait before retrying connection to the CDN if the connection is lost.
    */
  var ConnectionRetryInterval: js.UndefOr[integerMin0] = js.native
  
  /**
    * Size in seconds of file cache for streaming outputs.
    */
  var FilecacheDuration: js.UndefOr[integerMin0Max600] = js.native
  
  /**
    * When set to temporal, output files are stored in non-persistent memory for faster reading and writing.
    */
  var MediaStoreStorageClass: js.UndefOr[HlsMediaStoreStorageClass] = js.native
  
  /**
    * Number of retry attempts that will be made before the Live Event is put into an error state.
    */
  var NumRetries: js.UndefOr[integerMin0] = js.native
  
  /**
    * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
    */
  var RestartDelay: js.UndefOr[integerMin0Max15] = js.native
}
object HlsMediaStoreSettings {
  
  @scala.inline
  def apply(): HlsMediaStoreSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsMediaStoreSettings]
  }
  
  @scala.inline
  implicit class HlsMediaStoreSettingsMutableBuilder[Self <: HlsMediaStoreSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionRetryInterval(value: integerMin0): Self = StObject.set(x, "ConnectionRetryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionRetryIntervalUndefined: Self = StObject.set(x, "ConnectionRetryInterval", js.undefined)
    
    @scala.inline
    def setFilecacheDuration(value: integerMin0Max600): Self = StObject.set(x, "FilecacheDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilecacheDurationUndefined: Self = StObject.set(x, "FilecacheDuration", js.undefined)
    
    @scala.inline
    def setMediaStoreStorageClass(value: HlsMediaStoreStorageClass): Self = StObject.set(x, "MediaStoreStorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaStoreStorageClassUndefined: Self = StObject.set(x, "MediaStoreStorageClass", js.undefined)
    
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
