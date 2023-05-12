package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelledShadowDomSelector
  extends StObject
     with _Selector
     with _SerialSelector {
  
  var fromShadowDom: ShadowDomSelector
}
object LabelledShadowDomSelector {
  
  inline def apply(fromShadowDom: ShadowDomSelector): LabelledShadowDomSelector = {
    val __obj = js.Dynamic.literal(fromShadowDom = fromShadowDom.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelledShadowDomSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelledShadowDomSelector] (val x: Self) extends AnyVal {
    
    inline def setFromShadowDom(value: ShadowDomSelector): Self = StObject.set(x, "fromShadowDom", value.asInstanceOf[js.Any])
  }
}
