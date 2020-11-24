package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteWorldsRequest extends js.Object {
  
  /**
    * A list of Amazon Resource Names (arns) that correspond to worlds to delete.
    */
  var worlds: Arns = js.native
}
object BatchDeleteWorldsRequest {
  
  @scala.inline
  def apply(worlds: Arns): BatchDeleteWorldsRequest = {
    val __obj = js.Dynamic.literal(worlds = worlds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteWorldsRequest]
  }
  
  @scala.inline
  implicit class BatchDeleteWorldsRequestOps[Self <: BatchDeleteWorldsRequest] (val x: Self) extends AnyVal {
    
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
    def setWorldsVarargs(value: Arn*): Self = this.set("worlds", js.Array(value :_*))
    
    @scala.inline
    def setWorlds(value: Arns): Self = this.set("worlds", value.asInstanceOf[js.Any])
  }
}
