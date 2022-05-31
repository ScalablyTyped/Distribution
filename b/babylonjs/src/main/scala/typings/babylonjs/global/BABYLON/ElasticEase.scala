package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ElasticEase")
@js.native
/**
  * Instantiates an elastic easing function
  * @see https://easings.net/#easeInElastic
  * @param oscillations Defines the number of oscillations
  * @param springiness Defines the amplitude of the oscillations
  */
class ElasticEase ()
  extends StObject
     with typings.babylonjs.BABYLON.ElasticEase {
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
  
  /* private */ /* CompleteClass */
  var _easingMode: js.Any = js.native
  
  /**
    * Given an input gradient between 0 and 1, this returns the corrseponding value
    * of the easing function.
    * The link below provides some of the most common examples of easing functions.
    * @see https://easings.net/
    * @param gradient Defines the value between 0 and 1 we want the easing value for
    * @returns the corresponding value on the curve defined by the easing function
    */
  /* CompleteClass */
  override def ease(gradient: Double): Double = js.native
  
  /**
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
  
  /** Defines the number of oscillations*/
  /* CompleteClass */
  var oscillations: Double = js.native
  
  /**
    * Sets the easing mode of the current function.
    * @param easingMode Defines the willing mode (EASINGMODE_EASEIN, EASINGMODE_EASEOUT or EASINGMODE_EASEINOUT)
    */
  /* CompleteClass */
  override def setEasingMode(easingMode: Double): Unit = js.native
  
  /** Defines the amplitude of the oscillations*/
  /* CompleteClass */
  var springiness: Double = js.native
}
