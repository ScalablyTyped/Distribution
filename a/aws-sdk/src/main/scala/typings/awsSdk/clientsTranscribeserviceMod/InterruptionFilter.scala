package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterruptionFilter extends StObject {
  
  /**
    * Allows you to specify a time range (in milliseconds) in your audio, during which you want to search for an interruption. See for more detail.
    */
  var AbsoluteTimeRange: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.AbsoluteTimeRange] = js.undefined
  
  /**
    * Set to TRUE to flag speech that does not contain interruptions. Set to FALSE to flag speech that contains interruptions.
    */
  var Negate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify the interrupter you want to flag. Omitting this parameter is equivalent to specifying both participants.
    */
  var ParticipantRole: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.ParticipantRole] = js.undefined
  
  /**
    * Allows you to specify a time range (in percentage) in your media file, during which you want to search for an interruption. See for more detail.
    */
  var RelativeTimeRange: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.RelativeTimeRange] = js.undefined
  
  /**
    * Specify the duration of the interruptions in milliseconds. For example, you can flag speech that contains more than 10000 milliseconds of interruptions.
    */
  var Threshold: js.UndefOr[TimestampMilliseconds] = js.undefined
}
object InterruptionFilter {
  
  inline def apply(): InterruptionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterruptionFilter]
  }
  
  extension [Self <: InterruptionFilter](x: Self) {
    
    inline def setAbsoluteTimeRange(value: AbsoluteTimeRange): Self = StObject.set(x, "AbsoluteTimeRange", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteTimeRangeUndefined: Self = StObject.set(x, "AbsoluteTimeRange", js.undefined)
    
    inline def setNegate(value: Boolean): Self = StObject.set(x, "Negate", value.asInstanceOf[js.Any])
    
    inline def setNegateUndefined: Self = StObject.set(x, "Negate", js.undefined)
    
    inline def setParticipantRole(value: ParticipantRole): Self = StObject.set(x, "ParticipantRole", value.asInstanceOf[js.Any])
    
    inline def setParticipantRoleUndefined: Self = StObject.set(x, "ParticipantRole", js.undefined)
    
    inline def setRelativeTimeRange(value: RelativeTimeRange): Self = StObject.set(x, "RelativeTimeRange", value.asInstanceOf[js.Any])
    
    inline def setRelativeTimeRangeUndefined: Self = StObject.set(x, "RelativeTimeRange", js.undefined)
    
    inline def setThreshold(value: TimestampMilliseconds): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "Threshold", js.undefined)
  }
}
