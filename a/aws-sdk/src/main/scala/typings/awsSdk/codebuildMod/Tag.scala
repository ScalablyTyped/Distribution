package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * The tag's key.
    */
  var key: js.UndefOr[KeyInput] = js.native
  /**
    * The tag's value.
    */
  var value: js.UndefOr[ValueInput] = js.native
}

object Tag {
  @scala.inline
  def apply(key: KeyInput = null, value: ValueInput = null): Tag = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

