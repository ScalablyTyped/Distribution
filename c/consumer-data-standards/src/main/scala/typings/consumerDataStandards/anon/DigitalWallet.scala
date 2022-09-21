package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
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

trait DigitalWallet
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var biller: js.UndefOr[BillerCode] = js.undefined
  
  /**
    * The date the payee was created by the customer
    */
  var creationDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A description of the payee provided by the customer
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  var digitalWallet: js.UndefOr[Name] = js.undefined
  
  var domestic: js.UndefOr[Account] = js.undefined
  
  var international: js.UndefOr[BankDetails] = js.undefined
  
  /**
    * The short display name of the payee as provided by the customer. Where a customer has not provided a nickname, a display name derived by the bank for the payee consistent with existing digital banking channels
    */
  var nickname: String
  
  /**
    * ID of the payee adhering to the rules of ID permanence
    */
  var payeeId: String
  
  /**
    * Type of object included that describes the payee in detail
    */
  var payeeUType: biller_ | digitalWallet | domestic_ | international_
  
  /**
    * The type of payee.<br/>DOMESTIC means a registered payee for domestic payments including NPP. <br/>INTERNATIONAL means a registered payee for international payments. <br/>BILLER means a registered payee for BPAY. <br/>DIGITAL_WALLET means a registered payee for a bank's digital wallet
    */
  var `type`: BILLER | DIGITAL_WALLET | DOMESTIC | INTERNATIONAL
}
object DigitalWallet {
  
  inline def apply(
    nickname: String,
    payeeId: String,
    payeeUType: biller_ | digitalWallet | domestic_ | international_,
    `type`: BILLER | DIGITAL_WALLET | DOMESTIC | INTERNATIONAL
  ): DigitalWallet = {
    val __obj = js.Dynamic.literal(nickname = nickname.asInstanceOf[js.Any], payeeId = payeeId.asInstanceOf[js.Any], payeeUType = payeeUType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DigitalWallet]
  }
  
  extension [Self <: DigitalWallet](x: Self) {
    
    inline def setBiller(value: BillerCode): Self = StObject.set(x, "biller", value.asInstanceOf[js.Any])
    
    inline def setBillerUndefined: Self = StObject.set(x, "biller", js.undefined)
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateNull: Self = StObject.set(x, "creationDate", null)
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDigitalWallet(value: Name): Self = StObject.set(x, "digitalWallet", value.asInstanceOf[js.Any])
    
    inline def setDigitalWalletUndefined: Self = StObject.set(x, "digitalWallet", js.undefined)
    
    inline def setDomestic(value: Account): Self = StObject.set(x, "domestic", value.asInstanceOf[js.Any])
    
    inline def setDomesticUndefined: Self = StObject.set(x, "domestic", js.undefined)
    
    inline def setInternational(value: BankDetails): Self = StObject.set(x, "international", value.asInstanceOf[js.Any])
    
    inline def setInternationalUndefined: Self = StObject.set(x, "international", js.undefined)
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setPayeeId(value: String): Self = StObject.set(x, "payeeId", value.asInstanceOf[js.Any])
    
    inline def setPayeeUType(value: biller_ | digitalWallet | domestic_ | international_): Self = StObject.set(x, "payeeUType", value.asInstanceOf[js.Any])
    
    inline def setType(value: BILLER | DIGITAL_WALLET | DOMESTIC | INTERNATIONAL): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
