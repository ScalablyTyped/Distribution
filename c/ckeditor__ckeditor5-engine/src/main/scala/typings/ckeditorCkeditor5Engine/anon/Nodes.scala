package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.insert
import typings.ckeditorCkeditor5Engine.nodeMod.default
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nodes extends StObject {
  
  var howMany: Double
  
  var nodes: ReturnType[js.Function0[js.Array[default]]]
  
  var position: ReturnType[js.Function0[Root]]
  
  var shouldReceiveAttributes: Boolean
  
  var `type`: insert
}
object Nodes {
  
  inline def apply(
    howMany: Double,
    nodes: ReturnType[js.Function0[js.Array[default]]],
    position: ReturnType[js.Function0[Root]],
    shouldReceiveAttributes: Boolean
  ): Nodes = {
    val __obj = js.Dynamic.literal(howMany = howMany.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], shouldReceiveAttributes = shouldReceiveAttributes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("insert")
    __obj.asInstanceOf[Nodes]
  }
  
  extension [Self <: Nodes](x: Self) {
    
    inline def setHowMany(value: Double): Self = StObject.set(x, "howMany", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: ReturnType[js.Function0[js.Array[default]]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: ReturnType[js.Function0[Root]]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setShouldReceiveAttributes(value: Boolean): Self = StObject.set(x, "shouldReceiveAttributes", value.asInstanceOf[js.Any])
    
    inline def setType(value: insert): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
