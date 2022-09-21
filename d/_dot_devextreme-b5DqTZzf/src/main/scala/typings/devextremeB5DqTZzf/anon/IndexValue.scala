package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexValue extends StObject {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
  
  var valueText: js.UndefOr[String] = js.undefined
}
object IndexValue {
  
  inline def apply(): IndexValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexValue]
  }
  
  extension [Self <: IndexValue](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
    
    inline def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
