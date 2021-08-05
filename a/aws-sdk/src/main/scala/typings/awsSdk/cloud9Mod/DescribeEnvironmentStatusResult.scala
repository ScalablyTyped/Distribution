package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEnvironmentStatusResult extends StObject {
  
  /**
    * Any informational message about the status of the environment.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the environment. Available values include:    connecting: The environment is connecting.    creating: The environment is being created.    deleting: The environment is being deleted.    error: The environment is in an error state.    ready: The environment is ready.    stopped: The environment is stopped.    stopping: The environment is stopping.  
    */
  var status: js.UndefOr[EnvironmentStatus] = js.undefined
}
object DescribeEnvironmentStatusResult {
  
  inline def apply(): DescribeEnvironmentStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentStatusResult]
  }
  
  extension [Self <: DescribeEnvironmentStatusResult](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setStatus(value: EnvironmentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
