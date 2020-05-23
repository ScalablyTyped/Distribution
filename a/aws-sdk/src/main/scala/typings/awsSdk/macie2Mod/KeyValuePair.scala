package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyValuePair extends js.Object {
  /**
    * One part of a key-value pair that comprises a tag. A tag key is a general label that acts as a category for more specific tag values.
    */
  var key: js.UndefOr[string] = js.native
  /**
    * One part of a key-value pair that comprises a tag. A tag value acts as a descriptor for a tag key. A tag value can be empty or null.
    */
  var value: js.UndefOr[string] = js.native
}

object KeyValuePair {
  @scala.inline
  def apply(key: string = null, value: string = null): KeyValuePair = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValuePair]
  }
}

