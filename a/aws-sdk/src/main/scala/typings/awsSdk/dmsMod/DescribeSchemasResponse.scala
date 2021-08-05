package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSchemasResponse extends StObject {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The described schema.
    */
  var Schemas: js.UndefOr[SchemaList] = js.undefined
}
object DescribeSchemasResponse {
  
  inline def apply(): DescribeSchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSchemasResponse]
  }
  
  extension [Self <: DescribeSchemasResponse](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setSchemas(value: SchemaList): Self = StObject.set(x, "Schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "Schemas", js.undefined)
    
    inline def setSchemasVarargs(value: String*): Self = StObject.set(x, "Schemas", js.Array(value :_*))
  }
}
