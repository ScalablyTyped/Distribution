package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleListTable
  extends StObject
     with ListElementStyle {
  
  /**
    * Cell style.
    */
  var cell: js.UndefOr[Any] = js.undefined
  
  /**
    * Header style.
    */
  var header: js.UndefOr[Any] = js.undefined
}
object StyleListTable {
  
  inline def apply(): StyleListTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleListTable]
  }
  
  extension [Self <: StyleListTable](x: Self) {
    
    inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    inline def setHeader(value: Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
