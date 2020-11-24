package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRFeaturePoint extends js.Object {
  
  /**
    * Represents the confidence value of the feature point in world space. 0 being least confident, and 1 being most confident.
    */
  var confidenceValue: Double = js.native
  
  /**
    * Represents the position of the feature point in world space.
    */
  var position: Vector3 = js.native
}
object IWebXRFeaturePoint {
  
  @scala.inline
  def apply(confidenceValue: Double, position: Vector3): IWebXRFeaturePoint = {
    val __obj = js.Dynamic.literal(confidenceValue = confidenceValue.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRFeaturePoint]
  }
  
  @scala.inline
  implicit class IWebXRFeaturePointOps[Self <: IWebXRFeaturePoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfidenceValue(value: Double): Self = this.set("confidenceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Vector3): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
