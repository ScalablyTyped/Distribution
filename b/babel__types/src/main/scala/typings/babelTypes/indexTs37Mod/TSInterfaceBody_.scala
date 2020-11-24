package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSInterfaceBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSInterfaceBody_
  extends BaseNode
     with _Node {
  
  var body: js.Array[TSTypeElement] = js.native
  
  @JSName("type")
  var type_TSInterfaceBody_ : TSInterfaceBody = js.native
}
object TSInterfaceBody_ {
  
  @scala.inline
  def apply(body: js.Array[TSTypeElement], `type`: TSInterfaceBody): TSInterfaceBody_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSInterfaceBody_]
  }
  
  @scala.inline
  implicit class TSInterfaceBody_Ops[Self <: TSInterfaceBody_] (val x: Self) extends AnyVal {
    
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
    def setBodyVarargs(value: TSTypeElement*): Self = this.set("body", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: js.Array[TSTypeElement]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSInterfaceBody): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
