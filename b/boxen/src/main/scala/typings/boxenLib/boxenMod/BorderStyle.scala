package typings
package boxenLib.boxenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderStyle extends js.Object

@JSImport("boxen", "BorderStyle")
@js.native
object BorderStyle extends js.Object {
  @js.native
  sealed trait Classic
    extends boxenLib.boxenMod.BorderStyle
  
  @js.native
  sealed trait Double
    extends boxenLib.boxenMod.BorderStyle
  
  @js.native
  sealed trait DoubleSingle
    extends boxenLib.boxenMod.BorderStyle
  
  @js.native
  sealed trait Round
    extends boxenLib.boxenMod.BorderStyle
  
  @js.native
  sealed trait Single
    extends boxenLib.boxenMod.BorderStyle
  
  @js.native
  sealed trait SingleDouble
    extends boxenLib.boxenMod.BorderStyle
  
  /* "classic" */ val Classic: Classic with java.lang.String = js.native
  /* "double" */ val Double: Double with java.lang.String = js.native
  /* "doubleSingle" */ val DoubleSingle: DoubleSingle with java.lang.String = js.native
  /* "round" */ val Round: Round with java.lang.String = js.native
  /* "single" */ val Single: Single with java.lang.String = js.native
  /* "singleDouble" */ val SingleDouble: SingleDouble with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[boxenLib.boxenMod.BorderStyle with java.lang.String] = js.native
}

