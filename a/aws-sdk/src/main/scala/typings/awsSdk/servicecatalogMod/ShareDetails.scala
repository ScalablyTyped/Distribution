package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareDetails extends StObject {
  
  /**
    * List of errors.
    */
  var ShareErrors: js.UndefOr[typings.awsSdk.servicecatalogMod.ShareErrors] = js.undefined
  
  /**
    * List of accounts for whom the operation succeeded.
    */
  var SuccessfulShares: js.UndefOr[typings.awsSdk.servicecatalogMod.SuccessfulShares] = js.undefined
}
object ShareDetails {
  
  inline def apply(): ShareDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareDetails]
  }
  
  extension [Self <: ShareDetails](x: Self) {
    
    inline def setShareErrors(value: ShareErrors): Self = StObject.set(x, "ShareErrors", value.asInstanceOf[js.Any])
    
    inline def setShareErrorsUndefined: Self = StObject.set(x, "ShareErrors", js.undefined)
    
    inline def setShareErrorsVarargs(value: ShareError*): Self = StObject.set(x, "ShareErrors", js.Array(value :_*))
    
    inline def setSuccessfulShares(value: SuccessfulShares): Self = StObject.set(x, "SuccessfulShares", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulSharesUndefined: Self = StObject.set(x, "SuccessfulShares", js.undefined)
    
    inline def setSuccessfulSharesVarargs(value: AccountId*): Self = StObject.set(x, "SuccessfulShares", js.Array(value :_*))
  }
}
