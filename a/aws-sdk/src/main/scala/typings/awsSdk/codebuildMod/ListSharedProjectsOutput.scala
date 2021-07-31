package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSharedProjectsOutput extends StObject {
  
  /**
    *  During a previous call, the maximum number of items that can be returned is the value specified in maxResults. If there more items in the list, then a unique string called a nextToken is returned. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    *  The list of ARNs for the build projects shared with the current AWS account or user. 
    */
  var projects: js.UndefOr[ProjectArns] = js.undefined
}
object ListSharedProjectsOutput {
  
  @scala.inline
  def apply(): ListSharedProjectsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSharedProjectsOutput]
  }
  
  @scala.inline
  implicit class ListSharedProjectsOutputMutableBuilder[Self <: ListSharedProjectsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setProjects(value: ProjectArns): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    @scala.inline
    def setProjectsVarargs(value: NonEmptyString*): Self = StObject.set(x, "projects", js.Array(value :_*))
  }
}
