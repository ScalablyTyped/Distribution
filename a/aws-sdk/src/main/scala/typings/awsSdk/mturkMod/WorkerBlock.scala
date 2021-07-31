package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerBlock extends StObject {
  
  /**
    *  A message explaining the reason the Worker was blocked. 
    */
  var Reason: js.UndefOr[String] = js.undefined
  
  /**
    *  The ID of the Worker who accepted the HIT.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.undefined
}
object WorkerBlock {
  
  @scala.inline
  def apply(): WorkerBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerBlock]
  }
  
  @scala.inline
  implicit class WorkerBlockMutableBuilder[Self <: WorkerBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    @scala.inline
    def setWorkerId(value: CustomerId): Self = StObject.set(x, "WorkerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerIdUndefined: Self = StObject.set(x, "WorkerId", js.undefined)
  }
}
