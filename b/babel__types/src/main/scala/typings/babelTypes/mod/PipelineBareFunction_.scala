package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.PipelineBareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineBareFunction_
  extends BaseNode
     with _Node {
  var callee: Expression = js.native
  @JSName("type")
  var type_PipelineBareFunction_ : PipelineBareFunction = js.native
}

object PipelineBareFunction_ {
  @scala.inline
  def apply(callee: Expression, `type`: PipelineBareFunction): PipelineBareFunction_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineBareFunction_]
  }
  @scala.inline
  implicit class PipelineBareFunction_Ops[Self <: PipelineBareFunction_] (val x: Self) extends AnyVal {
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
    def setCallee(value: Expression): Self = this.set("callee", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PipelineBareFunction): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

