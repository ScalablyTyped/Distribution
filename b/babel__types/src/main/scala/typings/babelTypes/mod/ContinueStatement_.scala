package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ContinueStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ContinueStatement_
  extends CompletionStatement
     with BaseNode
     with Statement
     with Terminatorless {
  
  var label: Identifier_ | Null = js.native
  
  @JSName("type")
  var type_ContinueStatement_ : ContinueStatement = js.native
}
object ContinueStatement_ {
  
  @scala.inline
  def apply(`type`: ContinueStatement): ContinueStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueStatement_]
  }
  
  @scala.inline
  implicit class ContinueStatement_MutableBuilder[Self <: ContinueStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: Identifier_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNull: Self = StObject.set(x, "label", null)
    
    @scala.inline
    def setType(value: ContinueStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
