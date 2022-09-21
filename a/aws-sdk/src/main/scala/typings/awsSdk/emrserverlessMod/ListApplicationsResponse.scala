package typings.awsSdk.emrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsResponse extends StObject {
  
  /**
    * The output lists the specified applications.
    */
  var applications: ApplicationList
  
  /**
    * The output displays the token for the next set of application results. This is required for pagination and is available as a response of the previous request.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListApplicationsResponse {
  
  inline def apply(applications: ApplicationList): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationsResponse]
  }
  
  extension [Self <: ListApplicationsResponse](x: Self) {
    
    inline def setApplications(value: ApplicationList): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsVarargs(value: ApplicationSummary*): Self = StObject.set(x, "applications", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
