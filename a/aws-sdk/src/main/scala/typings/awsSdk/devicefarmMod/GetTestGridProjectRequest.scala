package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTestGridProjectRequest extends StObject {
  
  /**
    * The ARN of the Selenium testing project, from either CreateTestGridProject or ListTestGridProjects.
    */
  var projectArn: DeviceFarmArn
}
object GetTestGridProjectRequest {
  
  inline def apply(projectArn: DeviceFarmArn): GetTestGridProjectRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTestGridProjectRequest]
  }
  
  extension [Self <: GetTestGridProjectRequest](x: Self) {
    
    inline def setProjectArn(value: DeviceFarmArn): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
  }
}
