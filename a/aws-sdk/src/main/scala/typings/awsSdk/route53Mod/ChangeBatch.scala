package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeBatch extends js.Object {
  
  /**
    * Information about the changes to make to the record sets.
    */
  var Changes: typings.awsSdk.route53Mod.Changes = js.native
  
  /**
    *  Optional: Any comments you want to include about a change batch request.
    */
  var Comment: js.UndefOr[ResourceDescription] = js.native
}
object ChangeBatch {
  
  @scala.inline
  def apply(Changes: Changes): ChangeBatch = {
    val __obj = js.Dynamic.literal(Changes = Changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeBatch]
  }
  
  @scala.inline
  implicit class ChangeBatchOps[Self <: ChangeBatch] (val x: Self) extends AnyVal {
    
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
    def setChangesVarargs(value: Change*): Self = this.set("Changes", js.Array(value :_*))
    
    @scala.inline
    def setChanges(value: Changes): Self = this.set("Changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: ResourceDescription): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
  }
}
