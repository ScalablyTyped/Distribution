package typings.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLexiconOutput extends StObject {
  
  /**
    * Lexicon object that provides name and the string content of the lexicon. 
    */
  var Lexicon: js.UndefOr[typings.awsSdk.pollyMod.Lexicon] = js.native
  
  /**
    * Metadata of the lexicon, including phonetic alphabetic used, language code, lexicon ARN, number of lexemes defined in the lexicon, and size of lexicon in bytes.
    */
  var LexiconAttributes: js.UndefOr[typings.awsSdk.pollyMod.LexiconAttributes] = js.native
}
object GetLexiconOutput {
  
  @scala.inline
  def apply(): GetLexiconOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLexiconOutput]
  }
  
  @scala.inline
  implicit class GetLexiconOutputMutableBuilder[Self <: GetLexiconOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLexicon(value: Lexicon): Self = StObject.set(x, "Lexicon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexiconAttributes(value: LexiconAttributes): Self = StObject.set(x, "LexiconAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexiconAttributesUndefined: Self = StObject.set(x, "LexiconAttributes", js.undefined)
    
    @scala.inline
    def setLexiconUndefined: Self = StObject.set(x, "Lexicon", js.undefined)
  }
}
