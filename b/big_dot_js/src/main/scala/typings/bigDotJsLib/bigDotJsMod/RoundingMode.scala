package typings
package bigDotJsLib.bigDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - bigDotJsLib.bigDotJsLibNumbers.`0`
  - bigDotJsLib.bigDotJsLibNumbers.`1`
  - bigDotJsLib.bigDotJsLibNumbers.`2`
  - bigDotJsLib.bigDotJsLibNumbers.`3`
*/
trait RoundingMode extends js.Object

object RoundingMode {
  /**
    * Rounds towards zero.
    * I.e. truncate, no rounding.
    */
  @scala.inline
  def RoundDown: bigDotJsLib.bigDotJsLibNumbers.`0` = this.cast(0)
  /**
    * Rounds towards nearest neighbour.
    * If equidistant, rounds towards even neighbour.
    */
  @scala.inline
  def RoundHalfEven: bigDotJsLib.bigDotJsLibNumbers.`2` = this.cast(2)
  /**
    * Rounds towards nearest neighbour.
    * If equidistant, rounds away from zero.
    */
  @scala.inline
  def RoundHalfUp: bigDotJsLib.bigDotJsLibNumbers.`1` = this.cast(1)
  /**
    * Rounds away from zero.
    */
  @scala.inline
  def RoundUp: bigDotJsLib.bigDotJsLibNumbers.`3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

