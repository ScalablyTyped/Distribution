package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetContentStatus extends js.Object {
  
  /**
    * The reason the data set contents are in this state.
    */
  var reason: js.UndefOr[Reason] = js.native
  
  /**
    * The state of the data set contents. Can be one of READY, CREATING, SUCCEEDED, or FAILED.
    */
  var state: js.UndefOr[DatasetContentState] = js.native
}
object DatasetContentStatus {
  
  @scala.inline
  def apply(): DatasetContentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetContentStatus]
  }
  
  @scala.inline
  implicit class DatasetContentStatusOps[Self <: DatasetContentStatus] (val x: Self) extends AnyVal {
    
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
    def setReason(value: Reason): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setState(value: DatasetContentState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
