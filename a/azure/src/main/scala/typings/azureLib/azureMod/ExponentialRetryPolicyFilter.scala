package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "ExponentialRetryPolicyFilter")
@js.native
class ExponentialRetryPolicyFilter () extends Filter {
  def this(retryCount: scala.Double) = this()
  def this(retryCount: scala.Double, retryInterval: scala.Double) = this()
  def this(retryCount: scala.Double, retryInterval: scala.Double, minRetryInterval: scala.Double) = this()
  def this(retryCount: scala.Double, retryInterval: scala.Double, minRetryInterval: scala.Double, maxRetryInterval: scala.Double) = this()
  var maxRetryInterval: scala.Double = js.native
  var minRetryInterval: scala.Double = js.native
  var retryCount: scala.Double = js.native
  var retryInterval: scala.Double = js.native
  /* CompleteClass */
  override def handle(requestOptions: js.Any, next: js.Function): scala.Unit = js.native
}

