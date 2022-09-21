package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSetSummary extends StObject {
  
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
  var dataSetOrg: js.UndefOr[String20] = js.undefined
  
  /**
    * The format of the data set. 
    */
  var format: js.UndefOr[String20] = js.undefined
  
  /**
    * The last time the data set was referenced.
    */
  var lastReferencedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last time the data set was updated.
    */
  var lastUpdatedTime: js.UndefOr[js.Date] = js.undefined
}
object DataSetSummary {
  
  inline def apply(dataSetName: String200): DataSetSummary = {
    val __obj = js.Dynamic.literal(dataSetName = dataSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSetSummary]
  }
  
  extension [Self <: DataSetSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDataSetName(value: String200): Self = StObject.set(x, "dataSetName", value.asInstanceOf[js.Any])
    
    inline def setDataSetOrg(value: String20): Self = StObject.set(x, "dataSetOrg", value.asInstanceOf[js.Any])
    
    inline def setDataSetOrgUndefined: Self = StObject.set(x, "dataSetOrg", js.undefined)
    
    inline def setFormat(value: String20): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLastReferencedTime(value: js.Date): Self = StObject.set(x, "lastReferencedTime", value.asInstanceOf[js.Any])
    
    inline def setLastReferencedTimeUndefined: Self = StObject.set(x, "lastReferencedTime", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
  }
}
