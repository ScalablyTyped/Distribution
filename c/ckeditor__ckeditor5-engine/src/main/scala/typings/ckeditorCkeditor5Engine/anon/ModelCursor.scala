package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcModelPositionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelCursor extends StObject {
  
  var modelCursor: default
  
  var modelRange: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default
}
object ModelCursor {
  
  inline def apply(modelCursor: default, modelRange: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default): ModelCursor = {
    val __obj = js.Dynamic.literal(modelCursor = modelCursor.asInstanceOf[js.Any], modelRange = modelRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelCursor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelCursor] (val x: Self) extends AnyVal {
    
    inline def setModelCursor(value: default): Self = StObject.set(x, "modelCursor", value.asInstanceOf[js.Any])
    
    inline def setModelRange(value: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default): Self = StObject.set(x, "modelRange", value.asInstanceOf[js.Any])
  }
}
