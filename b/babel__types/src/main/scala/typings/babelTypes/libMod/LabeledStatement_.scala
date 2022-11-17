package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabeledStatement_
  extends StObject
     with BaseNode {
  
  var body: Statement
  
  var label: Identifier_
  
  @JSName("type")
  var type_LabeledStatement_ : "LabeledStatement"
}
object LabeledStatement_ {
  
  inline def apply(body: Statement, label: Identifier_): LabeledStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LabeledStatement")
    __obj.asInstanceOf[LabeledStatement_]
  }
  
  extension [Self <: LabeledStatement_](x: Self) {
    
    inline def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Identifier_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setType(value: "LabeledStatement"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
