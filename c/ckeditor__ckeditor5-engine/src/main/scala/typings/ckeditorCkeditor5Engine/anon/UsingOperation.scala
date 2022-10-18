package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcModelRangeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsingOperation extends StObject {
  
  var affectsData: js.UndefOr[Boolean] = js.undefined
  
  var range: js.UndefOr[default] = js.undefined
  
  var usingOperation: js.UndefOr[Boolean] = js.undefined
}
object UsingOperation {
  
  inline def apply(): UsingOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsingOperation]
  }
  
  extension [Self <: UsingOperation](x: Self) {
    
    inline def setAffectsData(value: Boolean): Self = StObject.set(x, "affectsData", value.asInstanceOf[js.Any])
    
    inline def setAffectsDataUndefined: Self = StObject.set(x, "affectsData", js.undefined)
    
    inline def setRange(value: default): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setUsingOperation(value: Boolean): Self = StObject.set(x, "usingOperation", value.asInstanceOf[js.Any])
    
    inline def setUsingOperationUndefined: Self = StObject.set(x, "usingOperation", js.undefined)
  }
}
