package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Abn
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Australian Business Number for the authorised entity
    */
  var abn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Australian Company Number for the authorised entity
    */
  var acn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Australian Registered Body Number for the authorised entity
    */
  var arbn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of the authorised entity derived from previously executed direct debits
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the financial institution through which the direct debit will be executed. Is required unless the payment is made via a credit card scheme
    */
  var financialInstitution: js.UndefOr[String | Null] = js.undefined
}
object Abn {
  
  inline def apply(): Abn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Abn]
  }
  
  extension [Self <: Abn](x: Self) {
    
    inline def setAbn(value: String): Self = StObject.set(x, "abn", value.asInstanceOf[js.Any])
    
    inline def setAbnNull: Self = StObject.set(x, "abn", null)
    
    inline def setAbnUndefined: Self = StObject.set(x, "abn", js.undefined)
    
    inline def setAcn(value: String): Self = StObject.set(x, "acn", value.asInstanceOf[js.Any])
    
    inline def setAcnNull: Self = StObject.set(x, "acn", null)
    
    inline def setAcnUndefined: Self = StObject.set(x, "acn", js.undefined)
    
    inline def setArbn(value: String): Self = StObject.set(x, "arbn", value.asInstanceOf[js.Any])
    
    inline def setArbnNull: Self = StObject.set(x, "arbn", null)
    
    inline def setArbnUndefined: Self = StObject.set(x, "arbn", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFinancialInstitution(value: String): Self = StObject.set(x, "financialInstitution", value.asInstanceOf[js.Any])
    
    inline def setFinancialInstitutionNull: Self = StObject.set(x, "financialInstitution", null)
    
    inline def setFinancialInstitutionUndefined: Self = StObject.set(x, "financialInstitution", js.undefined)
  }
}
