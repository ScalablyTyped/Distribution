package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockStatement_
  extends StObject
     with BaseNode {
  
  var body: js.Array[Statement]
  
  var directives: js.Array[Directive_]
  
  @JSName("type")
  var type_BlockStatement_ : "BlockStatement"
}
object BlockStatement_ {
  
  inline def apply(body: js.Array[Statement], directives: js.Array[Directive_]): BlockStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[BlockStatement_]
  }
  
  extension [Self <: BlockStatement_](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setDirectives(value: js.Array[Directive_]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesVarargs(value: Directive_ *): Self = StObject.set(x, "directives", js.Array(value*))
    
    inline def setType(value: "BlockStatement"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
