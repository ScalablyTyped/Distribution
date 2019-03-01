package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssLocation extends js.Object {
  var end: cssDashTreeLib.Anon_Column
  var source: java.lang.String
  var start: cssDashTreeLib.Anon_Column
}

object CssLocation {
  @scala.inline
  def apply(end: cssDashTreeLib.Anon_Column, source: java.lang.String, start: cssDashTreeLib.Anon_Column): CssLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[CssLocation]
  }
}

