package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetModelPropertyDefinition extends js.Object {
  /**
    * The data type of the property definition.
    */
  var dataType: PropertyDataType = js.native
  /**
    * The name of the property definition.
    */
  var name: Name = js.native
  /**
    * The property definition type (see PropertyType). You can only specify one type in a property definition.
    */
  var `type`: PropertyType = js.native
  /**
    * The unit of the property definition, such as Newtons or RPM.
    */
  var unit: js.UndefOr[PropertyUnit] = js.native
}

object AssetModelPropertyDefinition {
  @scala.inline
  def apply(dataType: PropertyDataType, name: Name, `type`: PropertyType, unit: PropertyUnit = null): AssetModelPropertyDefinition = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelPropertyDefinition]
  }
}

