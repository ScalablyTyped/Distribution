package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.SpreadElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait SpreadElement_
  extends UnaryLike
     with BaseNode {
  
  var argument: Expression = js.native
  
  @JSName("type")
  var type_SpreadElement_ : SpreadElement = js.native
}
object SpreadElement_ {
  
  @scala.inline
  def apply(argument: Expression, `type`: SpreadElement): SpreadElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
