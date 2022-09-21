package typings.handlebarsPfdZsGKG.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockStatement
  extends StObject
     with Node {
  
  var closeStrip: StripFlags
  
  var hash: Hash
  
  var inverse: Program
  
  var inverseStrip: StripFlags
  
  var openStrip: StripFlags
  
  var params: js.Array[Expression]
  
  var path: PathExpression
  
  var program: Program
  
  @JSName("type")
  var type_BlockStatement: typings.handlebarsPfdZsGKG.handlebarsPfdZsGKGStrings.BlockStatement
}
object BlockStatement {
  
  inline def apply(
    closeStrip: StripFlags,
    hash: Hash,
    inverse: Program,
    inverseStrip: StripFlags,
    loc: SourceLocation,
    openStrip: StripFlags,
    params: js.Array[Expression],
    path: PathExpression,
    program: Program
  ): BlockStatement = {
    val __obj = js.Dynamic.literal(closeStrip = closeStrip.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], inverseStrip = inverseStrip.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], openStrip = openStrip.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[BlockStatement]
  }
  
  extension [Self <: BlockStatement](x: Self) {
    
    inline def setCloseStrip(value: StripFlags): Self = StObject.set(x, "closeStrip", value.asInstanceOf[js.Any])
    
    inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setInverse(value: Program): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setInverseStrip(value: StripFlags): Self = StObject.set(x, "inverseStrip", value.asInstanceOf[js.Any])
    
    inline def setOpenStrip(value: StripFlags): Self = StObject.set(x, "openStrip", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Expression]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: Expression*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setPath(value: PathExpression): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.handlebarsPfdZsGKG.handlebarsPfdZsGKGStrings.BlockStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
