package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformJobSummary extends StObject {
  
  /**
    * A timestamp that shows when the transform Job was created.
    */
  var CreationTime: Timestamp = js.native
  
  /**
    * If the transform job failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * Indicates when the transform job was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Indicates when the transform job ends on compute instances. For successful jobs and stopped jobs, this is the exact time recorded after the results are uploaded. For failed jobs, this is when Amazon SageMaker detected that the job failed.
    */
  var TransformEndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the transform job.
    */
  var TransformJobArn: typings.awsSdk.sagemakerMod.TransformJobArn = js.native
  
  /**
    * The name of the transform job.
    */
  var TransformJobName: typings.awsSdk.sagemakerMod.TransformJobName = js.native
  
  /**
    * The status of the transform job.
    */
  var TransformJobStatus: typings.awsSdk.sagemakerMod.TransformJobStatus = js.native
}
object TransformJobSummary {
  
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    TransformJobArn: TransformJobArn,
    TransformJobName: TransformJobName,
    TransformJobStatus: TransformJobStatus
  ): TransformJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], TransformJobArn = TransformJobArn.asInstanceOf[js.Any], TransformJobName = TransformJobName.asInstanceOf[js.Any], TransformJobStatus = TransformJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformJobSummary]
  }
  
  @scala.inline
  implicit class TransformJobSummaryMutableBuilder[Self <: TransformJobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setTransformEndTime(value: Timestamp): Self = StObject.set(x, "TransformEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformEndTimeUndefined: Self = StObject.set(x, "TransformEndTime", js.undefined)
    
    @scala.inline
    def setTransformJobArn(value: TransformJobArn): Self = StObject.set(x, "TransformJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformJobName(value: TransformJobName): Self = StObject.set(x, "TransformJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformJobStatus(value: TransformJobStatus): Self = StObject.set(x, "TransformJobStatus", value.asInstanceOf[js.Any])
  }
}
