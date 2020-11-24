package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartChangeSetResponse extends js.Object {
  
  /**
    * The ARN associated to the unique identifier generated for the request.
    */
  var ChangeSetArn: js.UndefOr[ARN] = js.native
  
  /**
    * Unique identifier generated for the request.
    */
  var ChangeSetId: js.UndefOr[ResourceId] = js.native
}
object StartChangeSetResponse {
  
  @scala.inline
  def apply(): StartChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartChangeSetResponse]
  }
  
  @scala.inline
  implicit class StartChangeSetResponseOps[Self <: StartChangeSetResponse] (val x: Self) extends AnyVal {
    
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
    def setChangeSetArn(value: ARN): Self = this.set("ChangeSetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeSetArn: Self = this.set("ChangeSetArn", js.undefined)
    
    @scala.inline
    def setChangeSetId(value: ResourceId): Self = this.set("ChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeSetId: Self = this.set("ChangeSetId", js.undefined)
  }
}
