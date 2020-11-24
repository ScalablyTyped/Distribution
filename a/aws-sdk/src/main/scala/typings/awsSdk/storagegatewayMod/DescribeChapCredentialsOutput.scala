package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChapCredentialsOutput extends js.Object {
  
  /**
    * An array of ChapInfo objects that represent CHAP credentials. Each object in the array contains CHAP credential information for one target-initiator pair. If no CHAP credentials are set, an empty array is returned. CHAP credential information is provided in a JSON object with the following fields:    InitiatorName: The iSCSI initiator that connects to the target.    SecretToAuthenticateInitiator: The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP with the target.    SecretToAuthenticateTarget: The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows client).    TargetARN: The Amazon Resource Name (ARN) of the storage volume.  
    */
  var ChapCredentials: js.UndefOr[typings.awsSdk.storagegatewayMod.ChapCredentials] = js.native
}
object DescribeChapCredentialsOutput {
  
  @scala.inline
  def apply(): DescribeChapCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChapCredentialsOutput]
  }
  
  @scala.inline
  implicit class DescribeChapCredentialsOutputOps[Self <: DescribeChapCredentialsOutput] (val x: Self) extends AnyVal {
    
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
    def setChapCredentialsVarargs(value: ChapInfo*): Self = this.set("ChapCredentials", js.Array(value :_*))
    
    @scala.inline
    def setChapCredentials(value: ChapCredentials): Self = this.set("ChapCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChapCredentials: Self = this.set("ChapCredentials", js.undefined)
  }
}
