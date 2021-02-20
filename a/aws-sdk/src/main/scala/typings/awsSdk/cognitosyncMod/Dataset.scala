package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dataset extends StObject {
  
  /**
    * Date on which the dataset was created.
    */
  var CreationDate: js.UndefOr[Date] = js.native
  
  /**
    * Total size in bytes of the records in this dataset.
    */
  var DataStorage: js.UndefOr[Long] = js.native
  
  /**
    * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.' (dot).
    */
  var DatasetName: js.UndefOr[typings.awsSdk.cognitosyncMod.DatasetName] = js.native
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.cognitosyncMod.IdentityId] = js.native
  
  /**
    * The device that made the last change to this dataset.
    */
  var LastModifiedBy: js.UndefOr[String] = js.native
  
  /**
    * Date when the dataset was last modified.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.native
  
  /**
    * Number of records in this dataset.
    */
  var NumRecords: js.UndefOr[Long] = js.native
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
    def setCreationDate(value: Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setDataStorage(value: Long): Self = StObject.set(x, "DataStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataStorageUndefined: Self = StObject.set(x, "DataStorage", js.undefined)
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    @scala.inline
    def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: String): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setNumRecords(value: Long): Self = StObject.set(x, "NumRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumRecordsUndefined: Self = StObject.set(x, "NumRecords", js.undefined)
  }
}
