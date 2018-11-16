package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #############################################################################################
// Array - https://github.com/zloirock/core-js/#array
// Modules: core.array.turn
// #############################################################################################
@js.native
trait Array[T] extends js.Object {
  /**
       * Non-standard.
       */
  def turn(
    callbackfn: js.Function4[
      /* memo */ Array[T], 
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ Array[T], 
      scala.Unit
    ]
  ): Array[T] = js.native
  /**
       * Non-standard.
       */
  def turn(
    callbackfn: js.Function4[
      /* memo */ Array[T], 
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ Array[T], 
      scala.Unit
    ],
    memo: Array[T]
  ): Array[T] = js.native
  /**
       * Non-standard.
       */
  def turn[U](
    callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Unit],
    memo: U
  ): U = js.native
  /**
       * Non-standard.
       */
  @JSName("turn")
  def turn_UU[U](
    callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Unit]
  ): U = js.native
}

