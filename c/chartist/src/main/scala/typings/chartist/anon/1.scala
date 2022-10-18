package typings.chartist.anon

import typings.chartist.distCoreTypesMod.Multi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`
  extends StObject
     with Multi {
  
  var y: Double | String | js.Date | Null
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(y = null)
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setY(value: Double | String | js.Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
  }
}
