package typings.constantinople.anon

import typings.constantinople.constantinopleBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constant extends js.Object {
  var constant: `true` = js.native
  var result: js.Any = js.native
}

object Constant {
  @scala.inline
  def apply(constant: `true`, result: js.Any): Constant = {
    val __obj = js.Dynamic.literal(constant = constant.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constant]
  }
  @scala.inline
  implicit class ConstantOps[Self <: Constant] (val x: Self) extends AnyVal {
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
    def setConstant(value: `true`): Self = this.set("constant", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

