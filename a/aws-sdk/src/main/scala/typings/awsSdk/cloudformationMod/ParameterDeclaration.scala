package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterDeclaration extends StObject {
  
  /**
    * The default value of the parameter.
    */
  var DefaultValue: js.UndefOr[ParameterValue] = js.native
  
  /**
    * The description that is associate with the parameter.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  
  /**
    * Flag that indicates whether the parameter value is shown as plain text in logs and in the AWS Management Console.
    */
  var NoEcho: js.UndefOr[typings.awsSdk.cloudformationMod.NoEcho] = js.native
  
  /**
    * The criteria that AWS CloudFormation uses to validate parameter values.
    */
  var ParameterConstraints: js.UndefOr[typings.awsSdk.cloudformationMod.ParameterConstraints] = js.native
  
  /**
    * The name that is associated with the parameter.
    */
  var ParameterKey: js.UndefOr[typings.awsSdk.cloudformationMod.ParameterKey] = js.native
  
  /**
    * The type of parameter.
    */
  var ParameterType: js.UndefOr[typings.awsSdk.cloudformationMod.ParameterType] = js.native
}
object ParameterDeclaration {
  
  @scala.inline
  def apply(): ParameterDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterDeclaration]
  }
  
  @scala.inline
  implicit class ParameterDeclarationMutableBuilder[Self <: ParameterDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: ParameterValue): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setNoEcho(value: NoEcho): Self = StObject.set(x, "NoEcho", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoEchoUndefined: Self = StObject.set(x, "NoEcho", js.undefined)
    
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
