package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryTablesOptions
  extends StObject
     with TimeoutIntervalOptions {
  
  var nextTableName: js.UndefOr[String] = js.undefined
}
object QueryTablesOptions {
  
  @scala.inline
  def apply(): QueryTablesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTablesOptions]
  }
  
  @scala.inline
  implicit class QueryTablesOptionsMutableBuilder[Self <: QueryTablesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextTableName(value: String): Self = StObject.set(x, "nextTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTableNameUndefined: Self = StObject.set(x, "nextTableName", js.undefined)
  }
}
