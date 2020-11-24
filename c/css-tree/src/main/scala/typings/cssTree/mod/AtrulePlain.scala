package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AtrulePlain
  extends CssNodeCommon
     with CssNodePlain {
  
  var block: BlockPlain | Null = js.native
  
  var name: String = js.native
  
  var prelude: AtrulePreludePlain | Raw | Null = js.native
  
  @JSName("type")
  var type_AtrulePlain: typings.cssTree.cssTreeStrings.Atrule = js.native
}
object AtrulePlain {
  
  @scala.inline
  def apply(name: String, `type`: typings.cssTree.cssTreeStrings.Atrule): AtrulePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtrulePlain]
  }
  
  @scala.inline
  implicit class AtrulePlainOps[Self <: AtrulePlain] (val x: Self) extends AnyVal {
    
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
    def setBlock(value: BlockPlain): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockNull: Self = this.set("block", null)
    
    @scala.inline
    def setPrelude(value: AtrulePreludePlain | Raw): Self = this.set("prelude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreludeNull: Self = this.set("prelude", null)
  }
}
