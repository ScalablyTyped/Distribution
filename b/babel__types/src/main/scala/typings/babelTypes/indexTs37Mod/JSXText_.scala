package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.JSXText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait JSXText_
  extends Immutable
     with BaseNode
     with JSX {
  
  @JSName("type")
  var type_JSXText_ : JSXText = js.native
  
  var value: String = js.native
}
object JSXText_ {
  
  @scala.inline
  def apply(`type`: JSXText, value: String): JSXText_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXText_]
  }
  
  @scala.inline
  implicit class JSXText_MutableBuilder[Self <: JSXText_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXText): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
