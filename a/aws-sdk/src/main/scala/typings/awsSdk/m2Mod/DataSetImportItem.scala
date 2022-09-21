package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSetImportItem extends StObject {
  
  /**
    * The data set.
    */
  var dataSet: DataSet
  
  /**
    * The location of the data set.
    */
  var externalLocation: ExternalLocation
}
object DataSetImportItem {
  
  inline def apply(dataSet: DataSet, externalLocation: ExternalLocation): DataSetImportItem = {
    val __obj = js.Dynamic.literal(dataSet = dataSet.asInstanceOf[js.Any], externalLocation = externalLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSetImportItem]
  }
  
  extension [Self <: DataSetImportItem](x: Self) {
    
    inline def setDataSet(value: DataSet): Self = StObject.set(x, "dataSet", value.asInstanceOf[js.Any])
    
    inline def setExternalLocation(value: ExternalLocation): Self = StObject.set(x, "externalLocation", value.asInstanceOf[js.Any])
  }
}
