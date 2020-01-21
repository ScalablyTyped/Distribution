package typings.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSize extends js.Object {
  var size: Double
  var unclampedSize: Double
}

object AnonSize {
  @scala.inline
  def apply(size: Double, unclampedSize: Double): AnonSize = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], unclampedSize = unclampedSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSize]
  }
}

