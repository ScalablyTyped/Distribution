package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsInputSettings extends StObject {
  
  /**
    * When specified the HLS stream with the m3u8 BANDWIDTH that most closely matches this value will be chosen, otherwise the highest bandwidth stream in the m3u8 will be chosen.  The bitrate is specified in bits per second, as in an HLS manifest.
    */
  var Bandwidth: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * When specified, reading of the HLS input will begin this many buffer segments from the end (most recently written segment).  When not specified, the HLS input will begin with the first segment specified in the m3u8.
    */
  var BufferSegments: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * The number of consecutive times that attempts to read a manifest or segment must fail before the input is considered unavailable.
    */
  var Retries: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * The number of seconds between retries when an attempt to read a manifest or segment fails.
    */
  var RetryInterval: js.UndefOr[integerMin0] = js.undefined
}
object HlsInputSettings {
  
  @scala.inline
  def apply(): HlsInputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsInputSettings]
  }
  
  @scala.inline
  implicit class HlsInputSettingsMutableBuilder[Self <: HlsInputSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidth(value: integerMin0): Self = StObject.set(x, "Bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthUndefined: Self = StObject.set(x, "Bandwidth", js.undefined)
    
    @scala.inline
    def setBufferSegments(value: integerMin0): Self = StObject.set(x, "BufferSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferSegmentsUndefined: Self = StObject.set(x, "BufferSegments", js.undefined)
    
    @scala.inline
    def setRetries(value: integerMin0): Self = StObject.set(x, "Retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetriesUndefined: Self = StObject.set(x, "Retries", js.undefined)
    
    @scala.inline
    def setRetryInterval(value: integerMin0): Self = StObject.set(x, "RetryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryIntervalUndefined: Self = StObject.set(x, "RetryInterval", js.undefined)
  }
}
