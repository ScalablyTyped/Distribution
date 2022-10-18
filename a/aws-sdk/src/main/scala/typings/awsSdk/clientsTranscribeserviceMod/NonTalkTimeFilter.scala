package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonTalkTimeFilter extends StObject {
  
  /**
    * Allows you to specify a time range (in milliseconds) in your audio, during which you want to search for a period of silence. See for more detail.
    */
  var AbsoluteTimeRange: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.AbsoluteTimeRange] = js.undefined
  
  /**
    * Set to TRUE to flag periods of speech. Set to FALSE to flag periods of silence
    */
  var Negate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows you to specify a time range (in percentage) in your media file, during which you want to search for a period of silence. See for more detail.
    */
  var RelativeTimeRange: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.RelativeTimeRange] = js.undefined
  
  /**
    * Specify the duration, in milliseconds, of the period of silence you want to flag. For example, you can flag a silent period that lasts 30000 milliseconds.
    */
  var Threshold: js.UndefOr[TimestampMilliseconds] = js.undefined
}
object NonTalkTimeFilter {
  
  inline def apply(): NonTalkTimeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonTalkTimeFilter]
  }
  
  extension [Self <: NonTalkTimeFilter](x: Self) {
    
    inline def setAbsoluteTimeRange(value: AbsoluteTimeRange): Self = StObject.set(x, "AbsoluteTimeRange", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteTimeRangeUndefined: Self = StObject.set(x, "AbsoluteTimeRange", js.undefined)
    
    inline def setNegate(value: Boolean): Self = StObject.set(x, "Negate", value.asInstanceOf[js.Any])
    
    inline def setNegateUndefined: Self = StObject.set(x, "Negate", js.undefined)
    
    inline def setRelativeTimeRange(value: RelativeTimeRange): Self = StObject.set(x, "RelativeTimeRange", value.asInstanceOf[js.Any])
    
    inline def setRelativeTimeRangeUndefined: Self = StObject.set(x, "RelativeTimeRange", js.undefined)
    
    inline def setThreshold(value: TimestampMilliseconds): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "Threshold", js.undefined)
  }
}
