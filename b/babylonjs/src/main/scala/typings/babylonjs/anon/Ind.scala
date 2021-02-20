package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ind extends StObject {
  
  var ind: Double = js.native
  
  var sqDistance: Double = js.native
}
object Ind {
  
  @scala.inline
  def apply(ind: Double, sqDistance: Double): Ind = {
    val __obj = js.Dynamic.literal(ind = ind.asInstanceOf[js.Any], sqDistance = sqDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ind]
  }
  
  @scala.inline
  implicit class IndMutableBuilder[Self <: Ind] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInd(value: Double): Self = StObject.set(x, "ind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqDistance(value: Double): Self = StObject.set(x, "sqDistance", value.asInstanceOf[js.Any])
  }
}
