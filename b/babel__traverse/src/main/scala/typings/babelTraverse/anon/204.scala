package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXClosingFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `204` extends js.Object {
  var `type`: JSXClosingFragment = js.native
}

object `204` {
  @scala.inline
  def apply(`type`: JSXClosingFragment): `204` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`204`]
  }
  @scala.inline
  implicit class `204Ops`[Self <: `204`] (val x: Self) extends AnyVal {
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
    def setType(value: JSXClosingFragment): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

