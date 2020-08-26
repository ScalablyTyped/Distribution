package typings.constantinople.anon

import typings.constantinople.constantinopleBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var constant: `false` = js.native
  var result: js.UndefOr[Unit] = js.native
}

object Result {
  @scala.inline
  def apply(constant: `false`): Result = {
    val __obj = js.Dynamic.literal(constant = constant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setConstant(value: `false`): Self = this.set("constant", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: Unit): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

