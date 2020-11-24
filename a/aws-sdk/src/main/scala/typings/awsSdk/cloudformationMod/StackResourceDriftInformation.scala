package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackResourceDriftInformation extends js.Object {
  
  /**
    * When AWS CloudFormation last checked if the resource had drifted from its expected configuration.
    */
  var LastCheckTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * Status of the resource's actual configuration compared to its expected configuration    DELETED: The resource differs from its expected configuration in that it has been deleted.    MODIFIED: The resource differs from its expected configuration.    NOT_CHECKED: AWS CloudFormation has not checked if the resource differs from its expected configuration. Any resources that do not currently support drift detection have a status of NOT_CHECKED. For more information, see Resources that Support Drift Detection.     IN_SYNC: The resources's actual configuration matches its expected configuration.  
    */
  var StackResourceDriftStatus: typings.awsSdk.cloudformationMod.StackResourceDriftStatus = js.native
}
object StackResourceDriftInformation {
  
  @scala.inline
  def apply(StackResourceDriftStatus: StackResourceDriftStatus): StackResourceDriftInformation = {
    val __obj = js.Dynamic.literal(StackResourceDriftStatus = StackResourceDriftStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResourceDriftInformation]
  }
  
  @scala.inline
  implicit class StackResourceDriftInformationOps[Self <: StackResourceDriftInformation] (val x: Self) extends AnyVal {
    
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
    def setStackResourceDriftStatus(value: StackResourceDriftStatus): Self = this.set("StackResourceDriftStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastCheckTimestamp(value: Timestamp): Self = this.set("LastCheckTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastCheckTimestamp: Self = this.set("LastCheckTimestamp", js.undefined)
  }
}
