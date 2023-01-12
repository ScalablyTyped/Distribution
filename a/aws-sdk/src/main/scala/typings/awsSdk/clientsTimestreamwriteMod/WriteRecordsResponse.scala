package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteRecordsResponse extends StObject {
  
  /**
    * Information on the records ingested by this request.
    */
  var RecordsIngested: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.RecordsIngested] = js.undefined
}
object WriteRecordsResponse {
  
  inline def apply(): WriteRecordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteRecordsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteRecordsResponse] (val x: Self) extends AnyVal {
    
    inline def setRecordsIngested(value: RecordsIngested): Self = StObject.set(x, "RecordsIngested", value.asInstanceOf[js.Any])
    
    inline def setRecordsIngestedUndefined: Self = StObject.set(x, "RecordsIngested", js.undefined)
  }
}
