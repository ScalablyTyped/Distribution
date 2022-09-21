package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource.DataSourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomDataExpr extends StObject {
  
  /**
    * Specifies the name of a data source field or an expression that returns an edge&apos;s custom data.
    */
  var customDataExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Binds the edges collection to the specified data. Specify this property if you use node and edge data sources.
    */
  var dataSource: js.UndefOr[DataSourceLike[Any, Any]] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns an edge&apos;s start node key.
    */
  var fromExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns an edge&apos;s line start tip.
    */
  var fromLineEndExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns an index of a shape connection point where an edge starts.
    */
  var fromPointIndexExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns an edge&apos;s key.
    */
  var keyExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns an edge&apos;s line type.
    */
  var lineTypeExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression whose Boolean value indicates whether an edge is locked.
    */
  var lockedExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns an edge&apos;s key points.
    */
  var pointsExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns an edge style.
    */
  var styleExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns edge text.
    */
  var textExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns an edge&apos;s text style.
    */
  var textStyleExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns an edge&apos;s end node key.
    */
  var toExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns an edge&apos;s line end tip.
    */
  var toLineEndExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns an index of a shape connection point where an edge ends.
    */
  var toPointIndexExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns an edge&apos;s z-index.
    */
  var zIndexExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
}
object CustomDataExpr {
  
  inline def apply(): CustomDataExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDataExpr]
  }
  
  extension [Self <: CustomDataExpr](x: Self) {
    
    inline def setCustomDataExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "customDataExpr", value.asInstanceOf[js.Any])
    
    inline def setCustomDataExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "customDataExpr", js.Any.fromFunction2(value))
    
    inline def setCustomDataExprUndefined: Self = StObject.set(x, "customDataExpr", js.undefined)
    
    inline def setDataSource(value: DataSourceLike[Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setFromExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "fromExpr", value.asInstanceOf[js.Any])
    
    inline def setFromExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "fromExpr", js.Any.fromFunction2(value))
    
    inline def setFromExprUndefined: Self = StObject.set(x, "fromExpr", js.undefined)
    
    inline def setFromLineEndExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "fromLineEndExpr", value.asInstanceOf[js.Any])
    
    inline def setFromLineEndExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "fromLineEndExpr", js.Any.fromFunction2(value))
    
    inline def setFromLineEndExprUndefined: Self = StObject.set(x, "fromLineEndExpr", js.undefined)
    
    inline def setFromPointIndexExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "fromPointIndexExpr", value.asInstanceOf[js.Any])
    
    inline def setFromPointIndexExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "fromPointIndexExpr", js.Any.fromFunction2(value))
    
    inline def setFromPointIndexExprUndefined: Self = StObject.set(x, "fromPointIndexExpr", js.undefined)
    
    inline def setKeyExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    inline def setKeyExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "keyExpr", js.Any.fromFunction2(value))
    
    inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    inline def setLineTypeExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "lineTypeExpr", value.asInstanceOf[js.Any])
    
    inline def setLineTypeExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "lineTypeExpr", js.Any.fromFunction2(value))
    
    inline def setLineTypeExprUndefined: Self = StObject.set(x, "lineTypeExpr", js.undefined)
    
    inline def setLockedExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "lockedExpr", value.asInstanceOf[js.Any])
    
    inline def setLockedExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "lockedExpr", js.Any.fromFunction2(value))
    
    inline def setLockedExprUndefined: Self = StObject.set(x, "lockedExpr", js.undefined)
    
    inline def setPointsExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "pointsExpr", value.asInstanceOf[js.Any])
    
    inline def setPointsExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "pointsExpr", js.Any.fromFunction2(value))
    
    inline def setPointsExprUndefined: Self = StObject.set(x, "pointsExpr", js.undefined)
    
    inline def setStyleExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "styleExpr", value.asInstanceOf[js.Any])
    
    inline def setStyleExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "styleExpr", js.Any.fromFunction2(value))
    
    inline def setStyleExprUndefined: Self = StObject.set(x, "styleExpr", js.undefined)
    
    inline def setTextExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "textExpr", value.asInstanceOf[js.Any])
    
    inline def setTextExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "textExpr", js.Any.fromFunction2(value))
    
    inline def setTextExprUndefined: Self = StObject.set(x, "textExpr", js.undefined)
    
    inline def setTextStyleExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "textStyleExpr", value.asInstanceOf[js.Any])
    
    inline def setTextStyleExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "textStyleExpr", js.Any.fromFunction2(value))
    
    inline def setTextStyleExprUndefined: Self = StObject.set(x, "textStyleExpr", js.undefined)
    
    inline def setToExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "toExpr", value.asInstanceOf[js.Any])
    
    inline def setToExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "toExpr", js.Any.fromFunction2(value))
    
    inline def setToExprUndefined: Self = StObject.set(x, "toExpr", js.undefined)
    
    inline def setToLineEndExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "toLineEndExpr", value.asInstanceOf[js.Any])
    
    inline def setToLineEndExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "toLineEndExpr", js.Any.fromFunction2(value))
    
    inline def setToLineEndExprUndefined: Self = StObject.set(x, "toLineEndExpr", js.undefined)
    
    inline def setToPointIndexExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "toPointIndexExpr", value.asInstanceOf[js.Any])
    
    inline def setToPointIndexExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "toPointIndexExpr", js.Any.fromFunction2(value))
    
    inline def setToPointIndexExprUndefined: Self = StObject.set(x, "toPointIndexExpr", js.undefined)
    
    inline def setZIndexExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "zIndexExpr", value.asInstanceOf[js.Any])
    
    inline def setZIndexExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "zIndexExpr", js.Any.fromFunction2(value))
    
    inline def setZIndexExprUndefined: Self = StObject.set(x, "zIndexExpr", js.undefined)
  }
}
