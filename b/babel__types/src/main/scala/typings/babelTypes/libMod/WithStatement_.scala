package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.WithStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithStatement_
  extends StObject
     with BaseNode
     with Node
     with Standardized
     with Statement {
  
  var body: Statement
  
  var `object`: Expression
  
  @JSName("type")
  var type_WithStatement_ : WithStatement
}
object WithStatement_ {
  
  inline def apply(body: Statement, `object`: Expression): WithStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WithStatement")
    __obj.asInstanceOf[WithStatement_]
  }
  
  extension [Self <: WithStatement_](x: Self) {
    
    inline def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Expression): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setType(value: WithStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
