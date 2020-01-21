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
    * The specific value of the tag.
    */
  var Values: js.UndefOr[typings.awsSdk.costexplorerMod.Values] = js.native
}

object TagValues {
  @scala.inline
  def apply(Key: TagKey = null, Values: Values = null): TagValues = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagValues]
  }
}

