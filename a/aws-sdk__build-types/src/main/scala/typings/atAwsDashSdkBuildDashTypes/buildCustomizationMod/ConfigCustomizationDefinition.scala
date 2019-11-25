package typings.atAwsDashSdkBuildDashTypes.buildCustomizationMod

import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigCustomizationDefinition extends CustomizationDefinition {
  var configuration: ConfigurationDefinition
  var `type`: Configuration
}

object ConfigCustomizationDefinition {
  @scala.inline
  def apply(configuration: ConfigurationDefinition, `type`: Configuration): ConfigCustomizationDefinition = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigCustomizationDefinition]
  }
}

