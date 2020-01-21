package typings.d3Ease

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-ease", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait BackEasingFactory extends js.Object {
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
  trait ElasticEasingFactory extends js.Object {
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
  trait PolynomialEasingFactory extends js.Object {
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
  
  val easeBack: BackEasingFactory = js.native
  val easeBackIn: BackEasingFactory = js.native
  val easeBackInOut: BackEasingFactory = js.native
  val easeBackOut: BackEasingFactory = js.native
  val easeElastic: ElasticEasingFactory = js.native
  val easeElasticIn: ElasticEasingFactory = js.native
  val easeElasticInOut: ElasticEasingFactory = js.native
  val easeElasticOut: ElasticEasingFactory = js.native
  val easePoly: PolynomialEasingFactory = js.native
  val easePolyIn: PolynomialEasingFactory = js.native
  val easePolyInOut: PolynomialEasingFactory = js.native
  val easePolyOut: PolynomialEasingFactory = js.native
  def easeBounce(normalizedTime: Double): Double = js.native
  def easeBounceIn(normalizedTime: Double): Double = js.native
  def easeBounceInOut(normalizedTime: Double): Double = js.native
  def easeBounceOut(normalizedTime: Double): Double = js.native
  def easeCircle(normalizedTime: Double): Double = js.native
  def easeCircleIn(normalizedTime: Double): Double = js.native
  def easeCircleInOut(normalizedTime: Double): Double = js.native
  def easeCircleOut(normalizedTime: Double): Double = js.native
  def easeCubic(normalizedTime: Double): Double = js.native
  def easeCubicIn(normalizedTime: Double): Double = js.native
  def easeCubicInOut(normalizedTime: Double): Double = js.native
  def easeCubicOut(normalizedTime: Double): Double = js.native
  def easeExp(normalizedTime: Double): Double = js.native
  def easeExpIn(normalizedTime: Double): Double = js.native
  def easeExpInOut(normalizedTime: Double): Double = js.native
  def easeExpOut(normalizedTime: Double): Double = js.native
  def easeLinear(normalizedTime: Double): Double = js.native
  def easeQuad(normalizedTime: Double): Double = js.native
  def easeQuadIn(normalizedTime: Double): Double = js.native
  def easeQuadInOut(normalizedTime: Double): Double = js.native
  def easeQuadOut(normalizedTime: Double): Double = js.native
  def easeSin(normalizedTime: Double): Double = js.native
  def easeSinIn(normalizedTime: Double): Double = js.native
  def easeSinInOut(normalizedTime: Double): Double = js.native
  def easeSinOut(normalizedTime: Double): Double = js.native
}

