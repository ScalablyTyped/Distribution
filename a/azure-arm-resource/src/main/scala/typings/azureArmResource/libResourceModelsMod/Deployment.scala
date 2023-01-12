package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deployment extends StObject {
  
  /**
    * The location to store the deployment data.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The deployment properties.
    */
  var properties: DeploymentProperties
}
object Deployment {
  
  inline def apply(properties: DeploymentProperties): Deployment = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setProperties(value: DeploymentProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
