package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.anon.AllowVaultCardOverride
import typings.braintreeWebDropIn.anon.Fields
import typings.braintreeWebDropIn.anon.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait cardCreateOptions extends StObject {
  
  var cardholderName: js.UndefOr[Boolean | Required] = js.undefined
  
  var clearFieldsAfterTokenization: js.UndefOr[Boolean] = js.undefined
  
  var overrides: js.UndefOr[Fields] = js.undefined
  
  var vault: js.UndefOr[AllowVaultCardOverride] = js.undefined
}
object cardCreateOptions {
  
  @scala.inline
  def apply(): cardCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[cardCreateOptions]
  }
  
  @scala.inline
  implicit class cardCreateOptionsMutableBuilder[Self <: cardCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardholderName(value: Boolean | Required): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardholderNameUndefined: Self = StObject.set(x, "cardholderName", js.undefined)
    
    @scala.inline
    def setClearFieldsAfterTokenization(value: Boolean): Self = StObject.set(x, "clearFieldsAfterTokenization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearFieldsAfterTokenizationUndefined: Self = StObject.set(x, "clearFieldsAfterTokenization", js.undefined)
    
    @scala.inline
    def setOverrides(value: Fields): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setVault(value: AllowVaultCardOverride): Self = StObject.set(x, "vault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultUndefined: Self = StObject.set(x, "vault", js.undefined)
  }
}
