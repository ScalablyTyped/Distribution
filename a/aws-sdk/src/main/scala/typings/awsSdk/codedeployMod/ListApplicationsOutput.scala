package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsOutput extends StObject {
  
  /**
    * A list of application names.
    */
  var applications: js.UndefOr[ApplicationsList] = js.undefined
  
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list applications call to return the next set of applications in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListApplicationsOutput {
  
  @scala.inline
  def apply(): ListApplicationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsOutput]
  }
  
  @scala.inline
  implicit class ListApplicationsOutputMutableBuilder[Self <: ListApplicationsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplications(value: ApplicationsList): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    @scala.inline
    def setApplicationsVarargs(value: ApplicationName*): Self = StObject.set(x, "applications", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
