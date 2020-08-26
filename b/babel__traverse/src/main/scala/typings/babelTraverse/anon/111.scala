package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `111` extends js.Object {
  var `type`: ExportSpecifier = js.native
}

object `111` {
  @scala.inline
  def apply(`type`: ExportSpecifier): `111` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`111`]
  }
  @scala.inline
  implicit class `111Ops`[Self <: `111`] (val x: Self) extends AnyVal {
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
    def setType(value: ExportSpecifier): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

