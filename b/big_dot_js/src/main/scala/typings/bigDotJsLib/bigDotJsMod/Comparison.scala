package typings
package bigDotJsLib.bigDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Comparison extends js.Object

@JSImport("big.js", "Comparison")
@js.native
object Comparison extends js.Object {
  @js.native
  sealed trait EQ
    extends bigDotJsLib.bigDotJsMod.Comparison
  
  @js.native
  sealed trait GT
    extends bigDotJsLib.bigDotJsMod.Comparison
  
  @js.native
  sealed trait LT
    extends bigDotJsLib.bigDotJsMod.Comparison
  
  /* 0 */ val EQ: EQ with scala.Double = js.native
  /* 1 */ val GT: GT with scala.Double = js.native
  /* -1 */ val LT: LT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bigDotJsLib.bigDotJsMod.Comparison with scala.Double] = js.native
}

