package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectRequest extends StObject {
  
  /**
    * The name of the project to create.
    */
  var ProjectName: typings.awsSdk.rekognitionMod.ProjectName
}
object CreateProjectRequest {
  
  inline def apply(ProjectName: ProjectName): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
  
  extension [Self <: CreateProjectRequest](x: Self) {
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
  }
}
