package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupByCustomField extends StObject {
  
  var groupByCustomField: js.UndefOr[String] = js.undefined
  
  var settlementDate: String
}
object GroupByCustomField {
  
  inline def apply(settlementDate: String): GroupByCustomField = {
    val __obj = js.Dynamic.literal(settlementDate = settlementDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupByCustomField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupByCustomField] (val x: Self) extends AnyVal {
    
    inline def setGroupByCustomField(value: String): Self = StObject.set(x, "groupByCustomField", value.asInstanceOf[js.Any])
    
    inline def setGroupByCustomFieldUndefined: Self = StObject.set(x, "groupByCustomField", js.undefined)
    
    inline def setSettlementDate(value: String): Self = StObject.set(x, "settlementDate", value.asInstanceOf[js.Any])
  }
}
