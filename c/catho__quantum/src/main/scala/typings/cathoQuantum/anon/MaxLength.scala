package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxLength extends js.Object {
  var maxLength: js.UndefOr[String | Double] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object MaxLength {
  @scala.inline
  def apply(maxLength: String | Double = null, value: String = null): MaxLength = {
    val __obj = js.Dynamic.literal()
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxLength]
  }
}

