package typings.bitcoreLib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrevHash extends js.Object {
  var prevHash: String
  var time: Double
}

object PrevHash {
  @scala.inline
  def apply(prevHash: String, time: Double): PrevHash = {
    val __obj = js.Dynamic.literal(prevHash = prevHash.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevHash]
  }
}

