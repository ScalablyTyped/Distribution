package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrepareQueryRequest extends StObject {
  
  /**
    * The Timestream query string that you want to use as a prepared statement. Parameter names can be specified in the query string @ character followed by an identifier. 
    */
  var QueryString: typings.awsSdk.clientsTimestreamqueryMod.QueryString
  
  /**
    * By setting this value to true, Timestream will only validate that the query string is a valid Timestream query, and not store the prepared query for later use.
    */
  var ValidateOnly: js.UndefOr[NullableBoolean] = js.undefined
}
object PrepareQueryRequest {
  
  inline def apply(QueryString: QueryString): PrepareQueryRequest = {
    val __obj = js.Dynamic.literal(QueryString = QueryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrepareQueryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrepareQueryRequest] (val x: Self) extends AnyVal {
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
    
    inline def setValidateOnly(value: NullableBoolean): Self = StObject.set(x, "ValidateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "ValidateOnly", js.undefined)
  }
}
