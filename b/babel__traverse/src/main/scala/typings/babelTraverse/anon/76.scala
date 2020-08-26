package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BindExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `76` extends js.Object {
  var `type`: BindExpression = js.native
}

object `76` {
  @scala.inline
  def apply(`type`: BindExpression): `76` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`76`]
  }
  @scala.inline
  implicit class `76Ops`[Self <: `76`] (val x: Self) extends AnyVal {
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
    def setType(value: BindExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

