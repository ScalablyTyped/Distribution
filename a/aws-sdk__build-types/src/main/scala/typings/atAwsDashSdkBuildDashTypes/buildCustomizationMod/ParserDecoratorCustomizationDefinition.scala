package typings.atAwsDashSdkBuildDashTypes.buildCustomizationMod

import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.ParserDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserDecoratorCustomizationDefinition extends CustomizationDefinition {
  /**
    * Any configuration necessary for this middleware to be resolved.
    */
  var configuration: js.UndefOr[ConfigurationDefinition] = js.undefined
  /**
    * An expression that resolves to the decorator with which to wrap the
    * parser.
    */
  var expression: String
  /**
    * Packages that must be imported to use this parser decorator.
    * Packages will be imported using the `import * as ${snake_case_package_name} from 'package-name';`
    * syntax.
    */
  var imports: js.UndefOr[js.Array[Import]] = js.undefined
  /**
    * The relative priority of this decorator relative to other decorators.
    * Used during client generation to order decorator application.
    */
  var priority: Double
  var `type`: ParserDecorator
}

object ParserDecoratorCustomizationDefinition {
  @scala.inline
  def apply(
    expression: String,
    priority: Double,
    `type`: ParserDecorator,
    configuration: ConfigurationDefinition = null,
    imports: js.Array[Import] = null
  ): ParserDecoratorCustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression, priority = priority)
    __obj.updateDynamic("type")(`type`)
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (imports != null) __obj.updateDynamic("imports")(imports)
    __obj.asInstanceOf[ParserDecoratorCustomizationDefinition]
  }
}

