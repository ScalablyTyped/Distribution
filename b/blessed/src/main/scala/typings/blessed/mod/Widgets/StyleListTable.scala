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
  var cell: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Header style.
    */
  var header: js.UndefOr[js.Any] = js.undefined
}
object StyleListTable {
  
  @scala.inline
  def apply(): StyleListTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleListTable]
  }
  
  @scala.inline
  implicit class StyleListTableMutableBuilder[Self <: StyleListTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCell(value: js.Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
