package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource.DataSourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyExpr extends StObject {
  
  /**
    * Binds the UI component to the data source, which contains resource assignments.
    */
  var dataSource: js.UndefOr[DataSourceLike[Any, Any]] = js.undefined
  
  /**
    * Specifies the data field that provides keys for resource assignments.
    */
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies the data field that provides resource IDs.
    */
  var resourceIdExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies the data field that provides task IDs.
    */
  var taskIdExpr: js.UndefOr[String | js.Function] = js.undefined
}
object KeyExpr {
  
  inline def apply(): KeyExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyExpr]
  }
  
  extension [Self <: KeyExpr](x: Self) {
    
    inline def setDataSource(value: DataSourceLike[Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setKeyExpr(value: String | js.Function): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    inline def setResourceIdExpr(value: String | js.Function): Self = StObject.set(x, "resourceIdExpr", value.asInstanceOf[js.Any])
    
    inline def setResourceIdExprUndefined: Self = StObject.set(x, "resourceIdExpr", js.undefined)
    
    inline def setTaskIdExpr(value: String | js.Function): Self = StObject.set(x, "taskIdExpr", value.asInstanceOf[js.Any])
    
    inline def setTaskIdExprUndefined: Self = StObject.set(x, "taskIdExpr", js.undefined)
  }
}
