package typings.carbonMotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpressive extends js.Object {
  var expressive: String
  var productive: String
}

object AnonExpressive {
  @scala.inline
  def apply(expressive: String, productive: String): AnonExpressive = {
    val __obj = js.Dynamic.literal(expressive = expressive.asInstanceOf[js.Any], productive = productive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpressive]
  }
}

