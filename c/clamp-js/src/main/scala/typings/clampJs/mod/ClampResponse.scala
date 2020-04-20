package typings.clampJs.mod

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
    val __obj = js.Dynamic.literal(clamped = clamped.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClampResponse]
  }
}

