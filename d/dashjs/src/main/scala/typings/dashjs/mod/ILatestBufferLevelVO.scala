package typings.dashjs.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILatestBufferLevelVO extends StObject {
  
  var level: Double
  
  var t: Date
}
object ILatestBufferLevelVO {
  
  inline def apply(level: Double, t: Date): ILatestBufferLevelVO = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILatestBufferLevelVO]
  }
  
  extension [Self <: ILatestBufferLevelVO](x: Self) {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setT(value: Date): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
