package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteRecordsResponse extends StObject {
  
  /**
    * Information on the records ingested by this request.
    */
  var RecordsIngested: js.UndefOr[typings.awsSdk.timestreamwriteMod.RecordsIngested] = js.undefined
}
object WriteRecordsResponse {
  
  inline def apply(): WriteRecordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteRecordsResponse]
  }
  
  extension [Self <: WriteRecordsResponse](x: Self) {
    
    inline def setRecordsIngested(value: RecordsIngested): Self = StObject.set(x, "RecordsIngested", value.asInstanceOf[js.Any])
    
    inline def setRecordsIngestedUndefined: Self = StObject.set(x, "RecordsIngested", js.undefined)
  }
}
