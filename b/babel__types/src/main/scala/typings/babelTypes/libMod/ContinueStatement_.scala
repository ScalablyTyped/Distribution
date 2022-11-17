package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueStatement_
  extends StObject
     with BaseNode {
  
  var label: js.UndefOr[Identifier_ | Null] = js.undefined
  
  @JSName("type")
  var type_ContinueStatement_ : "ContinueStatement"
}
object ContinueStatement_ {
  
  inline def apply(): ContinueStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[ContinueStatement_]
  }
  
  extension [Self <: ContinueStatement_](x: Self) {
    
    inline def setLabel(value: Identifier_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setType(value: "ContinueStatement"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
