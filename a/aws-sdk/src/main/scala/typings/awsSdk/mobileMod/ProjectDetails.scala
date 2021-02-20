package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectDetails extends StObject {
  
  /**
    *  Website URL for this project in the AWS Mobile Hub console. 
    */
  var consoleUrl: js.UndefOr[ConsoleUrl] = js.native
  
  /**
    *  Date the project was created. 
    */
  var createdDate: js.UndefOr[Date] = js.native
  
  /**
    *  Date of the last modification of the project. 
    */
  var lastUpdatedDate: js.UndefOr[Date] = js.native
  
  var name: js.UndefOr[ProjectName] = js.native
  
  var projectId: js.UndefOr[ProjectId] = js.native
  
  var region: js.UndefOr[ProjectRegion] = js.native
  
  var resources: js.UndefOr[Resources] = js.native
  
  var state: js.UndefOr[ProjectState] = js.native
}
object ProjectDetails {
  
  @scala.inline
  def apply(): ProjectDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectDetails]
  }
  
  @scala.inline
  implicit class ProjectDetailsMutableBuilder[Self <: ProjectDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsoleUrl(value: ConsoleUrl): Self = StObject.set(x, "consoleUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsoleUrlUndefined: Self = StObject.set(x, "consoleUrl", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setName(value: ProjectName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProjectId(value: ProjectId): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setRegion(value: ProjectRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setResources(value: Resources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setState(value: ProjectState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
