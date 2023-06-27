package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingBillerPayee
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * BPAY Biller Code of the Biller
    */
  var billerCode: String
  
  /**
    * Name of the Biller
    */
  var billerName: String
  
  /**
    * BPAY CRN of the Biller (if available).<br/>Where the CRN contains sensitive information, it should be masked in line with how the Data Holder currently displays account identifiers in their existing online banking channels. If the contents of the CRN match the format of a Credit Card PAN they should be masked according to the rules applicable for MaskedPANString. If the contents are otherwise sensitive, then it should be masked using the rules applicable for the MaskedAccountString common type.
    */
  var crn: js.UndefOr[String | Null] = js.undefined
}
object BankingBillerPayee {
  
  inline def apply(billerCode: String, billerName: String): BankingBillerPayee = {
    val __obj = js.Dynamic.literal(billerCode = billerCode.asInstanceOf[js.Any], billerName = billerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingBillerPayee]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BankingBillerPayee] (val x: Self) extends AnyVal {
    
    inline def setBillerCode(value: String): Self = StObject.set(x, "billerCode", value.asInstanceOf[js.Any])
    
    inline def setBillerName(value: String): Self = StObject.set(x, "billerName", value.asInstanceOf[js.Any])
    
    inline def setCrn(value: String): Self = StObject.set(x, "crn", value.asInstanceOf[js.Any])
    
    inline def setCrnNull: Self = StObject.set(x, "crn", null)
    
    inline def setCrnUndefined: Self = StObject.set(x, "crn", js.undefined)
  }
}
