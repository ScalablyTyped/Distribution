package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "LinearRetryPolicyFilter")
@js.native
class LinearRetryPolicyFilter () extends Filter {
  def this(retryCount: scala.Double) = this()
  def this(retryCount: scala.Double, retryInterval: scala.Double) = this()
  var retryCount: scala.Double = js.native
  var retryInterval: scala.Double = js.native
  /* CompleteClass */
  override def handle(requestOptions: js.Any, next: js.Function): scala.Unit = js.native
}

