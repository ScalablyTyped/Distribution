package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.AttributeOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var __className: AttributeOperation
}
object ClassName {
  
  inline def apply(): ClassName = {
    val __obj = js.Dynamic.literal(__className = "AttributeOperation")
    __obj.asInstanceOf[ClassName]
  }
  
  extension [Self <: ClassName](x: Self) {
    
    inline def set__className(value: AttributeOperation): Self = StObject.set(x, "__className", value.asInstanceOf[js.Any])
  }
}
