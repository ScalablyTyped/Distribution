package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEnvironmentStatusResult extends StObject {
  
  /**
    * Any informational message about the status of the environment.
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * The status of the environment. Available values include:    connecting: The environment is connecting.    creating: The environment is being created.    deleting: The environment is being deleted.    error: The environment is in an error state.    ready: The environment is ready.    stopped: The environment is stopped.    stopping: The environment is stopping.  
    */
  var status: js.UndefOr[EnvironmentStatus] = js.native
}
object DescribeEnvironmentStatusResult {
  
  @scala.inline
  def apply(): DescribeEnvironmentStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentStatusResult]
  }
  
  @scala.inline
  implicit class DescribeEnvironmentStatusResultMutableBuilder[Self <: DescribeEnvironmentStatusResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setStatus(value: EnvironmentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
