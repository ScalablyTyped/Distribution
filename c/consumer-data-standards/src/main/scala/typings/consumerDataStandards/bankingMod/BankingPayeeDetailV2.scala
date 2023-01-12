package typings.consumerDataStandards.bankingMod

import typings.consumerDataStandards.anon.Account
import typings.consumerDataStandards.anon.BankDetails
import typings.consumerDataStandards.anon.BillerCode
import typings.consumerDataStandards.anon.Name
import typings.consumerDataStandards.consumerDataStandardsStrings.BILLER
import typings.consumerDataStandards.consumerDataStandardsStrings.DIGITAL_WALLET
import typings.consumerDataStandards.consumerDataStandardsStrings.DOMESTIC
import typings.consumerDataStandards.consumerDataStandardsStrings.INTERNATIONAL
import typings.consumerDataStandards.consumerDataStandardsStrings.biller_
import typings.consumerDataStandards.consumerDataStandardsStrings.digitalWallet
import typings.consumerDataStandards.consumerDataStandardsStrings.domestic_
import typings.consumerDataStandards.consumerDataStandardsStrings.international_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingPayeeDetailV2
  extends StObject
     with BankingPayeeV2 {
  
  var biller: js.UndefOr[BillerCode] = js.undefined
  
  var digitalWallet: js.UndefOr[Name] = js.undefined
  
  var domestic: js.UndefOr[Account] = js.undefined
  
  var international: js.UndefOr[BankDetails] = js.undefined
  
  /**
    * Type of object included that describes the payee in detail
    */
  var payeeUType: biller_ | digitalWallet | domestic_ | international_
}
object BankingPayeeDetailV2 {
  
  inline def apply(
    nickname: String,
    payeeId: String,
    payeeUType: biller_ | digitalWallet | domestic_ | international_,
    `type`: BILLER | DIGITAL_WALLET | DOMESTIC | INTERNATIONAL
  ): BankingPayeeDetailV2 = {
    val __obj = js.Dynamic.literal(nickname = nickname.asInstanceOf[js.Any], payeeId = payeeId.asInstanceOf[js.Any], payeeUType = payeeUType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingPayeeDetailV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BankingPayeeDetailV2] (val x: Self) extends AnyVal {
    
    inline def setBiller(value: BillerCode): Self = StObject.set(x, "biller", value.asInstanceOf[js.Any])
    
    inline def setBillerUndefined: Self = StObject.set(x, "biller", js.undefined)
    
    inline def setDigitalWallet(value: Name): Self = StObject.set(x, "digitalWallet", value.asInstanceOf[js.Any])
    
    inline def setDigitalWalletUndefined: Self = StObject.set(x, "digitalWallet", js.undefined)
    
    inline def setDomestic(value: Account): Self = StObject.set(x, "domestic", value.asInstanceOf[js.Any])
    
    inline def setDomesticUndefined: Self = StObject.set(x, "domestic", js.undefined)
    
    inline def setInternational(value: BankDetails): Self = StObject.set(x, "international", value.asInstanceOf[js.Any])
    
    inline def setInternationalUndefined: Self = StObject.set(x, "international", js.undefined)
    
    inline def setPayeeUType(value: biller_ | digitalWallet | domestic_ | international_): Self = StObject.set(x, "payeeUType", value.asInstanceOf[js.Any])
  }
}
