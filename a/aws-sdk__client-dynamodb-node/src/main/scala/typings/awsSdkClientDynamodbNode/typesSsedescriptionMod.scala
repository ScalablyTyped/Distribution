package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.AES256
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DISABLED
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DISABLING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ENABLED
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ENABLING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.KMS
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.UPDATING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSsedescriptionMod {
  
  trait SSEDescription extends StObject {
    
    /**
      * <p>The KMS master key ARN used for the KMS encryption.</p>
      */
    var KMSMasterKeyArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Server-side encryption type:</p> <ul> <li> <p> <code>AES256</code> - Server-side encryption which uses the AES256 algorithm.</p> </li> <li> <p> <code>KMS</code> - Server-side encryption which uses AWS Key Management Service.</p> </li> </ul>
      */
    var SSEType: js.UndefOr[AES256 | KMS | String] = js.undefined
    
    /**
      * <p>The current state of server-side encryption:</p> <ul> <li> <p> <code>ENABLING</code> - Server-side encryption is being enabled.</p> </li> <li> <p> <code>ENABLED</code> - Server-side encryption is enabled.</p> </li> <li> <p> <code>DISABLING</code> - Server-side encryption is being disabled.</p> </li> <li> <p> <code>DISABLED</code> - Server-side encryption is disabled.</p> </li> <li> <p> <code>UPDATING</code> - Server-side encryption is being updated.</p> </li> </ul>
      */
    var Status: js.UndefOr[ENABLING | ENABLED | DISABLING | DISABLED | UPDATING | String] = js.undefined
  }
  object SSEDescription {
    
    inline def apply(): SSEDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SSEDescription]
    }
    
    extension [Self <: SSEDescription](x: Self) {
      
      inline def setKMSMasterKeyArn(value: String): Self = StObject.set(x, "KMSMasterKeyArn", value.asInstanceOf[js.Any])
      
      inline def setKMSMasterKeyArnUndefined: Self = StObject.set(x, "KMSMasterKeyArn", js.undefined)
      
      inline def setSSEType(value: AES256 | KMS | String): Self = StObject.set(x, "SSEType", value.asInstanceOf[js.Any])
      
      inline def setSSETypeUndefined: Self = StObject.set(x, "SSEType", js.undefined)
      
      inline def setStatus(value: ENABLING | ENABLED | DISABLING | DISABLED | UPDATING | String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    }
  }
  
  type UnmarshalledSSEDescription = SSEDescription
}
