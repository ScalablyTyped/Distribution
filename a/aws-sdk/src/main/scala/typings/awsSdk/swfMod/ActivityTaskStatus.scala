package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityTaskStatus extends StObject {
  
  /**
    * Set to true if cancellation of the task is requested.
    */
  var cancelRequested: Canceled = js.native
}
object ActivityTaskStatus {
  
  @scala.inline
  def apply(cancelRequested: Canceled): ActivityTaskStatus = {
    val __obj = js.Dynamic.literal(cancelRequested = cancelRequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTaskStatus]
  }
  
  @scala.inline
  implicit class ActivityTaskStatusMutableBuilder[Self <: ActivityTaskStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelRequested(value: Canceled): Self = StObject.set(x, "cancelRequested", value.asInstanceOf[js.Any])
  }
}
