package typings.carbonIconHelpers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cx extends js.Object {
  var cx: String
  var cy: String
  var r: String
}

object Cx {
  @scala.inline
  def apply(cx: String, cy: String, r: String): Cx = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cx]
  }
}

