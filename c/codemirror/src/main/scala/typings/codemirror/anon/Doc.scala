package typings.codemirror.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Doc extends js.Object {
  
  var changed: To | Null = js.native
  
  var doc: typings.codemirror.mod.Doc = js.native
  
  var name: String = js.native
}
object Doc {
  
  @scala.inline
  def apply(doc: typings.codemirror.mod.Doc, name: String): Doc = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doc]
  }
  
  @scala.inline
  implicit class DocOps[Self <: Doc] (val x: Self) extends AnyVal {
    
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
    def setDoc(value: typings.codemirror.mod.Doc): Self = this.set("doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChanged(value: To): Self = this.set("changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedNull: Self = this.set("changed", null)
  }
}
