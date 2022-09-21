package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLaunchRequest extends StObject {
  
  /**
    * The name of the launch to delete.
    */
  var launch: LaunchName
  
  /**
    * The name or ARN of the project that contains the launch to delete.
    */
  var project: ProjectRef
}
object DeleteLaunchRequest {
  
  inline def apply(launch: LaunchName, project: ProjectRef): DeleteLaunchRequest = {
    val __obj = js.Dynamic.literal(launch = launch.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLaunchRequest]
  }
  
  extension [Self <: DeleteLaunchRequest](x: Self) {
    
    inline def setLaunch(value: LaunchName): Self = StObject.set(x, "launch", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
