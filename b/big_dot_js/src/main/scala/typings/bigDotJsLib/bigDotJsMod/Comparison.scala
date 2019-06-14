package typings
package bigDotJsLib.bigDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - bigDotJsLib.bigDotJsLibNumbers.`1`
  - bigDotJsLib.bigDotJsLibNumbers.`0`
  - bigDotJsLib.bigDotJsLibNumbers.`-1`
*/
trait Comparison extends js.Object

object Comparison {
  @scala.inline
  def EQ: bigDotJsLib.bigDotJsLibNumbers.`0` = this.cast(0)
  @scala.inline
  def GT: bigDotJsLib.bigDotJsLibNumbers.`1` = this.cast(1)
  @scala.inline
  def LT: bigDotJsLib.bigDotJsLibNumbers.`-1` = this.cast(-1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

