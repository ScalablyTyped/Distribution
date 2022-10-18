package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMailboxExportJobsResponse extends StObject {
  
  /**
    * The mailbox export job details.
    */
  var Jobs: js.UndefOr[typings.awsSdk.clientsWorkmailMod.Jobs] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsWorkmailMod.NextToken] = js.undefined
}
object ListMailboxExportJobsResponse {
  
  inline def apply(): ListMailboxExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMailboxExportJobsResponse]
  }
  
  extension [Self <: ListMailboxExportJobsResponse](x: Self) {
    
    inline def setJobs(value: Jobs): Self = StObject.set(x, "Jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "Jobs", js.undefined)
    
    inline def setJobsVarargs(value: MailboxExportJob*): Self = StObject.set(x, "Jobs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
