package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.StaticBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait StaticBlock_
  extends StObject
     with BaseNode
     with BlockParent
     with FunctionParent
     with Scopable
     with Standardized {
  
  var body: js.Array[Statement]
  
  @JSName("type")
  var type_StaticBlock_ : StaticBlock
}
object StaticBlock_ {
  
  inline def apply(body: js.Array[Statement]): StaticBlock_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StaticBlock")
    __obj.asInstanceOf[StaticBlock_]
  }
  
  extension [Self <: StaticBlock_](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setType(value: StaticBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
