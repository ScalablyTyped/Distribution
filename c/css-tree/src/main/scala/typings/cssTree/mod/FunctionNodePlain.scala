package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionNodePlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain] = js.native
  var name: String = js.native
  @JSName("type")
  var type_FunctionNodePlain: Function = js.native
}

object FunctionNodePlain {
  @scala.inline
  def apply(children: js.Array[CssNodePlain], name: String, `type`: Function): FunctionNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionNodePlain]
  }
  @scala.inline
  implicit class FunctionNodePlainOps[Self <: FunctionNodePlain] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: CssNodePlain*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[CssNodePlain]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Function): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

