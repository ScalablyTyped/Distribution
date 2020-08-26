package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSPropertySignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `113` extends js.Object {
  var `type`: TSPropertySignature = js.native
}

object `113` {
  @scala.inline
  def apply(`type`: TSPropertySignature): `113` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`113`]
  }
  @scala.inline
  implicit class `113Ops`[Self <: `113`] (val x: Self) extends AnyVal {
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
    def setType(value: TSPropertySignature): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

