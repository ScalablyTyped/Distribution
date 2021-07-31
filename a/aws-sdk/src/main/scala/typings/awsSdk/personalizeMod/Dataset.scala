package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dataset extends StObject {
  
  /**
    * The creation date and time (in Unix time) of the dataset.
    */
  var creationDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset that you want metadata for.
    */
  var datasetArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * One of the following values:   Interactions   Items   Users  
    */
  var datasetType: js.UndefOr[DatasetType] = js.undefined
  
  /**
    * A time stamp that shows when the dataset was updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The name of the dataset.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The ARN of the associated schema.
    */
  var schemaArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the dataset. A dataset can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.undefined
}
object Dataset {
  
  @scala.inline
  def apply(): Dataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dataset]
  }
  
  @scala.inline
  implicit class DatasetMutableBuilder[Self <: Dataset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    @scala.inline
    def setDatasetArn(value: Arn): Self = StObject.set(x, "datasetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetArnUndefined: Self = StObject.set(x, "datasetArn", js.undefined)
    
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetGroupArnUndefined: Self = StObject.set(x, "datasetGroupArn", js.undefined)
    
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
    def setSchemaArn(value: Arn): Self = StObject.set(x, "schemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArnUndefined: Self = StObject.set(x, "schemaArn", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
