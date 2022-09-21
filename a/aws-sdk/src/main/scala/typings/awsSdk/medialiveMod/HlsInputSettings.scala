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
  
  /**
    * Identifies the source for the SCTE-35 messages that MediaLive will ingest. Messages can be ingested from the content segments (in the stream) or from tags in the playlist (the HLS manifest). MediaLive ignores SCTE-35 information in the source that is not selected.
    */
  var Scte35Source: js.UndefOr[HlsScte35SourceType] = js.undefined
}
object HlsInputSettings {
  
  inline def apply(): HlsInputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsInputSettings]
  }
  
  extension [Self <: HlsInputSettings](x: Self) {
    
    inline def setBandwidth(value: integerMin0): Self = StObject.set(x, "Bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "Bandwidth", js.undefined)
    
    inline def setBufferSegments(value: integerMin0): Self = StObject.set(x, "BufferSegments", value.asInstanceOf[js.Any])
    
    inline def setBufferSegmentsUndefined: Self = StObject.set(x, "BufferSegments", js.undefined)
    
    inline def setRetries(value: integerMin0): Self = StObject.set(x, "Retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesUndefined: Self = StObject.set(x, "Retries", js.undefined)
    
    inline def setRetryInterval(value: integerMin0): Self = StObject.set(x, "RetryInterval", value.asInstanceOf[js.Any])
    
    inline def setRetryIntervalUndefined: Self = StObject.set(x, "RetryInterval", js.undefined)
    
    inline def setScte35Source(value: HlsScte35SourceType): Self = StObject.set(x, "Scte35Source", value.asInstanceOf[js.Any])
    
    inline def setScte35SourceUndefined: Self = StObject.set(x, "Scte35Source", js.undefined)
  }
}
