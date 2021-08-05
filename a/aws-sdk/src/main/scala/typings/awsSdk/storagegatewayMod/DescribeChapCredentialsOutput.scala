package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChapCredentialsOutput extends StObject {
  
  /**
    * An array of ChapInfo objects that represent CHAP credentials. Each object in the array contains CHAP credential information for one target-initiator pair. If no CHAP credentials are set, an empty array is returned. CHAP credential information is provided in a JSON object with the following fields:    InitiatorName: The iSCSI initiator that connects to the target.    SecretToAuthenticateInitiator: The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP with the target.    SecretToAuthenticateTarget: The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows client).    TargetARN: The Amazon Resource Name (ARN) of the storage volume.  
    */
  var ChapCredentials: js.UndefOr[typings.awsSdk.storagegatewayMod.ChapCredentials] = js.undefined
}
object DescribeChapCredentialsOutput {
  
  inline def apply(): DescribeChapCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChapCredentialsOutput]
  }
  
  extension [Self <: DescribeChapCredentialsOutput](x: Self) {
    
    inline def setChapCredentials(value: ChapCredentials): Self = StObject.set(x, "ChapCredentials", value.asInstanceOf[js.Any])
    
    inline def setChapCredentialsUndefined: Self = StObject.set(x, "ChapCredentials", js.undefined)
    
    inline def setChapCredentialsVarargs(value: ChapInfo*): Self = StObject.set(x, "ChapCredentials", js.Array(value :_*))
  }
}
