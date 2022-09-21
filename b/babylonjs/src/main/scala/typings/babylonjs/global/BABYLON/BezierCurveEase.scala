package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BezierCurveEase")
@js.native
/**
  * Instantiates a bezier function
  * @see http://cubic-bezier.com/#.17,.67,.83,.67
  * @param x1 Defines the x component of the start tangent in the bezier curve
  * @param y1 Defines the y component of the start tangent in the bezier curve
  * @param x2 Defines the x component of the end tangent in the bezier curve
  * @param y2 Defines the y component of the end tangent in the bezier curve
  */
open class BezierCurveEase ()
  extends StObject
     with typings.babylonjs.BABYLON.BezierCurveEase {
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
  
  /* private */ /* CompleteClass */
  var _easingMode: Any = js.native
  
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
    * @param gradient
    * @hidden
    */
  /* CompleteClass */
  override def easeInCore(gradient: Double): Double = js.native
  
  /**
    * Gets the current easing mode.
    * @returns the easing mode
    */
  /* CompleteClass */
  override def getEasingMode(): Double = js.native
  
  /**
    * Sets the easing mode of the current function.
    * @param easingMode Defines the willing mode (EASINGMODE_EASEIN, EASINGMODE_EASEOUT or EASINGMODE_EASEINOUT)
    */
  /* CompleteClass */
  override def setEasingMode(easingMode: Double): Unit = js.native
  
  /** Defines the x component of the start tangent in the bezier curve */
  /* CompleteClass */
  var x1: Double = js.native
  
  /** Defines the x component of the end tangent in the bezier curve */
  /* CompleteClass */
  var x2: Double = js.native
  
  /** Defines the y component of the start tangent in the bezier curve */
  /* CompleteClass */
  var y1: Double = js.native
  
  /** Defines the y component of the end tangent in the bezier curve */
  /* CompleteClass */
  var y2: Double = js.native
}
