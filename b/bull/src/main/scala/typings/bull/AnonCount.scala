package typings.bull

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var count: Double
  var logs: js.Array[String]
}

object AnonCount {
  @scala.inline
  def apply(count: Double, logs: js.Array[String]): AnonCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}

