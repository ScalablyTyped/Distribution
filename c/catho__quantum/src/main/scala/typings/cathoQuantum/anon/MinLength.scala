package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinLength extends js.Object {
  var minLength: js.UndefOr[String | Double] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object MinLength {
  @scala.inline
  def apply(minLength: String | Double = null, value: String = null): MinLength = {
    val __obj = js.Dynamic.literal()
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinLength]
  }
}

