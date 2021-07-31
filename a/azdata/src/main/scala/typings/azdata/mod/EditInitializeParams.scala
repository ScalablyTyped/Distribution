package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditInitializeParams
  extends StObject
     with IEditSessionOperationParams {
  
  var filters: EditInitializeFiltering
  
  var objectName: String
  
  var objectType: String
  
  var queryString: String
  
  var schemaName: String
}
object EditInitializeParams {
  
  @scala.inline
  def apply(
    filters: EditInitializeFiltering,
    objectName: String,
    objectType: String,
    ownerUri: String,
    queryString: String,
    schemaName: String
  ): EditInitializeParams = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], objectName = objectName.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], schemaName = schemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditInitializeParams]
  }
  
  @scala.inline
  implicit class EditInitializeParamsMutableBuilder[Self <: EditInitializeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: EditInitializeFiltering): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaName(value: String): Self = StObject.set(x, "schemaName", value.asInstanceOf[js.Any])
  }
}
