package typings.bitcoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrevHash extends js.Object {
  var prevHash: String
  var time: Double
}

object AnonPrevHash {
  @scala.inline
  def apply(prevHash: String, time: Double): AnonPrevHash = {
    val __obj = js.Dynamic.literal(prevHash = prevHash.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrevHash]
  }
}

