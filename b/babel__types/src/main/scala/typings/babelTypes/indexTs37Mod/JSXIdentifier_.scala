package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.JSXIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait JSXIdentifier_
  extends JSX
     with BaseNode {
  
  var name: String = js.native
  
  @JSName("type")
  var type_JSXIdentifier_ : JSXIdentifier = js.native
}
object JSXIdentifier_ {
  
  @scala.inline
  def apply(name: String, `type`: JSXIdentifier): JSXIdentifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXIdentifier_]
  }
  
  @scala.inline
  implicit class JSXIdentifier_MutableBuilder[Self <: JSXIdentifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
