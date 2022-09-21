package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subtitles extends StObject {
  
  /**
    * Specify the output format for your subtitle file; if you select both WebVTT (vtt) and SubRip (srt) formats, two output files are generated.
    */
  var Formats: js.UndefOr[SubtitleFormats] = js.undefined
  
  /**
    * Specify the starting value that is assigned to the first subtitle segment. The default start index for Amazon Transcribe is 0, which differs from the more widely used standard of 1. If you're uncertain which value to use, we recommend choosing 1, as this may improve compatibility with other services.
    */
  var OutputStartIndex: js.UndefOr[SubtitleOutputStartIndex] = js.undefined
}
object Subtitles {
  
  inline def apply(): Subtitles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subtitles]
  }
  
  extension [Self <: Subtitles](x: Self) {
    
    inline def setFormats(value: SubtitleFormats): Self = StObject.set(x, "Formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "Formats", js.undefined)
    
    inline def setFormatsVarargs(value: SubtitleFormat*): Self = StObject.set(x, "Formats", js.Array(value*))
    
    inline def setOutputStartIndex(value: SubtitleOutputStartIndex): Self = StObject.set(x, "OutputStartIndex", value.asInstanceOf[js.Any])
    
    inline def setOutputStartIndexUndefined: Self = StObject.set(x, "OutputStartIndex", js.undefined)
  }
}
