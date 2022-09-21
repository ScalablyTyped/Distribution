package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ThisExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThisExpression_
  extends StObject
     with Node
     with Expression {
  
  @JSName("type")
  var type_ThisExpression_ : ThisExpression
}
object ThisExpression_ {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double): ThisExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[ThisExpression_]
  }
  
  extension [Self <: ThisExpression_](x: Self) {
    
    inline def setType(value: ThisExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
