package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsResponse extends StObject {
  
  /**
    * An array of application summaries.
    */
  var Applications: js.UndefOr[listOfApplicationSummary] = js.undefined
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListApplicationsResponse {
  
  @scala.inline
  def apply(): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsResponse]
  }
  
  @scala.inline
  implicit class ListApplicationsResponseMutableBuilder[Self <: ListApplicationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplications(value: listOfApplicationSummary): Self = StObject.set(x, "Applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsUndefined: Self = StObject.set(x, "Applications", js.undefined)
    
    @scala.inline
    def setApplicationsVarargs(value: ApplicationSummary*): Self = StObject.set(x, "Applications", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
