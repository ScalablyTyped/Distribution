package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kmsMod {
  type AWSAccountIdType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RSAES_PKCS1_V1_5
    - typings.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_1
    - typings.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_256
    - java.lang.String
  */
  type AlgorithmSpec = typings.awsSdk.kmsMod._AlgorithmSpec | java.lang.String
  type AliasList = js.Array[typings.awsSdk.kmsMod.AliasListEntry]
  type AliasNameType = java.lang.String
  type ArnType = java.lang.String
  type BooleanType = scala.Boolean
  type CiphertextType = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.kmsMod.Blob | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.kmsMod.ClientApiVersions
  type CloudHsmClusterIdType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INVALID_CREDENTIALS
    - typings.awsSdk.awsSdkStrings.CLUSTER_NOT_FOUND
    - typings.awsSdk.awsSdkStrings.NETWORK_ERRORS
    - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typings.awsSdk.awsSdkStrings.INSUFFICIENT_CLOUDHSM_HSMS
    - typings.awsSdk.awsSdkStrings.USER_LOCKED_OUT
    - typings.awsSdk.awsSdkStrings.USER_NOT_FOUND
    - typings.awsSdk.awsSdkStrings.USER_LOGGED_IN
    - typings.awsSdk.awsSdkStrings.SUBNET_NOT_FOUND
    - java.lang.String
  */
  type ConnectionErrorCodeType = typings.awsSdk.kmsMod._ConnectionErrorCodeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CONNECTED
    - typings.awsSdk.awsSdkStrings.CONNECTING
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.DISCONNECTED
    - typings.awsSdk.awsSdkStrings.DISCONNECTING
    - java.lang.String
  */
  type ConnectionStateType = typings.awsSdk.kmsMod._ConnectionStateType | java.lang.String
  type CustomKeyStoreIdType = java.lang.String
  type CustomKeyStoreNameType = java.lang.String
  type CustomKeyStoresList = js.Array[typings.awsSdk.kmsMod.CustomKeyStoresListEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RSA_2048
    - typings.awsSdk.awsSdkStrings.RSA_3072
    - typings.awsSdk.awsSdkStrings.RSA_4096
    - typings.awsSdk.awsSdkStrings.ECC_NIST_P256
    - typings.awsSdk.awsSdkStrings.ECC_NIST_P384
    - typings.awsSdk.awsSdkStrings.ECC_NIST_P521
    - typings.awsSdk.awsSdkStrings.ECC_SECG_P256K1
    - typings.awsSdk.awsSdkStrings.SYMMETRIC_DEFAULT
    - java.lang.String
  */
  type CustomerMasterKeySpec = typings.awsSdk.kmsMod._CustomerMasterKeySpec | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RSA_2048
    - typings.awsSdk.awsSdkStrings.RSA_3072
    - typings.awsSdk.awsSdkStrings.RSA_4096
    - typings.awsSdk.awsSdkStrings.ECC_NIST_P256
    - typings.awsSdk.awsSdkStrings.ECC_NIST_P384
    - typings.awsSdk.awsSdkStrings.ECC_NIST_P521
    - typings.awsSdk.awsSdkStrings.ECC_SECG_P256K1
    - java.lang.String
  */
  type DataKeyPairSpec = typings.awsSdk.kmsMod._DataKeyPairSpec | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AES_256
    - typings.awsSdk.awsSdkStrings.AES_128
    - java.lang.String
  */
  type DataKeySpec = typings.awsSdk.kmsMod._DataKeySpec | java.lang.String
  type DateType = typings.std.Date
  type DescriptionType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SYMMETRIC_DEFAULT
    - typings.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_1
    - typings.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_256
    - java.lang.String
  */
  type EncryptionAlgorithmSpec = typings.awsSdk.kmsMod._EncryptionAlgorithmSpec | java.lang.String
  type EncryptionAlgorithmSpecList = js.Array[typings.awsSdk.kmsMod.EncryptionAlgorithmSpec]
  type EncryptionContextKey = java.lang.String
  type EncryptionContextType = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.kmsMod.EncryptionContextValue]
  type EncryptionContextValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.KEY_MATERIAL_EXPIRES
    - typings.awsSdk.awsSdkStrings.KEY_MATERIAL_DOES_NOT_EXPIRE
    - java.lang.String
  */
  type ExpirationModelType = typings.awsSdk.kmsMod._ExpirationModelType | java.lang.String
  type GrantIdType = java.lang.String
  type GrantList = js.Array[typings.awsSdk.kmsMod.GrantListEntry]
  type GrantNameType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Decrypt
    - typings.awsSdk.awsSdkStrings.Encrypt
    - typings.awsSdk.awsSdkStrings.GenerateDataKey
    - typings.awsSdk.awsSdkStrings.GenerateDataKeyWithoutPlaintext
    - typings.awsSdk.awsSdkStrings.ReEncryptFrom
    - typings.awsSdk.awsSdkStrings.ReEncryptTo
    - typings.awsSdk.awsSdkStrings.Sign_
    - typings.awsSdk.awsSdkStrings.Verify
    - typings.awsSdk.awsSdkStrings.GetPublicKey
    - typings.awsSdk.awsSdkStrings.CreateGrant
    - typings.awsSdk.awsSdkStrings.RetireGrant
    - typings.awsSdk.awsSdkStrings.DescribeKey
    - typings.awsSdk.awsSdkStrings.GenerateDataKeyPair
    - typings.awsSdk.awsSdkStrings.GenerateDataKeyPairWithoutPlaintext
    - java.lang.String
  */
  type GrantOperation = typings.awsSdk.kmsMod._GrantOperation | java.lang.String
  type GrantOperationList = js.Array[typings.awsSdk.kmsMod.GrantOperation]
  type GrantTokenList = js.Array[typings.awsSdk.kmsMod.GrantTokenType]
  type GrantTokenType = java.lang.String
  type KeyIdType = java.lang.String
  type KeyList = js.Array[typings.awsSdk.kmsMod.KeyListEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AWS
    - typings.awsSdk.awsSdkStrings.CUSTOMER
    - java.lang.String
  */
  type KeyManagerType = typings.awsSdk.kmsMod._KeyManagerType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Enabled_
    - typings.awsSdk.awsSdkStrings.Disabled_
    - typings.awsSdk.awsSdkStrings.PendingDeletion
    - typings.awsSdk.awsSdkStrings.PendingImport
    - typings.awsSdk.awsSdkStrings.Unavailable_
    - java.lang.String
  */
  type KeyState = typings.awsSdk.kmsMod._KeyState | java.lang.String
  type KeyStorePasswordType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SIGN_VERIFY
    - typings.awsSdk.awsSdkStrings.ENCRYPT_DECRYPT
    - java.lang.String
  */
  type KeyUsageType = typings.awsSdk.kmsMod._KeyUsageType | java.lang.String
  type LimitType = scala.Double
  type MarkerType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RAW
    - typings.awsSdk.awsSdkStrings.DIGEST
    - java.lang.String
  */
  type MessageType = typings.awsSdk.kmsMod._MessageType | java.lang.String
  type NumberOfBytesType = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AWS_KMS
    - typings.awsSdk.awsSdkStrings.EXTERNAL
    - typings.awsSdk.awsSdkStrings.AWS_CLOUDHSM
    - java.lang.String
  */
  type OriginType = typings.awsSdk.kmsMod._OriginType | java.lang.String
  type PendingWindowInDaysType = scala.Double
  type PlaintextType = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.kmsMod.Blob | java.lang.String
  type PolicyNameList = js.Array[typings.awsSdk.kmsMod.PolicyNameType]
  type PolicyNameType = java.lang.String
  type PolicyType = java.lang.String
  type PrincipalIdType = java.lang.String
  type PublicKeyType = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.kmsMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RSASSA_PSS_SHA_256
    - typings.awsSdk.awsSdkStrings.RSASSA_PSS_SHA_384
    - typings.awsSdk.awsSdkStrings.RSASSA_PSS_SHA_512
    - typings.awsSdk.awsSdkStrings.RSASSA_PKCS1_V1_5_SHA_256
    - typings.awsSdk.awsSdkStrings.RSASSA_PKCS1_V1_5_SHA_384
    - typings.awsSdk.awsSdkStrings.RSASSA_PKCS1_V1_5_SHA_512
    - typings.awsSdk.awsSdkStrings.ECDSA_SHA_256
    - typings.awsSdk.awsSdkStrings.ECDSA_SHA_384
    - typings.awsSdk.awsSdkStrings.ECDSA_SHA_512
    - java.lang.String
  */
  type SigningAlgorithmSpec = typings.awsSdk.kmsMod._SigningAlgorithmSpec | java.lang.String
  type SigningAlgorithmSpecList = js.Array[typings.awsSdk.kmsMod.SigningAlgorithmSpec]
  type TagKeyList = js.Array[typings.awsSdk.kmsMod.TagKeyType]
  type TagKeyType = java.lang.String
  type TagList = js.Array[typings.awsSdk.kmsMod.Tag]
  type TagValueType = java.lang.String
  type TrustAnchorCertificateType = java.lang.String
  type WrappingKeySpec = typings.awsSdk.awsSdkStrings.RSA_2048 | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2014-11-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.kmsMod._apiVersion | java.lang.String
}
