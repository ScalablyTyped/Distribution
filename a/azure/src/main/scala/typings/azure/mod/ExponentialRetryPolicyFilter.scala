package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "ExponentialRetryPolicyFilter")
@js.native
class ExponentialRetryPolicyFilter () extends Filter {
  def this(retryCount: Double) = this()
  def this(retryCount: Double, retryInterval: Double) = this()
  def this(retryCount: Double, retryInterval: Double, minRetryInterval: Double) = this()
  def this(retryCount: Double, retryInterval: Double, minRetryInterval: Double, maxRetryInterval: Double) = this()
  var maxRetryInterval: Double = js.native
  var minRetryInterval: Double = js.native
  var retryCount: Double = js.native
  var retryInterval: Double = js.native
  /* CompleteClass */
  override def handle(requestOptions: js.Any, next: js.Function): Unit = js.native
}

