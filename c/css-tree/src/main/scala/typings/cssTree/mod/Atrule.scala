package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Atrule
  extends CssNodeCommon
     with CssNode {
  
  var block: Block | Null = js.native
  
  var name: String = js.native
  
  var prelude: AtrulePrelude | Raw | Null = js.native
  
  @JSName("type")
  var type_Atrule: typings.cssTree.cssTreeStrings.Atrule = js.native
}
object Atrule {
  
  @scala.inline
  def apply(name: String, `type`: typings.cssTree.cssTreeStrings.Atrule): Atrule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Atrule]
  }
  
  @scala.inline
  implicit class AtruleOps[Self <: Atrule] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Atrule): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlock(value: Block): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockNull: Self = this.set("block", null)
    
    @scala.inline
    def setPrelude(value: AtrulePrelude | Raw): Self = this.set("prelude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreludeNull: Self = this.set("prelude", null)
  }
}
