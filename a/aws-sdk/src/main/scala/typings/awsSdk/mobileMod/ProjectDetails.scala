package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectDetails extends StObject {
  
  /**
    *  Website URL for this project in the AWS Mobile Hub console. 
    */
  var consoleUrl: js.UndefOr[ConsoleUrl] = js.undefined
  
  /**
    *  Date the project was created. 
    */
  var createdDate: js.UndefOr[Date] = js.undefined
  
  /**
    *  Date of the last modification of the project. 
    */
  var lastUpdatedDate: js.UndefOr[Date] = js.undefined
  
  var name: js.UndefOr[ProjectName] = js.undefined
  
  var projectId: js.UndefOr[ProjectId] = js.undefined
  
  var region: js.UndefOr[ProjectRegion] = js.undefined
  
  var resources: js.UndefOr[Resources] = js.undefined
  
  var state: js.UndefOr[ProjectState] = js.undefined
}
object ProjectDetails {
  
  inline def apply(): ProjectDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectDetails]
  }
  
  extension [Self <: ProjectDetails](x: Self) {
    
    inline def setConsoleUrl(value: ConsoleUrl): Self = StObject.set(x, "consoleUrl", value.asInstanceOf[js.Any])
    
    inline def setConsoleUrlUndefined: Self = StObject.set(x, "consoleUrl", js.undefined)
    
    inline def setCreatedDate(value: Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setLastUpdatedDate(value: Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
    
    inline def setName(value: ProjectName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: ProjectId): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRegion(value: ProjectRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setResources(value: Resources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    inline def setState(value: ProjectState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
