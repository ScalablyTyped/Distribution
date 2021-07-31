package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.SpreadElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait SpreadElement_
  extends StObject
     with BaseNode
     with UnaryLike {
  
  var argument: Expression
  
  @JSName("type")
  var type_SpreadElement_ : SpreadElement
}
object SpreadElement_ {
  
  @scala.inline
  def apply(argument: Expression): SpreadElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("SpreadElement")
    __obj.asInstanceOf[SpreadElement_]
  }
  
  @scala.inline
  implicit class SpreadElement_MutableBuilder[Self <: SpreadElement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: SpreadElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
