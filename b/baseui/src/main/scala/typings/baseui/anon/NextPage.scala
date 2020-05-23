package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextPage extends js.Object {
  var nextPage: Double
  var prevPage: Double
}

object NextPage {
  @scala.inline
  def apply(nextPage: Double, prevPage: Double): NextPage = {
    val __obj = js.Dynamic.literal(nextPage = nextPage.asInstanceOf[js.Any], prevPage = prevPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextPage]
  }
}

