package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "ExponentialRetryPolicyFilter")
@js.native
class ExponentialRetryPolicyFilter ()
  extends StObject
     with Filter {
  def this(retryCount: Double) = this()
  def this(retryCount: Double, retryInterval: Double) = this()
  def this(retryCount: Unit, retryInterval: Double) = this()
  def this(retryCount: Double, retryInterval: Double, minRetryInterval: Double) = this()
  def this(retryCount: Double, retryInterval: Unit, minRetryInterval: Double) = this()
  def this(retryCount: Unit, retryInterval: Double, minRetryInterval: Double) = this()
  def this(retryCount: Unit, retryInterval: Unit, minRetryInterval: Double) = this()
  def this(retryCount: Double, retryInterval: Double, minRetryInterval: Double, maxRetryInterval: Double) = this()
  def this(retryCount: Double, retryInterval: Double, minRetryInterval: Unit, maxRetryInterval: Double) = this()
  def this(retryCount: Double, retryInterval: Unit, minRetryInterval: Double, maxRetryInterval: Double) = this()
  def this(retryCount: Double, retryInterval: Unit, minRetryInterval: Unit, maxRetryInterval: Double) = this()
  def this(retryCount: Unit, retryInterval: Double, minRetryInterval: Double, maxRetryInterval: Double) = this()
  def this(retryCount: Unit, retryInterval: Double, minRetryInterval: Unit, maxRetryInterval: Double) = this()
  def this(retryCount: Unit, retryInterval: Unit, minRetryInterval: Double, maxRetryInterval: Double) = this()
  def this(retryCount: Unit, retryInterval: Unit, minRetryInterval: Unit, maxRetryInterval: Double) = this()
  
  /* CompleteClass */
  override def handle(requestOptions: js.Any, next: js.Function): Unit = js.native
  
  var maxRetryInterval: Double = js.native
  
  var minRetryInterval: Double = js.native
  
  var retryCount: Double = js.native
  
  var retryInterval: Double = js.native
}
