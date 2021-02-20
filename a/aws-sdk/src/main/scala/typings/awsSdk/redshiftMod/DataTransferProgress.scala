package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTransferProgress extends StObject {
  
  /**
    * Describes the data transfer rate in MB's per second.
    */
  var CurrentRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.native
  
  /**
    * Describes the total amount of data that has been transfered in MB's.
    */
  var DataTransferredInMegaBytes: js.UndefOr[Long] = js.native
  
  /**
    * Describes the number of seconds that have elapsed during the data transfer.
    */
  var ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.native
  
  /**
    * Describes the estimated number of seconds remaining to complete the transfer.
    */
  var EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.native
  
  /**
    * Describes the status of the cluster. While the transfer is in progress the status is transferringdata.
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * Describes the total amount of data to be transfered in megabytes.
    */
  var TotalDataInMegaBytes: js.UndefOr[Long] = js.native
}
object DataTransferProgress {
  
  @scala.inline
  def apply(): DataTransferProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTransferProgress]
  }
  
  @scala.inline
  implicit class DataTransferProgressMutableBuilder[Self <: DataTransferProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentRateInMegaBytesPerSecond(value: DoubleOptional): Self = StObject.set(x, "CurrentRateInMegaBytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRateInMegaBytesPerSecondUndefined: Self = StObject.set(x, "CurrentRateInMegaBytesPerSecond", js.undefined)
    
    @scala.inline
    def setDataTransferredInMegaBytes(value: Long): Self = StObject.set(x, "DataTransferredInMegaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTransferredInMegaBytesUndefined: Self = StObject.set(x, "DataTransferredInMegaBytes", js.undefined)
    
    @scala.inline
    def setElapsedTimeInSeconds(value: LongOptional): Self = StObject.set(x, "ElapsedTimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsedTimeInSecondsUndefined: Self = StObject.set(x, "ElapsedTimeInSeconds", js.undefined)
    
    @scala.inline
    def setEstimatedTimeToCompletionInSeconds(value: LongOptional): Self = StObject.set(x, "EstimatedTimeToCompletionInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedTimeToCompletionInSecondsUndefined: Self = StObject.set(x, "EstimatedTimeToCompletionInSeconds", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTotalDataInMegaBytes(value: Long): Self = StObject.set(x, "TotalDataInMegaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalDataInMegaBytesUndefined: Self = StObject.set(x, "TotalDataInMegaBytes", js.undefined)
  }
}
