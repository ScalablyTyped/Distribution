package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fake extends StObject {
  
  var backward: js.UndefOr[Boolean] = js.undefined
  
  var fake: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
}
object Fake {
  
  inline def apply(): Fake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fake] (val x: Self) extends AnyVal {
    
    inline def setBackward(value: Boolean): Self = StObject.set(x, "backward", value.asInstanceOf[js.Any])
    
    inline def setBackwardUndefined: Self = StObject.set(x, "backward", js.undefined)
    
    inline def setFake(value: Boolean): Self = StObject.set(x, "fake", value.asInstanceOf[js.Any])
    
    inline def setFakeUndefined: Self = StObject.set(x, "fake", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
