package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.SyntheticParameter
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntheticParameterCustomizationDefinition extends CustomizationDefinition {
  /**
    * The documentation string that should be injected for this property.
    * Should be in standard JSDoc format and expect to be indented by 4 spaces.
    */
  var documentation: String
  /**
    * Packages that must be imported to use this property.
    * Packages will be imported using the `import * as ${snake_case_package_name} from 'package-name';`
    * syntax.
    */
  var imports: js.UndefOr[js.Array[Import]] = js.undefined
  /**
    * The I/O shape on which this synthetic parameter should be applied.
    */
  var location: input | output
  /**
    * The name of the property to be added to the operation's input or output
    * shape. For client-side only parameters, the first character should
    * typically be `$` to avoid any clashes with service parameters.
    */
  var name: String
  /**
    * Whether this input parameter must be provided by the user.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  var `type`: SyntheticParameter
  /**
    * Will be used as the type annotation for this property.
    *
    * Must be a symbol resolvable by the TypeScript compiler.
    *
    * If an imported type is used, it must be referred to as a property of the
    * imported package.
    */
  var typeExpression: String
}

object SyntheticParameterCustomizationDefinition {
  @scala.inline
  def apply(
    documentation: String,
    location: input | output,
    name: String,
    `type`: SyntheticParameter,
    typeExpression: String,
    imports: js.Array[Import] = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): SyntheticParameterCustomizationDefinition = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeExpression = typeExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntheticParameterCustomizationDefinition]
  }
}

