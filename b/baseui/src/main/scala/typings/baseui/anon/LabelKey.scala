package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelKey extends StObject {
  
  var labelKey: String = js.native
  
  var valueKey: String = js.native
}
object LabelKey {
  
  @scala.inline
  def apply(labelKey: String, valueKey: String): LabelKey = {
    val __obj = js.Dynamic.literal(labelKey = labelKey.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelKey]
  }
  
  @scala.inline
  implicit class LabelKeyMutableBuilder[Self <: LabelKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
  }
}
