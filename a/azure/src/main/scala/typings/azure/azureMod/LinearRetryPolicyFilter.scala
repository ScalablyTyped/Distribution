package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "LinearRetryPolicyFilter")
@js.native
class LinearRetryPolicyFilter () extends Filter {
  def this(retryCount: Double) = this()
  def this(retryCount: Double, retryInterval: Double) = this()
  var retryCount: Double = js.native
  var retryInterval: Double = js.native
  /* CompleteClass */
  override def handle(requestOptions: js.Any, next: js.Function): Unit = js.native
}

