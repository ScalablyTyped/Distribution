package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsInputSettings extends js.Object {
  
  /**
    * When specified the HLS stream with the m3u8 BANDWIDTH that most closely matches this value will be chosen, otherwise the highest bandwidth stream in the m3u8 will be chosen.  The bitrate is specified in bits per second, as in an HLS manifest.
    */
  var Bandwidth: js.UndefOr[integerMin0] = js.native
  
  /**
    * When specified, reading of the HLS input will begin this many buffer segments from the end (most recently written segment).  When not specified, the HLS input will begin with the first segment specified in the m3u8.
    */
  var BufferSegments: js.UndefOr[integerMin0] = js.native
  
  /**
    * The number of consecutive times that attempts to read a manifest or segment must fail before the input is considered unavailable.
    */
  var Retries: js.UndefOr[integerMin0] = js.native
  
  /**
    * The number of seconds between retries when an attempt to read a manifest or segment fails.
    */
  var RetryInterval: js.UndefOr[integerMin0] = js.native
}
object HlsInputSettings {
  
  @scala.inline
  def apply(): HlsInputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsInputSettings]
  }
  
  @scala.inline
  implicit class HlsInputSettingsOps[Self <: HlsInputSettings] (val x: Self) extends AnyVal {
    
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
    def setBandwidth(value: integerMin0): Self = this.set("Bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidth: Self = this.set("Bandwidth", js.undefined)
    
    @scala.inline
    def setBufferSegments(value: integerMin0): Self = this.set("BufferSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferSegments: Self = this.set("BufferSegments", js.undefined)
    
    @scala.inline
    def setRetries(value: integerMin0): Self = this.set("Retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetries: Self = this.set("Retries", js.undefined)
    
    @scala.inline
    def setRetryInterval(value: integerMin0): Self = this.set("RetryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryInterval: Self = this.set("RetryInterval", js.undefined)
  }
}
