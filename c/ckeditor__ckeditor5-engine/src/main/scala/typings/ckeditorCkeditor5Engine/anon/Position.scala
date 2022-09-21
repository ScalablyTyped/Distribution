package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.positionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var position: default
  
  var range: typings.ckeditorCkeditor5Engine.rangeMod.default
}
object Position {
  
  inline def apply(position: default, range: typings.ckeditorCkeditor5Engine.rangeMod.default): Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def setPosition(value: default): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typings.ckeditorCkeditor5Engine.rangeMod.default): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
