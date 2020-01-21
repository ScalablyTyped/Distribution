package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.ParameterSuppression
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterSuppressionCustomizationDefinition extends CustomizationDefinition {
  /**
    * The I/O shape from which this parameter should be suppressed.
    */
  var location: input | output
  /**
    * The name of the property to be suppressed. The property will be removed
    * from the input or output shape interface, but the underlying
    * serialization will not be changed.
    */
  var name: String
  var `type`: ParameterSuppression
}

object ParameterSuppressionCustomizationDefinition {
  @scala.inline
  def apply(location: input | output, name: String, `type`: ParameterSuppression): ParameterSuppressionCustomizationDefinition = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterSuppressionCustomizationDefinition]
  }
}

