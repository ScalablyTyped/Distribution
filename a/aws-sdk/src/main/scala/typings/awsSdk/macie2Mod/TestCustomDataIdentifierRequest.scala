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
    * The regular expression (regex) that defines the pattern to match. The expression can contain as many as 500 characters.
    */
  var regex: string = js.native
  /**
    * The sample text to inspect by using the custom data identifier. The text can contain as many as 1,000 characters.
    */
  var sampleText: string = js.native
}

object TestCustomDataIdentifierRequest {
  @scala.inline
  def apply(
    regex: string,
    sampleText: string,
    ignoreWords: listOfString = null,
    keywords: listOfString = null,
    maximumMatchDistance: js.UndefOr[integer] = js.undefined
  ): TestCustomDataIdentifierRequest = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], sampleText = sampleText.asInstanceOf[js.Any])
    if (ignoreWords != null) __obj.updateDynamic("ignoreWords")(ignoreWords.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumMatchDistance)) __obj.updateDynamic("maximumMatchDistance")(maximumMatchDistance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCustomDataIdentifierRequest]
  }
}

