package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedDataIdentifierSummary extends StObject {
  
  /**
    * The category of sensitive data that the managed data identifier detects: CREDENTIALS, for credentials data such as private keys or Amazon Web Services secret access keys; FINANCIAL_INFORMATION, for financial data such as credit card numbers; or, PERSONAL_INFORMATION, for personal health information, such as health insurance identification numbers, or personally identifiable information, such as passport numbers.
    */
  var category: js.UndefOr[SensitiveDataItemCategory] = js.undefined
  
  /**
    * The unique identifier for the managed data identifier. This is a string that describes the type of sensitive data that the managed data identifier detects. For example: OPENSSH_PRIVATE_KEY for OpenSSH private keys, CREDIT_CARD_NUMBER for credit card numbers, or USA_PASSPORT_NUMBER for US passport numbers.
    */
  var id: js.UndefOr[string] = js.undefined
}
object ManagedDataIdentifierSummary {
  
  inline def apply(): ManagedDataIdentifierSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedDataIdentifierSummary]
  }
  
  extension [Self <: ManagedDataIdentifierSummary](x: Self) {
    
    inline def setCategory(value: SensitiveDataItemCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
