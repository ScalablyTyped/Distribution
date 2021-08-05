package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetProjectsOutput extends StObject {
  
  /**
    * Information about the requested build projects.
    */
  var projects: js.UndefOr[Projects] = js.undefined
  
  /**
    * The names of build projects for which information could not be found.
    */
  var projectsNotFound: js.UndefOr[ProjectNames] = js.undefined
}
object BatchGetProjectsOutput {
  
  inline def apply(): BatchGetProjectsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetProjectsOutput]
  }
  
  extension [Self <: BatchGetProjectsOutput](x: Self) {
    
    inline def setProjects(value: Projects): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsNotFound(value: ProjectNames): Self = StObject.set(x, "projectsNotFound", value.asInstanceOf[js.Any])
    
    inline def setProjectsNotFoundUndefined: Self = StObject.set(x, "projectsNotFound", js.undefined)
    
    inline def setProjectsNotFoundVarargs(value: NonEmptyString*): Self = StObject.set(x, "projectsNotFound", js.Array(value :_*))
    
    inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    inline def setProjectsVarargs(value: Project*): Self = StObject.set(x, "projects", js.Array(value :_*))
  }
}
