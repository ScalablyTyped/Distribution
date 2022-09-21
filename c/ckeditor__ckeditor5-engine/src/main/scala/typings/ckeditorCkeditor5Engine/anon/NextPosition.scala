package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.character
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
import typings.ckeditorCkeditor5Engine.textproxyMod.default
import typings.ckeditorCkeditor5Engine.treewalkerMod.TreeWalkerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextPosition
  extends StObject
     with TreeWalkerValue {
  
  var item: default
  
  var length: Double
  
  var nextPosition: typings.ckeditorCkeditor5Engine.positionMod.default
  
  var previousPosition: typings.ckeditorCkeditor5Engine.positionMod.default
  
  var `type`: character | text
}
object NextPosition {
  
  inline def apply(
    item: default,
    length: Double,
    nextPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
    previousPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
    `type`: character | text
  ): NextPosition = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], nextPosition = nextPosition.asInstanceOf[js.Any], previousPosition = previousPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextPosition]
  }
  
  extension [Self <: NextPosition](x: Self) {
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setNextPosition(value: typings.ckeditorCkeditor5Engine.positionMod.default): Self = StObject.set(x, "nextPosition", value.asInstanceOf[js.Any])
    
    inline def setPreviousPosition(value: typings.ckeditorCkeditor5Engine.positionMod.default): Self = StObject.set(x, "previousPosition", value.asInstanceOf[js.Any])
    
    inline def setType(value: character | text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
