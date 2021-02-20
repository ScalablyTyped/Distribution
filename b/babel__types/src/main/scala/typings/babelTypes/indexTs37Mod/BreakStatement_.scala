package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.BreakStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait BreakStatement_
  extends CompletionStatement
     with BaseNode
     with Statement
     with Terminatorless {
  
  var label: Identifier_ | Null = js.native
  
  @JSName("type")
  var type_BreakStatement_ : BreakStatement = js.native
}
object BreakStatement_ {
  
  @scala.inline
  def apply(`type`: BreakStatement): BreakStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakStatement_]
  }
  
  @scala.inline
  implicit class BreakStatement_MutableBuilder[Self <: BreakStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: Identifier_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNull: Self = StObject.set(x, "label", null)
    
    @scala.inline
    def setType(value: BreakStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
