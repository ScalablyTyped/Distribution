package typings
package bullLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: scala.Double
  var logs: js.Array[java.lang.String]
}

object Anon_Count {
  @scala.inline
  def apply(count: scala.Double, logs: js.Array[java.lang.String]): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count, logs = logs)
  
    __obj.asInstanceOf[Anon_Count]
  }
}

