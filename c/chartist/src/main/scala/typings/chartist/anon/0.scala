package typings.chartist.anon

import typings.chartist.distCoreTypesMod.Multi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with Multi {
  
  var x: Double | String | js.Date | Null
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(x = null)
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setX(value: Double | String | js.Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
  }
}
