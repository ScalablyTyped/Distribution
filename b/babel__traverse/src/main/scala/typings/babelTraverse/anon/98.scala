package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSStringKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `98` extends js.Object {
  var `type`: TSStringKeyword = js.native
}

object `98` {
  @scala.inline
  def apply(`type`: TSStringKeyword): `98` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`98`]
  }
  @scala.inline
  implicit class `98Ops`[Self <: `98`] (val x: Self) extends AnyVal {
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
    def setType(value: TSStringKeyword): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

