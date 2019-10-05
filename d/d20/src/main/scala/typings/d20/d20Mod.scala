package typings.d20

import typings.d20.d20Numbers.`false`
import typings.d20.d20Numbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d20", JSImport.Namespace)
@js.native
object d20Mod extends js.Object {
  def roll(dice: String): Double = js.native
  def roll(dice: String, verbose: Boolean): Double = js.native
  def roll(dice: Double): Double = js.native
  def roll(dice: Double, verbose: Boolean): Double = js.native
  @JSName("roll")
  def roll_false(dice: String, verbose: `false`): Double = js.native
  @JSName("roll")
  def roll_false(dice: Double, verbose: `false`): Double = js.native
  @JSName("roll")
  def roll_true(dice: String, verbose: `true`): js.Array[Double] = js.native
  @JSName("roll")
  def roll_true(dice: Double, verbose: `true`): js.Array[Double] = js.native
  def verboseRoll(dice: String): js.Array[Double] = js.native
  def verboseRoll(dice: Double): js.Array[Double] = js.native
}

