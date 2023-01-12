package typings.dateFns.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NearestTo extends StObject {
  
  var nearestTo: js.UndefOr[Double] = js.undefined
  
  var roundingMethod: js.UndefOr[String] = js.undefined
}
object NearestTo {
  
  inline def apply(): NearestTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NearestTo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NearestTo] (val x: Self) extends AnyVal {
    
    inline def setNearestTo(value: Double): Self = StObject.set(x, "nearestTo", value.asInstanceOf[js.Any])
    
    inline def setNearestToUndefined: Self = StObject.set(x, "nearestTo", js.undefined)
    
    inline def setRoundingMethod(value: String): Self = StObject.set(x, "roundingMethod", value.asInstanceOf[js.Any])
    
    inline def setRoundingMethodUndefined: Self = StObject.set(x, "roundingMethod", js.undefined)
  }
}
