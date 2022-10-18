package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcModelPositionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length extends StObject {
  
  var length: Double
  
  var position: default
}
object Length {
  
  inline def apply(length: Double, position: default): Length = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
  
  extension [Self <: Length](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: default): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
