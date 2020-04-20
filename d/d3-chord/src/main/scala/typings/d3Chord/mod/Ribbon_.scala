package typings.d3Chord.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ribbon_ extends js.Object {
  /**
    * Ribbon subgroup constituting the source of the Ribbon
    */
  var source: RibbonSubgroup
  /**
    * Ribbon subgroup constituting the target of the Ribbon
    */
  var target: RibbonSubgroup
}

object Ribbon_ {
  @scala.inline
  def apply(source: RibbonSubgroup, target: RibbonSubgroup): Ribbon_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ribbon_]
  }
}

