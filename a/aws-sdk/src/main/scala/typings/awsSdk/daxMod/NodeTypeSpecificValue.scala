package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeTypeSpecificValue extends js.Object {
  /**
    * A node type to which the parameter value applies.
    */
  var NodeType: js.UndefOr[String] = js.native
  /**
    * The parameter value for this node type.
    */
  var Value: js.UndefOr[String] = js.native
}

object NodeTypeSpecificValue {
  @scala.inline
  def apply(): NodeTypeSpecificValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeTypeSpecificValue]
  }
  @scala.inline
  implicit class NodeTypeSpecificValueOps[Self <: NodeTypeSpecificValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNodeType(value: String): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeType: Self = this.set("NodeType", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

