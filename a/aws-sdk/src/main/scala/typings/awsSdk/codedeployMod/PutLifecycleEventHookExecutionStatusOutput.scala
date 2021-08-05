package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLifecycleEventHookExecutionStatusOutput extends StObject {
  
  /**
    * The execution ID of the lifecycle event hook. A hook is specified in the hooks section of the deployment's AppSpec file.
    */
  var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId] = js.undefined
}
object PutLifecycleEventHookExecutionStatusOutput {
  
  inline def apply(): PutLifecycleEventHookExecutionStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutLifecycleEventHookExecutionStatusOutput]
  }
  
  extension [Self <: PutLifecycleEventHookExecutionStatusOutput](x: Self) {
    
    inline def setLifecycleEventHookExecutionId(value: LifecycleEventHookExecutionId): Self = StObject.set(x, "lifecycleEventHookExecutionId", value.asInstanceOf[js.Any])
    
    inline def setLifecycleEventHookExecutionIdUndefined: Self = StObject.set(x, "lifecycleEventHookExecutionId", js.undefined)
  }
}
