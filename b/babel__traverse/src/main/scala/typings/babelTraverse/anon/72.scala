package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.QualifiedTypeIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `72` extends js.Object {
  var `type`: QualifiedTypeIdentifier = js.native
}

object `72` {
  @scala.inline
  def apply(`type`: QualifiedTypeIdentifier): `72` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`72`]
  }
  @scala.inline
  implicit class `72Ops`[Self <: `72`] (val x: Self) extends AnyVal {
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
    def setType(value: QualifiedTypeIdentifier): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

