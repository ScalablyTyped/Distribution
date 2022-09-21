package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindNodesInfo extends StObject {
  
  var database: String
  
  var name: String
  
  var parentObjectNames: js.Array[String]
  
  var schema: String
  
  var sessionId: String
  
  var `type`: String
}
object FindNodesInfo {
  
  inline def apply(
    database: String,
    name: String,
    parentObjectNames: js.Array[String],
    schema: String,
    sessionId: String,
    `type`: String
  ): FindNodesInfo = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentObjectNames = parentObjectNames.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindNodesInfo]
  }
  
  extension [Self <: FindNodesInfo](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParentObjectNames(value: js.Array[String]): Self = StObject.set(x, "parentObjectNames", value.asInstanceOf[js.Any])
    
    inline def setParentObjectNamesVarargs(value: String*): Self = StObject.set(x, "parentObjectNames", js.Array(value*))
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
