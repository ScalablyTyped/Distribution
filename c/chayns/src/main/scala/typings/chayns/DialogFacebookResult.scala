package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogFacebookResult extends StObject {
  
  var buttonType: Double
  
  var selection: js.Array[DialogFacebookResultSelection]
}
object DialogFacebookResult {
  
  @scala.inline
  def apply(buttonType: Double, selection: js.Array[DialogFacebookResultSelection]): DialogFacebookResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogFacebookResult]
  }
  
  @scala.inline
  implicit class DialogFacebookResultMutableBuilder[Self <: DialogFacebookResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonType(value: Double): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: js.Array[DialogFacebookResultSelection]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionVarargs(value: DialogFacebookResultSelection*): Self = StObject.set(x, "selection", js.Array(value :_*))
  }
}
