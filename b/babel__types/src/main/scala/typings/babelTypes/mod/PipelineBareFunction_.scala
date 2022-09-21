package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.PipelineBareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait PipelineBareFunction_
  extends StObject
     with BaseNode
     with Expression {
  
  var callee: Expression
  
  @JSName("type")
  var type_PipelineBareFunction_ : PipelineBareFunction
}
object PipelineBareFunction_ {
  
  inline def apply(callee: Expression): PipelineBareFunction_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("PipelineBareFunction")
    __obj.asInstanceOf[PipelineBareFunction_]
  }
  
  extension [Self <: PipelineBareFunction_](x: Self) {
    
    inline def setCallee(value: Expression): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    inline def setType(value: PipelineBareFunction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
