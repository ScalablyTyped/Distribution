package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDataSource extends StObject {
  
  /**
    * The configuration parameters for the data source of the import
    */
  var dataSourceConfig: ImportDataSourceConfig
}
object ImportDataSource {
  
  inline def apply(dataSourceConfig: ImportDataSourceConfig): ImportDataSource = {
    val __obj = js.Dynamic.literal(dataSourceConfig = dataSourceConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDataSource]
  }
  
  extension [Self <: ImportDataSource](x: Self) {
    
    inline def setDataSourceConfig(value: ImportDataSourceConfig): Self = StObject.set(x, "dataSourceConfig", value.asInstanceOf[js.Any])
  }
}
