package typings.handlebarsPfdZsGKG.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialStatement
  extends StObject
     with Node {
  
  var hash: Hash
  
  var indent: String
  
  var name: PathExpression | SubExpression
  
  var params: js.Array[Expression]
  
  var strip: StripFlags
  
  @JSName("type")
  var type_PartialStatement: typings.handlebarsPfdZsGKG.handlebarsPfdZsGKGStrings.PartialStatement
}
object PartialStatement {
  
  inline def apply(
    hash: Hash,
    indent: String,
    loc: SourceLocation,
    name: PathExpression | SubExpression,
    params: js.Array[Expression],
    strip: StripFlags
  ): PartialStatement = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PartialStatement")
    __obj.asInstanceOf[PartialStatement]
  }
  
  extension [Self <: PartialStatement](x: Self) {
    
    inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setName(value: PathExpression | SubExpression): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Expression]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: Expression*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setStrip(value: StripFlags): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.handlebarsPfdZsGKG.handlebarsPfdZsGKGStrings.PartialStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
