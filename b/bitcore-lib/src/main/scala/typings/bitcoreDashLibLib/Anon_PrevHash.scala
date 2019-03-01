package typings
package bitcoreDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrevHash extends js.Object {
  var prevHash: java.lang.String
  var time: scala.Double
}

object Anon_PrevHash {
  @scala.inline
  def apply(prevHash: java.lang.String, time: scala.Double): Anon_PrevHash = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("prevHash")(prevHash)
    __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[Anon_PrevHash]
  }
}

