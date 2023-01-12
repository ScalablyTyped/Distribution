package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.BILLER
import typings.consumerDataStandards.consumerDataStandardsStrings.DIGITAL_WALLET
import typings.consumerDataStandards.consumerDataStandardsStrings.DOMESTIC
import typings.consumerDataStandards.consumerDataStandardsStrings.INTERNATIONAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nickname
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The date the payee was created by the customer
    */
  var creationDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A description of the payee provided by the customer
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The short display name of the payee as provided by the customer. Where a customer has not provided a nickname, a display name derived by the bank for the payee consistent with existing digital banking channels
    */
  var nickname: String
  
  /**
    * ID of the payee adhering to the rules of ID permanence
    */
  var payeeId: String
  
  /**
    * The type of payee.<br/>DOMESTIC means a registered payee for domestic payments including NPP. <br/>INTERNATIONAL means a registered payee for international payments. <br/>BILLER means a registered payee for BPAY. <br/>DIGITAL_WALLET means a registered payee for a bank's digital wallet
    */
  var `type`: BILLER | DIGITAL_WALLET | DOMESTIC | INTERNATIONAL
}
object Nickname {
  
  inline def apply(nickname: String, payeeId: String, `type`: BILLER | DIGITAL_WALLET | DOMESTIC | INTERNATIONAL): Nickname = {
    val __obj = js.Dynamic.literal(nickname = nickname.asInstanceOf[js.Any], payeeId = payeeId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nickname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nickname] (val x: Self) extends AnyVal {
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateNull: Self = StObject.set(x, "creationDate", null)
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setPayeeId(value: String): Self = StObject.set(x, "payeeId", value.asInstanceOf[js.Any])
    
    inline def setType(value: BILLER | DIGITAL_WALLET | DOMESTIC | INTERNATIONAL): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
