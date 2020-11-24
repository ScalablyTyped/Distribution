package typings.ctrlTinycolor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ctrl/tinycolor/dist/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def bound01(n: js.Any, max: Double): Double = js.native
  
  def boundAlpha(): Double = js.native
  def boundAlpha(a: String): Double = js.native
  def boundAlpha(a: Double): Double = js.native
  
  def clamp01(`val`: Double): Double = js.native
  
  def convertToPercentage(n: String): Double | String = js.native
  def convertToPercentage(n: Double): Double | String = js.native
  
  def isOnePointZero(n: String): Boolean = js.native
  def isOnePointZero(n: Double): Boolean = js.native
  
  def isPercentage(n: String): Boolean = js.native
  def isPercentage(n: Double): Boolean = js.native
  
  def pad2(c: String): String = js.native
}
