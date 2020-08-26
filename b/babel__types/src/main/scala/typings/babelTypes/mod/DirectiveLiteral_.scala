package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DirectiveLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectiveLiteral_
  extends BaseNode
     with _Node {
  @JSName("type")
  var type_DirectiveLiteral_ : DirectiveLiteral = js.native
  var value: String = js.native
}

object DirectiveLiteral_ {
  @scala.inline
  def apply(`type`: DirectiveLiteral, value: String): DirectiveLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveLiteral_]
  }
  @scala.inline
  implicit class DirectiveLiteral_Ops[Self <: DirectiveLiteral_] (val x: Self) extends AnyVal {
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
    def setType(value: DirectiveLiteral): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

