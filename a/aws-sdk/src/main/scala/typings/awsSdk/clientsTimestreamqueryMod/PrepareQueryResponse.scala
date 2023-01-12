package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrepareQueryResponse extends StObject {
  
  /**
    * A list of SELECT clause columns of the submitted query string. 
    */
  var Columns: SelectColumnList
  
  /**
    * A list of parameters used in the submitted query string. 
    */
  var Parameters: ParameterMappingList
  
  /**
    * The query string that you want prepare.
    */
  var QueryString: typings.awsSdk.clientsTimestreamqueryMod.QueryString
}
object PrepareQueryResponse {
  
  inline def apply(Columns: SelectColumnList, Parameters: ParameterMappingList, QueryString: QueryString): PrepareQueryResponse = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrepareQueryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrepareQueryResponse] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: SelectColumnList): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: SelectColumn*): Self = StObject.set(x, "Columns", js.Array(value*))
    
    inline def setParameters(value: ParameterMappingList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: ParameterMapping*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
  }
}
