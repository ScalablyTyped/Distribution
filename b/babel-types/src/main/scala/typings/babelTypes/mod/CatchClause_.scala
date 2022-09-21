package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.CatchClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatchClause_
  extends StObject
     with Node
     with Scopable {
  
  var body: BlockStatement_
  
  var param: Identifier_
  
  @JSName("type")
  var type_CatchClause_ : CatchClause
}
object CatchClause_ {
  
  inline def apply(body: BlockStatement_, end: Double, loc: SourceLocation, param: Identifier_, start: Double): CatchClause_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CatchClause")
    __obj.asInstanceOf[CatchClause_]
  }
  
  extension [Self <: CatchClause_](x: Self) {
    
    inline def setBody(value: BlockStatement_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setParam(value: Identifier_): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setType(value: CatchClause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
