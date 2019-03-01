package typings
package bagpipesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object bagpipesLibStrings {
  @js.native
  sealed trait hoist
    extends bagpipesLib.bagpipesMod.Affinity
  
  @js.native
  sealed trait sink
    extends bagpipesLib.bagpipesMod.Affinity
  
  @js.native
  sealed trait system
    extends bagpipesLib.bagpipesMod._FittingType
  
  @js.native
  sealed trait user
    extends bagpipesLib.bagpipesMod._FittingType
  
  @scala.inline
  def hoist: hoist = "hoist".asInstanceOf[hoist]
  @scala.inline
  def sink: sink = "sink".asInstanceOf[sink]
  @scala.inline
  def system: system = "system".asInstanceOf[system]
  @scala.inline
  def user: user = "user".asInstanceOf[user]
}

