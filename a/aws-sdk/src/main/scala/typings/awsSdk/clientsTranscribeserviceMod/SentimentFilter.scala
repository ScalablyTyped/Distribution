package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SentimentFilter extends StObject {
  
  /**
    * Makes it possible to specify a time range (in milliseconds) in your audio, during which you want to search for the specified sentiments. See for more detail.
    */
  var AbsoluteTimeRange: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.AbsoluteTimeRange] = js.undefined
  
  /**
    * Set to TRUE to flag the sentiments that you didn't include in your request. Set to FALSE to flag the sentiments that you specified in your request.
    */
  var Negate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify the participant that you want to flag. Omitting this parameter is equivalent to specifying both participants.
    */
  var ParticipantRole: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.ParticipantRole] = js.undefined
  
  /**
    * Makes it possible to specify a time range (in percentage) in your media file, during which you want to search for the specified sentiments. See for more detail.
    */
  var RelativeTimeRange: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.RelativeTimeRange] = js.undefined
  
  /**
    * Specify the sentiments that you want to flag.
    */
  var Sentiments: SentimentValueList
}
object SentimentFilter {
  
  inline def apply(Sentiments: SentimentValueList): SentimentFilter = {
    val __obj = js.Dynamic.literal(Sentiments = Sentiments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentimentFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SentimentFilter] (val x: Self) extends AnyVal {
    
    inline def setAbsoluteTimeRange(value: AbsoluteTimeRange): Self = StObject.set(x, "AbsoluteTimeRange", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteTimeRangeUndefined: Self = StObject.set(x, "AbsoluteTimeRange", js.undefined)
    
    inline def setNegate(value: Boolean): Self = StObject.set(x, "Negate", value.asInstanceOf[js.Any])
    
    inline def setNegateUndefined: Self = StObject.set(x, "Negate", js.undefined)
    
    inline def setParticipantRole(value: ParticipantRole): Self = StObject.set(x, "ParticipantRole", value.asInstanceOf[js.Any])
    
    inline def setParticipantRoleUndefined: Self = StObject.set(x, "ParticipantRole", js.undefined)
    
    inline def setRelativeTimeRange(value: RelativeTimeRange): Self = StObject.set(x, "RelativeTimeRange", value.asInstanceOf[js.Any])
    
    inline def setRelativeTimeRangeUndefined: Self = StObject.set(x, "RelativeTimeRange", js.undefined)
    
    inline def setSentiments(value: SentimentValueList): Self = StObject.set(x, "Sentiments", value.asInstanceOf[js.Any])
    
    inline def setSentimentsVarargs(value: SentimentValue*): Self = StObject.set(x, "Sentiments", js.Array(value*))
  }
}
