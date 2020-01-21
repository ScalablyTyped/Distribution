package typings.coreJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/core/number", JSImport.Namespace)
@js.native
object coreNumberMod extends js.Object {
  var EPSILON: Double = js.native
  var MAX_SAFE_INTEGER: Double = js.native
  var MIN_SAFE_INTEGER: Double = js.native
  def acosh(x: Double): Double = js.native
  def asinh(x: Double): Double = js.native
  def atanh(x: Double): Double = js.native
  def cbrt(x: Double): Double = js.native
  def clz32(x: Double): Double = js.native
  def cosh(x: Double): Double = js.native
  def expm1(x: Double): Double = js.native
  def fround(x: Double): Double = js.native
  def hypot(values: Double*): Double = js.native
  def imul(x: Double, y: Double): Double = js.native
  def isFinite(number: Double): Boolean = js.native
  def isInteger(number: Double): Boolean = js.native
  def isNaN(number: Double): Boolean = js.native
  def isSafeInteger(number: Double): Boolean = js.native
  def log10(x: Double): Double = js.native
  def log1p(x: Double): Double = js.native
  def log2(x: Double): Double = js.native
  def parseFloat(string: java.lang.String): Double = js.native
  def parseInt(string: java.lang.String): Double = js.native
  def parseInt(string: java.lang.String, radix: Double): Double = js.native
  def random(): Double = js.native
  def random(lim: Double): Double = js.native
  def sign(x: Double): Double = js.native
  def sinh(x: Double): Double = js.native
  def tanh(x: Double): Double = js.native
  def trunc(x: Double): Double = js.native
}

