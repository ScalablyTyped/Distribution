package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChapInfo extends js.Object {
  
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: js.UndefOr[IqnName] = js.native
  
  /**
    * The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP with the target.
    */
  var SecretToAuthenticateInitiator: js.UndefOr[ChapSecret] = js.native
  
  /**
    * The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g., Windows client).
    */
  var SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the volume. Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var TargetARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TargetARN] = js.native
}
object ChapInfo {
  
  @scala.inline
  def apply(): ChapInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChapInfo]
  }
  
  @scala.inline
  implicit class ChapInfoOps[Self <: ChapInfo] (val x: Self) extends AnyVal {
    
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
    def setSecretToAuthenticateInitiator(value: ChapSecret): Self = this.set("SecretToAuthenticateInitiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretToAuthenticateInitiator: Self = this.set("SecretToAuthenticateInitiator", js.undefined)
    
    @scala.inline
    def setSecretToAuthenticateTarget(value: ChapSecret): Self = this.set("SecretToAuthenticateTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretToAuthenticateTarget: Self = this.set("SecretToAuthenticateTarget", js.undefined)
    
    @scala.inline
    def setTargetARN(value: TargetARN): Self = this.set("TargetARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetARN: Self = this.set("TargetARN", js.undefined)
  }
}
