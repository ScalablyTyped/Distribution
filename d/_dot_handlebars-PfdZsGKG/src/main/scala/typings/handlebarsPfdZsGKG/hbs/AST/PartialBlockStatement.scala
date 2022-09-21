package typings.handlebarsPfdZsGKG.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialBlockStatement
  extends StObject
     with Node {
  
  var closeStrip: StripFlags
  
  var hash: Hash
  
  var name: PathExpression | SubExpression
  
  var openStrip: StripFlags
  
  var params: js.Array[Expression]
  
  var program: Program
  
  @JSName("type")
  var type_PartialBlockStatement: typings.handlebarsPfdZsGKG.handlebarsPfdZsGKGStrings.PartialBlockStatement
}
object PartialBlockStatement {
  
  inline def apply(
    closeStrip: StripFlags,
    hash: Hash,
    loc: SourceLocation,
    name: PathExpression | SubExpression,
    openStrip: StripFlags,
    params: js.Array[Expression],
    program: Program
  ): PartialBlockStatement = {
    val __obj = js.Dynamic.literal(closeStrip = closeStrip.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], openStrip = openStrip.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PartialBlockStatement")
    __obj.asInstanceOf[PartialBlockStatement]
  }
  
  extension [Self <: PartialBlockStatement](x: Self) {
    
    inline def setCloseStrip(value: StripFlags): Self = StObject.set(x, "closeStrip", value.asInstanceOf[js.Any])
    
    inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setName(value: PathExpression | SubExpression): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOpenStrip(value: StripFlags): Self = StObject.set(x, "openStrip", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Expression]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: Expression*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.handlebarsPfdZsGKG.handlebarsPfdZsGKGStrings.PartialBlockStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
