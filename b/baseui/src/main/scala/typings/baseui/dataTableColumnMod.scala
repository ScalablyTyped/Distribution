package typings.baseui

import typings.baseui.dataTableTypesMod.ColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableColumnMod {
  
  @JSImport("baseui/data-table/column", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Value, FilterParams](options: ColumnOptions[Value, FilterParams]): ColumnOptions[Value, FilterParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[ColumnOptions[Value, FilterParams]]
}
