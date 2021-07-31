package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ReturnStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ReturnStatement_
  extends StObject
     with BaseNode
     with CompletionStatement
     with Statement
     with Terminatorless {
  
  var argument: Expression | Null
  
  @JSName("type")
  var type_ReturnStatement_ : ReturnStatement
}
object ReturnStatement_ {
  
  @scala.inline
  def apply(): ReturnStatement_ = {
    val __obj = js.Dynamic.literal(argument = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[ReturnStatement_]
  }
  
  @scala.inline
  implicit class ReturnStatement_MutableBuilder[Self <: ReturnStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentNull: Self = StObject.set(x, "argument", null)
    
    @scala.inline
    def setType(value: ReturnStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
