package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.unified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.awsSdkBuildTypes.customizationMod.ConfigurationPropertyDefinitionRuntimeAttributes because var conflicts: imports. Inlined required, default, normalize, apply */ @js.native
trait UnifiedConfigurationPropertyDefinition
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
  var apply: js.UndefOr[String] = js.native
  /**
    * The default (if any) to use should the user not supply a value for this
    * property.
    */
  var default: js.UndefOr[DefaultValue | DefaultProvider] = js.native
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
  var normalize: js.UndefOr[String] = js.native
  /**
    * Whether the user must supply a value for this property.
    */
  var required: Boolean = js.native
  var `type`: unified = js.native
}

object UnifiedConfigurationPropertyDefinition {
  @scala.inline
  def apply(documentation: String, inputType: String, required: Boolean, `type`: unified): UnifiedConfigurationPropertyDefinition = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnifiedConfigurationPropertyDefinition]
  }
  @scala.inline
  implicit class UnifiedConfigurationPropertyDefinitionOps[Self <: UnifiedConfigurationPropertyDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: unified): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setApply(value: String): Self = this.set("apply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApply: Self = this.set("apply", js.undefined)
    @scala.inline
    def setDefault(value: DefaultValue | DefaultProvider): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setNormalize(value: String): Self = this.set("normalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
  }
  
}

