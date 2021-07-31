package typings.ckeditorCkeditor5Engine.mod.model

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeWalkerValue extends StObject {
  
  var item: Item
  
  var length: Double
  
  var nextPosition: Position
  
  var previousPosition: Position
  
  var `type`: TreeWalkerValueType
}
object TreeWalkerValue {
  
  @scala.inline
  def apply(
    item: Item,
    length: Double,
    nextPosition: Position,
    previousPosition: Position,
    `type`: TreeWalkerValueType
  ): TreeWalkerValue = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], nextPosition = nextPosition.asInstanceOf[js.Any], previousPosition = previousPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeWalkerValue]
  }
  
  @scala.inline
  implicit class TreeWalkerValueMutableBuilder[Self <: TreeWalkerValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPosition(value: Position): Self = StObject.set(x, "nextPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousPosition(value: Position): Self = StObject.set(x, "previousPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TreeWalkerValueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
