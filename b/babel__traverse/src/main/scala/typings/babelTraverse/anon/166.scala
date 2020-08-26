package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TypeParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `166` extends js.Object {
  var `type`: TypeParameter = js.native
}

object `166` {
  @scala.inline
  def apply(`type`: TypeParameter): `166` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`166`]
  }
  @scala.inline
  implicit class `166Ops`[Self <: `166`] (val x: Self) extends AnyVal {
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
    def setType(value: TypeParameter): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

