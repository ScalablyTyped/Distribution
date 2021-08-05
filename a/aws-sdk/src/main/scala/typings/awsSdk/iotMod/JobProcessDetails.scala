package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobProcessDetails extends StObject {
  
  /**
    * The number of things that cancelled the job.
    */
  var numberOfCanceledThings: js.UndefOr[CanceledThings] = js.undefined
  
  /**
    * The number of things that failed executing the job.
    */
  var numberOfFailedThings: js.UndefOr[FailedThings] = js.undefined
  
  /**
    * The number of things currently executing the job.
    */
  var numberOfInProgressThings: js.UndefOr[InProgressThings] = js.undefined
  
  /**
    * The number of things that are awaiting execution of the job.
    */
  var numberOfQueuedThings: js.UndefOr[QueuedThings] = js.undefined
  
  /**
    * The number of things that rejected the job.
    */
  var numberOfRejectedThings: js.UndefOr[RejectedThings] = js.undefined
  
  /**
    * The number of things that are no longer scheduled to execute the job because they have been deleted or have been removed from the group that was a target of the job.
    */
  var numberOfRemovedThings: js.UndefOr[RemovedThings] = js.undefined
  
  /**
    * The number of things which successfully completed the job.
    */
  var numberOfSucceededThings: js.UndefOr[SucceededThings] = js.undefined
  
  /**
    * The number of things whose job execution status is TIMED_OUT.
    */
  var numberOfTimedOutThings: js.UndefOr[TimedOutThings] = js.undefined
  
  /**
    * The target devices to which the job execution is being rolled out. This value will be null after the job execution has finished rolling out to all the target devices.
    */
  var processingTargets: js.UndefOr[ProcessingTargetNameList] = js.undefined
}
object JobProcessDetails {
  
  inline def apply(): JobProcessDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobProcessDetails]
  }
  
  extension [Self <: JobProcessDetails](x: Self) {
    
    inline def setNumberOfCanceledThings(value: CanceledThings): Self = StObject.set(x, "numberOfCanceledThings", value.asInstanceOf[js.Any])
    
    inline def setNumberOfCanceledThingsUndefined: Self = StObject.set(x, "numberOfCanceledThings", js.undefined)
    
    inline def setNumberOfFailedThings(value: FailedThings): Self = StObject.set(x, "numberOfFailedThings", value.asInstanceOf[js.Any])
    
    inline def setNumberOfFailedThingsUndefined: Self = StObject.set(x, "numberOfFailedThings", js.undefined)
    
    inline def setNumberOfInProgressThings(value: InProgressThings): Self = StObject.set(x, "numberOfInProgressThings", value.asInstanceOf[js.Any])
    
    inline def setNumberOfInProgressThingsUndefined: Self = StObject.set(x, "numberOfInProgressThings", js.undefined)
    
    inline def setNumberOfQueuedThings(value: QueuedThings): Self = StObject.set(x, "numberOfQueuedThings", value.asInstanceOf[js.Any])
    
    inline def setNumberOfQueuedThingsUndefined: Self = StObject.set(x, "numberOfQueuedThings", js.undefined)
    
    inline def setNumberOfRejectedThings(value: RejectedThings): Self = StObject.set(x, "numberOfRejectedThings", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRejectedThingsUndefined: Self = StObject.set(x, "numberOfRejectedThings", js.undefined)
    
    inline def setNumberOfRemovedThings(value: RemovedThings): Self = StObject.set(x, "numberOfRemovedThings", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRemovedThingsUndefined: Self = StObject.set(x, "numberOfRemovedThings", js.undefined)
    
    inline def setNumberOfSucceededThings(value: SucceededThings): Self = StObject.set(x, "numberOfSucceededThings", value.asInstanceOf[js.Any])
    
    inline def setNumberOfSucceededThingsUndefined: Self = StObject.set(x, "numberOfSucceededThings", js.undefined)
    
    inline def setNumberOfTimedOutThings(value: TimedOutThings): Self = StObject.set(x, "numberOfTimedOutThings", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTimedOutThingsUndefined: Self = StObject.set(x, "numberOfTimedOutThings", js.undefined)
    
    inline def setProcessingTargets(value: ProcessingTargetNameList): Self = StObject.set(x, "processingTargets", value.asInstanceOf[js.Any])
    
    inline def setProcessingTargetsUndefined: Self = StObject.set(x, "processingTargets", js.undefined)
    
    inline def setProcessingTargetsVarargs(value: ProcessingTargetName*): Self = StObject.set(x, "processingTargets", js.Array(value :_*))
  }
}
