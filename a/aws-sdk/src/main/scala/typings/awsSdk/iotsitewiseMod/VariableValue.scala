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
  def apply(propertyId: Macro, hierarchyId: Macro = null): VariableValue = {
    val __obj = js.Dynamic.literal(propertyId = propertyId.asInstanceOf[js.Any])
    if (hierarchyId != null) __obj.updateDynamic("hierarchyId")(hierarchyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValue]
  }
}

