package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.CatchClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatchClause_
  extends StObject
     with BaseNode
     with BlockParent
     with Node
     with Scopable
     with Standardized {
  
  var body: BlockStatement_
  
  var param: js.UndefOr[Identifier_ | ArrayPattern_ | ObjectPattern_ | Null] = js.undefined
  
  @JSName("type")
  var type_CatchClause_ : CatchClause
}
object CatchClause_ {
  
  inline def apply(body: BlockStatement_): CatchClause_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CatchClause")
    __obj.asInstanceOf[CatchClause_]
  }
  
  extension [Self <: CatchClause_](x: Self) {
    
    inline def setBody(value: BlockStatement_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setParam(value: Identifier_ | ArrayPattern_ | ObjectPattern_): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamNull: Self = StObject.set(x, "param", null)
    
    inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    inline def setType(value: CatchClause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
