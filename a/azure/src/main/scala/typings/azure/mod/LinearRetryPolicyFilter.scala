package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "LinearRetryPolicyFilter")
@js.native
class LinearRetryPolicyFilter ()
  extends StObject
     with Filter {
  def this(retryCount: Double) = this()
  def this(retryCount: Double, retryInterval: Double) = this()
  def this(retryCount: Unit, retryInterval: Double) = this()
  
  /* CompleteClass */
  override def handle(requestOptions: js.Any, next: js.Function): Unit = js.native
  
  var retryCount: Double = js.native
  
  var retryInterval: Double = js.native
}
