package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var backward: js.UndefOr[Boolean] = js.undefined
  
  var fake: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[Boolean] = js.undefined
}
object Label {
  
  inline def apply(): Label = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setBackward(value: Boolean): Self = StObject.set(x, "backward", value.asInstanceOf[js.Any])
    
    inline def setBackwardUndefined: Self = StObject.set(x, "backward", js.undefined)
    
    inline def setFake(value: Boolean): Self = StObject.set(x, "fake", value.asInstanceOf[js.Any])
    
    inline def setFakeUndefined: Self = StObject.set(x, "fake", js.undefined)
    
    inline def setLabel(value: Boolean): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
