package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnimationKey extends js.Object {
  
  /**
    * Frame of the key frame
    */
  var frame: Double = js.native
  
  /**
    * The input tangent for the cubic hermite spline
    */
  var inTangent: js.UndefOr[js.Any] = js.native
  
  /**
    * The animation interpolation type
    */
  var interpolation: js.UndefOr[AnimationKeyInterpolation] = js.native
  
  /**
    * The output tangent for the cubic hermite spline
    */
  var outTangent: js.UndefOr[js.Any] = js.native
  
  /**
    * Value at the specifies key frame
    */
  var value: js.Any = js.native
}
object IAnimationKey {
  
  @scala.inline
  def apply(frame: Double, value: js.Any): IAnimationKey = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimationKey]
  }
  
  @scala.inline
  implicit class IAnimationKeyOps[Self <: IAnimationKey] (val x: Self) extends AnyVal {
    
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
    def setFrame(value: Double): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInTangent(value: js.Any): Self = this.set("inTangent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInTangent: Self = this.set("inTangent", js.undefined)
    
    @scala.inline
    def setInterpolation(value: AnimationKeyInterpolation): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
    
    @scala.inline
    def setOutTangent(value: js.Any): Self = this.set("outTangent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutTangent: Self = this.set("outTangent", js.undefined)
  }
}
