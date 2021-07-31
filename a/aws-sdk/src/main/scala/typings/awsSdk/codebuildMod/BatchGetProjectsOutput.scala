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
  
  @scala.inline
  def apply(): BatchGetProjectsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetProjectsOutput]
  }
  
  @scala.inline
  implicit class BatchGetProjectsOutputMutableBuilder[Self <: BatchGetProjectsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjects(value: Projects): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectsNotFound(value: ProjectNames): Self = StObject.set(x, "projectsNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectsNotFoundUndefined: Self = StObject.set(x, "projectsNotFound", js.undefined)
    
    @scala.inline
    def setProjectsNotFoundVarargs(value: NonEmptyString*): Self = StObject.set(x, "projectsNotFound", js.Array(value :_*))
    
    @scala.inline
    def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    @scala.inline
    def setProjectsVarargs(value: Project*): Self = StObject.set(x, "projects", js.Array(value :_*))
  }
}
