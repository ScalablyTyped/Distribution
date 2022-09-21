package typings.handlebarsPfdZsGKG.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MustacheStatement
  extends StObject
     with Node {
  
  var escaped: Boolean
  
  var hash: Hash
  
  var params: js.Array[Expression]
  
  var path: PathExpression | Literal
  
  var strip: StripFlags
  
  @JSName("type")
  var type_MustacheStatement: typings.handlebarsPfdZsGKG.handlebarsPfdZsGKGStrings.MustacheStatement
}
object MustacheStatement {
  
  inline def apply(
    escaped: Boolean,
    hash: Hash,
    loc: SourceLocation,
    params: js.Array[Expression],
    path: PathExpression | Literal,
    strip: StripFlags
  ): MustacheStatement = {
    val __obj = js.Dynamic.literal(escaped = escaped.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MustacheStatement")
    __obj.asInstanceOf[MustacheStatement]
  }
  
  extension [Self <: MustacheStatement](x: Self) {
    
    inline def setEscaped(value: Boolean): Self = StObject.set(x, "escaped", value.asInstanceOf[js.Any])
    
    inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Expression]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: Expression*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setPath(value: PathExpression | Literal): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStrip(value: StripFlags): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.handlebarsPfdZsGKG.handlebarsPfdZsGKGStrings.MustacheStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
