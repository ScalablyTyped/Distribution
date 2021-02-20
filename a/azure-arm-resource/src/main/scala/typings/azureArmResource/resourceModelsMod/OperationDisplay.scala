package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationDisplay extends StObject {
  
  /**
    * Description of the operation.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Operation type: Read, write, delete, etc.
    */
  var operation: js.UndefOr[String] = js.native
  
  /**
    * Service provider: Microsoft.Resources
    */
  var provider: js.UndefOr[String] = js.native
  
  /**
    * Resource on which the operation is performed: Profile, endpoint, etc.
    */
  var resource: js.UndefOr[String] = js.native
}
object OperationDisplay {
  
  @scala.inline
  def apply(): OperationDisplay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationDisplay]
  }
  
  @scala.inline
  implicit class OperationDisplayMutableBuilder[Self <: OperationDisplay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
