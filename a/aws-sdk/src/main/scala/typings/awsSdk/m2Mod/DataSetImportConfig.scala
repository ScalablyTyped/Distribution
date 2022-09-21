package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSetImportConfig extends StObject {
  
  /**
    * The data sets.
    */
  var dataSets: js.UndefOr[DataSetImportList] = js.undefined
  
  /**
    * The Amazon S3 location of the data sets.
    */
  var s3Location: js.UndefOr[String2000] = js.undefined
}
object DataSetImportConfig {
  
  inline def apply(): DataSetImportConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSetImportConfig]
  }
  
  extension [Self <: DataSetImportConfig](x: Self) {
    
    inline def setDataSets(value: DataSetImportList): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
    
    inline def setDataSetsUndefined: Self = StObject.set(x, "dataSets", js.undefined)
    
    inline def setDataSetsVarargs(value: DataSetImportItem*): Self = StObject.set(x, "dataSets", js.Array(value*))
    
    inline def setS3Location(value: String2000): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    inline def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
  }
}
