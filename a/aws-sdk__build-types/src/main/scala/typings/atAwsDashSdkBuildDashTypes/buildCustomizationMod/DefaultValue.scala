package typings.atAwsDashSdkBuildDashTypes.buildCustomizationMod

import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultValue extends js.Object {
  /**
    * A string containing a valid TypeScript expression that evaluates to a
    * valid value for this configuration property.
    *
    * If an imported type is used, it must be referred to as a property of the
    * imported package.
    */
  var expression: String
  var `type`: value
}

object DefaultValue {
  @scala.inline
  def apply(expression: String, `type`: value): DefaultValue = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
}

