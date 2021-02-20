package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StickValues extends StObject {
  
  /**
    * The x component of the control stick
    */
  var x: Double = js.native
  
  /**
    * The y component of the control stick
    */
  var y: Double = js.native
}
object StickValues {
  
  @scala.inline
  def apply(x: Double, y: Double): StickValues = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickValues]
  }
  
  @scala.inline
  implicit class StickValuesMutableBuilder[Self <: StickValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
