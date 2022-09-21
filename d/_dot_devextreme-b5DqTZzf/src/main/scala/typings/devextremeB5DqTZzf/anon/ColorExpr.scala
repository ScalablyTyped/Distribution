package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource.DataSourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorExpr extends StObject {
  
  /**
    * Specifies the data field that provides resources&apos; color.
    */
  var colorExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Binds the UI component to the data source, which contains resources.
    */
  var dataSource: js.UndefOr[DataSourceLike[Any, Any]] = js.undefined
  
  /**
    * Specifies the data field that provides keys for resources.
    */
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies the data field that provides resource texts.
    */
  var textExpr: js.UndefOr[String | js.Function] = js.undefined
}
object ColorExpr {
  
  inline def apply(): ColorExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorExpr]
  }
  
  extension [Self <: ColorExpr](x: Self) {
    
    inline def setColorExpr(value: String | js.Function): Self = StObject.set(x, "colorExpr", value.asInstanceOf[js.Any])
    
    inline def setColorExprUndefined: Self = StObject.set(x, "colorExpr", js.undefined)
    
    inline def setDataSource(value: DataSourceLike[Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setKeyExpr(value: String | js.Function): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    inline def setTextExpr(value: String | js.Function): Self = StObject.set(x, "textExpr", value.asInstanceOf[js.Any])
    
    inline def setTextExprUndefined: Self = StObject.set(x, "textExpr", js.undefined)
  }
}
