package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position1 extends StObject {
  
  var position1: Cartesian2
  
  var position2: Cartesian2
}
object Position1 {
  
  inline def apply(position1: Cartesian2, position2: Cartesian2): Position1 = {
    val __obj = js.Dynamic.literal(position1 = position1.asInstanceOf[js.Any], position2 = position2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position1]
  }
  
  extension [Self <: Position1](x: Self) {
    
    inline def setPosition1(value: Cartesian2): Self = StObject.set(x, "position1", value.asInstanceOf[js.Any])
    
    inline def setPosition2(value: Cartesian2): Self = StObject.set(x, "position2", value.asInstanceOf[js.Any])
  }
}
