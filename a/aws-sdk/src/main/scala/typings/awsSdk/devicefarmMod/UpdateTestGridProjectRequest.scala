package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTestGridProjectRequest extends StObject {
  
  /**
    * Human-readable description for the project.
    */
  var description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * Human-readable name for the project.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * ARN of the project to update.
    */
  var projectArn: DeviceFarmArn
}
object UpdateTestGridProjectRequest {
  
  inline def apply(projectArn: DeviceFarmArn): UpdateTestGridProjectRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTestGridProjectRequest]
  }
  
  extension [Self <: UpdateTestGridProjectRequest](x: Self) {
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectArn(value: DeviceFarmArn): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
  }
}
