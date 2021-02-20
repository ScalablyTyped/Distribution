package typings.d20

import typings.d20.d20Booleans.`false`
import typings.d20.d20Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d20", "roll")
  @js.native
  def roll(dice: String): Double = js.native
  @JSImport("d20", "roll")
  @js.native
  def roll(dice: String, verbose: Boolean): Double = js.native
  @JSImport("d20", "roll")
  @js.native
  def roll(dice: Double): Double = js.native
  @JSImport("d20", "roll")
  @js.native
  def roll(dice: Double, verbose: Boolean): Double = js.native
  @JSImport("d20", "roll")
  @js.native
  def roll_false(dice: String, verbose: `false`): Double = js.native
  @JSImport("d20", "roll")
  @js.native
  def roll_false(dice: Double, verbose: `false`): Double = js.native
  @JSImport("d20", "roll")
  @js.native
  def roll_true(dice: String, verbose: `true`): js.Array[Double] = js.native
  @JSImport("d20", "roll")
  @js.native
  def roll_true(dice: Double, verbose: `true`): js.Array[Double] = js.native
  
  @JSImport("d20", "verboseRoll")
  @js.native
  def verboseRoll(dice: String): js.Array[Double] = js.native
  @JSImport("d20", "verboseRoll")
  @js.native
  def verboseRoll(dice: Double): js.Array[Double] = js.native
}
