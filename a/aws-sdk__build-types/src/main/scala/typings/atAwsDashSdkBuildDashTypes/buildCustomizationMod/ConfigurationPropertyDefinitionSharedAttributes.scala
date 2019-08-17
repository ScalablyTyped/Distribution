package typings.atAwsDashSdkBuildDashTypes.buildCustomizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationPropertyDefinitionSharedAttributes extends js.Object {
  /**
    * The documentation string that should be injected over this configuration
    * property. Should be in standard JSDoc format and expect to be indented by
    * 4 spaces.
    */
  var documentation: String
  /**
    * Packages that must be imported to use this configuration property.
    * Packages will be imported using the `import * as ${snake_case_package_name} from 'package-name';`
    * syntax.
    */
  var imports: js.UndefOr[js.Array[Import]] = js.undefined
  /**
    * Will be used as the `InputType` type parameter to the generated
    * `ConfigurationPropertyDefinition` for this configuration property.
    *
    * Must be a symbol resolvable by the TypeScript compiler.
    *
    * If an imported type is used, it must be referred to as a property of the
    * imported package.
    */
  var inputType: String
  /**
    * Whether this property represents internal state about an SDK client that
    * is not meant to be controlled by users of that client.
    *
    * If `true`, the property will not appear in the client's configuration
    * interface but will appear in the client's resolved configuration
    * interface.
    */
  var internal: js.UndefOr[Boolean] = js.undefined
  /**
    * The type to which this property will be normalized. It should only be
    * specified if different from the property's inputType (in which case it
    * must be a subtype thereof).
    *
    * Must be a symbol resolvable by the TypeScript compiler.
    *
    * If an imported type is used, it must be referred to as a property of the
    * imported package.
    */
  var resolvedType: js.UndefOr[String] = js.undefined
}

object ConfigurationPropertyDefinitionSharedAttributes {
  @scala.inline
  def apply(
    documentation: String,
    inputType: String,
    imports: js.Array[Import] = null,
    internal: js.UndefOr[Boolean] = js.undefined,
    resolvedType: String = null
  ): ConfigurationPropertyDefinitionSharedAttributes = {
    val __obj = js.Dynamic.literal(documentation = documentation, inputType = inputType)
    if (imports != null) __obj.updateDynamic("imports")(imports)
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    if (resolvedType != null) __obj.updateDynamic("resolvedType")(resolvedType)
    __obj.asInstanceOf[ConfigurationPropertyDefinitionSharedAttributes]
  }
}

