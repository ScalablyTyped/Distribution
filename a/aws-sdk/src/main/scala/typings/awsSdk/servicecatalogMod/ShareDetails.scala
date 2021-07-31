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
  
  @scala.inline
  def apply(): ShareDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareDetails]
  }
  
  @scala.inline
  implicit class ShareDetailsMutableBuilder[Self <: ShareDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShareErrors(value: ShareErrors): Self = StObject.set(x, "ShareErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareErrorsUndefined: Self = StObject.set(x, "ShareErrors", js.undefined)
    
    @scala.inline
    def setShareErrorsVarargs(value: ShareError*): Self = StObject.set(x, "ShareErrors", js.Array(value :_*))
    
    @scala.inline
    def setSuccessfulShares(value: SuccessfulShares): Self = StObject.set(x, "SuccessfulShares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulSharesUndefined: Self = StObject.set(x, "SuccessfulShares", js.undefined)
    
    @scala.inline
    def setSuccessfulSharesVarargs(value: AccountId*): Self = StObject.set(x, "SuccessfulShares", js.Array(value :_*))
  }
}
