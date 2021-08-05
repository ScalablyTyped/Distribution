package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreStatus extends StObject {
  
  /**
    * The number of megabytes per second being transferred from the backup storage. Returns the average rate for a completed backup. This field is only updated when you restore to DC2 and DS2 node types. 
    */
  var CurrentRestoreRateInMegaBytesPerSecond: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of time an in-progress restore has been running, or the amount of time it took a completed restore to finish. This field is only updated when you restore to DC2 and DS2 node types. 
    */
  var ElapsedTimeInSeconds: js.UndefOr[Long] = js.undefined
  
  /**
    * The estimate of the time remaining before the restore will complete. Returns 0 for a completed restore. This field is only updated when you restore to DC2 and DS2 node types. 
    */
  var EstimatedTimeToCompletionInSeconds: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of megabytes that have been transferred from snapshot storage. This field is only updated when you restore to DC2 and DS2 node types. 
    */
  var ProgressInMegaBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The size of the set of snapshot data used to restore the cluster. This field is only updated when you restore to DC2 and DS2 node types. 
    */
  var SnapshotSizeInMegaBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The status of the restore action. Returns starting, restoring, completed, or failed.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object RestoreStatus {
  
  inline def apply(): RestoreStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreStatus]
  }
  
  extension [Self <: RestoreStatus](x: Self) {
    
    inline def setCurrentRestoreRateInMegaBytesPerSecond(value: Double): Self = StObject.set(x, "CurrentRestoreRateInMegaBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setCurrentRestoreRateInMegaBytesPerSecondUndefined: Self = StObject.set(x, "CurrentRestoreRateInMegaBytesPerSecond", js.undefined)
    
    inline def setElapsedTimeInSeconds(value: Long): Self = StObject.set(x, "ElapsedTimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setElapsedTimeInSecondsUndefined: Self = StObject.set(x, "ElapsedTimeInSeconds", js.undefined)
    
    inline def setEstimatedTimeToCompletionInSeconds(value: Long): Self = StObject.set(x, "EstimatedTimeToCompletionInSeconds", value.asInstanceOf[js.Any])
    
    inline def setEstimatedTimeToCompletionInSecondsUndefined: Self = StObject.set(x, "EstimatedTimeToCompletionInSeconds", js.undefined)
    
    inline def setProgressInMegaBytes(value: Long): Self = StObject.set(x, "ProgressInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setProgressInMegaBytesUndefined: Self = StObject.set(x, "ProgressInMegaBytes", js.undefined)
    
    inline def setSnapshotSizeInMegaBytes(value: Long): Self = StObject.set(x, "SnapshotSizeInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setSnapshotSizeInMegaBytesUndefined: Self = StObject.set(x, "SnapshotSizeInMegaBytes", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
