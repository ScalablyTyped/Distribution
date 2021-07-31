package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsResponse extends StObject {
  
  /**
    * This list of applications.
    */
  var applications: js.UndefOr[ApplicationSummaries] = js.undefined
  
  /**
    * The token to use to get the next page of results after a previous API call. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
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
    def setApplications(value: ApplicationSummaries): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    @scala.inline
    def setApplicationsVarargs(value: ApplicationSummary*): Self = StObject.set(x, "applications", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
