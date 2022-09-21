package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICellOutputMetadata extends StObject {
  
  var azdata_chartOptions: js.UndefOr[Any] = js.undefined
}
object ICellOutputMetadata {
  
  inline def apply(): ICellOutputMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICellOutputMetadata]
  }
  
  extension [Self <: ICellOutputMetadata](x: Self) {
    
    inline def setAzdata_chartOptions(value: Any): Self = StObject.set(x, "azdata_chartOptions", value.asInstanceOf[js.Any])
    
    inline def setAzdata_chartOptionsUndefined: Self = StObject.set(x, "azdata_chartOptions", js.undefined)
  }
}
