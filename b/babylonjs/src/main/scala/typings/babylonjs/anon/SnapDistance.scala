package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapDistance extends StObject {
  
  var snapDistance: Double = js.native
}
object SnapDistance {
  
  @scala.inline
  def apply(snapDistance: Double): SnapDistance = {
    val __obj = js.Dynamic.literal(snapDistance = snapDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapDistance]
  }
  
  @scala.inline
  implicit class SnapDistanceMutableBuilder[Self <: SnapDistance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapDistance(value: Double): Self = StObject.set(x, "snapDistance", value.asInstanceOf[js.Any])
  }
}
