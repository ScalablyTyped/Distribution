package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  /**
    * Flag the presence or absence of interruptions in your Call Analytics transcription output. Refer to for more detail.
    */
  var InterruptionFilter: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.InterruptionFilter] = js.undefined
  
  /**
    * Flag the presence or absence of periods of silence in your Call Analytics transcription output. Refer to for more detail.
    */
  var NonTalkTimeFilter: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.NonTalkTimeFilter] = js.undefined
  
  /**
    * Flag the presence or absence of specific sentiments in your Call Analytics transcription output. Refer to for more detail.
    */
  var SentimentFilter: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.SentimentFilter] = js.undefined
  
  /**
    * Flag the presence or absence of specific words or phrases in your Call Analytics transcription output. Refer to for more detail.
    */
  var TranscriptFilter: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.TranscriptFilter] = js.undefined
}
object Rule {
  
  inline def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  extension [Self <: Rule](x: Self) {
    
    inline def setInterruptionFilter(value: InterruptionFilter): Self = StObject.set(x, "InterruptionFilter", value.asInstanceOf[js.Any])
    
    inline def setInterruptionFilterUndefined: Self = StObject.set(x, "InterruptionFilter", js.undefined)
    
    inline def setNonTalkTimeFilter(value: NonTalkTimeFilter): Self = StObject.set(x, "NonTalkTimeFilter", value.asInstanceOf[js.Any])
    
    inline def setNonTalkTimeFilterUndefined: Self = StObject.set(x, "NonTalkTimeFilter", js.undefined)
    
    inline def setSentimentFilter(value: SentimentFilter): Self = StObject.set(x, "SentimentFilter", value.asInstanceOf[js.Any])
    
    inline def setSentimentFilterUndefined: Self = StObject.set(x, "SentimentFilter", js.undefined)
    
    inline def setTranscriptFilter(value: TranscriptFilter): Self = StObject.set(x, "TranscriptFilter", value.asInstanceOf[js.Any])
    
    inline def setTranscriptFilterUndefined: Self = StObject.set(x, "TranscriptFilter", js.undefined)
  }
}
