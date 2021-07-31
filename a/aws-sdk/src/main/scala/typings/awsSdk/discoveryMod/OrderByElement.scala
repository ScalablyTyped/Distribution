package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderByElement extends StObject {
  
  /**
    * The field on which to order.
    */
  var fieldName: String
  
  /**
    * Ordering direction.
    */
  var sortOrder: js.UndefOr[orderString] = js.undefined
}
object OrderByElement {
  
  @scala.inline
  def apply(fieldName: String): OrderByElement = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderByElement]
  }
  
  @scala.inline
  implicit class OrderByElementMutableBuilder[Self <: OrderByElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrder(value: orderString): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
