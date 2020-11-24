package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteChapCredentialsOutput extends js.Object {
  
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: js.UndefOr[IqnName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the target.
    */
  var TargetARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TargetARN] = js.native
}
object DeleteChapCredentialsOutput {
  
  @scala.inline
  def apply(): DeleteChapCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteChapCredentialsOutput]
  }
  
  @scala.inline
  implicit class DeleteChapCredentialsOutputOps[Self <: DeleteChapCredentialsOutput] (val x: Self) extends AnyVal {
    
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
    def setInitiatorName(value: IqnName): Self = this.set("InitiatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitiatorName: Self = this.set("InitiatorName", js.undefined)
    
    @scala.inline
    def setTargetARN(value: TargetARN): Self = this.set("TargetARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetARN: Self = this.set("TargetARN", js.undefined)
  }
}
