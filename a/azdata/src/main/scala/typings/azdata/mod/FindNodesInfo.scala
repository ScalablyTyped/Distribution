package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindNodesInfo extends StObject {
  
  var database: String = js.native
  
  var name: String = js.native
  
  var parentObjectNames: js.Array[String] = js.native
  
  var schema: String = js.native
  
  var sessionId: String = js.native
  
  var `type`: String = js.native
}
object FindNodesInfo {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class FindNodesInfoMutableBuilder[Self <: FindNodesInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentObjectNames(value: js.Array[String]): Self = StObject.set(x, "parentObjectNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentObjectNamesVarargs(value: String*): Self = StObject.set(x, "parentObjectNames", js.Array(value :_*))
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
