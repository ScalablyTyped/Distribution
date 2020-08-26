package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `125` extends js.Object {
  var `type`: VariableDeclarator = js.native
}

object `125` {
  @scala.inline
  def apply(`type`: VariableDeclarator): `125` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`125`]
  }
  @scala.inline
  implicit class `125Ops`[Self <: `125`] (val x: Self) extends AnyVal {
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
    def setType(value: VariableDeclarator): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

