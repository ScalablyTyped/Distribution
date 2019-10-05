package typings.d3.d3Mod

import typings.d3DashChord.d3DashChordMod.Ribbon
import typings.d3DashChord.d3DashChordMod.RibbonGenerator
import typings.d3DashChord.d3DashChordMod.RibbonSubgroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "ribbon")
@js.native
object ribbon extends js.Object {
  def apply(): RibbonGenerator[_, Ribbon, RibbonSubgroup] = js.native
}

