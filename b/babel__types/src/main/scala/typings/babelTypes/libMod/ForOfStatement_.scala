package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.ForOfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForOfStatement_
  extends StObject
     with BaseNode
     with BlockParent
     with For
     with ForXStatement
     with Loop
     with Node
     with Scopable
     with Standardized
     with Statement {
  
  var await: Boolean
  
  var body: Statement
  
  var left: VariableDeclaration_ | LVal
  
  var right: Expression
  
  @JSName("type")
  var type_ForOfStatement_ : ForOfStatement
}
object ForOfStatement_ {
  
  inline def apply(await: Boolean, body: Statement, left: VariableDeclaration_ | LVal, right: Expression): ForOfStatement_ = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[ForOfStatement_]
  }
  
  extension [Self <: ForOfStatement_](x: Self) {
    
    inline def setAwait(value: Boolean): Self = StObject.set(x, "await", value.asInstanceOf[js.Any])
    
    inline def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: VariableDeclaration_ | LVal): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: ForOfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
