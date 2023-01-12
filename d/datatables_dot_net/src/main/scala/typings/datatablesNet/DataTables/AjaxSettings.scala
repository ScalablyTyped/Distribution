package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AjaxSettings
  extends StObject
     with typings.jquery.JQuery.AjaxSettings[Any] {
  
  /**
    * Data property or manipulation method for table data. Since: 1.10
    */
  var dataSrc: js.UndefOr[String | (js.Function1[/* data */ Any, js.Array[Any]])] = js.undefined
}
object AjaxSettings {
  
  inline def apply(): AjaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AjaxSettings] (val x: Self) extends AnyVal {
    
    inline def setDataSrc(value: String | (js.Function1[/* data */ Any, js.Array[Any]])): Self = StObject.set(x, "dataSrc", value.asInstanceOf[js.Any])
    
    inline def setDataSrcFunction1(value: /* data */ Any => js.Array[Any]): Self = StObject.set(x, "dataSrc", js.Any.fromFunction1(value))
    
    inline def setDataSrcUndefined: Self = StObject.set(x, "dataSrc", js.undefined)
  }
}
