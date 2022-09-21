package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLJobSummary extends StObject {
  
  /**
    * The ARN of the AutoML job.
    */
  var AutoMLJobArn: typings.awsSdk.sagemakerMod.AutoMLJobArn
  
  /**
    * The name of the AutoML job you are requesting.
    */
  var AutoMLJobName: typings.awsSdk.sagemakerMod.AutoMLJobName
  
  /**
    * The secondary status of the AutoML job.
    */
  var AutoMLJobSecondaryStatus: typings.awsSdk.sagemakerMod.AutoMLJobSecondaryStatus
  
  /**
    * The status of the AutoML job.
    */
  var AutoMLJobStatus: typings.awsSdk.sagemakerMod.AutoMLJobStatus
  
  /**
    * When the AutoML job was created.
    */
  var CreationTime: js.Date
  
  /**
    * The end time of an AutoML job.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The failure reason of an AutoML job.
    */
  var FailureReason: js.UndefOr[AutoMLFailureReason] = js.undefined
  
  /**
    * When the AutoML job was last modified.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The list of reasons for partial failures within an AutoML job.
    */
  var PartialFailureReasons: js.UndefOr[AutoMLPartialFailureReasons] = js.undefined
}
object AutoMLJobSummary {
  
  inline def apply(
    AutoMLJobArn: AutoMLJobArn,
    AutoMLJobName: AutoMLJobName,
    AutoMLJobSecondaryStatus: AutoMLJobSecondaryStatus,
    AutoMLJobStatus: AutoMLJobStatus,
    CreationTime: js.Date,
    LastModifiedTime: js.Date
  ): AutoMLJobSummary = {
    val __obj = js.Dynamic.literal(AutoMLJobArn = AutoMLJobArn.asInstanceOf[js.Any], AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any], AutoMLJobSecondaryStatus = AutoMLJobSecondaryStatus.asInstanceOf[js.Any], AutoMLJobStatus = AutoMLJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLJobSummary]
  }
  
  extension [Self <: AutoMLJobSummary](x: Self) {
    
    inline def setAutoMLJobArn(value: AutoMLJobArn): Self = StObject.set(x, "AutoMLJobArn", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobName(value: AutoMLJobName): Self = StObject.set(x, "AutoMLJobName", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobSecondaryStatus(value: AutoMLJobSecondaryStatus): Self = StObject.set(x, "AutoMLJobSecondaryStatus", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobStatus(value: AutoMLJobStatus): Self = StObject.set(x, "AutoMLJobStatus", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setFailureReason(value: AutoMLFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setPartialFailureReasons(value: AutoMLPartialFailureReasons): Self = StObject.set(x, "PartialFailureReasons", value.asInstanceOf[js.Any])
    
    inline def setPartialFailureReasonsUndefined: Self = StObject.set(x, "PartialFailureReasons", js.undefined)
    
    inline def setPartialFailureReasonsVarargs(value: AutoMLPartialFailureReason*): Self = StObject.set(x, "PartialFailureReasons", js.Array(value*))
  }
}
