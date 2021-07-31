package typings.d20

import typings.d20.d20Booleans.`false`
import typings.d20.d20Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d20", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def roll(dice: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("roll")(dice.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def roll(dice: String, verbose: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("roll")(dice.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def roll(dice: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("roll")(dice.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def roll(dice: Double, verbose: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("roll")(dice.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def roll_false(dice: String, verbose: `false`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("roll")(dice.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def roll_false(dice: Double, verbose: `false`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("roll")(dice.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def roll_true(dice: String, verbose: `true`): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("roll")(dice.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def roll_true(dice: Double, verbose: `true`): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("roll")(dice.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def verboseRoll(dice: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("verboseRoll")(dice.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def verboseRoll(dice: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("verboseRoll")(dice.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
