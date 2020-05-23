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
    * A custom description of the custom data identifier. The description can contain up to 120 characters. We strongly recommend that you avoid including any sensitive data in the description of a custom data identifier. Other users of your account might be able to see the identifier's description, depending on the actions that they're allowed to perform in Amazon Macie.
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
    * The maximum number of characters that can exist between text that matches the regex pattern and the character sequences specified by the keywords array. Macie includes or excludes a result based on the proximity of a keyword to text that matches the regex pattern. The distance can be 1 - 300 characters. The default value is 300.
    */
  var maximumMatchDistance: js.UndefOr[integer] = js.native
  /**
    * A custom name for the custom data identifier. The name can contain as many as 120 characters. We strongly recommend that you avoid including any sensitive data in the name of a custom data identifier. Other users of your account might be able to see the identifier's name, depending on the actions that they're allowed to perform in Amazon Macie.
    */
  var name: js.UndefOr[string] = js.native
  /**
    * The regular expression (regex) that defines the pattern to match. The expression can contain as many as 500 characters.
    */
  var regex: js.UndefOr[string] = js.native
  /**
    * A map of key-value pairs that specifies the tags to associate with the custom data identifier. A custom data identifier can have a maximum of 50 tags. Each tag consists of a required tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateCustomDataIdentifierRequest {
  @scala.inline
  def apply(
    clientToken: string = null,
    description: string = null,
    ignoreWords: listOfString = null,
    keywords: listOfString = null,
    maximumMatchDistance: js.UndefOr[integer] = js.undefined,
    name: string = null,
    regex: string = null,
    tags: TagMap = null
  ): CreateCustomDataIdentifierRequest = {
    val __obj = js.Dynamic.literal()
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ignoreWords != null) __obj.updateDynamic("ignoreWords")(ignoreWords.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumMatchDistance)) __obj.updateDynamic("maximumMatchDistance")(maximumMatchDistance.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomDataIdentifierRequest]
  }
}

