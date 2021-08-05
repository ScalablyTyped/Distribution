package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportProjectRequest extends StObject {
  
  /**
    *  Unique project identifier. 
    */
  var projectId: ProjectId
}
object ExportProjectRequest {
  
  inline def apply(projectId: ProjectId): ExportProjectRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportProjectRequest]
  }
  
  extension [Self <: ExportProjectRequest](x: Self) {
    
    inline def setProjectId(value: ProjectId): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
  }
}
