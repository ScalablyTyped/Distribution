package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetGroupSummary extends StObject {
  
  /**
    * The date and time (in Unix time) that the dataset group was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * If creating a dataset group fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  
  /**
    * The date and time (in Unix time) that the dataset group was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The name of the dataset group.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The status of the dataset group. A dataset group can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING  
    */
  var status: js.UndefOr[Status] = js.undefined
}
object DatasetGroupSummary {
  
  @scala.inline
  def apply(): DatasetGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetGroupSummary]
  }
  
  @scala.inline
  implicit class DatasetGroupSummaryMutableBuilder[Self <: DatasetGroupSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetGroupArnUndefined: Self = StObject.set(x, "datasetGroupArn", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
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
