package typings.babylonjs.BABYLON

import typings.babylonjs.anon.TypeofsetTimeout
import typings.std.ReturnType
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @ignore */
trait WorkerInfo extends StObject {
  
  var idle: Boolean
  
  var timeoutId: js.UndefOr[ReturnType[TypeofsetTimeout]] = js.undefined
  
  var workerPromise: js.Promise[Worker]
}
object WorkerInfo {
  
  inline def apply(idle: Boolean, workerPromise: js.Promise[Worker]): WorkerInfo = {
    val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], workerPromise = workerPromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerInfo]
  }
  
  extension [Self <: WorkerInfo](x: Self) {
    
    inline def setIdle(value: Boolean): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    inline def setTimeoutId(value: ReturnType[TypeofsetTimeout]): Self = StObject.set(x, "timeoutId", value.asInstanceOf[js.Any])
    
    inline def setTimeoutIdUndefined: Self = StObject.set(x, "timeoutId", js.undefined)
    
    inline def setWorkerPromise(value: js.Promise[Worker]): Self = StObject.set(x, "workerPromise", value.asInstanceOf[js.Any])
  }
}
