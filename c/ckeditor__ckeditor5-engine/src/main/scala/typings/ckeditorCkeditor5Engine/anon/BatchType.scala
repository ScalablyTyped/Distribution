package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchType extends StObject {
  
  var batchType: js.UndefOr[String] = js.undefined
  
  var lastRangeBackward: js.UndefOr[Boolean] = js.undefined
  
  var rootName: js.UndefOr[String] = js.undefined
  
  var selectionAttributes: js.UndefOr[js.Array[js.Object]] = js.undefined
}
object BatchType {
  
  inline def apply(): BatchType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchType]
  }
  
  extension [Self <: BatchType](x: Self) {
    
    inline def setBatchType(value: String): Self = StObject.set(x, "batchType", value.asInstanceOf[js.Any])
    
    inline def setBatchTypeUndefined: Self = StObject.set(x, "batchType", js.undefined)
    
    inline def setLastRangeBackward(value: Boolean): Self = StObject.set(x, "lastRangeBackward", value.asInstanceOf[js.Any])
    
    inline def setLastRangeBackwardUndefined: Self = StObject.set(x, "lastRangeBackward", js.undefined)
    
    inline def setRootName(value: String): Self = StObject.set(x, "rootName", value.asInstanceOf[js.Any])
    
    inline def setRootNameUndefined: Self = StObject.set(x, "rootName", js.undefined)
    
    inline def setSelectionAttributes(value: js.Array[js.Object]): Self = StObject.set(x, "selectionAttributes", value.asInstanceOf[js.Any])
    
    inline def setSelectionAttributesUndefined: Self = StObject.set(x, "selectionAttributes", js.undefined)
    
    inline def setSelectionAttributesVarargs(value: js.Object*): Self = StObject.set(x, "selectionAttributes", js.Array(value :_*))
  }
}
