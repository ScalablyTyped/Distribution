package typings
package d3DashChordLib.d3DashChordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-chord", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def chord(): ChordLayout = js.native
  def ribbon(): RibbonGenerator[_, Ribbon, RibbonSubgroup] = js.native
  @JSName("ribbon")
  def ribbon_DatumSubgroupDatum[Datum, SubgroupDatum](): RibbonGenerator[_, Datum, SubgroupDatum] = js.native
  @JSName("ribbon")
  def ribbon_ThisDatumSubgroupDatum[This, Datum, SubgroupDatum](): RibbonGenerator[This, Datum, SubgroupDatum] = js.native
}

