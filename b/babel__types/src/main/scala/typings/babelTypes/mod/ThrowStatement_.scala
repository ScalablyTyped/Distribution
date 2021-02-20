package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ThrowStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ThrowStatement_
  extends CompletionStatement
     with BaseNode
     with Statement
     with Terminatorless {
  
  var argument: Expression = js.native
  
  @JSName("type")
  var type_ThrowStatement_ : ThrowStatement = js.native
}
object ThrowStatement_ {
  
  @scala.inline
  def apply(argument: Expression, `type`: ThrowStatement): ThrowStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrowStatement_]
  }
  
  @scala.inline
  implicit class ThrowStatement_MutableBuilder[Self <: ThrowStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ThrowStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
