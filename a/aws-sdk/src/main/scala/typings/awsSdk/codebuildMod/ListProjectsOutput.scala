package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProjectsOutput extends StObject {
  
  /**
    * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string called a nextToken. To get the next batch of items in the list, call this operation again, adding the next token to the call.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of build project names, with each build project name representing a single build project.
    */
  var projects: js.UndefOr[ProjectNames] = js.undefined
}
object ListProjectsOutput {
  
  inline def apply(): ListProjectsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProjectsOutput]
  }
  
  extension [Self <: ListProjectsOutput](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProjects(value: ProjectNames): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    inline def setProjectsVarargs(value: NonEmptyString*): Self = StObject.set(x, "projects", js.Array(value*))
  }
}
