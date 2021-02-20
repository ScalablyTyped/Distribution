package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeBatch extends StObject {
  
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
  implicit class ChangeBatchMutableBuilder[Self <: ChangeBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanges(value: Changes): Self = StObject.set(x, "Changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: Change*): Self = StObject.set(x, "Changes", js.Array(value :_*))
    
    @scala.inline
    def setComment(value: ResourceDescription): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
  }
}
