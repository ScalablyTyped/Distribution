package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationNode extends js.Object {
  /**
    * The organization node type.
    */
  var Type: js.UndefOr[OrganizationNodeType] = js.native
  /**
    * The identifier of the organization node.
    */
  var Value: js.UndefOr[OrganizationNodeValue] = js.native
}

object OrganizationNode {
  @scala.inline
  def apply(): OrganizationNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationNode]
  }
  @scala.inline
  implicit class OrganizationNodeOps[Self <: OrganizationNode] (val x: Self) extends AnyVal {
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
    def setType(value: OrganizationNodeType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setValue(value: OrganizationNodeValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

