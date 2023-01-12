package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseCapture extends StObject {
  
  var priority: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any)
  ] = js.undefined
  
  var useCapture: js.UndefOr[Boolean] = js.undefined
  
  var usePassive: js.UndefOr[Boolean] = js.undefined
}
object UseCapture {
  
  inline def apply(): UseCapture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseCapture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseCapture] (val x: Self) extends AnyVal {
    
    inline def setPriority(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any)
    ): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setUseCapture(value: Boolean): Self = StObject.set(x, "useCapture", value.asInstanceOf[js.Any])
    
    inline def setUseCaptureUndefined: Self = StObject.set(x, "useCapture", js.undefined)
    
    inline def setUsePassive(value: Boolean): Self = StObject.set(x, "usePassive", value.asInstanceOf[js.Any])
    
    inline def setUsePassiveUndefined: Self = StObject.set(x, "usePassive", js.undefined)
  }
}
