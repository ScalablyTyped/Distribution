package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranscriptFilter extends StObject {
  
  /**
    * The object representing the filter that Amazon Lex will use to select the appropriate transcript when the transcript format is the Amazon Lex format.
    */
  var lexTranscriptFilter: js.UndefOr[LexTranscriptFilter] = js.undefined
}
object TranscriptFilter {
  
  inline def apply(): TranscriptFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranscriptFilter]
  }
  
  extension [Self <: TranscriptFilter](x: Self) {
    
    inline def setLexTranscriptFilter(value: LexTranscriptFilter): Self = StObject.set(x, "lexTranscriptFilter", value.asInstanceOf[js.Any])
    
    inline def setLexTranscriptFilterUndefined: Self = StObject.set(x, "lexTranscriptFilter", js.undefined)
  }
}
