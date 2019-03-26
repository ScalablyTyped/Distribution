package typings
package cypressLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventLike extends js.Object {
  var `type`: java.lang.String
}

object EventLike {
  @scala.inline
  def apply(`type`: java.lang.String): EventLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EventLike]
  }
}

