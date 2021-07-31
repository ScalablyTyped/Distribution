package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLabelingJobRequest extends StObject {
  
  /**
    * The name of the labeling job to return information for.
    */
  var LabelingJobName: typings.awsSdk.sagemakerMod.LabelingJobName
}
object DescribeLabelingJobRequest {
  
  @scala.inline
  def apply(LabelingJobName: LabelingJobName): DescribeLabelingJobRequest = {
    val __obj = js.Dynamic.literal(LabelingJobName = LabelingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLabelingJobRequest]
  }
  
  @scala.inline
  implicit class DescribeLabelingJobRequestMutableBuilder[Self <: DescribeLabelingJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelingJobName(value: LabelingJobName): Self = StObject.set(x, "LabelingJobName", value.asInstanceOf[js.Any])
  }
}
