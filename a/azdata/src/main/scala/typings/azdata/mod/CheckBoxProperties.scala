package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckBoxProperties extends ComponentProperties {
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[String] = js.native
}
object CheckBoxProperties {
  
  @scala.inline
  def apply(): CheckBoxProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckBoxProperties]
  }
  
  @scala.inline
  implicit class CheckBoxPropertiesMutableBuilder[Self <: CheckBoxProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
