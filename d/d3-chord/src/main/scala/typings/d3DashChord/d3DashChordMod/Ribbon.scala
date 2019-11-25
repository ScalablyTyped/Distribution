package typings.d3DashChord.d3DashChordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ribbon extends js.Object {
  /**
    * Ribbon subgroup constituting the source of the Ribbon
    */
  var source: RibbonSubgroup
  /**
    * Ribbon subgroup constituting the target of the Ribbon
    */
  var target: RibbonSubgroup
}

object Ribbon {
  @scala.inline
  def apply(source: RibbonSubgroup, target: RibbonSubgroup): Ribbon = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Ribbon]
  }
}

@JSImport("d3-chord", "ribbon")
@js.native
object ribbon extends js.Object {
  def apply(): RibbonGenerator[_, Ribbon, RibbonSubgroup] = js.native
}

