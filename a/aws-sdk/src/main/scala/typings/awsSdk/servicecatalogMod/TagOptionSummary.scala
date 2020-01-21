package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagOptionSummary extends js.Object {
  /**
    * The TagOption key.
    */
  var Key: js.UndefOr[TagOptionKey] = js.native
  /**
    * The TagOption value.
    */
  var Values: js.UndefOr[TagOptionValues] = js.native
}

object TagOptionSummary {
  @scala.inline
  def apply(Key: TagOptionKey = null, Values: TagOptionValues = null): TagOptionSummary = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagOptionSummary]
  }
}

