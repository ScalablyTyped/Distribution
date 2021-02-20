package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceMax extends StObject {
  
  var distance: Double = js.native
  
  var max: Vector3 = js.native
  
  var min: Vector3 = js.native
}
object DistanceMax {
  
  @scala.inline
  def apply(distance: Double, max: Vector3, min: Vector3): DistanceMax = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMax]
  }
  
  @scala.inline
  implicit class DistanceMaxMutableBuilder[Self <: DistanceMax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Vector3): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Vector3): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
