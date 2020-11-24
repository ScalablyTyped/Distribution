package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsMediaStoreSettings extends js.Object {
  
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
  implicit class HlsMediaStoreSettingsOps[Self <: HlsMediaStoreSettings] (val x: Self) extends AnyVal {
    
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
    def setMediaStoreStorageClass(value: HlsMediaStoreStorageClass): Self = this.set("MediaStoreStorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaStoreStorageClass: Self = this.set("MediaStoreStorageClass", js.undefined)
    
    @scala.inline
    def setNumRetries(value: integerMin0): Self = this.set("NumRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumRetries: Self = this.set("NumRetries", js.undefined)
    
    @scala.inline
    def setRestartDelay(value: integerMin0Max15): Self = this.set("RestartDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestartDelay: Self = this.set("RestartDelay", js.undefined)
  }
}
