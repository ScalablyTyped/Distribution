package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranscriptFilter extends StObject {
  
  /**
    * Makes it possible to specify a time range (in milliseconds) in your audio, during which you want to search for the specified key words or phrases. See for more detail.
    */
  var AbsoluteTimeRange: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.AbsoluteTimeRange] = js.undefined
  
  /**
    * Set to TRUE to flag the absence of the phrase that you specified in your request. Set to FALSE to flag the presence of the phrase that you specified in your request.
    */
  var Negate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify the participant that you want to flag. Omitting this parameter is equivalent to specifying both participants.
    */
  var ParticipantRole: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.ParticipantRole] = js.undefined
  
  /**
    * Makes it possible to specify a time range (in percentage) in your media file, during which you want to search for the specified key words or phrases. See for more detail.
    */
  var RelativeTimeRange: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.RelativeTimeRange] = js.undefined
  
  /**
    * Specify the phrases that you want to flag.
    */
  var Targets: StringTargetList
  
  /**
    * Flag the presence or absence of an exact match to the phrases that you specify. For example, if you specify the phrase "speak to a manager" as your Targets value, only that exact phrase is flagged. Note that semantic matching is not supported. For example, if your customer says "speak to the manager", instead of "speak to a manager", your content is not flagged.
    */
  var TranscriptFilterType: typings.awsSdk.clientsTranscribeserviceMod.TranscriptFilterType
}
object TranscriptFilter {
  
  inline def apply(Targets: StringTargetList, TranscriptFilterType: TranscriptFilterType): TranscriptFilter = {
    val __obj = js.Dynamic.literal(Targets = Targets.asInstanceOf[js.Any], TranscriptFilterType = TranscriptFilterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscriptFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TranscriptFilter] (val x: Self) extends AnyVal {
    
    inline def setAbsoluteTimeRange(value: AbsoluteTimeRange): Self = StObject.set(x, "AbsoluteTimeRange", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteTimeRangeUndefined: Self = StObject.set(x, "AbsoluteTimeRange", js.undefined)
    
    inline def setNegate(value: Boolean): Self = StObject.set(x, "Negate", value.asInstanceOf[js.Any])
    
    inline def setNegateUndefined: Self = StObject.set(x, "Negate", js.undefined)
    
    inline def setParticipantRole(value: ParticipantRole): Self = StObject.set(x, "ParticipantRole", value.asInstanceOf[js.Any])
    
    inline def setParticipantRoleUndefined: Self = StObject.set(x, "ParticipantRole", js.undefined)
    
    inline def setRelativeTimeRange(value: RelativeTimeRange): Self = StObject.set(x, "RelativeTimeRange", value.asInstanceOf[js.Any])
    
    inline def setRelativeTimeRangeUndefined: Self = StObject.set(x, "RelativeTimeRange", js.undefined)
    
    inline def setTargets(value: StringTargetList): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Targets", js.Array(value*))
    
    inline def setTranscriptFilterType(value: TranscriptFilterType): Self = StObject.set(x, "TranscriptFilterType", value.asInstanceOf[js.Any])
  }
}
