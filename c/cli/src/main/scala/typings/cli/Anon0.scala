package typings.cli

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var `0`: String | Boolean
  var `1`: String
  var `2`: js.UndefOr[String] = js.undefined
  var `3`: js.UndefOr[js.Any] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply(`0`: String | Boolean, `1`: String, `2`: String = null, `3`: js.Any = null): Anon0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    if (`2` != null) __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    if (`3` != null) __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

