package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLogGroupFieldsResponse extends StObject {
  
  /**
    * The array of fields found in the query. Each object in the array contains the name of the field, along with the percentage of time it appeared in the log events that were queried.
    */
  var logGroupFields: js.UndefOr[LogGroupFieldList] = js.undefined
}
object GetLogGroupFieldsResponse {
  
  inline def apply(): GetLogGroupFieldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLogGroupFieldsResponse]
  }
  
  extension [Self <: GetLogGroupFieldsResponse](x: Self) {
    
    inline def setLogGroupFields(value: LogGroupFieldList): Self = StObject.set(x, "logGroupFields", value.asInstanceOf[js.Any])
    
    inline def setLogGroupFieldsUndefined: Self = StObject.set(x, "logGroupFields", js.undefined)
    
    inline def setLogGroupFieldsVarargs(value: LogGroupField*): Self = StObject.set(x, "logGroupFields", js.Array(value :_*))
  }
}
