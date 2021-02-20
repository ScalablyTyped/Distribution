package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCustomDataIdentifierResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom data identifier.
    */
  var arn: js.UndefOr[string] = js.native
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
    */
  var createdAt: js.UndefOr[timestampIso8601] = js.native
  
  /**
    * Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon Macie doesn't delete it permanently. Instead, it soft deletes the identifier.
    */
  var deleted: js.UndefOr[boolean] = js.native
  
  /**
    * The custom description of the custom data identifier.
    */
  var description: js.UndefOr[string] = js.native
  
  /**
    * The unique identifier for the custom data identifier.
    */
  var id: js.UndefOr[string] = js.native
  
  /**
    * An array that lists specific character sequences (ignore words) to exclude from the results. If the text matched by the regular expression is the same as any string in this array, Amazon Macie ignores it. Ignore words are case sensitive.
    */
  var ignoreWords: js.UndefOr[listOfString] = js.native
  
  /**
    * An array that lists specific character sequences (keywords), one of which must be within proximity (maximumMatchDistance) of the regular expression to match. Keywords aren't case sensitive.
    */
  var keywords: js.UndefOr[listOfString] = js.native
  
  /**
    * The maximum number of characters that can exist between text that matches the regex pattern and the character sequences specified by the keywords array. Macie includes or excludes a result based on the proximity of a keyword to text that matches the regex pattern.
    */
  var maximumMatchDistance: js.UndefOr[integer] = js.native
  
  /**
    * The custom name of the custom data identifier.
    */
  var name: js.UndefOr[string] = js.native
  
  /**
    * The regular expression (regex) that defines the pattern to match.
    */
  var regex: js.UndefOr[string] = js.native
  
  /**
    * A map of key-value pairs that identifies the tags (keys and values) that are associated with the custom data identifier.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object GetCustomDataIdentifierResponse {
  
  @scala.inline
  def apply(): GetCustomDataIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomDataIdentifierResponse]
  }
  
  @scala.inline
  implicit class GetCustomDataIdentifierResponseMutableBuilder[Self <: GetCustomDataIdentifierResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: timestampIso8601): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDeleted(value: boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
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
