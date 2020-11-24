package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXClosingFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
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
  implicit class JSXClosingFragment_Ops[Self <: JSXClosingFragment_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: JSXClosingFragment): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
