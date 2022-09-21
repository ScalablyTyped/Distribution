package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnimationKey extends StObject {
  
  /**
    * Frame of the key frame
    */
  var frame: Double
  
  /**
    * The input tangent for the cubic hermite spline
    */
  var inTangent: js.UndefOr[Any] = js.undefined
  
  /**
    * The animation interpolation type
    */
  var interpolation: js.UndefOr[AnimationKeyInterpolation] = js.undefined
  
  /**
    * Property defined by UI tools to link (or not ) the tangents
    */
  var lockedTangent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The output tangent for the cubic hermite spline
    */
  var outTangent: js.UndefOr[Any] = js.undefined
  
  /**
    * Value at the specifies key frame
    */
  var value: Any
}
object IAnimationKey {
  
  inline def apply(frame: Double, value: Any): IAnimationKey = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimationKey]
  }
  
  extension [Self <: IAnimationKey](x: Self) {
    
    inline def setFrame(value: Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setInTangent(value: Any): Self = StObject.set(x, "inTangent", value.asInstanceOf[js.Any])
    
    inline def setInTangentUndefined: Self = StObject.set(x, "inTangent", js.undefined)
    
    inline def setInterpolation(value: AnimationKeyInterpolation): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setLockedTangent(value: Boolean): Self = StObject.set(x, "lockedTangent", value.asInstanceOf[js.Any])
    
    inline def setLockedTangentUndefined: Self = StObject.set(x, "lockedTangent", js.undefined)
    
    inline def setOutTangent(value: Any): Self = StObject.set(x, "outTangent", value.asInstanceOf[js.Any])
    
    inline def setOutTangentUndefined: Self = StObject.set(x, "outTangent", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
