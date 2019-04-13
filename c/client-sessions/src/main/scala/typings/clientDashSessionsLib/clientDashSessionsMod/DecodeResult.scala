package typings
package clientDashSessionsLib.clientDashSessionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodeResult extends js.Object {
  var content: js.Any
  var createdAt: scala.Double
  var duration: scala.Double
}

object DecodeResult {
  @scala.inline
  def apply(content: js.Any, createdAt: scala.Double, duration: scala.Double): DecodeResult = {
    val __obj = js.Dynamic.literal(content = content, createdAt = createdAt, duration = duration)
  
    __obj.asInstanceOf[DecodeResult]
  }
}

