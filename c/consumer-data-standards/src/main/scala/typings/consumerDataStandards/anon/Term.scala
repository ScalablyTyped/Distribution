package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ANNUAL
import typings.consumerDataStandards.consumerDataStandardsStrings.BIANNUAL
import typings.consumerDataStandards.consumerDataStandardsStrings.CC_PROCESSING
import typings.consumerDataStandards.consumerDataStandardsStrings.CHEQUE_DISHONOUR
import typings.consumerDataStandards.consumerDataStandardsStrings.CONNECTION
import typings.consumerDataStandards.consumerDataStandardsStrings.CONTRIBUTION
import typings.consumerDataStandards.consumerDataStandardsStrings.DAILY
import typings.consumerDataStandards.consumerDataStandardsStrings.DD_DISHONOUR
import typings.consumerDataStandards.consumerDataStandardsStrings.DISCONNECTION
import typings.consumerDataStandards.consumerDataStandardsStrings.DISCONNECT_MOVE_OUT
import typings.consumerDataStandards.consumerDataStandardsStrings.DISCONNECT_NON_PAY
import typings.consumerDataStandards.consumerDataStandardsStrings.ESTABLISHMENT
import typings.consumerDataStandards.consumerDataStandardsStrings.EXIT
import typings.consumerDataStandards.consumerDataStandardsStrings.FIXED
import typings.consumerDataStandards.consumerDataStandardsStrings.LATE_PAYMENT
import typings.consumerDataStandards.consumerDataStandardsStrings.MEMBERSHIP
import typings.consumerDataStandards.consumerDataStandardsStrings.MONTHLY
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.PAPER_BILL
import typings.consumerDataStandards.consumerDataStandardsStrings.PAYMENT_PROCESSING
import typings.consumerDataStandards.consumerDataStandardsStrings.PERCENT_OF_BILL
import typings.consumerDataStandards.consumerDataStandardsStrings.RECONNECTION
import typings.consumerDataStandards.consumerDataStandardsStrings.VARIABLE
import typings.consumerDataStandards.consumerDataStandardsStrings.WEEKLY
import typings.consumerDataStandards.consumerDataStandardsStrings.`1_YEAR`
import typings.consumerDataStandards.consumerDataStandardsStrings.`2_YEAR`
import typings.consumerDataStandards.consumerDataStandardsStrings.`3_YEAR`
import typings.consumerDataStandards.consumerDataStandardsStrings.`4_YEAR`
import typings.consumerDataStandards.consumerDataStandardsStrings.`5_YEAR`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Term
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The fee amount. Required if term is not PERCENT_OF_BILL
    */
  var amount: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the fee
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The fee rate. Required if term is PERCENT_OF_BILL
    */
  var rate: js.UndefOr[String] = js.undefined
  
  /**
    * The term of the fee
    */
  var term: FIXED | `1_YEAR` | `2_YEAR` | `3_YEAR` | `4_YEAR` | `5_YEAR` | PERCENT_OF_BILL | ANNUAL | DAILY | WEEKLY | MONTHLY | BIANNUAL | VARIABLE
  
  /**
    * The type of the fee
    */
  var `type`: EXIT | ESTABLISHMENT | LATE_PAYMENT | DISCONNECTION | DISCONNECT_MOVE_OUT | DISCONNECT_NON_PAY | RECONNECTION | CONNECTION | PAYMENT_PROCESSING | CC_PROCESSING | CHEQUE_DISHONOUR | DD_DISHONOUR | MEMBERSHIP | CONTRIBUTION | PAPER_BILL | OTHER
}
object Term {
  
  inline def apply(
    term: FIXED | `1_YEAR` | `2_YEAR` | `3_YEAR` | `4_YEAR` | `5_YEAR` | PERCENT_OF_BILL | ANNUAL | DAILY | WEEKLY | MONTHLY | BIANNUAL | VARIABLE,
    `type`: EXIT | ESTABLISHMENT | LATE_PAYMENT | DISCONNECTION | DISCONNECT_MOVE_OUT | DISCONNECT_NON_PAY | RECONNECTION | CONNECTION | PAYMENT_PROCESSING | CC_PROCESSING | CHEQUE_DISHONOUR | DD_DISHONOUR | MEMBERSHIP | CONTRIBUTION | PAPER_BILL | OTHER
  ): Term = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Term]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Term] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setTerm(
      value: FIXED | `1_YEAR` | `2_YEAR` | `3_YEAR` | `4_YEAR` | `5_YEAR` | PERCENT_OF_BILL | ANNUAL | DAILY | WEEKLY | MONTHLY | BIANNUAL | VARIABLE
    ): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: EXIT | ESTABLISHMENT | LATE_PAYMENT | DISCONNECTION | DISCONNECT_MOVE_OUT | DISCONNECT_NON_PAY | RECONNECTION | CONNECTION | PAYMENT_PROCESSING | CC_PROCESSING | CHEQUE_DISHONOUR | DD_DISHONOUR | MEMBERSHIP | CONTRIBUTION | PAPER_BILL | OTHER
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
