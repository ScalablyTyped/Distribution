package typings.backlogJs.mod.Option.PullRequest

import typings.backlogJs.mod.Option.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPullRequestCommentsParams extends js.Object {
  
  var count: js.UndefOr[Double] = js.native
  
  var maxId: js.UndefOr[Double] = js.native
  
  var minId: js.UndefOr[Double] = js.native
  
  var order: js.UndefOr[Order] = js.native
}
object GetPullRequestCommentsParams {
  
  @scala.inline
  def apply(): GetPullRequestCommentsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPullRequestCommentsParams]
  }
  
  @scala.inline
  implicit class GetPullRequestCommentsParamsOps[Self <: GetPullRequestCommentsParams] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setMaxId(value: Double): Self = this.set("maxId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxId: Self = this.set("maxId", js.undefined)
    
    @scala.inline
    def setMinId(value: Double): Self = this.set("minId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinId: Self = this.set("minId", js.undefined)
    
    @scala.inline
    def setOrder(value: Order): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
}
