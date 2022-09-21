package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.CONTACT_NAME
import typings.consumerDataStandards.consumerDataStandardsStrings.EMAIL
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.PAYPAL_AU
import typings.consumerDataStandards.consumerDataStandardsStrings.TELEPHONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingDigitalWalletPayee
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The identifier of the digital wallet (dependent on type)
    */
  var identifier: String
  
  /**
    * The name assigned to the digital wallet by the owner of the wallet, else the display name provided by the digital wallet provider
    */
  var name: String
  
  /**
    * The provider of the digital wallet
    */
  var provider: PAYPAL_AU | OTHER
  
  /**
    * The type of the digital wallet identifier
    */
  var `type`: EMAIL | CONTACT_NAME | TELEPHONE
}
object BankingDigitalWalletPayee {
  
  inline def apply(
    identifier: String,
    name: String,
    provider: PAYPAL_AU | OTHER,
    `type`: EMAIL | CONTACT_NAME | TELEPHONE
  ): BankingDigitalWalletPayee = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingDigitalWalletPayee]
  }
  
  extension [Self <: BankingDigitalWalletPayee](x: Self) {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: PAYPAL_AU | OTHER): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setType(value: EMAIL | CONTACT_NAME | TELEPHONE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
