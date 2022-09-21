package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataExpressionMixin extends StObject {
  
  def getDataSource(): DataSource[Any, Any]
}
object DataExpressionMixin {
  
  inline def apply(getDataSource: () => DataSource[Any, Any]): DataExpressionMixin = {
    val __obj = js.Dynamic.literal(getDataSource = js.Any.fromFunction0(getDataSource))
    __obj.asInstanceOf[DataExpressionMixin]
  }
  
  extension [Self <: DataExpressionMixin](x: Self) {
    
    inline def setGetDataSource(value: () => DataSource[Any, Any]): Self = StObject.set(x, "getDataSource", js.Any.fromFunction0(value))
  }
}
