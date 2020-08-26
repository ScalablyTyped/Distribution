package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestCustomDataIdentifierRequest extends js.Object {
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
    * The regular expression (regex) that defines the pattern to match. The expression can contain as many as 512 characters.
    */
  var regex: string = js.native
  /**
    * The sample text to inspect by using the custom data identifier. The text can contain as many as 1,000 characters.
    */
  var sampleText: string = js.native
}

object TestCustomDataIdentifierRequest {
  @scala.inline
  def apply(regex: string, sampleText: string): TestCustomDataIdentifierRequest = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], sampleText = sampleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCustomDataIdentifierRequest]
  }
  @scala.inline
  implicit class TestCustomDataIdentifierRequestOps[Self <: TestCustomDataIdentifierRequest] (val x: Self) extends AnyVal {
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
    def setRegex(value: string): Self = this.set("regex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSampleText(value: string): Self = this.set("sampleText", value.asInstanceOf[js.Any])
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
  }
  
}

