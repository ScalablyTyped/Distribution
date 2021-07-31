package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AjaxSettings
  extends StObject
     with typings.jquery.JQuery.AjaxSettings[js.Any] {
  
  /**
    * Data property or manipulation method for table data. Since: 1.10
    */
  var dataSrc: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Array[js.Any]])] = js.undefined
}
object AjaxSettings {
  
  @scala.inline
  def apply(): AjaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxSettings]
  }
  
  @scala.inline
  implicit class AjaxSettingsMutableBuilder[Self <: AjaxSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSrc(value: String | (js.Function1[/* data */ js.Any, js.Array[js.Any]])): Self = StObject.set(x, "dataSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSrcFunction1(value: /* data */ js.Any => js.Array[js.Any]): Self = StObject.set(x, "dataSrc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataSrcUndefined: Self = StObject.set(x, "dataSrc", js.undefined)
  }
}
