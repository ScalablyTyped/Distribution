package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetSummary extends StObject {
  
  /**
    * The date and time (in Unix time) that the dataset was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var datasetArn: js.UndefOr[Arn] = js.native
  
  /**
    * The dataset type. One of the following values:   Interactions   Items   Users   Event-Interactions  
    */
  var datasetType: js.UndefOr[DatasetType] = js.native
  
  /**
    * The date and time (in Unix time) that the dataset was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The name of the dataset.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The status of the dataset. A dataset can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.native
}
object DatasetSummary {
  
  @scala.inline
  def apply(): DatasetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetSummary]
  }
  
  @scala.inline
  implicit class DatasetSummaryMutableBuilder[Self <: DatasetSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    @scala.inline
    def setDatasetArn(value: Arn): Self = StObject.set(x, "datasetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetArnUndefined: Self = StObject.set(x, "datasetArn", js.undefined)
    
    @scala.inline
    def setDatasetType(value: DatasetType): Self = StObject.set(x, "datasetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetTypeUndefined: Self = StObject.set(x, "datasetType", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
