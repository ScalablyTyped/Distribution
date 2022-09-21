package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ModuleExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ModuleExpression_
  extends StObject
     with BaseNode
     with Expression {
  
  var body: Program_
  
  @JSName("type")
  var type_ModuleExpression_ : ModuleExpression
}
object ModuleExpression_ {
  
  inline def apply(body: Program_): ModuleExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ModuleExpression")
    __obj.asInstanceOf[ModuleExpression_]
  }
  
  extension [Self <: ModuleExpression_](x: Self) {
    
    inline def setBody(value: Program_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setType(value: ModuleExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
