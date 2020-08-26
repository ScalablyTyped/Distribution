package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableValue extends js.Object {
  /**
    * The ID of the hierarchy to query for the property ID. You can use the hierarchy's name instead of the hierarchy's ID. You use a hierarchy ID instead of a model ID because you can have several hierarchies using the same model and therefore the same propertyId. For example, you might have separately grouped assets that come from the same asset model. For more information, see Asset Hierarchies in the AWS IoT SiteWise User Guide.
    */
  var hierarchyId: js.UndefOr[Macro] = js.native
  /**
    * The ID of the property to use as the variable. You can use the property name if it's from the same asset model.
    */
  var propertyId: Macro = js.native
}

object VariableValue {
  @scala.inline
  def apply(propertyId: Macro): VariableValue = {
    val __obj = js.Dynamic.literal(propertyId = propertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValue]
  }
  @scala.inline
  implicit class VariableValueOps[Self <: VariableValue] (val x: Self) extends AnyVal {
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
    def setPropertyId(value: Macro): Self = this.set("propertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHierarchyId(value: Macro): Self = this.set("hierarchyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHierarchyId: Self = this.set("hierarchyId", js.undefined)
  }
  
}

