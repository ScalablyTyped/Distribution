package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChapInfo extends StObject {
  
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
  implicit class ChapInfoMutableBuilder[Self <: ChapInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitiatorName(value: IqnName): Self = StObject.set(x, "InitiatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiatorNameUndefined: Self = StObject.set(x, "InitiatorName", js.undefined)
    
    @scala.inline
    def setSecretToAuthenticateInitiator(value: ChapSecret): Self = StObject.set(x, "SecretToAuthenticateInitiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretToAuthenticateInitiatorUndefined: Self = StObject.set(x, "SecretToAuthenticateInitiator", js.undefined)
    
    @scala.inline
    def setSecretToAuthenticateTarget(value: ChapSecret): Self = StObject.set(x, "SecretToAuthenticateTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretToAuthenticateTargetUndefined: Self = StObject.set(x, "SecretToAuthenticateTarget", js.undefined)
    
    @scala.inline
    def setTargetARN(value: TargetARN): Self = StObject.set(x, "TargetARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetARNUndefined: Self = StObject.set(x, "TargetARN", js.undefined)
  }
}
