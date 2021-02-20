package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ReturnStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ReturnStatement_
  extends CompletionStatement
     with BaseNode
     with Statement
     with Terminatorless {
  
  var argument: Expression | Null = js.native
  
  @JSName("type")
  var type_ReturnStatement_ : ReturnStatement = js.native
}
object ReturnStatement_ {
  
  @scala.inline
  def apply(`type`: ReturnStatement): ReturnStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
