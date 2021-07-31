package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonDomButtomCommon extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
}
object ButtonDomButtomCommon {
  
  @scala.inline
  def apply(): ButtonDomButtomCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonDomButtomCommon]
  }
  
  @scala.inline
  implicit class ButtonDomButtomCommonMutableBuilder[Self <: ButtonDomButtomCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
