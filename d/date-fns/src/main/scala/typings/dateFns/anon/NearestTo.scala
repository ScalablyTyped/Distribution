package typings.dateFns.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NearestTo extends StObject {
  
  var nearestTo: js.UndefOr[Double] = js.undefined
}
object NearestTo {
  
  inline def apply(): NearestTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NearestTo]
  }
  
  extension [Self <: NearestTo](x: Self) {
    
    inline def setNearestTo(value: Double): Self = StObject.set(x, "nearestTo", value.asInstanceOf[js.Any])
    
    inline def setNearestToUndefined: Self = StObject.set(x, "nearestTo", js.undefined)
  }
}
