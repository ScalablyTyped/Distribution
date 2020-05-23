package typings.blueprintjsTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextScrollLeft extends js.Object {
  var nextScrollLeft: Double
  var nextScrollTop: Double
}

object NextScrollLeft {
  @scala.inline
  def apply(nextScrollLeft: Double, nextScrollTop: Double): NextScrollLeft = {
    val __obj = js.Dynamic.literal(nextScrollLeft = nextScrollLeft.asInstanceOf[js.Any], nextScrollTop = nextScrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextScrollLeft]
  }
}

