package typings.clientDashSessions.clientDashSessionsMod

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
    val __obj = js.Dynamic.literal(content = content, createdAt = createdAt, duration = duration)
  
    __obj.asInstanceOf[DecodeResult]
  }
}

