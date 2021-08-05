package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChapInfo extends StObject {
  
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: js.UndefOr[IqnName] = js.undefined
  
  /**
    * The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP with the target.
    */
  var SecretToAuthenticateInitiator: js.UndefOr[ChapSecret] = js.undefined
  
  /**
    * The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g., Windows client).
    */
  var SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the volume. Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var TargetARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TargetARN] = js.undefined
}
object ChapInfo {
  
  inline def apply(): ChapInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChapInfo]
  }
  
  extension [Self <: ChapInfo](x: Self) {
    
    inline def setInitiatorName(value: IqnName): Self = StObject.set(x, "InitiatorName", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNameUndefined: Self = StObject.set(x, "InitiatorName", js.undefined)
    
    inline def setSecretToAuthenticateInitiator(value: ChapSecret): Self = StObject.set(x, "SecretToAuthenticateInitiator", value.asInstanceOf[js.Any])
    
    inline def setSecretToAuthenticateInitiatorUndefined: Self = StObject.set(x, "SecretToAuthenticateInitiator", js.undefined)
    
    inline def setSecretToAuthenticateTarget(value: ChapSecret): Self = StObject.set(x, "SecretToAuthenticateTarget", value.asInstanceOf[js.Any])
    
    inline def setSecretToAuthenticateTargetUndefined: Self = StObject.set(x, "SecretToAuthenticateTarget", js.undefined)
    
    inline def setTargetARN(value: TargetARN): Self = StObject.set(x, "TargetARN", value.asInstanceOf[js.Any])
    
    inline def setTargetARNUndefined: Self = StObject.set(x, "TargetARN", js.undefined)
  }
}
