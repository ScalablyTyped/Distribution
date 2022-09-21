package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetAdvisorSchemasRequest extends StObject {
  
  /**
    *  If you specify any of the following filters, the output includes information for only those schemas that meet the filter criteria:    complexity – The schema's complexity, for example Simple.    database-id – The ID of the schema's database.    database-ip-address – The IP address of the schema's database.    database-name – The name of the schema's database.    database-engine – The name of the schema database's engine.    original-schema-name – The name of the schema's database's main schema.    schema-id – The ID of the schema, for example 15.    schema-name – The name of the schema.    server-ip-address – The IP address of the schema database's server.   An example is: describe-fleet-advisor-schemas --filter Name="schema-id",Values="50" 
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * Sets the maximum number of records returned in the response.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * If NextToken is returned by a previous response, there are more results available. The value of NextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeFleetAdvisorSchemasRequest {
  
  inline def apply(): DescribeFleetAdvisorSchemasRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetAdvisorSchemasRequest]
  }
  
  extension [Self <: DescribeFleetAdvisorSchemasRequest](x: Self) {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
