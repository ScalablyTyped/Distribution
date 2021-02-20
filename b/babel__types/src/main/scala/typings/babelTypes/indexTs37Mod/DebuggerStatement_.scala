package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.DebuggerStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait DebuggerStatement_
  extends Statement
     with BaseNode {
  
  @JSName("type")
  var type_DebuggerStatement_ : DebuggerStatement = js.native
}
object DebuggerStatement_ {
  
  @scala.inline
  def apply(`type`: DebuggerStatement): DebuggerStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebuggerStatement_]
  }
  
  @scala.inline
  implicit class DebuggerStatement_MutableBuilder[Self <: DebuggerStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DebuggerStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
