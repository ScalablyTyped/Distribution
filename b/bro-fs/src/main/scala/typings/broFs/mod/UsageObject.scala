package typings.broFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageObject extends js.Object {
  var grantedBytes: Double
  var usedBytes: Double
}

object UsageObject {
  @scala.inline
  def apply(grantedBytes: Double, usedBytes: Double): UsageObject = {
    val __obj = js.Dynamic.literal(grantedBytes = grantedBytes.asInstanceOf[js.Any], usedBytes = usedBytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsageObject]
  }
}

