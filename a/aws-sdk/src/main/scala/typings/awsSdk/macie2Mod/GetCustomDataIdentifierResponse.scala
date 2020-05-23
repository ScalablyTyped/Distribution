package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * An array that lists specific character sequences (ignore words) to exclude from the results. If the text matched by the regular expression is the same as any string in this array, Amazon Macie ignores it.
    */
  var ignoreWords: js.UndefOr[listOfString] = js.native
  /**
    * An array that lists specific character sequences (keywords), one of which must be within proximity (maximumMatchDistance) of the regular expression to match.
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
  def apply(
    arn: string = null,
    createdAt: timestampIso8601 = null,
    deleted: js.UndefOr[boolean] = js.undefined,
    description: string = null,
    id: string = null,
    ignoreWords: listOfString = null,
    keywords: listOfString = null,
    maximumMatchDistance: js.UndefOr[integer] = js.undefined,
    name: string = null,
    regex: string = null,
    tags: TagMap = null
  ): GetCustomDataIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ignoreWords != null) __obj.updateDynamic("ignoreWords")(ignoreWords.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumMatchDistance)) __obj.updateDynamic("maximumMatchDistance")(maximumMatchDistance.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomDataIdentifierResponse]
  }
}

