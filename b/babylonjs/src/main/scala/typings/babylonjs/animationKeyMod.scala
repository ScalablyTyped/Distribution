package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationKeyMod {
  
  @js.native
  sealed trait AnimationKeyInterpolation extends StObject
  @JSImport("babylonjs/Animations/animationKey", "AnimationKeyInterpolation")
  @js.native
  object AnimationKeyInterpolation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AnimationKeyInterpolation & Double] = js.native
    
    /**
      * Do not interpolate between keys and use the start key value only. Tangents are ignored
      */
    @js.native
    sealed trait STEP
      extends StObject
         with AnimationKeyInterpolation
    /* 1 */ val STEP: typings.babylonjs.animationKeyMod.AnimationKeyInterpolation.STEP & Double = js.native
  }
  
  trait IAnimationKey extends StObject {
    
    /**
      * Frame of the key frame
      */
    var frame: Double
    
    /**
      * The input tangent for the cubic hermite spline
      */
    var inTangent: js.UndefOr[js.Any] = js.undefined
    
    /**
      * The animation interpolation type
      */
    var interpolation: js.UndefOr[AnimationKeyInterpolation] = js.undefined
    
    /**
      * The output tangent for the cubic hermite spline
      */
    var outTangent: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Value at the specifies key frame
      */
    var value: js.Any
  }
  object IAnimationKey {
    
    inline def apply(frame: Double, value: js.Any): IAnimationKey = {
      val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAnimationKey]
    }
    
    extension [Self <: IAnimationKey](x: Self) {
      
      inline def setFrame(value: Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setInTangent(value: js.Any): Self = StObject.set(x, "inTangent", value.asInstanceOf[js.Any])
      
      inline def setInTangentUndefined: Self = StObject.set(x, "inTangent", js.undefined)
      
      inline def setInterpolation(value: AnimationKeyInterpolation): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
      
      inline def setOutTangent(value: js.Any): Self = StObject.set(x, "outTangent", value.asInstanceOf[js.Any])
      
      inline def setOutTangentUndefined: Self = StObject.set(x, "outTangent", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
