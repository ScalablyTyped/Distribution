package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.nodeMod.default
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseVersion extends StObject {
  
  var baseVersion: Double | Null
  
  var nodes: ReturnType[js.Function0[js.Array[default]]]
  
  var position: ReturnType[js.Function0[Root]]
  
  var shouldReceiveAttributes: Boolean
}
object BaseVersion {
  
  inline def apply(
    nodes: ReturnType[js.Function0[js.Array[default]]],
    position: ReturnType[js.Function0[Root]],
    shouldReceiveAttributes: Boolean
  ): BaseVersion = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], shouldReceiveAttributes = shouldReceiveAttributes.asInstanceOf[js.Any], baseVersion = null)
    __obj.asInstanceOf[BaseVersion]
  }
  
  extension [Self <: BaseVersion](x: Self) {
    
    inline def setBaseVersion(value: Double): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
    
    inline def setBaseVersionNull: Self = StObject.set(x, "baseVersion", null)
    
    inline def setNodes(value: ReturnType[js.Function0[js.Array[default]]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: ReturnType[js.Function0[Root]]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setShouldReceiveAttributes(value: Boolean): Self = StObject.set(x, "shouldReceiveAttributes", value.asInstanceOf[js.Any])
  }
}
