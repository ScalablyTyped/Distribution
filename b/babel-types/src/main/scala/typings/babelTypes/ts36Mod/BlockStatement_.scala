package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.BlockStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockStatement_
  extends StObject
     with Node
     with Block
     with BlockParent
     with Scopable
     with Statement {
  
  var body: js.Array[Statement]
  
  var directives: js.UndefOr[js.Array[Directive_]] = js.undefined
  
  @JSName("type")
  var type_BlockStatement_ : BlockStatement
}
object BlockStatement_ {
  
  inline def apply(body: js.Array[Statement], end: Double, loc: SourceLocation, start: Double): BlockStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[BlockStatement_]
  }
  
  extension [Self <: BlockStatement_](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    inline def setDirectives(value: js.Array[Directive_]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    inline def setDirectivesVarargs(value: Directive_ *): Self = StObject.set(x, "directives", js.Array(value :_*))
    
    inline def setType(value: BlockStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
