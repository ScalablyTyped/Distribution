package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentLifecycle extends StObject {
  
  /**
    * If the environment failed to delete, the Amazon Resource Name (ARN) of the related Amazon Web Services resource.
    */
  var failureResource: js.UndefOr[String] = js.undefined
  
  /**
    * Any informational message about the lifecycle state of the environment.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The current creation or deletion lifecycle state of the environment.    CREATING: The environment is in the process of being created.    CREATED: The environment was successfully created.    CREATE_FAILED: The environment failed to be created.    DELETING: The environment is in the process of being deleted.    DELETE_FAILED: The environment failed to delete.  
    */
  var status: js.UndefOr[EnvironmentLifecycleStatus] = js.undefined
}
object EnvironmentLifecycle {
  
  inline def apply(): EnvironmentLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentLifecycle]
  }
  
  extension [Self <: EnvironmentLifecycle](x: Self) {
    
    inline def setFailureResource(value: String): Self = StObject.set(x, "failureResource", value.asInstanceOf[js.Any])
    
    inline def setFailureResourceUndefined: Self = StObject.set(x, "failureResource", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setStatus(value: EnvironmentLifecycleStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
