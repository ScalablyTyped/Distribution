package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataSetDetailsResponse extends StObject {
  
  /**
    * The size of the block on disk. 
    */
  var blocksize: js.UndefOr[Integer] = js.undefined
  
  /**
    * The timestamp when the data set was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the data set.
    */
  var dataSetName: String200
  
  /**
    * The type of data set. Possible values include VSAM, IS, PS, GDG, PO, PS, or unknown.
    */
  var dataSetOrg: js.UndefOr[DatasetDetailOrgAttributes] = js.undefined
  
  /**
    * The last time the data set was referenced.
    */
  var lastReferencedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last time the data set was updated.
    */
  var lastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The locaion where the data set is stored.
    */
  var location: js.UndefOr[String2000] = js.undefined
  
  /**
    * The length of records in the data set.
    */
  var recordLength: js.UndefOr[Integer] = js.undefined
}
object GetDataSetDetailsResponse {
  
  inline def apply(dataSetName: String200): GetDataSetDetailsResponse = {
    val __obj = js.Dynamic.literal(dataSetName = dataSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataSetDetailsResponse]
  }
  
  extension [Self <: GetDataSetDetailsResponse](x: Self) {
    
    inline def setBlocksize(value: Integer): Self = StObject.set(x, "blocksize", value.asInstanceOf[js.Any])
    
    inline def setBlocksizeUndefined: Self = StObject.set(x, "blocksize", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDataSetName(value: String200): Self = StObject.set(x, "dataSetName", value.asInstanceOf[js.Any])
    
    inline def setDataSetOrg(value: DatasetDetailOrgAttributes): Self = StObject.set(x, "dataSetOrg", value.asInstanceOf[js.Any])
    
    inline def setDataSetOrgUndefined: Self = StObject.set(x, "dataSetOrg", js.undefined)
    
    inline def setLastReferencedTime(value: js.Date): Self = StObject.set(x, "lastReferencedTime", value.asInstanceOf[js.Any])
    
    inline def setLastReferencedTimeUndefined: Self = StObject.set(x, "lastReferencedTime", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setLocation(value: String2000): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRecordLength(value: Integer): Self = StObject.set(x, "recordLength", value.asInstanceOf[js.Any])
    
    inline def setRecordLengthUndefined: Self = StObject.set(x, "recordLength", js.undefined)
  }
}
