package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisioningArtifactParameter extends StObject {
  
  /**
    * The default value.
    */
  var DefaultValue: js.UndefOr[typings.awsSdk.servicecatalogMod.DefaultValue] = js.native
  
  /**
    * The description of the parameter.
    */
  var Description: js.UndefOr[typings.awsSdk.servicecatalogMod.Description] = js.native
  
  /**
    * If this value is true, the value for this parameter is obfuscated from view when the parameter is retrieved. This parameter is used to hide sensitive information.
    */
  var IsNoEcho: js.UndefOr[NoEcho] = js.native
  
  /**
    * Constraints that the administrator has put on a parameter.
    */
  var ParameterConstraints: js.UndefOr[typings.awsSdk.servicecatalogMod.ParameterConstraints] = js.native
  
  /**
    * The parameter key.
    */
  var ParameterKey: js.UndefOr[typings.awsSdk.servicecatalogMod.ParameterKey] = js.native
  
  /**
    * The parameter type.
    */
  var ParameterType: js.UndefOr[typings.awsSdk.servicecatalogMod.ParameterType] = js.native
}
object ProvisioningArtifactParameter {
  
  @scala.inline
  def apply(): ProvisioningArtifactParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactParameter]
  }
  
  @scala.inline
  implicit class ProvisioningArtifactParameterMutableBuilder[Self <: ProvisioningArtifactParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: DefaultValue): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setIsNoEcho(value: NoEcho): Self = StObject.set(x, "IsNoEcho", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNoEchoUndefined: Self = StObject.set(x, "IsNoEcho", js.undefined)
    
    @scala.inline
    def setParameterConstraints(value: ParameterConstraints): Self = StObject.set(x, "ParameterConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterConstraintsUndefined: Self = StObject.set(x, "ParameterConstraints", js.undefined)
    
    @scala.inline
    def setParameterKey(value: ParameterKey): Self = StObject.set(x, "ParameterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterKeyUndefined: Self = StObject.set(x, "ParameterKey", js.undefined)
    
    @scala.inline
    def setParameterType(value: ParameterType): Self = StObject.set(x, "ParameterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterTypeUndefined: Self = StObject.set(x, "ParameterType", js.undefined)
  }
}
