package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ind extends StObject {
  
  var ind: Double
  
  var sqDistance: Double
}
object Ind {
  
  inline def apply(ind: Double, sqDistance: Double): Ind = {
    val __obj = js.Dynamic.literal(ind = ind.asInstanceOf[js.Any], sqDistance = sqDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ind]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ind] (val x: Self) extends AnyVal {
    
    inline def setInd(value: Double): Self = StObject.set(x, "ind", value.asInstanceOf[js.Any])
    
    inline def setSqDistance(value: Double): Self = StObject.set(x, "sqDistance", value.asInstanceOf[js.Any])
  }
}
