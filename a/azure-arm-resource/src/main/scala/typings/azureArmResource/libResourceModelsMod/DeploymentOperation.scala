package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentOperation extends StObject {
  
  /**
    * Full deployment operation ID.
    */
  val id: js.UndefOr[String] = js.undefined
  
  /**
    * Deployment operation ID.
    */
  val operationId: js.UndefOr[String] = js.undefined
  
  /**
    * Deployment properties.
    */
  var properties: js.UndefOr[DeploymentOperationProperties] = js.undefined
}
object DeploymentOperation {
  
  inline def apply(): DeploymentOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentOperation] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setProperties(value: DeploymentOperationProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
