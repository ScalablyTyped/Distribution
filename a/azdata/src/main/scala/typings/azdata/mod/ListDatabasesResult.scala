package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDatabasesResult extends StObject {
  
  var databaseNames: js.Array[String] = js.native
  
  var databases: js.UndefOr[js.Array[DatabaseInfo]] = js.native
}
object ListDatabasesResult {
  
  @scala.inline
  def apply(databaseNames: js.Array[String]): ListDatabasesResult = {
    val __obj = js.Dynamic.literal(databaseNames = databaseNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatabasesResult]
  }
  
  @scala.inline
  implicit class ListDatabasesResultMutableBuilder[Self <: ListDatabasesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseNames(value: js.Array[String]): Self = StObject.set(x, "databaseNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNamesVarargs(value: String*): Self = StObject.set(x, "databaseNames", js.Array(value :_*))
    
    @scala.inline
    def setDatabases(value: js.Array[DatabaseInfo]): Self = StObject.set(x, "databases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabasesUndefined: Self = StObject.set(x, "databases", js.undefined)
    
    @scala.inline
    def setDatabasesVarargs(value: DatabaseInfo*): Self = StObject.set(x, "databases", js.Array(value :_*))
  }
}
