package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructValue extends StObject {
  
  /**
    * The attributes returned in the record.
    */
  var attributes: js.UndefOr[ArrayValueList] = js.undefined
}
object StructValue {
  
  inline def apply(): StructValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructValue]
  }
  
  extension [Self <: StructValue](x: Self) {
    
    inline def setAttributes(value: ArrayValueList): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Value*): Self = StObject.set(x, "attributes", js.Array(value*))
  }
}
