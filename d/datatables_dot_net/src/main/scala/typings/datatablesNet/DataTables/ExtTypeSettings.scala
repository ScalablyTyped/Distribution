package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "ext internal"
trait ExtTypeSettings extends StObject {
  
  /**
    * Type detection functions for plug-in development.
    *
    * @see https://datatables.net/manual/plug-ins/type-detection
    */
  var detect: js.Array[FunctionExtTypeSettingsDetect]
  
  /**
    * Type based ordering functions for plug-in development.
    *
    * @see https://datatables.net/manual/plug-ins/sorting
    * @default {}
    */
  var order: js.Object
  
  /**
    * Type based search formatting for plug-in development.
    *
    * @default {}
    * @example
    *   $.fn.dataTable.ext.type.search['title-numeric'] = function ( d ) {
    *     return d.replace(/\n/g," ").replace( /<.*?>/g, "" );
    *   }
    */
  var search: js.Object
}
object ExtTypeSettings {
  
  inline def apply(detect: js.Array[FunctionExtTypeSettingsDetect], order: js.Object, search: js.Object): ExtTypeSettings = {
    val __obj = js.Dynamic.literal(detect = detect.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtTypeSettings]
  }
  
  extension [Self <: ExtTypeSettings](x: Self) {
    
    inline def setDetect(value: js.Array[FunctionExtTypeSettingsDetect]): Self = StObject.set(x, "detect", value.asInstanceOf[js.Any])
    
    inline def setDetectVarargs(value: FunctionExtTypeSettingsDetect*): Self = StObject.set(x, "detect", js.Array(value*))
    
    inline def setOrder(value: js.Object): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: js.Object): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
