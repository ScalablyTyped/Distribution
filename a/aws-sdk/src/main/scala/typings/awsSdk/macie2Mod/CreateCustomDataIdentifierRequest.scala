package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomDataIdentifierRequest extends StObject {
  
  /**
    * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[string] = js.undefined
  
  /**
    * A custom description of the custom data identifier. The description can contain as many as 512 characters. We strongly recommend that you avoid including any sensitive data in the description of a custom data identifier. Other users of your account might be able to see the identifier's description, depending on the actions that they're allowed to perform in Amazon Macie.
    */
  var description: js.UndefOr[string] = js.undefined
  
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
    * A custom name for the custom data identifier. The name can contain as many as 128 characters. We strongly recommend that you avoid including any sensitive data in the name of a custom data identifier. Other users of your account might be able to see the identifier's name, depending on the actions that they're allowed to perform in Amazon Macie.
    */
  var name: js.UndefOr[string] = js.undefined
  
  /**
    * The regular expression (regex) that defines the pattern to match. The expression can contain as many as 512 characters.
    */
  var regex: js.UndefOr[string] = js.undefined
  
  /**
    * A map of key-value pairs that specifies the tags to associate with the custom data identifier. A custom data identifier can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateCustomDataIdentifierRequest {
  
  @scala.inline
  def apply(): CreateCustomDataIdentifierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomDataIdentifierRequest]
  }
  
  @scala.inline
  implicit class CreateCustomDataIdentifierRequestMutableBuilder[Self <: CreateCustomDataIdentifierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: string): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIgnoreWords(value: listOfString): Self = StObject.set(x, "ignoreWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreWordsUndefined: Self = StObject.set(x, "ignoreWords", js.undefined)
    
    @scala.inline
    def setIgnoreWordsVarargs(value: string*): Self = StObject.set(x, "ignoreWords", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: listOfString): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setKeywordsVarargs(value: string*): Self = StObject.set(x, "keywords", js.Array(value :_*))
    
    @scala.inline
    def setMaximumMatchDistance(value: integer): Self = StObject.set(x, "maximumMatchDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumMatchDistanceUndefined: Self = StObject.set(x, "maximumMatchDistance", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRegex(value: string): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
