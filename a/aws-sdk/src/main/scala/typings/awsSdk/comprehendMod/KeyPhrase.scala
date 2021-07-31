package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyPhrase extends StObject {
  
  /**
    * A character offset in the input text that shows where the key phrase begins (the first character is at position 0). The offset returns the position of each UTF-8 code point in the string. A code point is the abstract character from a particular graphical representation. For example, a multi-byte UTF-8 character maps to a single code point.
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * A character offset in the input text where the key phrase ends. The offset returns the position of each UTF-8 code point in the string. A code point is the abstract character from a particular graphical representation. For example, a multi-byte UTF-8 character maps to a single code point.
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
    */
  var Score: js.UndefOr[Float] = js.undefined
  
  /**
    * The text of a key noun phrase.
    */
  var Text: js.UndefOr[String] = js.undefined
}
object KeyPhrase {
  
  @scala.inline
  def apply(): KeyPhrase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPhrase]
  }
  
  @scala.inline
  implicit class KeyPhraseMutableBuilder[Self <: KeyPhrase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    @scala.inline
    def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
    
    @scala.inline
    def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
