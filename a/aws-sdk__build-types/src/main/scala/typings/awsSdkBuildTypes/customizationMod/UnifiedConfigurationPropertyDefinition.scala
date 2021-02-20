package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.unified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.awsSdkBuildTypes.customizationMod.ConfigurationPropertyDefinitionRuntimeAttributes because var conflicts: imports. Inlined required, default, normalize, apply */ @js.native
trait UnifiedConfigurationPropertyDefinition
  extends ConfigurationPropertyDefinitionSharedAttributes
     with ConfigurationPropertyDefinition {
  
  /**
    * The default (if any) to use should the user not supply a value for this
    * property.
    */
  var default: js.UndefOr[DefaultValue | DefaultProvider] = js.native
  
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
  implicit class UnifiedConfigurationPropertyDefinitionMutableBuilder[Self <: UnifiedConfigurationPropertyDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: String): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    @scala.inline
    def setDefault(value: DefaultValue | DefaultProvider): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setNormalize(value: String): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: unified): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
