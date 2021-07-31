package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChapCredentialsInput extends StObject {
  
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: IqnName
  
  /**
    * The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP with the target.  The secret key must be between 12 and 16 bytes when encoded in UTF-8. 
    */
  var SecretToAuthenticateInitiator: ChapSecret
  
  /**
    * The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows client). Byte constraints: Minimum bytes of 12. Maximum bytes of 16.  The secret key must be between 12 and 16 bytes when encoded in UTF-8. 
    */
  var SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return the TargetARN for specified VolumeARN.
    */
  var TargetARN: typings.awsSdk.storagegatewayMod.TargetARN
}
object UpdateChapCredentialsInput {
  
  @scala.inline
  def apply(InitiatorName: IqnName, SecretToAuthenticateInitiator: ChapSecret, TargetARN: TargetARN): UpdateChapCredentialsInput = {
    val __obj = js.Dynamic.literal(InitiatorName = InitiatorName.asInstanceOf[js.Any], SecretToAuthenticateInitiator = SecretToAuthenticateInitiator.asInstanceOf[js.Any], TargetARN = TargetARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChapCredentialsInput]
  }
  
  @scala.inline
  implicit class UpdateChapCredentialsInputMutableBuilder[Self <: UpdateChapCredentialsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitiatorName(value: IqnName): Self = StObject.set(x, "InitiatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretToAuthenticateInitiator(value: ChapSecret): Self = StObject.set(x, "SecretToAuthenticateInitiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretToAuthenticateTarget(value: ChapSecret): Self = StObject.set(x, "SecretToAuthenticateTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretToAuthenticateTargetUndefined: Self = StObject.set(x, "SecretToAuthenticateTarget", js.undefined)
    
    @scala.inline
    def setTargetARN(value: TargetARN): Self = StObject.set(x, "TargetARN", value.asInstanceOf[js.Any])
  }
}
