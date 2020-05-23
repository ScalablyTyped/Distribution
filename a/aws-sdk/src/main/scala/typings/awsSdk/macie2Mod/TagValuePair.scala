package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagValuePair extends js.Object {
  /**
    * The value for the tag key to use in the condition.
    */
  var key: js.UndefOr[string] = js.native
  /**
    * The tag value, associated with the specified tag key, to use in the condition.
    */
  var value: js.UndefOr[string] = js.native
}

object TagValuePair {
  @scala.inline
  def apply(key: string = null, value: string = null): TagValuePair = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagValuePair]
  }
}

