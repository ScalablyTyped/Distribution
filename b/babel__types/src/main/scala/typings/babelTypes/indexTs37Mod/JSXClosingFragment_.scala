package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.JSXClosingFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait JSXClosingFragment_
  extends Immutable
     with BaseNode
     with JSX {
  
  @JSName("type")
  var type_JSXClosingFragment_ : JSXClosingFragment = js.native
}
object JSXClosingFragment_ {
  
  @scala.inline
  def apply(`type`: JSXClosingFragment): JSXClosingFragment_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXClosingFragment_]
  }
  
  @scala.inline
  implicit class JSXClosingFragment_MutableBuilder[Self <: JSXClosingFragment_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXClosingFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
