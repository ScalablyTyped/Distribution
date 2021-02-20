package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "LinearRetryPolicyFilter")
@js.native
class LinearRetryPolicyFilter () extends Filter {
  def this(retryCount: Double) = this()
  def this(retryCount: js.UndefOr[scala.Nothing], retryInterval: Double) = this()
  def this(retryCount: Double, retryInterval: Double) = this()
  
  var retryCount: Double = js.native
  
  var retryInterval: Double = js.native
}
