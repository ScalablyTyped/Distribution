package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomKeyStoreRequest extends StObject {
  
  /**
    * Associates the custom key store with a related CloudHSM cluster.  Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares a backup history and has the same cluster certificate as the original cluster. You cannot use this parameter to associate a custom key store with an unrelated cluster. In addition, the replacement cluster must fulfill the requirements for a cluster associated with a custom key store. To view the cluster certificate of a cluster, use the DescribeClusters operation.
    */
  var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined
  
  /**
    * Identifies the custom key store that you want to update. Enter the ID of the custom key store. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
    */
  var CustomKeyStoreId: CustomKeyStoreIdType
  
  /**
    * Enter the current password of the kmsuser crypto user (CU) in the CloudHSM cluster that is associated with the custom key store. This parameter tells KMS the current password of the kmsuser crypto user (CU). It does not set or change the password of any users in the CloudHSM cluster.
    */
  var KeyStorePassword: js.UndefOr[KeyStorePasswordType] = js.undefined
  
  /**
    * Changes the friendly name of the custom key store to the value that you specify. The custom key store name must be unique in the Amazon Web Services account.
    */
  var NewCustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.undefined
}
object UpdateCustomKeyStoreRequest {
  
  inline def apply(CustomKeyStoreId: CustomKeyStoreIdType): UpdateCustomKeyStoreRequest = {
    val __obj = js.Dynamic.literal(CustomKeyStoreId = CustomKeyStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCustomKeyStoreRequest]
  }
  
  extension [Self <: UpdateCustomKeyStoreRequest](x: Self) {
    
    inline def setCloudHsmClusterId(value: CloudHsmClusterIdType): Self = StObject.set(x, "CloudHsmClusterId", value.asInstanceOf[js.Any])
    
    inline def setCloudHsmClusterIdUndefined: Self = StObject.set(x, "CloudHsmClusterId", js.undefined)
    
    inline def setCustomKeyStoreId(value: CustomKeyStoreIdType): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    inline def setKeyStorePassword(value: KeyStorePasswordType): Self = StObject.set(x, "KeyStorePassword", value.asInstanceOf[js.Any])
    
    inline def setKeyStorePasswordUndefined: Self = StObject.set(x, "KeyStorePassword", js.undefined)
    
    inline def setNewCustomKeyStoreName(value: CustomKeyStoreNameType): Self = StObject.set(x, "NewCustomKeyStoreName", value.asInstanceOf[js.Any])
    
    inline def setNewCustomKeyStoreNameUndefined: Self = StObject.set(x, "NewCustomKeyStoreName", js.undefined)
  }
}
