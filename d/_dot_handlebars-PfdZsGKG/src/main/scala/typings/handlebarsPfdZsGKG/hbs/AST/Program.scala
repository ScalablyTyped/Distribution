package typings.handlebarsPfdZsGKG.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Program
  extends StObject
     with Node {
  
  var blockParams: js.Array[String]
  
  var body: js.Array[Statement]
}
object Program {
  
  inline def apply(blockParams: js.Array[String], body: js.Array[Statement], loc: SourceLocation, `type`: String): Program = {
    val __obj = js.Dynamic.literal(blockParams = blockParams.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Program]
  }
  
  extension [Self <: Program](x: Self) {
    
    inline def setBlockParams(value: js.Array[String]): Self = StObject.set(x, "blockParams", value.asInstanceOf[js.Any])
    
    inline def setBlockParamsVarargs(value: String*): Self = StObject.set(x, "blockParams", js.Array(value*))
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
  }
}
