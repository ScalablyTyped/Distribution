package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCustomDataIdentifierResponse extends js.Object {
  
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
  implicit class GetCustomDataIdentifierResponseOps[Self <: GetCustomDataIdentifierResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: string): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: timestampIso8601): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setDeleted(value: boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIgnoreWordsVarargs(value: string*): Self = this.set("ignoreWords", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreWords(value: listOfString): Self = this.set("ignoreWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreWords: Self = this.set("ignoreWords", js.undefined)
    
    @scala.inline
    def setKeywordsVarargs(value: string*): Self = this.set("keywords", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: listOfString): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    
    @scala.inline
    def setMaximumMatchDistance(value: integer): Self = this.set("maximumMatchDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumMatchDistance: Self = this.set("maximumMatchDistance", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRegex(value: string): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
