package typings.bull.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  var count: Double
  var logs: js.Array[String]
}

object Count {
  @scala.inline
  def apply(count: Double, logs: js.Array[String]): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

