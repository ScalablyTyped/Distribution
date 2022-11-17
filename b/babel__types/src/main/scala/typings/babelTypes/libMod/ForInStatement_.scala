package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForInStatement_
  extends StObject
     with BaseNode {
  
  var body: Statement
  
  var left: VariableDeclaration_ | LVal
  
  var right: Expression
  
  @JSName("type")
  var type_ForInStatement_ : "ForInStatement"
}
object ForInStatement_ {
  
  inline def apply(body: Statement, left: VariableDeclaration_ | LVal, right: Expression): ForInStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[ForInStatement_]
  }
  
  extension [Self <: ForInStatement_](x: Self) {
    
    inline def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: VariableDeclaration_ | LVal): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: "ForInStatement"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
