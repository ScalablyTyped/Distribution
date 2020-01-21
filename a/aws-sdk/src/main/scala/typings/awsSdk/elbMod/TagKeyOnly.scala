package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagKeyOnly extends js.Object {
  /**
    * The name of the key.
    */
  var Key: js.UndefOr[TagKey] = js.native
}

object TagKeyOnly {
  @scala.inline
  def apply(Key: TagKey = null): TagKeyOnly = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagKeyOnly]
  }
}

