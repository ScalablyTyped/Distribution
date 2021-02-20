package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVRPresentationAttributes extends StObject {
  
  /**
    * Enables foveation in VR to improve perf. 0 none, 1 low, 2 medium, 3 high (Default is 1)
    */
  var foveationLevel: Double = js.native
  
  /**
    * Defines a boolean indicating that we want to get 72hz mode on Oculus Browser (default is off eg. 60hz)
    */
  var highRefreshRate: Boolean = js.native
}
object IVRPresentationAttributes {
  
  @scala.inline
  def apply(foveationLevel: Double, highRefreshRate: Boolean): IVRPresentationAttributes = {
    val __obj = js.Dynamic.literal(foveationLevel = foveationLevel.asInstanceOf[js.Any], highRefreshRate = highRefreshRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVRPresentationAttributes]
  }
  
  @scala.inline
  implicit class IVRPresentationAttributesMutableBuilder[Self <: IVRPresentationAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFoveationLevel(value: Double): Self = StObject.set(x, "foveationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighRefreshRate(value: Boolean): Self = StObject.set(x, "highRefreshRate", value.asInstanceOf[js.Any])
  }
}
