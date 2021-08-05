package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartExportTaskResponse extends StObject {
  
  /**
    * A unique identifier used to query the status of an export request.
    */
  var exportId: js.UndefOr[ConfigurationsExportId] = js.undefined
}
object StartExportTaskResponse {
  
  inline def apply(): StartExportTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartExportTaskResponse]
  }
  
  extension [Self <: StartExportTaskResponse](x: Self) {
    
    inline def setExportId(value: ConfigurationsExportId): Self = StObject.set(x, "exportId", value.asInstanceOf[js.Any])
    
    inline def setExportIdUndefined: Self = StObject.set(x, "exportId", js.undefined)
  }
}
