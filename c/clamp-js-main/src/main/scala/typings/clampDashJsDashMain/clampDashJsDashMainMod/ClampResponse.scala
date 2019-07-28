package typings.clampDashJsDashMain.clampDashJsDashMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClampResponse extends js.Object {
  var clamped: String
  var original: String
}

object ClampResponse {
  @scala.inline
  def apply(clamped: String, original: String): ClampResponse = {
    val __obj = js.Dynamic.literal(clamped = clamped, original = original)
  
    __obj.asInstanceOf[ClampResponse]
  }
}

