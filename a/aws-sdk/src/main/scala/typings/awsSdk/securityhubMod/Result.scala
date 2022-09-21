package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  /**
    * An Amazon Web Services account ID of the account that was not processed.
    */
  var AccountId: js.UndefOr[typings.awsSdk.securityhubMod.AccountId] = js.undefined
  
  /**
    * The reason that the account was not processed.
    */
  var ProcessingResult: js.UndefOr[NonEmptyString] = js.undefined
}
object Result {
  
  inline def apply(): Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Result]
  }
  
  extension [Self <: Result](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setProcessingResult(value: NonEmptyString): Self = StObject.set(x, "ProcessingResult", value.asInstanceOf[js.Any])
    
    inline def setProcessingResultUndefined: Self = StObject.set(x, "ProcessingResult", js.undefined)
  }
}
