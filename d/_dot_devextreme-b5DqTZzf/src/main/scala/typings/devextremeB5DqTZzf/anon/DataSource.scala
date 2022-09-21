package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource.DataSourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
  /**
    * Binds the UI component to the data source which contains dependencies.
    */
  var dataSource: js.UndefOr[DataSourceLike[Any, Any]] = js.undefined
  
  /**
    * Specifies the data field that provides keys for dependencies.
    */
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies the data field that provides predecessor IDs.
    */
  var predecessorIdExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies the data field that provides successor IDs.
    */
  var successorIdExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies the data field that provides dependency types.
    */
  var typeExpr: js.UndefOr[String | js.Function] = js.undefined
}
object DataSource {
  
  inline def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  extension [Self <: DataSource](x: Self) {
    
    inline def setDataSource(value: DataSourceLike[Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setKeyExpr(value: String | js.Function): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    inline def setPredecessorIdExpr(value: String | js.Function): Self = StObject.set(x, "predecessorIdExpr", value.asInstanceOf[js.Any])
    
    inline def setPredecessorIdExprUndefined: Self = StObject.set(x, "predecessorIdExpr", js.undefined)
    
    inline def setSuccessorIdExpr(value: String | js.Function): Self = StObject.set(x, "successorIdExpr", value.asInstanceOf[js.Any])
    
    inline def setSuccessorIdExprUndefined: Self = StObject.set(x, "successorIdExpr", js.undefined)
    
    inline def setTypeExpr(value: String | js.Function): Self = StObject.set(x, "typeExpr", value.asInstanceOf[js.Any])
    
    inline def setTypeExprUndefined: Self = StObject.set(x, "typeExpr", js.undefined)
  }
}
