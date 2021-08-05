package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTestGridProjectRequest extends StObject {
  
  /**
    * The ARN of the project to delete, from CreateTestGridProject or ListTestGridProjects.
    */
  var projectArn: DeviceFarmArn
}
object DeleteTestGridProjectRequest {
  
  inline def apply(projectArn: DeviceFarmArn): DeleteTestGridProjectRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTestGridProjectRequest]
  }
  
  extension [Self <: DeleteTestGridProjectRequest](x: Self) {
    
    inline def setProjectArn(value: DeviceFarmArn): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
  }
}
