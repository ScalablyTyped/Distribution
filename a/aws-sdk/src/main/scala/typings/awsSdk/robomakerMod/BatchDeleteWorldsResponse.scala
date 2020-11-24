package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteWorldsResponse extends js.Object {
  
  /**
    * A list of unprocessed worlds associated with the call. These worlds were not deleted.
    */
  var unprocessedWorlds: js.UndefOr[Arns] = js.native
}
object BatchDeleteWorldsResponse {
  
  @scala.inline
  def apply(): BatchDeleteWorldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteWorldsResponse]
  }
  
  @scala.inline
  implicit class BatchDeleteWorldsResponseOps[Self <: BatchDeleteWorldsResponse] (val x: Self) extends AnyVal {
    
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
    def setUnprocessedWorldsVarargs(value: Arn*): Self = this.set("unprocessedWorlds", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedWorlds(value: Arns): Self = this.set("unprocessedWorlds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnprocessedWorlds: Self = this.set("unprocessedWorlds", js.undefined)
  }
}
