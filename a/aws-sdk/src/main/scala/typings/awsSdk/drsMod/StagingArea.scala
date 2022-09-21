package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StagingArea extends StObject {
  
  /**
    * Shows an error message that occurred when DRS tried to access the staging source server. In this case StagingArea$status will have value EXTENSION_ERROR
    */
  var errorMessage: js.UndefOr[LargeBoundedString] = js.undefined
  
  /**
    * Account ID of the account to which source server belongs. If this source server is extended - shows Account ID of staging source server.
    */
  var stagingAccountID: js.UndefOr[AccountID] = js.undefined
  
  /**
    * Arn of the staging source server if this source server is extended
    */
  var stagingSourceServerArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Status of Source server extension. Possible values: (a) NOT_EXTENDED - This is a source server that is replicating in the current account. (b) EXTENDED - Source server is extended from a staging source server. In this case, the value of stagingSourceServerArn is pointing to the Arn of the source server in the staging account. (c) EXTENSION_ERROR - Some issue occurred when accessing staging source server. In this case, errorMessage field will contain an error message that explains what happened.
    */
  var status: js.UndefOr[ExtensionStatus] = js.undefined
}
object StagingArea {
  
  inline def apply(): StagingArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StagingArea]
  }
  
  extension [Self <: StagingArea](x: Self) {
    
    inline def setErrorMessage(value: LargeBoundedString): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setStagingAccountID(value: AccountID): Self = StObject.set(x, "stagingAccountID", value.asInstanceOf[js.Any])
    
    inline def setStagingAccountIDUndefined: Self = StObject.set(x, "stagingAccountID", js.undefined)
    
    inline def setStagingSourceServerArn(value: ARN): Self = StObject.set(x, "stagingSourceServerArn", value.asInstanceOf[js.Any])
    
    inline def setStagingSourceServerArnUndefined: Self = StObject.set(x, "stagingSourceServerArn", js.undefined)
    
    inline def setStatus(value: ExtensionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
