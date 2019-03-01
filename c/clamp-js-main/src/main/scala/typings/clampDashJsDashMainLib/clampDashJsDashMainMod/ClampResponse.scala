package typings
package clampDashJsDashMainLib.clampDashJsDashMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClampResponse extends js.Object {
  var clamped: java.lang.String
  var original: java.lang.String
}

object ClampResponse {
  @scala.inline
  def apply(clamped: java.lang.String, original: java.lang.String): ClampResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clamped")(clamped)
    __obj.updateDynamic("original")(original)
    __obj.asInstanceOf[ClampResponse]
  }
}

