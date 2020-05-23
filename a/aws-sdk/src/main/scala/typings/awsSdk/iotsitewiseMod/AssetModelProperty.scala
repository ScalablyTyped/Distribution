package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetModelProperty extends js.Object {
  /**
    * The data type of the asset model property.
    */
  var dataType: PropertyDataType = js.native
  /**
    * The ID of the asset model property.
    */
  var id: js.UndefOr[ID] = js.native
  /**
    * The name of the asset model property.
    */
  var name: Name = js.native
  /**
    * The property type (see PropertyType).
    */
  var `type`: PropertyType = js.native
  /**
    * The unit of the asset model property, such as Newtons or RPM.
    */
  var unit: js.UndefOr[PropertyUnit] = js.native
}

object AssetModelProperty {
  @scala.inline
  def apply(
    dataType: PropertyDataType,
    name: Name,
    `type`: PropertyType,
    id: ID = null,
    unit: PropertyUnit = null
  ): AssetModelProperty = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelProperty]
  }
}

