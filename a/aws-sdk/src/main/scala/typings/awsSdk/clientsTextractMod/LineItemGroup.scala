package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineItemGroup extends StObject {
  
  /**
    * The number used to identify a specific table in a document. The first table encountered will have a LineItemGroupIndex of 1, the second 2, etc.
    */
  var LineItemGroupIndex: js.UndefOr[UInteger] = js.undefined
  
  /**
    * The breakdown of information on a particular line of a table. 
    */
  var LineItems: js.UndefOr[LineItemList] = js.undefined
}
object LineItemGroup {
  
  inline def apply(): LineItemGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineItemGroup]
  }
  
  extension [Self <: LineItemGroup](x: Self) {
    
    inline def setLineItemGroupIndex(value: UInteger): Self = StObject.set(x, "LineItemGroupIndex", value.asInstanceOf[js.Any])
    
    inline def setLineItemGroupIndexUndefined: Self = StObject.set(x, "LineItemGroupIndex", js.undefined)
    
    inline def setLineItems(value: LineItemList): Self = StObject.set(x, "LineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "LineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: LineItemFields*): Self = StObject.set(x, "LineItems", js.Array(value*))
  }
}
