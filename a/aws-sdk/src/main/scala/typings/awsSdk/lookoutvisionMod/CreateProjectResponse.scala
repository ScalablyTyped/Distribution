package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectResponse extends StObject {
  
  /**
    * Information about the project.
    */
  var ProjectMetadata: js.UndefOr[typings.awsSdk.lookoutvisionMod.ProjectMetadata] = js.undefined
}
object CreateProjectResponse {
  
  inline def apply(): CreateProjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProjectResponse]
  }
  
  extension [Self <: CreateProjectResponse](x: Self) {
    
    inline def setProjectMetadata(value: ProjectMetadata): Self = StObject.set(x, "ProjectMetadata", value.asInstanceOf[js.Any])
    
    inline def setProjectMetadataUndefined: Self = StObject.set(x, "ProjectMetadata", js.undefined)
  }
}
