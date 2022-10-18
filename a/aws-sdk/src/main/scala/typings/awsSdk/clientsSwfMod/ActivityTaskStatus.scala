package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityTaskStatus extends StObject {
  
  /**
    * Set to true if cancellation of the task is requested.
    */
  var cancelRequested: Canceled
}
object ActivityTaskStatus {
  
  inline def apply(cancelRequested: Canceled): ActivityTaskStatus = {
    val __obj = js.Dynamic.literal(cancelRequested = cancelRequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTaskStatus]
  }
  
  extension [Self <: ActivityTaskStatus](x: Self) {
    
    inline def setCancelRequested(value: Canceled): Self = StObject.set(x, "cancelRequested", value.asInstanceOf[js.Any])
  }
}
