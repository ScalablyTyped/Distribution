package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCodeReviewResponse extends js.Object {
  
  var CodeReview: js.UndefOr[typings.awsSdk.codegurureviewerMod.CodeReview] = js.native
}
object CreateCodeReviewResponse {
  
  @scala.inline
  def apply(): CreateCodeReviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCodeReviewResponse]
  }
  
  @scala.inline
  implicit class CreateCodeReviewResponseOps[Self <: CreateCodeReviewResponse] (val x: Self) extends AnyVal {
    
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
    def setCodeReview(value: CodeReview): Self = this.set("CodeReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeReview: Self = this.set("CodeReview", js.undefined)
  }
}
