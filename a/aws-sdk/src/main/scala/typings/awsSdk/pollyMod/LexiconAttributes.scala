package typings.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LexiconAttributes extends StObject {
  
  /**
    * Phonetic alphabet used in the lexicon. Valid values are ipa and x-sampa.
    */
  var Alphabet: js.UndefOr[typings.awsSdk.pollyMod.Alphabet] = js.native
  
  /**
    * Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to all English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.pollyMod.LanguageCode] = js.native
  
  /**
    * Date lexicon was last modified (a timestamp value).
    */
  var LastModified: js.UndefOr[typings.awsSdk.pollyMod.LastModified] = js.native
  
  /**
    * Number of lexemes in the lexicon.
    */
  var LexemesCount: js.UndefOr[typings.awsSdk.pollyMod.LexemesCount] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the lexicon.
    */
  var LexiconArn: js.UndefOr[typings.awsSdk.pollyMod.LexiconArn] = js.native
  
  /**
    * Total size of the lexicon, in characters.
    */
  var Size: js.UndefOr[typings.awsSdk.pollyMod.Size] = js.native
}
object LexiconAttributes {
  
  @scala.inline
  def apply(): LexiconAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LexiconAttributes]
  }
  
  @scala.inline
  implicit class LexiconAttributesMutableBuilder[Self <: LexiconAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlphabet(value: Alphabet): Self = StObject.set(x, "Alphabet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphabetUndefined: Self = StObject.set(x, "Alphabet", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setLastModified(value: LastModified): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    @scala.inline
    def setLexemesCount(value: LexemesCount): Self = StObject.set(x, "LexemesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexemesCountUndefined: Self = StObject.set(x, "LexemesCount", js.undefined)
    
    @scala.inline
    def setLexiconArn(value: LexiconArn): Self = StObject.set(x, "LexiconArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexiconArnUndefined: Self = StObject.set(x, "LexiconArn", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
  }
}
