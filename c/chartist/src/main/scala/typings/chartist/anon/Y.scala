package typings.chartist.anon

import typings.chartist.coreTypesMod.Multi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y
  extends StObject
     with Multi {
  
  var x: Double | String | js.Date | Null
  
  var y: Double | String | js.Date | Null
}
object Y {
  
  inline def apply(): Y = {
    val __obj = js.Dynamic.literal(x = null, y = null)
    __obj.asInstanceOf[Y]
  }
  
  extension [Self <: Y](x: Self) {
    
    inline def setX(value: Double | String | js.Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
    
    inline def setY(value: Double | String | js.Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
  }
}
