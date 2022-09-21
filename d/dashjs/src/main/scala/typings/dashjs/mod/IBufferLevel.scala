package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBufferLevel extends StObject {
  
  var level: Double
  
  var t: js.Date
}
object IBufferLevel {
  
  inline def apply(level: Double, t: js.Date): IBufferLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBufferLevel]
  }
  
  extension [Self <: IBufferLevel](x: Self) {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setT(value: js.Date): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
