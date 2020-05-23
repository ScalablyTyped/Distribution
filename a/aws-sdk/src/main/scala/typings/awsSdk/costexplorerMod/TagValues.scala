package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagValues extends js.Object {
  /**
    * The key for the tag.
    */
  var Key: js.UndefOr[TagKey] = js.native
  /**
    * The match options that you can use to filter your results. MatchOptions is only applicable for only applicable for actions related to Cost Category. The default values for MatchOptions is EQUALS and CASE_SENSITIVE.
    */
  var MatchOptions: js.UndefOr[typings.awsSdk.costexplorerMod.MatchOptions] = js.native
  /**
    * The specific value of the tag.
    */
  var Values: js.UndefOr[typings.awsSdk.costexplorerMod.Values] = js.native
}

object TagValues {
  @scala.inline
  def apply(Key: TagKey = null, MatchOptions: MatchOptions = null, Values: Values = null): TagValues = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (MatchOptions != null) __obj.updateDynamic("MatchOptions")(MatchOptions.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagValues]
  }
}

