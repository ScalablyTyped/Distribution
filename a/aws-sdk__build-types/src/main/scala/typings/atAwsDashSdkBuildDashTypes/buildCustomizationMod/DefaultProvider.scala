package typings.atAwsDashSdkBuildDashTypes.buildCustomizationMod

import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultProvider extends js.Object {
  /**
    * A string containing a valid TypeScript expression that evaluates to a
    * function that, when called, will return a valid value for this
    * configuration property.
    *
    * This function will be called with the full configuration object at its
    * current point in processing.
    *
    * If an imported type is used, it must be referred to as a property of the
    * imported package.
    */
  var expression: String
  var `type`: provider
}

object DefaultProvider {
  @scala.inline
  def apply(expression: String, `type`: provider): DefaultProvider = {
    val __obj = js.Dynamic.literal(expression = expression)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DefaultProvider]
  }
}

