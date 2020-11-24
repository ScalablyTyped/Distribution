package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorChange extends js.Object {
  
  /** Position (in the pre-change coordinate system) where the change started. */
  var from: Position = js.native
  
  /**  String representing the origin of the change event and wether it can be merged with history */
  var origin: js.UndefOr[String] = js.native
  
  /**  Text that used to be between from and to, which is overwritten by this change. */
  var removed: js.UndefOr[js.Array[String]] = js.native
  
  /** Array of strings representing the text that replaced the changed range (split by line). */
  var text: js.Array[String] = js.native
  
  /** Position (in the pre-change coordinate system) where the change ended. */
  var to: Position = js.native
}
object EditorChange {
  
  @scala.inline
  def apply(from: Position, text: js.Array[String], to: Position): EditorChange = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorChange]
  }
  
  @scala.inline
  implicit class EditorChangeOps[Self <: EditorChange] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: Position): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextVarargs(value: String*): Self = this.set("text", js.Array(value :_*))
    
    @scala.inline
    def setText(value: js.Array[String]): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Position): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setRemovedVarargs(value: String*): Self = this.set("removed", js.Array(value :_*))
    
    @scala.inline
    def setRemoved(value: js.Array[String]): Self = this.set("removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoved: Self = this.set("removed", js.undefined)
  }
}
