package typings
package browserDashHarnessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RetryMS extends js.Object {
  var retryMS: scala.Double
  var timeoutMS: scala.Double
}

object Anon_RetryMS {
  @scala.inline
  def apply(retryMS: scala.Double, timeoutMS: scala.Double): Anon_RetryMS = {
    val __obj = js.Dynamic.literal(retryMS = retryMS, timeoutMS = timeoutMS)
  
    __obj.asInstanceOf[Anon_RetryMS]
  }
}

