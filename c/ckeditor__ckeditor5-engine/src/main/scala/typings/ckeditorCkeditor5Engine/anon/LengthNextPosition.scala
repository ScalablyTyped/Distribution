package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementEnd
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementStart
import typings.ckeditorCkeditor5Engine.viewElementMod.default
import typings.ckeditorCkeditor5Engine.viewTreewalkerMod.TreeWalkerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LengthNextPosition
  extends StObject
     with TreeWalkerValue {
  
  var item: default
  
  var length: Double
  
  var nextPosition: typings.ckeditorCkeditor5Engine.viewPositionMod.default
  
  var previousPosition: typings.ckeditorCkeditor5Engine.viewPositionMod.default
  
  var `type`: elementStart | elementEnd
}
object LengthNextPosition {
  
  inline def apply(
    item: default,
    length: Double,
    nextPosition: typings.ckeditorCkeditor5Engine.viewPositionMod.default,
    previousPosition: typings.ckeditorCkeditor5Engine.viewPositionMod.default,
    `type`: elementStart | elementEnd
  ): LengthNextPosition = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], nextPosition = nextPosition.asInstanceOf[js.Any], previousPosition = previousPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthNextPosition]
  }
  
  extension [Self <: LengthNextPosition](x: Self) {
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setNextPosition(value: typings.ckeditorCkeditor5Engine.viewPositionMod.default): Self = StObject.set(x, "nextPosition", value.asInstanceOf[js.Any])
    
    inline def setPreviousPosition(value: typings.ckeditorCkeditor5Engine.viewPositionMod.default): Self = StObject.set(x, "previousPosition", value.asInstanceOf[js.Any])
    
    inline def setType(value: elementStart | elementEnd): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
