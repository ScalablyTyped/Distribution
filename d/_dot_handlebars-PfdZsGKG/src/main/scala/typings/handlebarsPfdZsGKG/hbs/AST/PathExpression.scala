package typings.handlebarsPfdZsGKG.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathExpression
  extends StObject
     with Node {
  
  var data: Boolean
  
  var depth: Double
  
  var original: String
  
  var parts: js.Array[String]
  
  @JSName("type")
  var type_PathExpression: typings.handlebarsPfdZsGKG.handlebarsPfdZsGKGStrings.PathExpression
}
object PathExpression {
  
  inline def apply(data: Boolean, depth: Double, loc: SourceLocation, original: String, parts: js.Array[String]): PathExpression = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PathExpression")
    __obj.asInstanceOf[PathExpression]
  }
  
  extension [Self <: PathExpression](x: Self) {
    
    inline def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setParts(value: js.Array[String]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsVarargs(value: String*): Self = StObject.set(x, "parts", js.Array(value*))
    
    inline def setType(value: typings.handlebarsPfdZsGKG.handlebarsPfdZsGKGStrings.PathExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
