package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomDataIdentifierRequest extends js.Object {
  /**
    * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[string] = js.native
  /**
    * A custom description of the custom data identifier. The description can contain as many as 512 characters. We strongly recommend that you avoid including any sensitive data in the description of a custom data identifier. Other users of your account might be able to see the identifier's description, depending on the actions that they're allowed to perform in Amazon Macie.
    */
  var description: js.UndefOr[string] = js.native
  /**
    * An array that lists specific character sequences (ignore words) to exclude from the results. If the text matched by the regular expression is the same as any string in this array, Amazon Macie ignores it. The array can contain as many as 10 ignore words. Each ignore word can contain 4 - 90 characters.
    */
  var ignoreWords: js.UndefOr[listOfString] = js.native
  /**
    * An array that lists specific character sequences (keywords), one of which must be within proximity (maximumMatchDistance) of the regular expression to match. The array can contain as many as 50 keywords. Each keyword can contain 4 - 90 characters.
    */
  var keywords: js.UndefOr[listOfString] = js.native
  /**
    * The maximum number of characters that can exist between text that matches the regex pattern and the character sequences specified by the keywords array. Macie includes or excludes a result based on the proximity of a keyword to text that matches the regex pattern. The distance can be 1 - 300 characters. The default value is 50.
    */
  var maximumMatchDistance: js.UndefOr[integer] = js.native
  /**
    * A custom name for the custom data identifier. The name can contain as many as 128 characters. We strongly recommend that you avoid including any sensitive data in the name of a custom data identifier. Other users of your account might be able to see the identifier's name, depending on the actions that they're allowed to perform in Amazon Macie.
    */
  var name: js.UndefOr[string] = js.native
  /**
    * The regular expression (regex) that defines the pattern to match. The expression can contain as many as 512 characters.
    */
  var regex: js.UndefOr[string] = js.native
  /**
    * A map of key-value pairs that specifies the tags to associate with the custom data identifier. A custom data identifier can have a maximum of 50 tags. Each tag consists of a required tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateCustomDataIdentifierRequest {
  @scala.inline
  def apply(): CreateCustomDataIdentifierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomDataIdentifierRequest]
  }
  @scala.inline
  implicit class CreateCustomDataIdentifierRequestOps[Self <: CreateCustomDataIdentifierRequest] (val x: Self) extends AnyVal {
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
    def setClientToken(value: string): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    @scala.inline
    def setDescription(value: string): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
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

