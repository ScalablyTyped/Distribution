package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mag extends StObject {
  
  var mag: Double = js.native
  
  var min: Double = js.native
}
object Mag {
  
  @scala.inline
  def apply(mag: Double, min: Double): Mag = {
    val __obj = js.Dynamic.literal(mag = mag.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mag]
  }
  
  @scala.inline
  implicit class MagMutableBuilder[Self <: Mag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMag(value: Double): Self = StObject.set(x, "mag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
