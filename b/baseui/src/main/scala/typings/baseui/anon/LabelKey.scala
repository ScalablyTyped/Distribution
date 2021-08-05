package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelKey extends StObject {
  
  var labelKey: String
  
  var valueKey: String
}
object LabelKey {
  
  inline def apply(labelKey: String, valueKey: String): LabelKey = {
    val __obj = js.Dynamic.literal(labelKey = labelKey.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelKey]
  }
  
  extension [Self <: LabelKey](x: Self) {
    
    inline def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
  }
}
