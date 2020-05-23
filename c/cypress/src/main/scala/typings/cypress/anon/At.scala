package typings.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait At extends js.Object {
  var at: js.UndefOr[Double] = js.undefined
  var next: String
}

object At {
  @scala.inline
  def apply(next: String, at: js.UndefOr[Double] = js.undefined): At = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any])
    if (!js.isUndefined(at)) __obj.updateDynamic("at")(at.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[At]
  }
}

