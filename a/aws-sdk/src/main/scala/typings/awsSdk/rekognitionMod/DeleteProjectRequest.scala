package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the project that you want to delete.
    */
  var ProjectArn: typings.awsSdk.rekognitionMod.ProjectArn
}
object DeleteProjectRequest {
  
  inline def apply(ProjectArn: ProjectArn): DeleteProjectRequest = {
    val __obj = js.Dynamic.literal(ProjectArn = ProjectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectRequest]
  }
  
  extension [Self <: DeleteProjectRequest](x: Self) {
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
  }
}
