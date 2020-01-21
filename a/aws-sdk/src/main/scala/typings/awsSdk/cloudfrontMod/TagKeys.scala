package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagKeys extends js.Object {
  /**
    *  A complex type that contains Tag key elements.
    */
  var Items: js.UndefOr[TagKeyList] = js.native
}

object TagKeys {
  @scala.inline
  def apply(Items: TagKeyList = null): TagKeys = {
    val __obj = js.Dynamic.literal()
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagKeys]
  }
}

