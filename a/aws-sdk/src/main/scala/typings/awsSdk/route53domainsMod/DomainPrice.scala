package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainPrice extends StObject {
  
  /**
    * The price for changing domain ownership.
    */
  var ChangeOwnershipPrice: js.UndefOr[PriceWithCurrency] = js.undefined
  
  /**
    * The name of the TLD for which the prices apply.
    */
  var Name: js.UndefOr[DomainPriceName] = js.undefined
  
  /**
    * The price for domain registration with Route 53.
    */
  var RegistrationPrice: js.UndefOr[PriceWithCurrency] = js.undefined
  
  /**
    * The price for renewing domain registration with Route 53.
    */
  var RenewalPrice: js.UndefOr[PriceWithCurrency] = js.undefined
  
  /**
    * The price for restoring the domain with Route 53.
    */
  var RestorationPrice: js.UndefOr[PriceWithCurrency] = js.undefined
  
  /**
    * The price for transferring the domain registration to Route 53.
    */
  var TransferPrice: js.UndefOr[PriceWithCurrency] = js.undefined
}
object DomainPrice {
  
  inline def apply(): DomainPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainPrice]
  }
  
  extension [Self <: DomainPrice](x: Self) {
    
    inline def setChangeOwnershipPrice(value: PriceWithCurrency): Self = StObject.set(x, "ChangeOwnershipPrice", value.asInstanceOf[js.Any])
    
    inline def setChangeOwnershipPriceUndefined: Self = StObject.set(x, "ChangeOwnershipPrice", js.undefined)
    
    inline def setName(value: DomainPriceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRegistrationPrice(value: PriceWithCurrency): Self = StObject.set(x, "RegistrationPrice", value.asInstanceOf[js.Any])
    
    inline def setRegistrationPriceUndefined: Self = StObject.set(x, "RegistrationPrice", js.undefined)
    
    inline def setRenewalPrice(value: PriceWithCurrency): Self = StObject.set(x, "RenewalPrice", value.asInstanceOf[js.Any])
    
    inline def setRenewalPriceUndefined: Self = StObject.set(x, "RenewalPrice", js.undefined)
    
    inline def setRestorationPrice(value: PriceWithCurrency): Self = StObject.set(x, "RestorationPrice", value.asInstanceOf[js.Any])
    
    inline def setRestorationPriceUndefined: Self = StObject.set(x, "RestorationPrice", js.undefined)
    
    inline def setTransferPrice(value: PriceWithCurrency): Self = StObject.set(x, "TransferPrice", value.asInstanceOf[js.Any])
    
    inline def setTransferPriceUndefined: Self = StObject.set(x, "TransferPrice", js.undefined)
  }
}
