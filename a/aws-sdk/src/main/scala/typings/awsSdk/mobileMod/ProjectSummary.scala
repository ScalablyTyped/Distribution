package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectSummary extends StObject {
  
  /**
    *  Name of the project. 
    */
  var name: js.UndefOr[ProjectName] = js.undefined
  
  /**
    *  Unique project identifier. 
    */
  var projectId: js.UndefOr[ProjectId] = js.undefined
}
object ProjectSummary {
  
  inline def apply(): ProjectSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectSummary]
  }
  
  extension [Self <: ProjectSummary](x: Self) {
    
    inline def setName(value: ProjectName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: ProjectId): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
