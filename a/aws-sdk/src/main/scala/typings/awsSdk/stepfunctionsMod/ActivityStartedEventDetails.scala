package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityStartedEventDetails extends StObject {
  
  /**
    * The name of the worker that the task is assigned to. These names are provided by the workers when calling GetActivityTask.
    */
  var workerName: js.UndefOr[Identity] = js.undefined
}
object ActivityStartedEventDetails {
  
  inline def apply(): ActivityStartedEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityStartedEventDetails]
  }
  
  extension [Self <: ActivityStartedEventDetails](x: Self) {
    
    inline def setWorkerName(value: Identity): Self = StObject.set(x, "workerName", value.asInstanceOf[js.Any])
    
    inline def setWorkerNameUndefined: Self = StObject.set(x, "workerName", js.undefined)
  }
}
