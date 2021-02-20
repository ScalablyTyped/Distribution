package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.EmptyStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait EmptyStatement_
  extends Statement
     with BaseNode {
  
  @JSName("type")
  var type_EmptyStatement_ : EmptyStatement = js.native
}
object EmptyStatement_ {
  
  @scala.inline
  def apply(`type`: EmptyStatement): EmptyStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyStatement_]
  }
  
  @scala.inline
  implicit class EmptyStatement_MutableBuilder[Self <: EmptyStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EmptyStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
