package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDataSource extends StObject {
  
  var component: js.UndefOr[Any] = js.undefined
  
  var dataSource: js.UndefOr[Options[Any, Any, Any, Any]] = js.undefined
}
object ComponentDataSource {
  
  inline def apply(): ComponentDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentDataSource]
  }
  
  extension [Self <: ComponentDataSource](x: Self) {
    
    inline def setComponent(value: Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setDataSource(value: Options[Any, Any, Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
  }
}
