package typings.azureMobileApps.Azure.MobileApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlQueryDefinition extends StObject {
  
  var parameters: js.UndefOr[js.Array[SqlParameterDefinition]] = js.undefined
  
  var sql: String
}
object SqlQueryDefinition {
  
  inline def apply(sql: String): SqlQueryDefinition = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlQueryDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqlQueryDefinition] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: js.Array[SqlParameterDefinition]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SqlParameterDefinition*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
  }
}
