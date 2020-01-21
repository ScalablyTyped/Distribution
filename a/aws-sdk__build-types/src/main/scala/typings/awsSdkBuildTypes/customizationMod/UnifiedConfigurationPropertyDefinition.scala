package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.unified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.awsSdkBuildTypes.customizationMod.ConfigurationPropertyDefinitionRuntimeAttributes because var conflicts: imports. Inlined required, default, normalize, apply */ trait UnifiedConfigurationPropertyDefinition
  extends ConfigurationPropertyDefinitionSharedAttributes
     with ConfigurationPropertyDefinition {
  /**
    * A string containing a valid TypeScript expression that evaluates to a
    * function that, when called, will react to the value supplied for this
    * configuration property. Examples of actions taken during `apply` handlers
    * include altering the configuration object or the client middleware stack.
    *
    * This function will be called with the full configuration object at its
    * current point in processing.
    *
    * If an imported type is used, it must be referred to as a property of the
    * imported package.
    */
  @JSName("apply")
  var apply: js.UndefOr[String] = js.undefined
  /**
    * The default (if any) to use should the user not supply a value for this
    * property.
    */
  var default: js.UndefOr[DefaultValue | DefaultProvider] = js.undefined
  /**
    * A string containing a valid TypeScript expression that evaluates to a
    * function that will normalize user input to a subtype of the allowed input
    * type union.
    *
    * This function will be called with the supplied input and the full
    * configuration object at its current point in processing. The function
    * must return the normalized input.
    *
    * This function will not be called if the user did not supply a value.
    *
    * If an imported type is used, it must be referred to as a property of the
    * imported package.
    */
  var normalize: js.UndefOr[String] = js.undefined
  /**
    * Whether the user must supply a value for this property.
    */
  var required: Boolean
  var `type`: unified
}

object UnifiedConfigurationPropertyDefinition {
  @scala.inline
  def apply(
    documentation: String,
    inputType: String,
    required: Boolean,
    `type`: unified,
    apply: String = null,
    default: DefaultValue | DefaultProvider = null,
    imports: js.Array[Import] = null,
    internal: js.UndefOr[Boolean] = js.undefined,
    normalize: String = null,
    resolvedType: String = null
  ): UnifiedConfigurationPropertyDefinition = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (apply != null) __obj.updateDynamic("apply")(apply.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    if (resolvedType != null) __obj.updateDynamic("resolvedType")(resolvedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnifiedConfigurationPropertyDefinition]
  }
}

