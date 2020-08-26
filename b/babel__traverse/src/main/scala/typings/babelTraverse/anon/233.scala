package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `233` extends js.Object {
  var `type`: DeclareClass = js.native
}

object `233` {
  @scala.inline
  def apply(`type`: DeclareClass): `233` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`233`]
  }
  @scala.inline
  implicit class `233Ops`[Self <: `233`] (val x: Self) extends AnyVal {
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
    def setType(value: DeclareClass): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

