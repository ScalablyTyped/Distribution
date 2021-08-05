package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomOptionsModel extends StObject {
  
  /** The position about which to zoom. */
  var position: Position
}
object ZoomOptionsModel {
  
  inline def apply(position: Position): ZoomOptionsModel = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomOptionsModel]
  }
  
  extension [Self <: ZoomOptionsModel](x: Self) {
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
