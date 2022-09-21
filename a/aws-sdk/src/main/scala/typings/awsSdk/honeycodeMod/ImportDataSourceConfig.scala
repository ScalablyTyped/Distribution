package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDataSourceConfig extends StObject {
  
  /**
    *  The URL from which source data will be downloaded for the import request. 
    */
  var dataSourceUrl: js.UndefOr[SecureURL] = js.undefined
}
object ImportDataSourceConfig {
  
  inline def apply(): ImportDataSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportDataSourceConfig]
  }
  
  extension [Self <: ImportDataSourceConfig](x: Self) {
    
    inline def setDataSourceUrl(value: SecureURL): Self = StObject.set(x, "dataSourceUrl", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUrlUndefined: Self = StObject.set(x, "dataSourceUrl", js.undefined)
  }
}
