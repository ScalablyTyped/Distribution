package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyPredicate extends StObject {
  
  /**
    * The comparator used to compare this property to others.
    */
  var Comparator: js.UndefOr[typings.awsSdk.glueMod.Comparator] = js.undefined
  
  /**
    * The key of the property.
    */
  var Key: js.UndefOr[ValueString] = js.undefined
  
  /**
    * The value of the property.
    */
  var Value: js.UndefOr[ValueString] = js.undefined
}
object PropertyPredicate {
  
  inline def apply(): PropertyPredicate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyPredicate]
  }
  
  extension [Self <: PropertyPredicate](x: Self) {
    
    inline def setComparator(value: Comparator): Self = StObject.set(x, "Comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "Comparator", js.undefined)
    
    inline def setKey(value: ValueString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: ValueString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
