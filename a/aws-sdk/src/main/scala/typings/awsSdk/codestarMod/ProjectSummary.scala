package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var projectArn: js.UndefOr[ProjectArn] = js.undefined
  
  /**
    * The ID of the project.
    */
  var projectId: js.UndefOr[ProjectId] = js.undefined
}
object ProjectSummary {
  
  inline def apply(): ProjectSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectSummary]
  }
  
  extension [Self <: ProjectSummary](x: Self) {
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
    
    inline def setProjectArnUndefined: Self = StObject.set(x, "projectArn", js.undefined)
    
    inline def setProjectId(value: ProjectId): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
