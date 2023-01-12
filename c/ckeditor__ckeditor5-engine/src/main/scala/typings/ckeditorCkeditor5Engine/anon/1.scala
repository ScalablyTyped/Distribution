package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.MarkerOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var __className: MarkerOperation
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(__className = "MarkerOperation")
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def set__className(value: MarkerOperation): Self = StObject.set(x, "__className", value.asInstanceOf[js.Any])
  }
}
