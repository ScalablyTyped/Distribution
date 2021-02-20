package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentOperation extends StObject {
  
  /**
    * Full deployment operation ID.
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * Deployment operation ID.
    */
  val operationId: js.UndefOr[String] = js.native
  
  /**
    * Deployment properties.
    */
  var properties: js.UndefOr[DeploymentOperationProperties] = js.native
}
object DeploymentOperation {
  
  @scala.inline
  def apply(): DeploymentOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentOperation]
  }
  
  @scala.inline
  implicit class DeploymentOperationMutableBuilder[Self <: DeploymentOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setProperties(value: DeploymentOperationProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
