package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestCustomDataIdentifierRequest extends StObject {
  
  /**
    * An array that lists specific character sequences (ignore words) to exclude from the results. If the text matched by the regular expression is the same as any string in this array, Amazon Macie ignores it. The array can contain as many as 10 ignore words. Each ignore word can contain 4 - 90 characters. Ignore words are case sensitive.
    */
  var ignoreWords: js.UndefOr[listOfString] = js.undefined
  
  /**
    * An array that lists specific character sequences (keywords), one of which must be within proximity (maximumMatchDistance) of the regular expression to match. The array can contain as many as 50 keywords. Each keyword can contain 4 - 90 characters. Keywords aren't case sensitive.
    */
  var keywords: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The maximum number of characters that can exist between text that matches the regex pattern and the character sequences specified by the keywords array. Macie includes or excludes a result based on the proximity of a keyword to text that matches the regex pattern. The distance can be 1 - 300 characters. The default value is 50.
    */
  var maximumMatchDistance: js.UndefOr[integer] = js.undefined
  
  /**
    * The regular expression (regex) that defines the pattern to match. The expression can contain as many as 512 characters.
    */
  var regex: string
  
  /**
    * The sample text to inspect by using the custom data identifier. The text can contain as many as 1,000 characters.
    */
  var sampleText: string
}
object TestCustomDataIdentifierRequest {
  
  inline def apply(regex: string, sampleText: string): TestCustomDataIdentifierRequest = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], sampleText = sampleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCustomDataIdentifierRequest]
  }
  
  extension [Self <: TestCustomDataIdentifierRequest](x: Self) {
    
    inline def setIgnoreWords(value: listOfString): Self = StObject.set(x, "ignoreWords", value.asInstanceOf[js.Any])
    
    inline def setIgnoreWordsUndefined: Self = StObject.set(x, "ignoreWords", js.undefined)
    
    inline def setIgnoreWordsVarargs(value: string*): Self = StObject.set(x, "ignoreWords", js.Array(value :_*))
    
    inline def setKeywords(value: listOfString): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: string*): Self = StObject.set(x, "keywords", js.Array(value :_*))
    
    inline def setMaximumMatchDistance(value: integer): Self = StObject.set(x, "maximumMatchDistance", value.asInstanceOf[js.Any])
    
    inline def setMaximumMatchDistanceUndefined: Self = StObject.set(x, "maximumMatchDistance", js.undefined)
    
    inline def setRegex(value: string): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setSampleText(value: string): Self = StObject.set(x, "sampleText", value.asInstanceOf[js.Any])
  }
}
