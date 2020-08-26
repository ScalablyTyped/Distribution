package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSInferType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `100` extends js.Object {
  var `type`: TSInferType = js.native
}

object `100` {
  @scala.inline
  def apply(`type`: TSInferType): `100` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`100`]
  }
  @scala.inline
  implicit class `100Ops`[Self <: `100`] (val x: Self) extends AnyVal {
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
    def setType(value: TSInferType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

