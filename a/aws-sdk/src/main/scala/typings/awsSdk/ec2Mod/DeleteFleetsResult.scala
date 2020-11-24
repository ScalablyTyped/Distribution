package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFleetsResult extends js.Object {
  
  /**
    * Information about the EC2 Fleets that are successfully deleted.
    */
  var SuccessfulFleetDeletions: js.UndefOr[DeleteFleetSuccessSet] = js.native
  
  /**
    * Information about the EC2 Fleets that are not successfully deleted.
    */
  var UnsuccessfulFleetDeletions: js.UndefOr[DeleteFleetErrorSet] = js.native
}
object DeleteFleetsResult {
  
  @scala.inline
  def apply(): DeleteFleetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFleetsResult]
  }
  
  @scala.inline
  implicit class DeleteFleetsResultOps[Self <: DeleteFleetsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSuccessfulFleetDeletionsVarargs(value: DeleteFleetSuccessItem*): Self = this.set("SuccessfulFleetDeletions", js.Array(value :_*))
    
    @scala.inline
    def setSuccessfulFleetDeletions(value: DeleteFleetSuccessSet): Self = this.set("SuccessfulFleetDeletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessfulFleetDeletions: Self = this.set("SuccessfulFleetDeletions", js.undefined)
    
    @scala.inline
    def setUnsuccessfulFleetDeletionsVarargs(value: DeleteFleetErrorItem*): Self = this.set("UnsuccessfulFleetDeletions", js.Array(value :_*))
    
    @scala.inline
    def setUnsuccessfulFleetDeletions(value: DeleteFleetErrorSet): Self = this.set("UnsuccessfulFleetDeletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsuccessfulFleetDeletions: Self = this.set("UnsuccessfulFleetDeletions", js.undefined)
  }
}
