package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomKeyStoresListEntry extends js.Object {
  /**
    * A unique identifier for the AWS CloudHSM cluster that is associated with the custom key store.
    */
  var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.native
  /**
    * Describes the connection error. This field appears in the response only when the ConnectionState is FAILED. For help resolving these errors, see How to Fix a Connection Failure in AWS Key Management Service Developer Guide. Valid values are:    CLUSTER_NOT_FOUND - AWS KMS cannot find the AWS CloudHSM cluster with the specified cluster ID.    INSUFFICIENT_CLOUDHSM_HSMS - The associated AWS CloudHSM cluster does not contain any active HSMs. To connect a custom key store to its AWS CloudHSM cluster, the cluster must contain at least one active HSM.    INTERNAL_ERROR - AWS KMS could not complete the request due to an internal error. Retry the request. For ConnectCustomKeyStore requests, disconnect the custom key store before trying to connect again.    INVALID_CREDENTIALS - AWS KMS does not have the correct password for the kmsuser crypto user in the AWS CloudHSM cluster. Before you can connect your custom key store to its AWS CloudHSM cluster, you must change the kmsuser account password and update the key store password value for the custom key store.    NETWORK_ERRORS - Network errors are preventing AWS KMS from connecting to the custom key store.    SUBNET_NOT_FOUND - A subnet in the AWS CloudHSM cluster configuration was deleted. If AWS KMS cannot find all of the subnets that were configured for the cluster when the custom key store was created, attempts to connect fail. To fix this error, create a cluster from a backup and associate it with your custom key store. This process includes selecting a VPC and subnets. For details, see How to Fix a Connection Failure in the AWS Key Management Service Developer Guide.    USER_LOCKED_OUT - The kmsuser CU account is locked out of the associated AWS CloudHSM cluster due to too many failed password attempts. Before you can connect your custom key store to its AWS CloudHSM cluster, you must change the kmsuser account password and update the key store password value for the custom key store.    USER_LOGGED_IN - The kmsuser CU account is logged into the the associated AWS CloudHSM cluster. This prevents AWS KMS from rotating the kmsuser account password and logging into the cluster. Before you can connect your custom key store to its AWS CloudHSM cluster, you must log the kmsuser CU out of the cluster. If you changed the kmsuser password to log into the cluster, you must also and update the key store password value for the custom key store. For help, see How to Log Out and Reconnect in the AWS Key Management Service Developer Guide.    USER_NOT_FOUND - AWS KMS cannot find a kmsuser CU account in the associated AWS CloudHSM cluster. Before you can connect your custom key store to its AWS CloudHSM cluster, you must create a kmsuser CU account in the cluster, and then update the key store password value for the custom key store.  
    */
  var ConnectionErrorCode: js.UndefOr[ConnectionErrorCodeType] = js.native
  /**
    * Indicates whether the custom key store is connected to its AWS CloudHSM cluster. You can create and use CMKs in your custom key stores only when its connection state is CONNECTED. The value is DISCONNECTED if the key store has never been connected or you use the DisconnectCustomKeyStore operation to disconnect it. If the value is CONNECTED but you are having trouble using the custom key store, make sure that its associated AWS CloudHSM cluster is active and contains at least one active HSM. A value of FAILED indicates that an attempt to connect was unsuccessful. The ConnectionErrorCode field in the response indicates the cause of the failure. For help resolving a connection failure, see Troubleshooting a Custom Key Store in the AWS Key Management Service Developer Guide.
    */
  var ConnectionState: js.UndefOr[ConnectionStateType] = js.native
  /**
    * The date and time when the custom key store was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  /**
    * A unique identifier for the custom key store.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.native
  /**
    * The user-specified friendly name for the custom key store.
    */
  var CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.native
  /**
    * The trust anchor certificate of the associated AWS CloudHSM cluster. When you initialize the cluster, you create this certificate and save it in the customerCA.crt file.
    */
  var TrustAnchorCertificate: js.UndefOr[TrustAnchorCertificateType] = js.native
}

object CustomKeyStoresListEntry {
  @scala.inline
  def apply(
    CloudHsmClusterId: CloudHsmClusterIdType = null,
    ConnectionErrorCode: ConnectionErrorCodeType = null,
    ConnectionState: ConnectionStateType = null,
    CreationDate: DateType = null,
    CustomKeyStoreId: CustomKeyStoreIdType = null,
    CustomKeyStoreName: CustomKeyStoreNameType = null,
    TrustAnchorCertificate: TrustAnchorCertificateType = null
  ): CustomKeyStoresListEntry = {
    val __obj = js.Dynamic.literal()
    if (CloudHsmClusterId != null) __obj.updateDynamic("CloudHsmClusterId")(CloudHsmClusterId.asInstanceOf[js.Any])
    if (ConnectionErrorCode != null) __obj.updateDynamic("ConnectionErrorCode")(ConnectionErrorCode.asInstanceOf[js.Any])
    if (ConnectionState != null) __obj.updateDynamic("ConnectionState")(ConnectionState.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (CustomKeyStoreId != null) __obj.updateDynamic("CustomKeyStoreId")(CustomKeyStoreId.asInstanceOf[js.Any])
    if (CustomKeyStoreName != null) __obj.updateDynamic("CustomKeyStoreName")(CustomKeyStoreName.asInstanceOf[js.Any])
    if (TrustAnchorCertificate != null) __obj.updateDynamic("TrustAnchorCertificate")(TrustAnchorCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomKeyStoresListEntry]
  }
}

