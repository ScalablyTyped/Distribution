package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisioningParameter extends StObject {
  
  /**
    * The parameter key.
    */
  var Key: js.UndefOr[ParameterKey] = js.native
  
  /**
    * The parameter value.
    */
  var Value: js.UndefOr[ParameterValue] = js.native
}
object ProvisioningParameter {
  
  @scala.inline
  def apply(): ProvisioningParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningParameter]
  }
  
  @scala.inline
  implicit class ProvisioningParameterMutableBuilder[Self <: ProvisioningParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: ParameterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValue(value: ParameterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
