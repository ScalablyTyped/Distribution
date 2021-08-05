package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var position: Cartesian2
}
object Position {
  
  inline def apply(position: Cartesian2): Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def setPosition(value: Cartesian2): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
