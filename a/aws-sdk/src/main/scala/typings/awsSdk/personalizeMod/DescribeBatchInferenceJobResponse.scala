package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBatchInferenceJobResponse extends StObject {
  
  /**
    * Information on the specified batch inference job.
    */
  var batchInferenceJob: js.UndefOr[BatchInferenceJob] = js.native
}
object DescribeBatchInferenceJobResponse {
  
  @scala.inline
  def apply(): DescribeBatchInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBatchInferenceJobResponse]
  }
  
  @scala.inline
  implicit class DescribeBatchInferenceJobResponseMutableBuilder[Self <: DescribeBatchInferenceJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchInferenceJob(value: BatchInferenceJob): Self = StObject.set(x, "batchInferenceJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchInferenceJobUndefined: Self = StObject.set(x, "batchInferenceJob", js.undefined)
  }
}
