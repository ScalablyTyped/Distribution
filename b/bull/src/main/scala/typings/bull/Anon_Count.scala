package typings.bull

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: Double
  var logs: js.Array[String]
}

object Anon_Count {
  @scala.inline
  def apply(count: Double, logs: js.Array[String]): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count, logs = logs)
  
    __obj.asInstanceOf[Anon_Count]
  }
}

