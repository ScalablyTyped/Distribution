package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetSummary extends StObject {
  
  /**
    * When the dataset was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DatasetArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the dataset.
    */
  var DatasetName: js.UndefOr[Name] = js.undefined
  
  /**
    * The dataset type.
    */
  var DatasetType: js.UndefOr[typings.awsSdk.forecastserviceMod.DatasetType] = js.undefined
  
  /**
    * The domain associated with the dataset.
    */
  var Domain: js.UndefOr[typings.awsSdk.forecastserviceMod.Domain] = js.undefined
  
  /**
    * When you create a dataset, LastModificationTime is the same as CreationTime. While data is being imported to the dataset, LastModificationTime is the current time of the ListDatasets call. After a CreateDatasetImportJob operation has finished, LastModificationTime is when the import job completed or failed.
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.undefined
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
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDatasetArn(value: Arn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
    
    @scala.inline
    def setDatasetName(value: Name): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    @scala.inline
    def setDatasetType(value: DatasetType): Self = StObject.set(x, "DatasetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetTypeUndefined: Self = StObject.set(x, "DatasetType", js.undefined)
    
    @scala.inline
    def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    @scala.inline
    def setLastModificationTime(value: Timestamp): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
  }
}
