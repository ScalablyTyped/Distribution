package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationsEasingMod {
  
  @JSImport("babylonjs/Animations/easing", "BackEase")
  @js.native
  /**
    * Instantiates a back ease easing
    * @see https://easings.net/#easeInBack
    * @param amplitude Defines the amplitude of the function
    */
  open class BackEase () extends EasingFunction {
    def this(/** Defines the amplitude of the function */
    amplitude: Double) = this()
    
    /** Defines the amplitude of the function */
    var amplitude: Double = js.native
  }
  
  @JSImport("babylonjs/Animations/easing", "BezierCurveEase")
  @js.native
  /**
    * Instantiates a bezier function
    * @see http://cubic-bezier.com/#.17,.67,.83,.67
    * @param x1 Defines the x component of the start tangent in the bezier curve
    * @param y1 Defines the y component of the start tangent in the bezier curve
    * @param x2 Defines the x component of the end tangent in the bezier curve
    * @param y2 Defines the y component of the end tangent in the bezier curve
    */
  open class BezierCurveEase () extends EasingFunction {
    def this(/** Defines the x component of the start tangent in the bezier curve */
    x1: Double) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Unit,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Unit,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Unit,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Unit,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Unit,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Unit,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Unit,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Unit,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Unit,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Unit,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Unit,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Unit,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Unit,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Unit,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Unit,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Unit,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Unit,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    
    /** Defines the x component of the start tangent in the bezier curve */
    var x1: Double = js.native
    
    /** Defines the x component of the end tangent in the bezier curve */
    var x2: Double = js.native
    
    /** Defines the y component of the start tangent in the bezier curve */
    var y1: Double = js.native
    
    /** Defines the y component of the end tangent in the bezier curve */
    var y2: Double = js.native
  }
  
  @JSImport("babylonjs/Animations/easing", "BounceEase")
  @js.native
  /**
    * Instantiates a bounce easing
    * @see https://easings.net/#easeInBounce
    * @param bounces Defines the number of bounces
    * @param bounciness Defines the amplitude of the bounce
    */
  open class BounceEase () extends EasingFunction {
    def this(/** Defines the number of bounces */
    bounces: Double) = this()
    def this(
      /** Defines the number of bounces */
    bounces: Double,
      /** Defines the amplitude of the bounce */
    bounciness: Double
    ) = this()
    def this(
      /** Defines the number of bounces */
    bounces: Unit,
      /** Defines the amplitude of the bounce */
    bounciness: Double
    ) = this()
    
    /** Defines the number of bounces */
    var bounces: Double = js.native
    
    /** Defines the amplitude of the bounce */
    var bounciness: Double = js.native
  }
  
  @JSImport("babylonjs/Animations/easing", "CircleEase")
  @js.native
  open class CircleEase () extends EasingFunction
  
  @JSImport("babylonjs/Animations/easing", "CubicEase")
  @js.native
  open class CubicEase () extends EasingFunction
  
  @JSImport("babylonjs/Animations/easing", "EasingFunction")
  @js.native
  open class EasingFunction ()
    extends StObject
       with IEasingFunction {
    
    /* private */ var _easingMode: Any = js.native
    
    /**
      * Given an input gradient between 0 and 1, this returns the corresponding value
      * of the easing function.
      * The link below provides some of the most common examples of easing functions.
      * @see https://easings.net/
      * @param gradient Defines the value between 0 and 1 we want the easing value for
      * @returns the corresponding value on the curve defined by the easing function
      */
    /* CompleteClass */
    override def ease(gradient: Double): Double = js.native
    
    /**
      * @internal
      */
    def easeInCore(gradient: Double): Double = js.native
    
    /**
      * Gets the current easing mode.
      * @returns the easing mode
      */
    def getEasingMode(): Double = js.native
    
    /**
      * Sets the easing mode of the current function.
      * @param easingMode Defines the willing mode (EASINGMODE_EASEIN, EASINGMODE_EASEOUT or EASINGMODE_EASEINOUT)
      */
    def setEasingMode(easingMode: Double): Unit = js.native
  }
  /* static members */
  object EasingFunction {
    
    /**
      * Interpolation follows the mathematical formula associated with the easing function.
      */
    @JSImport("babylonjs/Animations/easing", "EasingFunction.EASINGMODE_EASEIN")
    @js.native
    val EASINGMODE_EASEIN: Double = js.native
    
    /**
      * Interpolation uses EaseIn for the first half of the animation and EaseOut for the second half.
      */
    @JSImport("babylonjs/Animations/easing", "EasingFunction.EASINGMODE_EASEINOUT")
    @js.native
    val EASINGMODE_EASEINOUT: Double = js.native
    
    /**
      * Interpolation follows 100% interpolation minus the output of the formula associated with the easing function.
      */
    @JSImport("babylonjs/Animations/easing", "EasingFunction.EASINGMODE_EASEOUT")
    @js.native
    val EASINGMODE_EASEOUT: Double = js.native
  }
  
  @JSImport("babylonjs/Animations/easing", "ElasticEase")
  @js.native
  /**
    * Instantiates an elastic easing function
    * @see https://easings.net/#easeInElastic
    * @param oscillations Defines the number of oscillations
    * @param springiness Defines the amplitude of the oscillations
    */
  open class ElasticEase () extends EasingFunction {
    def this(/** Defines the number of oscillations*/
    oscillations: Double) = this()
    def this(
      /** Defines the number of oscillations*/
    oscillations: Double,
      /** Defines the amplitude of the oscillations*/
    springiness: Double
    ) = this()
    def this(
      /** Defines the number of oscillations*/
    oscillations: Unit,
      /** Defines the amplitude of the oscillations*/
    springiness: Double
    ) = this()
    
    /** Defines the number of oscillations*/
    var oscillations: Double = js.native
    
    /** Defines the amplitude of the oscillations*/
    var springiness: Double = js.native
  }
  
  @JSImport("babylonjs/Animations/easing", "ExponentialEase")
  @js.native
  /**
    * Instantiates an exponential easing function
    * @see https://easings.net/#easeInExpo
    * @param exponent Defines the exponent of the function
    */
  open class ExponentialEase () extends EasingFunction {
    def this(/** Defines the exponent of the function */
    exponent: Double) = this()
    
    /** Defines the exponent of the function */
    var exponent: Double = js.native
  }
  
  @JSImport("babylonjs/Animations/easing", "PowerEase")
  @js.native
  /**
    * Instantiates an power base easing function
    * @see https://easings.net/#easeInQuad
    * @param power Defines the power of the function
    */
  open class PowerEase () extends EasingFunction {
    def this(/** Defines the power of the function */
    power: Double) = this()
    
    /** Defines the power of the function */
    var power: Double = js.native
  }
  
  @JSImport("babylonjs/Animations/easing", "QuadraticEase")
  @js.native
  open class QuadraticEase () extends EasingFunction
  
  @JSImport("babylonjs/Animations/easing", "QuarticEase")
  @js.native
  open class QuarticEase () extends EasingFunction
  
  @JSImport("babylonjs/Animations/easing", "QuinticEase")
  @js.native
  open class QuinticEase () extends EasingFunction
  
  @JSImport("babylonjs/Animations/easing", "SineEase")
  @js.native
  open class SineEase () extends EasingFunction
  
  trait IEasingFunction extends StObject {
    
    /**
      * Given an input gradient between 0 and 1, this returns the corresponding value
      * of the easing function.
      * The link below provides some of the most common examples of easing functions.
      * @see https://easings.net/
      * @param gradient Defines the value between 0 and 1 we want the easing value for
      * @returns the corresponding value on the curve defined by the easing function
      */
    def ease(gradient: Double): Double
  }
  object IEasingFunction {
    
    inline def apply(ease: Double => Double): IEasingFunction = {
      val __obj = js.Dynamic.literal(ease = js.Any.fromFunction1(ease))
      __obj.asInstanceOf[IEasingFunction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEasingFunction] (val x: Self) extends AnyVal {
      
      inline def setEase(value: Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
    }
  }
}
