package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `119` extends js.Object {
  var `type`: ObjectExpression = js.native
}

object `119` {
  @scala.inline
  def apply(`type`: ObjectExpression): `119` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`119`]
  }
  @scala.inline
  implicit class `119Ops`[Self <: `119`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: ObjectExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

