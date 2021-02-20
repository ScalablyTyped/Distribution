package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnimationKey extends StObject {
  
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
  implicit class IAnimationKeyMutableBuilder[Self <: IAnimationKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrame(value: Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInTangent(value: js.Any): Self = StObject.set(x, "inTangent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInTangentUndefined: Self = StObject.set(x, "inTangent", js.undefined)
    
    @scala.inline
    def setInterpolation(value: AnimationKeyInterpolation): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    @scala.inline
    def setOutTangent(value: js.Any): Self = StObject.set(x, "outTangent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutTangentUndefined: Self = StObject.set(x, "outTangent", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
