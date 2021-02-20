package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.JSXOpeningFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait JSXOpeningFragment_
  extends Immutable
     with BaseNode
     with JSX {
  
  @JSName("type")
  var type_JSXOpeningFragment_ : JSXOpeningFragment = js.native
}
object JSXOpeningFragment_ {
  
  @scala.inline
  def apply(`type`: JSXOpeningFragment): JSXOpeningFragment_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXOpeningFragment_]
  }
  
  @scala.inline
  implicit class JSXOpeningFragment_MutableBuilder[Self <: JSXOpeningFragment_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXOpeningFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
