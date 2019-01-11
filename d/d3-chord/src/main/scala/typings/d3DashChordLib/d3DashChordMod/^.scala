package typings
package d3DashChordLib.d3DashChordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-chord", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def chord(): d3DashChordLib.d3DashChordMod.ChordLayout = js.native
  def ribbon(): d3DashChordLib.d3DashChordMod.RibbonGenerator[
    _, 
    d3DashChordLib.d3DashChordMod.Ribbon, 
    d3DashChordLib.d3DashChordMod.RibbonSubgroup
  ] = js.native
  @JSName("ribbon")
  def ribbon_DatumSubgroupDatum[Datum, SubgroupDatum](): d3DashChordLib.d3DashChordMod.RibbonGenerator[_, Datum, SubgroupDatum] = js.native
  @JSName("ribbon")
  def ribbon_ThisDatumSubgroupDatum[This, Datum, SubgroupDatum](): d3DashChordLib.d3DashChordMod.RibbonGenerator[This, Datum, SubgroupDatum] = js.native
}

