package typings
package chalkLib.chalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Level extends js.Object

@JSImport("chalk", "Level")
@js.native
object Level extends js.Object {
  @js.native
  sealed trait Ansi256
    extends chalkLib.chalkMod.Level
  
  @js.native
  sealed trait Basic
    extends chalkLib.chalkMod.Level
  
  @js.native
  sealed trait None
    extends chalkLib.chalkMod.Level
  
  @js.native
  sealed trait TrueColor
    extends chalkLib.chalkMod.Level
  
  /* 2 */ val Ansi256: Ansi256 with scala.Double = js.native
  /* 1 */ val Basic: Basic with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 3 */ val TrueColor: TrueColor with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[chalkLib.chalkMod.Level with scala.Double] = js.native
}

