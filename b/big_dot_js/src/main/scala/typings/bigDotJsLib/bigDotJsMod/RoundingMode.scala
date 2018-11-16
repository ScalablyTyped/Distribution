package typings
package bigDotJsLib.bigDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoundingMode extends js.Object

@JSImport("big.js", "RoundingMode")
@js.native
object RoundingMode extends js.Object {
  /**
       * Rounds towards zero.
       * I.e. truncate, no rounding.
       */
  @js.native
  sealed trait RoundDown
    extends bigDotJsLib.bigDotJsMod.RoundingMode
  
  /**
       * Rounds towards nearest neighbour.
       * If equidistant, rounds towards even neighbour.
       */
  @js.native
  sealed trait RoundHalfEven
    extends bigDotJsLib.bigDotJsMod.RoundingMode
  
  /**
       * Rounds towards nearest neighbour.
       * If equidistant, rounds away from zero.
       */
  @js.native
  sealed trait RoundHalfUp
    extends bigDotJsLib.bigDotJsMod.RoundingMode
  
  /**
       * Rounds away from zero.
       */
  @js.native
  sealed trait RoundUp
    extends bigDotJsLib.bigDotJsMod.RoundingMode
  
  /* 0 */ val RoundDown: RoundDown with scala.Double = js.native
  /* 2 */ val RoundHalfEven: RoundHalfEven with scala.Double = js.native
  /* 1 */ val RoundHalfUp: RoundHalfUp with scala.Double = js.native
  /* 3 */ val RoundUp: RoundUp with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bigDotJsLib.bigDotJsMod.RoundingMode with scala.Double] = js.native
}

