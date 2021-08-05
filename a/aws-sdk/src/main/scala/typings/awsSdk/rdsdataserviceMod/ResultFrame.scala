package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultFrame extends StObject {
  
  /**
    * The records in the result set.
    */
  var records: js.UndefOr[Records] = js.undefined
  
  /**
    * The result-set metadata in the result set.
    */
  var resultSetMetadata: js.UndefOr[ResultSetMetadata] = js.undefined
}
object ResultFrame {
  
  inline def apply(): ResultFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultFrame]
  }
  
  extension [Self <: ResultFrame](x: Self) {
    
    inline def setRecords(value: Records): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
    
    inline def setRecordsVarargs(value: Record*): Self = StObject.set(x, "records", js.Array(value :_*))
    
    inline def setResultSetMetadata(value: ResultSetMetadata): Self = StObject.set(x, "resultSetMetadata", value.asInstanceOf[js.Any])
    
    inline def setResultSetMetadataUndefined: Self = StObject.set(x, "resultSetMetadata", js.undefined)
  }
}
