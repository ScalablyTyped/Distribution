package typings.clientSessions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodeResult extends js.Object {
  var content: js.Any
  var createdAt: Double
  var duration: Double
}

object DecodeResult {
  @scala.inline
  def apply(content: js.Any, createdAt: Double, duration: Double): DecodeResult = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeResult]
  }
}

