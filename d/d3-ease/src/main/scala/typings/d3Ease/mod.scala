package typings.d3Ease

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-ease", "easeBack")
  @js.native
  val easeBack: BackEasingFactory = js.native
  
  @JSImport("d3-ease", "easeBackIn")
  @js.native
  val easeBackIn: BackEasingFactory = js.native
  
  @JSImport("d3-ease", "easeBackInOut")
  @js.native
  val easeBackInOut: BackEasingFactory = js.native
  
  @JSImport("d3-ease", "easeBackOut")
  @js.native
  val easeBackOut: BackEasingFactory = js.native
  
  @JSImport("d3-ease", "easeBounce")
  @js.native
  def easeBounce(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeBounceIn")
  @js.native
  def easeBounceIn(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeBounceInOut")
  @js.native
  def easeBounceInOut(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeBounceOut")
  @js.native
  def easeBounceOut(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeCircle")
  @js.native
  def easeCircle(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeCircleIn")
  @js.native
  def easeCircleIn(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeCircleInOut")
  @js.native
  def easeCircleInOut(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeCircleOut")
  @js.native
  def easeCircleOut(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeCubic")
  @js.native
  def easeCubic(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeCubicIn")
  @js.native
  def easeCubicIn(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeCubicInOut")
  @js.native
  def easeCubicInOut(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeCubicOut")
  @js.native
  def easeCubicOut(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeElastic")
  @js.native
  val easeElastic: ElasticEasingFactory = js.native
  
  @JSImport("d3-ease", "easeElasticIn")
  @js.native
  val easeElasticIn: ElasticEasingFactory = js.native
  
  @JSImport("d3-ease", "easeElasticInOut")
  @js.native
  val easeElasticInOut: ElasticEasingFactory = js.native
  
  @JSImport("d3-ease", "easeElasticOut")
  @js.native
  val easeElasticOut: ElasticEasingFactory = js.native
  
  @JSImport("d3-ease", "easeExp")
  @js.native
  def easeExp(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeExpIn")
  @js.native
  def easeExpIn(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeExpInOut")
  @js.native
  def easeExpInOut(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeExpOut")
  @js.native
  def easeExpOut(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeLinear")
  @js.native
  def easeLinear(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easePoly")
  @js.native
  val easePoly: PolynomialEasingFactory = js.native
  
  @JSImport("d3-ease", "easePolyIn")
  @js.native
  val easePolyIn: PolynomialEasingFactory = js.native
  
  @JSImport("d3-ease", "easePolyInOut")
  @js.native
  val easePolyInOut: PolynomialEasingFactory = js.native
  
  @JSImport("d3-ease", "easePolyOut")
  @js.native
  val easePolyOut: PolynomialEasingFactory = js.native
  
  @JSImport("d3-ease", "easeQuad")
  @js.native
  def easeQuad(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeQuadIn")
  @js.native
  def easeQuadIn(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeQuadInOut")
  @js.native
  def easeQuadInOut(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeQuadOut")
  @js.native
  def easeQuadOut(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeSin")
  @js.native
  def easeSin(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeSinIn")
  @js.native
  def easeSinIn(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeSinInOut")
  @js.native
  def easeSinInOut(normalizedTime: Double): Double = js.native
  
  @JSImport("d3-ease", "easeSinOut")
  @js.native
  def easeSinOut(normalizedTime: Double): Double = js.native
  
  @js.native
  trait BackEasingFactory extends StObject {
    
    /**
      * Calculate eased time.
      * @param normalizedTime Normalized time typically in the range [0, 1]
      */
    def apply(normalizedTime: Double): Double = js.native
    
    /**
      * Returns a new back easing with the specified overshoot s.
      * The degree of overshoot is configurable; if not specified, it defaults to 1.70158.
      *
      * @param s Overshoot parameter
      */
    def overshoot(s: Double): BackEasingFactory = js.native
  }
  
  @js.native
  trait ElasticEasingFactory extends StObject {
    
    /**
      * Calculate eased time.
      * @param normalizedTime Normalized time typically in the range [0, 1]
      */
    def apply(normalizedTime: Double): Double = js.native
    
    /**
      * Returns a new elastic easing with the specified amplitude a.
      * Defaults to 1,if not specified.
      *
      * @param a Amplitude for elastic easing.
      */
    def amplitude(a: Double): ElasticEasingFactory = js.native
    
    /**
      * Returns a new elastic easing with the specified amplitude a.
      * Defaults to 0.3,if not specified.
      *
      * @param p Period for elastic easing.
      */
    def period(p: Double): ElasticEasingFactory = js.native
  }
  
  @js.native
  trait PolynomialEasingFactory extends StObject {
    
    /**
      * Calculate eased time.
      * @param normalizedTime Normalized time typically in the range [0, 1]
      */
    def apply(normalizedTime: Double): Double = js.native
    
    /**
      * Returns a new polynomial easing with the specified exponent e.
      * If the exponent is not specified, it defaults to 3, equivalent to cubic.
      *
      * @param e Exponent for polynomial easing.
      */
    def exponent(e: Double): PolynomialEasingFactory = js.native
  }
}
