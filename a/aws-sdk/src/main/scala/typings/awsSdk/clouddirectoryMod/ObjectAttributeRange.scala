package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectAttributeRange extends StObject {
  
  /**
    * The key of the attribute that the attribute range covers.
    */
  var AttributeKey: js.UndefOr[typings.awsSdk.clouddirectoryMod.AttributeKey] = js.undefined
  
  /**
    * The range of attribute values being selected.
    */
  var Range: js.UndefOr[TypedAttributeValueRange] = js.undefined
}
object ObjectAttributeRange {
  
  inline def apply(): ObjectAttributeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectAttributeRange]
  }
  
  extension [Self <: ObjectAttributeRange](x: Self) {
    
    inline def setAttributeKey(value: AttributeKey): Self = StObject.set(x, "AttributeKey", value.asInstanceOf[js.Any])
    
    inline def setAttributeKeyUndefined: Self = StObject.set(x, "AttributeKey", js.undefined)
    
    inline def setRange(value: TypedAttributeValueRange): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "Range", js.undefined)
  }
}
