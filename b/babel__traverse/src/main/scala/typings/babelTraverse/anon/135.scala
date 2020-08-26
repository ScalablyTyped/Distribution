package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ThrowStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `135` extends js.Object {
  var `type`: ThrowStatement = js.native
}

object `135` {
  @scala.inline
  def apply(`type`: ThrowStatement): `135` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`135`]
  }
  @scala.inline
  implicit class `135Ops`[Self <: `135`] (val x: Self) extends AnyVal {
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
    def setType(value: ThrowStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

