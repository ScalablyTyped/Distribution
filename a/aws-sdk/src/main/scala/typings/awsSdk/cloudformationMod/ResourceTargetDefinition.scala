package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTargetDefinition extends js.Object {
  /**
    * Indicates which resource attribute is triggering this update, such as a change in the resource attribute's Metadata, Properties, or Tags.
    */
  var Attribute: js.UndefOr[ResourceAttribute] = js.native
  /**
    * If the Attribute value is Properties, the name of the property. For all other attributes, the value is null.
    */
  var Name: js.UndefOr[PropertyName] = js.native
  /**
    * If the Attribute value is Properties, indicates whether a change to this property causes the resource to be recreated. The value can be Never, Always, or Conditionally. To determine the conditions for a Conditionally recreation, see the update behavior for that property in the AWS CloudFormation User Guide.
    */
  var RequiresRecreation: js.UndefOr[typings.awsSdk.cloudformationMod.RequiresRecreation] = js.native
}

object ResourceTargetDefinition {
  @scala.inline
  def apply(): ResourceTargetDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTargetDefinition]
  }
  @scala.inline
  implicit class ResourceTargetDefinitionOps[Self <: ResourceTargetDefinition] (val x: Self) extends AnyVal {
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
    def setAttribute(value: ResourceAttribute): Self = this.set("Attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribute: Self = this.set("Attribute", js.undefined)
    @scala.inline
    def setName(value: PropertyName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRequiresRecreation(value: RequiresRecreation): Self = this.set("RequiresRecreation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiresRecreation: Self = this.set("RequiresRecreation", js.undefined)
  }
  
}

