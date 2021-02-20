package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDatasetResponse extends StObject {
  
  /**
    * The ARN of the dataset.
    */
  var datasetArn: js.UndefOr[DatasetArn] = js.native
  
  /**
    * The name of the dataset.
    */
  var datasetName: js.UndefOr[DatasetName] = js.native
  
  /**
    * How long, in days, dataset contents are kept for the dataset.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
}
object CreateDatasetResponse {
  
  @scala.inline
  def apply(): CreateDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetResponse]
  }
  
  @scala.inline
  implicit class CreateDatasetResponseMutableBuilder[Self <: CreateDatasetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetArn(value: DatasetArn): Self = StObject.set(x, "datasetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetArnUndefined: Self = StObject.set(x, "datasetArn", js.undefined)
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = StObject.set(x, "datasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetNameUndefined: Self = StObject.set(x, "datasetName", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
  }
}
