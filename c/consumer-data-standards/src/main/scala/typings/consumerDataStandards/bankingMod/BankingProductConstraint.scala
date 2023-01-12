package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.MAX_BALANCE
import typings.consumerDataStandards.consumerDataStandardsStrings.MAX_LIMIT
import typings.consumerDataStandards.consumerDataStandardsStrings.MIN_BALANCE
import typings.consumerDataStandards.consumerDataStandardsStrings.MIN_LIMIT
import typings.consumerDataStandards.consumerDataStandardsStrings.OPENING_BALANCE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingProductConstraint
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Display text providing more information the constraint
    */
  var additionalInfo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to a web page with more information on the constraint
    */
  var additionalInfoUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Generic field containing additional information relevant to the [constraintType](#tocSproductconstrainttypedoc) specified.  Whether mandatory or not is dependent on the value of [constraintType](#tocSproductconstrainttypedoc)
    */
  var additionalValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of constraint described.  See the next section for an overview of valid values and their meaning
    */
  var constraintType: MAX_BALANCE | MAX_LIMIT | MIN_BALANCE | MIN_LIMIT | OPENING_BALANCE
}
object BankingProductConstraint {
  
  inline def apply(constraintType: MAX_BALANCE | MAX_LIMIT | MIN_BALANCE | MIN_LIMIT | OPENING_BALANCE): BankingProductConstraint = {
    val __obj = js.Dynamic.literal(constraintType = constraintType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingProductConstraint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BankingProductConstraint] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInfo(value: String): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoNull: Self = StObject.set(x, "additionalInfo", null)
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAdditionalInfoUri(value: String): Self = StObject.set(x, "additionalInfoUri", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUriNull: Self = StObject.set(x, "additionalInfoUri", null)
    
    inline def setAdditionalInfoUriUndefined: Self = StObject.set(x, "additionalInfoUri", js.undefined)
    
    inline def setAdditionalValue(value: String): Self = StObject.set(x, "additionalValue", value.asInstanceOf[js.Any])
    
    inline def setAdditionalValueNull: Self = StObject.set(x, "additionalValue", null)
    
    inline def setAdditionalValueUndefined: Self = StObject.set(x, "additionalValue", js.undefined)
    
    inline def setConstraintType(value: MAX_BALANCE | MAX_LIMIT | MIN_BALANCE | MIN_LIMIT | OPENING_BALANCE): Self = StObject.set(x, "constraintType", value.asInstanceOf[js.Any])
  }
}
