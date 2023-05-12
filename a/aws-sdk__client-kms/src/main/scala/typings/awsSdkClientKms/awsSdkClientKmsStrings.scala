package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesModelsModels0Mod.AlgorithmSpec
import typings.awsSdkClientKms.distTypesModelsModels0Mod.ConnectionErrorCodeType
import typings.awsSdkClientKms.distTypesModelsModels0Mod.ConnectionStateType
import typings.awsSdkClientKms.distTypesModelsModels0Mod.CustomKeyStoreType
import typings.awsSdkClientKms.distTypesModelsModels0Mod.CustomerMasterKeySpec
import typings.awsSdkClientKms.distTypesModelsModels0Mod.DataKeyPairSpec
import typings.awsSdkClientKms.distTypesModelsModels0Mod.DataKeySpec
import typings.awsSdkClientKms.distTypesModelsModels0Mod.EncryptionAlgorithmSpec
import typings.awsSdkClientKms.distTypesModelsModels0Mod.ExpirationModelType
import typings.awsSdkClientKms.distTypesModelsModels0Mod.GrantOperation
import typings.awsSdkClientKms.distTypesModelsModels0Mod.KeyManagerType
import typings.awsSdkClientKms.distTypesModelsModels0Mod.KeySpec
import typings.awsSdkClientKms.distTypesModelsModels0Mod.KeyState
import typings.awsSdkClientKms.distTypesModelsModels0Mod.KeyUsageType
import typings.awsSdkClientKms.distTypesModelsModels0Mod.MacAlgorithmSpec
import typings.awsSdkClientKms.distTypesModelsModels0Mod.MessageType
import typings.awsSdkClientKms.distTypesModelsModels0Mod.MultiRegionKeyType
import typings.awsSdkClientKms.distTypesModelsModels0Mod.OriginType
import typings.awsSdkClientKms.distTypesModelsModels0Mod.SigningAlgorithmSpec
import typings.awsSdkClientKms.distTypesModelsModels0Mod.XksProxyConnectivityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object awsSdkClientKmsStrings {
  
  @js.native
  sealed trait AES_128
    extends StObject
       with DataKeySpec
  inline def AES_128: AES_128 = "AES_128".asInstanceOf[AES_128]
  
  @js.native
  sealed trait AES_256
    extends StObject
       with DataKeySpec
  inline def AES_256: AES_256 = "AES_256".asInstanceOf[AES_256]
  
  @js.native
  sealed trait AWS
    extends StObject
       with KeyManagerType
  inline def AWS: AWS = "AWS".asInstanceOf[AWS]
  
  @js.native
  sealed trait AWS_CLOUDHSM
    extends StObject
       with CustomKeyStoreType
       with OriginType
  inline def AWS_CLOUDHSM: AWS_CLOUDHSM = "AWS_CLOUDHSM".asInstanceOf[AWS_CLOUDHSM]
  
  @js.native
  sealed trait AWS_KMS
    extends StObject
       with OriginType
  inline def AWS_KMS: AWS_KMS = "AWS_KMS".asInstanceOf[AWS_KMS]
  
  @js.native
  sealed trait AlreadyExistsException extends StObject
  inline def AlreadyExistsException: AlreadyExistsException = "AlreadyExistsException".asInstanceOf[AlreadyExistsException]
  
  @js.native
  sealed trait CLUSTER_NOT_FOUND
    extends StObject
       with ConnectionErrorCodeType
  inline def CLUSTER_NOT_FOUND: CLUSTER_NOT_FOUND = "CLUSTER_NOT_FOUND".asInstanceOf[CLUSTER_NOT_FOUND]
  
  @js.native
  sealed trait CONNECTED
    extends StObject
       with ConnectionStateType
  inline def CONNECTED: CONNECTED = "CONNECTED".asInstanceOf[CONNECTED]
  
  @js.native
  sealed trait CONNECTING
    extends StObject
       with ConnectionStateType
  inline def CONNECTING: CONNECTING = "CONNECTING".asInstanceOf[CONNECTING]
  
  @js.native
  sealed trait CUSTOMER
    extends StObject
       with KeyManagerType
  inline def CUSTOMER: CUSTOMER = "CUSTOMER".asInstanceOf[CUSTOMER]
  
  @js.native
  sealed trait CloudHsmClusterInUseException extends StObject
  inline def CloudHsmClusterInUseException: CloudHsmClusterInUseException = "CloudHsmClusterInUseException".asInstanceOf[CloudHsmClusterInUseException]
  
  @js.native
  sealed trait CloudHsmClusterInvalidConfigurationException extends StObject
  inline def CloudHsmClusterInvalidConfigurationException: CloudHsmClusterInvalidConfigurationException = "CloudHsmClusterInvalidConfigurationException".asInstanceOf[CloudHsmClusterInvalidConfigurationException]
  
  @js.native
  sealed trait CloudHsmClusterNotActiveException extends StObject
  inline def CloudHsmClusterNotActiveException: CloudHsmClusterNotActiveException = "CloudHsmClusterNotActiveException".asInstanceOf[CloudHsmClusterNotActiveException]
  
  @js.native
  sealed trait CloudHsmClusterNotFoundException extends StObject
  inline def CloudHsmClusterNotFoundException: CloudHsmClusterNotFoundException = "CloudHsmClusterNotFoundException".asInstanceOf[CloudHsmClusterNotFoundException]
  
  @js.native
  sealed trait CloudHsmClusterNotRelatedException extends StObject
  inline def CloudHsmClusterNotRelatedException: CloudHsmClusterNotRelatedException = "CloudHsmClusterNotRelatedException".asInstanceOf[CloudHsmClusterNotRelatedException]
  
  @js.native
  sealed trait CreateGrant
    extends StObject
       with GrantOperation
  inline def CreateGrant: CreateGrant = "CreateGrant".asInstanceOf[CreateGrant]
  
  @js.native
  sealed trait Creating
    extends StObject
       with KeyState
  inline def Creating: Creating = "Creating".asInstanceOf[Creating]
  
  @js.native
  sealed trait CustomKeyStoreHasCMKsException extends StObject
  inline def CustomKeyStoreHasCMKsException: CustomKeyStoreHasCMKsException = "CustomKeyStoreHasCMKsException".asInstanceOf[CustomKeyStoreHasCMKsException]
  
  @js.native
  sealed trait CustomKeyStoreInvalidStateException extends StObject
  inline def CustomKeyStoreInvalidStateException: CustomKeyStoreInvalidStateException = "CustomKeyStoreInvalidStateException".asInstanceOf[CustomKeyStoreInvalidStateException]
  
  @js.native
  sealed trait CustomKeyStoreNameInUseException extends StObject
  inline def CustomKeyStoreNameInUseException: CustomKeyStoreNameInUseException = "CustomKeyStoreNameInUseException".asInstanceOf[CustomKeyStoreNameInUseException]
  
  @js.native
  sealed trait CustomKeyStoreNotFoundException extends StObject
  inline def CustomKeyStoreNotFoundException: CustomKeyStoreNotFoundException = "CustomKeyStoreNotFoundException".asInstanceOf[CustomKeyStoreNotFoundException]
  
  @js.native
  sealed trait DIGEST
    extends StObject
       with MessageType
  inline def DIGEST: DIGEST = "DIGEST".asInstanceOf[DIGEST]
  
  @js.native
  sealed trait DISCONNECTED
    extends StObject
       with ConnectionStateType
  inline def DISCONNECTED: DISCONNECTED = "DISCONNECTED".asInstanceOf[DISCONNECTED]
  
  @js.native
  sealed trait DISCONNECTING
    extends StObject
       with ConnectionStateType
  inline def DISCONNECTING: DISCONNECTING = "DISCONNECTING".asInstanceOf[DISCONNECTING]
  
  @js.native
  sealed trait Decrypt
    extends StObject
       with GrantOperation
  inline def Decrypt: Decrypt = "Decrypt".asInstanceOf[Decrypt]
  
  @js.native
  sealed trait DependencyTimeoutException extends StObject
  inline def DependencyTimeoutException: DependencyTimeoutException = "DependencyTimeoutException".asInstanceOf[DependencyTimeoutException]
  
  @js.native
  sealed trait DescribeKey
    extends StObject
       with GrantOperation
  inline def DescribeKey: DescribeKey = "DescribeKey".asInstanceOf[DescribeKey]
  
  @js.native
  sealed trait Disabled
    extends StObject
       with KeyState
  inline def Disabled: Disabled = "Disabled".asInstanceOf[Disabled]
  
  @js.native
  sealed trait DisabledException extends StObject
  inline def DisabledException: DisabledException = "DisabledException".asInstanceOf[DisabledException]
  
  @js.native
  sealed trait ECC_NIST_P256
    extends StObject
       with CustomerMasterKeySpec
       with DataKeyPairSpec
       with KeySpec
  inline def ECC_NIST_P256: ECC_NIST_P256 = "ECC_NIST_P256".asInstanceOf[ECC_NIST_P256]
  
  @js.native
  sealed trait ECC_NIST_P384
    extends StObject
       with CustomerMasterKeySpec
       with DataKeyPairSpec
       with KeySpec
  inline def ECC_NIST_P384: ECC_NIST_P384 = "ECC_NIST_P384".asInstanceOf[ECC_NIST_P384]
  
  @js.native
  sealed trait ECC_NIST_P521
    extends StObject
       with CustomerMasterKeySpec
       with DataKeyPairSpec
       with KeySpec
  inline def ECC_NIST_P521: ECC_NIST_P521 = "ECC_NIST_P521".asInstanceOf[ECC_NIST_P521]
  
  @js.native
  sealed trait ECC_SECG_P256K1
    extends StObject
       with CustomerMasterKeySpec
       with DataKeyPairSpec
       with KeySpec
  inline def ECC_SECG_P256K1: ECC_SECG_P256K1 = "ECC_SECG_P256K1".asInstanceOf[ECC_SECG_P256K1]
  
  @js.native
  sealed trait ECDSA_SHA_256
    extends StObject
       with SigningAlgorithmSpec
  inline def ECDSA_SHA_256: ECDSA_SHA_256 = "ECDSA_SHA_256".asInstanceOf[ECDSA_SHA_256]
  
  @js.native
  sealed trait ECDSA_SHA_384
    extends StObject
       with SigningAlgorithmSpec
  inline def ECDSA_SHA_384: ECDSA_SHA_384 = "ECDSA_SHA_384".asInstanceOf[ECDSA_SHA_384]
  
  @js.native
  sealed trait ECDSA_SHA_512
    extends StObject
       with SigningAlgorithmSpec
  inline def ECDSA_SHA_512: ECDSA_SHA_512 = "ECDSA_SHA_512".asInstanceOf[ECDSA_SHA_512]
  
  @js.native
  sealed trait ENCRYPT_DECRYPT
    extends StObject
       with KeyUsageType
  inline def ENCRYPT_DECRYPT: ENCRYPT_DECRYPT = "ENCRYPT_DECRYPT".asInstanceOf[ENCRYPT_DECRYPT]
  
  @js.native
  sealed trait EXTERNAL
    extends StObject
       with OriginType
  inline def EXTERNAL: EXTERNAL = "EXTERNAL".asInstanceOf[EXTERNAL]
  
  @js.native
  sealed trait EXTERNAL_KEY_STORE
    extends StObject
       with CustomKeyStoreType
       with OriginType
  inline def EXTERNAL_KEY_STORE: EXTERNAL_KEY_STORE = "EXTERNAL_KEY_STORE".asInstanceOf[EXTERNAL_KEY_STORE]
  
  @js.native
  sealed trait Enabled
    extends StObject
       with KeyState
  inline def Enabled: Enabled = "Enabled".asInstanceOf[Enabled]
  
  @js.native
  sealed trait Encrypt
    extends StObject
       with GrantOperation
  inline def Encrypt: Encrypt = "Encrypt".asInstanceOf[Encrypt]
  
  @js.native
  sealed trait ExpiredImportTokenException extends StObject
  inline def ExpiredImportTokenException: ExpiredImportTokenException = "ExpiredImportTokenException".asInstanceOf[ExpiredImportTokenException]
  
  @js.native
  sealed trait FAILED
    extends StObject
       with ConnectionStateType
  inline def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @js.native
  sealed trait GENERATE_VERIFY_MAC
    extends StObject
       with KeyUsageType
  inline def GENERATE_VERIFY_MAC: GENERATE_VERIFY_MAC = "GENERATE_VERIFY_MAC".asInstanceOf[GENERATE_VERIFY_MAC]
  
  @js.native
  sealed trait GenerateDataKey
    extends StObject
       with GrantOperation
  inline def GenerateDataKey: GenerateDataKey = "GenerateDataKey".asInstanceOf[GenerateDataKey]
  
  @js.native
  sealed trait GenerateDataKeyPair
    extends StObject
       with GrantOperation
  inline def GenerateDataKeyPair: GenerateDataKeyPair = "GenerateDataKeyPair".asInstanceOf[GenerateDataKeyPair]
  
  @js.native
  sealed trait GenerateDataKeyPairWithoutPlaintext
    extends StObject
       with GrantOperation
  inline def GenerateDataKeyPairWithoutPlaintext: GenerateDataKeyPairWithoutPlaintext = "GenerateDataKeyPairWithoutPlaintext".asInstanceOf[GenerateDataKeyPairWithoutPlaintext]
  
  @js.native
  sealed trait GenerateDataKeyWithoutPlaintext
    extends StObject
       with GrantOperation
  inline def GenerateDataKeyWithoutPlaintext: GenerateDataKeyWithoutPlaintext = "GenerateDataKeyWithoutPlaintext".asInstanceOf[GenerateDataKeyWithoutPlaintext]
  
  @js.native
  sealed trait GenerateMac
    extends StObject
       with GrantOperation
  inline def GenerateMac: GenerateMac = "GenerateMac".asInstanceOf[GenerateMac]
  
  @js.native
  sealed trait GetPublicKey
    extends StObject
       with GrantOperation
  inline def GetPublicKey: GetPublicKey = "GetPublicKey".asInstanceOf[GetPublicKey]
  
  @js.native
  sealed trait HMAC_224
    extends StObject
       with CustomerMasterKeySpec
       with KeySpec
  inline def HMAC_224: HMAC_224 = "HMAC_224".asInstanceOf[HMAC_224]
  
  @js.native
  sealed trait HMAC_256
    extends StObject
       with CustomerMasterKeySpec
       with KeySpec
  inline def HMAC_256: HMAC_256 = "HMAC_256".asInstanceOf[HMAC_256]
  
  @js.native
  sealed trait HMAC_384
    extends StObject
       with CustomerMasterKeySpec
       with KeySpec
  inline def HMAC_384: HMAC_384 = "HMAC_384".asInstanceOf[HMAC_384]
  
  @js.native
  sealed trait HMAC_512
    extends StObject
       with CustomerMasterKeySpec
       with KeySpec
  inline def HMAC_512: HMAC_512 = "HMAC_512".asInstanceOf[HMAC_512]
  
  @js.native
  sealed trait HMAC_SHA_224
    extends StObject
       with MacAlgorithmSpec
  inline def HMAC_SHA_224: HMAC_SHA_224 = "HMAC_SHA_224".asInstanceOf[HMAC_SHA_224]
  
  @js.native
  sealed trait HMAC_SHA_256
    extends StObject
       with MacAlgorithmSpec
  inline def HMAC_SHA_256: HMAC_SHA_256 = "HMAC_SHA_256".asInstanceOf[HMAC_SHA_256]
  
  @js.native
  sealed trait HMAC_SHA_384
    extends StObject
       with MacAlgorithmSpec
  inline def HMAC_SHA_384: HMAC_SHA_384 = "HMAC_SHA_384".asInstanceOf[HMAC_SHA_384]
  
  @js.native
  sealed trait HMAC_SHA_512
    extends StObject
       with MacAlgorithmSpec
  inline def HMAC_SHA_512: HMAC_SHA_512 = "HMAC_SHA_512".asInstanceOf[HMAC_SHA_512]
  
  @js.native
  sealed trait INSUFFICIENT_CLOUDHSM_HSMS
    extends StObject
       with ConnectionErrorCodeType
  inline def INSUFFICIENT_CLOUDHSM_HSMS: INSUFFICIENT_CLOUDHSM_HSMS = "INSUFFICIENT_CLOUDHSM_HSMS".asInstanceOf[INSUFFICIENT_CLOUDHSM_HSMS]
  
  @js.native
  sealed trait INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET
    extends StObject
       with ConnectionErrorCodeType
  inline def INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET: INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET = "INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET".asInstanceOf[INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET]
  
  @js.native
  sealed trait INTERNAL_ERROR
    extends StObject
       with ConnectionErrorCodeType
  inline def INTERNAL_ERROR: INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[INTERNAL_ERROR]
  
  @js.native
  sealed trait INVALID_CREDENTIALS
    extends StObject
       with ConnectionErrorCodeType
  inline def INVALID_CREDENTIALS: INVALID_CREDENTIALS = "INVALID_CREDENTIALS".asInstanceOf[INVALID_CREDENTIALS]
  
  @js.native
  sealed trait IncorrectKeyException extends StObject
  inline def IncorrectKeyException: IncorrectKeyException = "IncorrectKeyException".asInstanceOf[IncorrectKeyException]
  
  @js.native
  sealed trait IncorrectKeyMaterialException extends StObject
  inline def IncorrectKeyMaterialException: IncorrectKeyMaterialException = "IncorrectKeyMaterialException".asInstanceOf[IncorrectKeyMaterialException]
  
  @js.native
  sealed trait IncorrectTrustAnchorException extends StObject
  inline def IncorrectTrustAnchorException: IncorrectTrustAnchorException = "IncorrectTrustAnchorException".asInstanceOf[IncorrectTrustAnchorException]
  
  @js.native
  sealed trait InvalidAliasNameException extends StObject
  inline def InvalidAliasNameException: InvalidAliasNameException = "InvalidAliasNameException".asInstanceOf[InvalidAliasNameException]
  
  @js.native
  sealed trait InvalidArnException extends StObject
  inline def InvalidArnException: InvalidArnException = "InvalidArnException".asInstanceOf[InvalidArnException]
  
  @js.native
  sealed trait InvalidCiphertextException extends StObject
  inline def InvalidCiphertextException: InvalidCiphertextException = "InvalidCiphertextException".asInstanceOf[InvalidCiphertextException]
  
  @js.native
  sealed trait InvalidGrantIdException extends StObject
  inline def InvalidGrantIdException: InvalidGrantIdException = "InvalidGrantIdException".asInstanceOf[InvalidGrantIdException]
  
  @js.native
  sealed trait InvalidGrantTokenException extends StObject
  inline def InvalidGrantTokenException: InvalidGrantTokenException = "InvalidGrantTokenException".asInstanceOf[InvalidGrantTokenException]
  
  @js.native
  sealed trait InvalidImportTokenException extends StObject
  inline def InvalidImportTokenException: InvalidImportTokenException = "InvalidImportTokenException".asInstanceOf[InvalidImportTokenException]
  
  @js.native
  sealed trait InvalidKeyUsageException extends StObject
  inline def InvalidKeyUsageException: InvalidKeyUsageException = "InvalidKeyUsageException".asInstanceOf[InvalidKeyUsageException]
  
  @js.native
  sealed trait InvalidMarkerException extends StObject
  inline def InvalidMarkerException: InvalidMarkerException = "InvalidMarkerException".asInstanceOf[InvalidMarkerException]
  
  @js.native
  sealed trait KEY_MATERIAL_DOES_NOT_EXPIRE
    extends StObject
       with ExpirationModelType
  inline def KEY_MATERIAL_DOES_NOT_EXPIRE: KEY_MATERIAL_DOES_NOT_EXPIRE = "KEY_MATERIAL_DOES_NOT_EXPIRE".asInstanceOf[KEY_MATERIAL_DOES_NOT_EXPIRE]
  
  @js.native
  sealed trait KEY_MATERIAL_EXPIRES
    extends StObject
       with ExpirationModelType
  inline def KEY_MATERIAL_EXPIRES: KEY_MATERIAL_EXPIRES = "KEY_MATERIAL_EXPIRES".asInstanceOf[KEY_MATERIAL_EXPIRES]
  
  @js.native
  sealed trait KMSInternalException extends StObject
  inline def KMSInternalException: KMSInternalException = "KMSInternalException".asInstanceOf[KMSInternalException]
  
  @js.native
  sealed trait KMSInvalidMacException extends StObject
  inline def KMSInvalidMacException: KMSInvalidMacException = "KMSInvalidMacException".asInstanceOf[KMSInvalidMacException]
  
  @js.native
  sealed trait KMSInvalidSignatureException extends StObject
  inline def KMSInvalidSignatureException: KMSInvalidSignatureException = "KMSInvalidSignatureException".asInstanceOf[KMSInvalidSignatureException]
  
  @js.native
  sealed trait KMSInvalidStateException extends StObject
  inline def KMSInvalidStateException: KMSInvalidStateException = "KMSInvalidStateException".asInstanceOf[KMSInvalidStateException]
  
  @js.native
  sealed trait KeyUnavailableException extends StObject
  inline def KeyUnavailableException: KeyUnavailableException = "KeyUnavailableException".asInstanceOf[KeyUnavailableException]
  
  @js.native
  sealed trait LimitExceededException extends StObject
  inline def LimitExceededException: LimitExceededException = "LimitExceededException".asInstanceOf[LimitExceededException]
  
  @js.native
  sealed trait MalformedPolicyDocumentException extends StObject
  inline def MalformedPolicyDocumentException: MalformedPolicyDocumentException = "MalformedPolicyDocumentException".asInstanceOf[MalformedPolicyDocumentException]
  
  @js.native
  sealed trait NETWORK_ERRORS
    extends StObject
       with ConnectionErrorCodeType
  inline def NETWORK_ERRORS: NETWORK_ERRORS = "NETWORK_ERRORS".asInstanceOf[NETWORK_ERRORS]
  
  @js.native
  sealed trait NotFoundException extends StObject
  inline def NotFoundException: NotFoundException = "NotFoundException".asInstanceOf[NotFoundException]
  
  @js.native
  sealed trait PRIMARY
    extends StObject
       with MultiRegionKeyType
  inline def PRIMARY: PRIMARY = "PRIMARY".asInstanceOf[PRIMARY]
  
  @js.native
  sealed trait PUBLIC_ENDPOINT
    extends StObject
       with XksProxyConnectivityType
  inline def PUBLIC_ENDPOINT: PUBLIC_ENDPOINT = "PUBLIC_ENDPOINT".asInstanceOf[PUBLIC_ENDPOINT]
  
  @js.native
  sealed trait PendingDeletion
    extends StObject
       with KeyState
  inline def PendingDeletion: PendingDeletion = "PendingDeletion".asInstanceOf[PendingDeletion]
  
  @js.native
  sealed trait PendingImport
    extends StObject
       with KeyState
  inline def PendingImport: PendingImport = "PendingImport".asInstanceOf[PendingImport]
  
  @js.native
  sealed trait PendingReplicaDeletion
    extends StObject
       with KeyState
  inline def PendingReplicaDeletion: PendingReplicaDeletion = "PendingReplicaDeletion".asInstanceOf[PendingReplicaDeletion]
  
  @js.native
  sealed trait RAW
    extends StObject
       with MessageType
  inline def RAW: RAW = "RAW".asInstanceOf[RAW]
  
  @js.native
  sealed trait REPLICA
    extends StObject
       with MultiRegionKeyType
  inline def REPLICA: REPLICA = "REPLICA".asInstanceOf[REPLICA]
  
  @js.native
  sealed trait RSAES_OAEP_SHA_1
    extends StObject
       with AlgorithmSpec
       with EncryptionAlgorithmSpec
  inline def RSAES_OAEP_SHA_1: RSAES_OAEP_SHA_1 = "RSAES_OAEP_SHA_1".asInstanceOf[RSAES_OAEP_SHA_1]
  
  @js.native
  sealed trait RSAES_OAEP_SHA_256
    extends StObject
       with AlgorithmSpec
       with EncryptionAlgorithmSpec
  inline def RSAES_OAEP_SHA_256: RSAES_OAEP_SHA_256 = "RSAES_OAEP_SHA_256".asInstanceOf[RSAES_OAEP_SHA_256]
  
  @js.native
  sealed trait RSAES_PKCS1_V1_5
    extends StObject
       with AlgorithmSpec
  inline def RSAES_PKCS1_V1_5: RSAES_PKCS1_V1_5 = "RSAES_PKCS1_V1_5".asInstanceOf[RSAES_PKCS1_V1_5]
  
  @js.native
  sealed trait RSASSA_PKCS1_V1_5_SHA_256
    extends StObject
       with SigningAlgorithmSpec
  inline def RSASSA_PKCS1_V1_5_SHA_256: RSASSA_PKCS1_V1_5_SHA_256 = "RSASSA_PKCS1_V1_5_SHA_256".asInstanceOf[RSASSA_PKCS1_V1_5_SHA_256]
  
  @js.native
  sealed trait RSASSA_PKCS1_V1_5_SHA_384
    extends StObject
       with SigningAlgorithmSpec
  inline def RSASSA_PKCS1_V1_5_SHA_384: RSASSA_PKCS1_V1_5_SHA_384 = "RSASSA_PKCS1_V1_5_SHA_384".asInstanceOf[RSASSA_PKCS1_V1_5_SHA_384]
  
  @js.native
  sealed trait RSASSA_PKCS1_V1_5_SHA_512
    extends StObject
       with SigningAlgorithmSpec
  inline def RSASSA_PKCS1_V1_5_SHA_512: RSASSA_PKCS1_V1_5_SHA_512 = "RSASSA_PKCS1_V1_5_SHA_512".asInstanceOf[RSASSA_PKCS1_V1_5_SHA_512]
  
  @js.native
  sealed trait RSASSA_PSS_SHA_256
    extends StObject
       with SigningAlgorithmSpec
  inline def RSASSA_PSS_SHA_256: RSASSA_PSS_SHA_256 = "RSASSA_PSS_SHA_256".asInstanceOf[RSASSA_PSS_SHA_256]
  
  @js.native
  sealed trait RSASSA_PSS_SHA_384
    extends StObject
       with SigningAlgorithmSpec
  inline def RSASSA_PSS_SHA_384: RSASSA_PSS_SHA_384 = "RSASSA_PSS_SHA_384".asInstanceOf[RSASSA_PSS_SHA_384]
  
  @js.native
  sealed trait RSASSA_PSS_SHA_512
    extends StObject
       with SigningAlgorithmSpec
  inline def RSASSA_PSS_SHA_512: RSASSA_PSS_SHA_512 = "RSASSA_PSS_SHA_512".asInstanceOf[RSASSA_PSS_SHA_512]
  
  @js.native
  sealed trait RSA_2048
    extends StObject
       with CustomerMasterKeySpec
       with DataKeyPairSpec
       with KeySpec
  inline def RSA_2048: RSA_2048 = "RSA_2048".asInstanceOf[RSA_2048]
  
  @js.native
  sealed trait RSA_3072
    extends StObject
       with CustomerMasterKeySpec
       with DataKeyPairSpec
       with KeySpec
  inline def RSA_3072: RSA_3072 = "RSA_3072".asInstanceOf[RSA_3072]
  
  @js.native
  sealed trait RSA_4096
    extends StObject
       with CustomerMasterKeySpec
       with DataKeyPairSpec
       with KeySpec
  inline def RSA_4096: RSA_4096 = "RSA_4096".asInstanceOf[RSA_4096]
  
  @js.native
  sealed trait ReEncryptFrom
    extends StObject
       with GrantOperation
  inline def ReEncryptFrom: ReEncryptFrom = "ReEncryptFrom".asInstanceOf[ReEncryptFrom]
  
  @js.native
  sealed trait ReEncryptTo
    extends StObject
       with GrantOperation
  inline def ReEncryptTo: ReEncryptTo = "ReEncryptTo".asInstanceOf[ReEncryptTo]
  
  @js.native
  sealed trait RetireGrant
    extends StObject
       with GrantOperation
  inline def RetireGrant: RetireGrant = "RetireGrant".asInstanceOf[RetireGrant]
  
  @js.native
  sealed trait SIGN_VERIFY
    extends StObject
       with KeyUsageType
  inline def SIGN_VERIFY: SIGN_VERIFY = "SIGN_VERIFY".asInstanceOf[SIGN_VERIFY]
  
  @js.native
  sealed trait SM2
    extends StObject
       with CustomerMasterKeySpec
       with DataKeyPairSpec
       with KeySpec
  inline def SM2: SM2 = "SM2".asInstanceOf[SM2]
  
  @js.native
  sealed trait SM2DSA
    extends StObject
       with SigningAlgorithmSpec
  inline def SM2DSA: SM2DSA = "SM2DSA".asInstanceOf[SM2DSA]
  
  @js.native
  sealed trait SM2PKE
    extends StObject
       with EncryptionAlgorithmSpec
  inline def SM2PKE: SM2PKE = "SM2PKE".asInstanceOf[SM2PKE]
  
  @js.native
  sealed trait SUBNET_NOT_FOUND
    extends StObject
       with ConnectionErrorCodeType
  inline def SUBNET_NOT_FOUND: SUBNET_NOT_FOUND = "SUBNET_NOT_FOUND".asInstanceOf[SUBNET_NOT_FOUND]
  
  @js.native
  sealed trait SYMMETRIC_DEFAULT
    extends StObject
       with CustomerMasterKeySpec
       with EncryptionAlgorithmSpec
       with KeySpec
  inline def SYMMETRIC_DEFAULT: SYMMETRIC_DEFAULT = "SYMMETRIC_DEFAULT".asInstanceOf[SYMMETRIC_DEFAULT]
  
  @js.native
  sealed trait Sign
    extends StObject
       with GrantOperation
  inline def Sign: Sign = "Sign".asInstanceOf[Sign]
  
  @js.native
  sealed trait TagException extends StObject
  inline def TagException: TagException = "TagException".asInstanceOf[TagException]
  
  @js.native
  sealed trait USER_LOCKED_OUT
    extends StObject
       with ConnectionErrorCodeType
  inline def USER_LOCKED_OUT: USER_LOCKED_OUT = "USER_LOCKED_OUT".asInstanceOf[USER_LOCKED_OUT]
  
  @js.native
  sealed trait USER_LOGGED_IN
    extends StObject
       with ConnectionErrorCodeType
  inline def USER_LOGGED_IN: USER_LOGGED_IN = "USER_LOGGED_IN".asInstanceOf[USER_LOGGED_IN]
  
  @js.native
  sealed trait USER_NOT_FOUND
    extends StObject
       with ConnectionErrorCodeType
  inline def USER_NOT_FOUND: USER_NOT_FOUND = "USER_NOT_FOUND".asInstanceOf[USER_NOT_FOUND]
  
  @js.native
  sealed trait Unavailable
    extends StObject
       with KeyState
  inline def Unavailable: Unavailable = "Unavailable".asInstanceOf[Unavailable]
  
  @js.native
  sealed trait UnsupportedOperationException extends StObject
  inline def UnsupportedOperationException: UnsupportedOperationException = "UnsupportedOperationException".asInstanceOf[UnsupportedOperationException]
  
  @js.native
  sealed trait Updating
    extends StObject
       with KeyState
  inline def Updating: Updating = "Updating".asInstanceOf[Updating]
  
  @js.native
  sealed trait VPC_ENDPOINT_SERVICE
    extends StObject
       with XksProxyConnectivityType
  inline def VPC_ENDPOINT_SERVICE: VPC_ENDPOINT_SERVICE = "VPC_ENDPOINT_SERVICE".asInstanceOf[VPC_ENDPOINT_SERVICE]
  
  @js.native
  sealed trait Verify
    extends StObject
       with GrantOperation
  inline def Verify: Verify = "Verify".asInstanceOf[Verify]
  
  @js.native
  sealed trait VerifyMac
    extends StObject
       with GrantOperation
  inline def VerifyMac: VerifyMac = "VerifyMac".asInstanceOf[VerifyMac]
  
  @js.native
  sealed trait XKS_PROXY_ACCESS_DENIED
    extends StObject
       with ConnectionErrorCodeType
  inline def XKS_PROXY_ACCESS_DENIED: XKS_PROXY_ACCESS_DENIED = "XKS_PROXY_ACCESS_DENIED".asInstanceOf[XKS_PROXY_ACCESS_DENIED]
  
  @js.native
  sealed trait XKS_PROXY_INVALID_CONFIGURATION
    extends StObject
       with ConnectionErrorCodeType
  inline def XKS_PROXY_INVALID_CONFIGURATION: XKS_PROXY_INVALID_CONFIGURATION = "XKS_PROXY_INVALID_CONFIGURATION".asInstanceOf[XKS_PROXY_INVALID_CONFIGURATION]
  
  @js.native
  sealed trait XKS_PROXY_INVALID_RESPONSE
    extends StObject
       with ConnectionErrorCodeType
  inline def XKS_PROXY_INVALID_RESPONSE: XKS_PROXY_INVALID_RESPONSE = "XKS_PROXY_INVALID_RESPONSE".asInstanceOf[XKS_PROXY_INVALID_RESPONSE]
  
  @js.native
  sealed trait XKS_PROXY_INVALID_TLS_CONFIGURATION
    extends StObject
       with ConnectionErrorCodeType
  inline def XKS_PROXY_INVALID_TLS_CONFIGURATION: XKS_PROXY_INVALID_TLS_CONFIGURATION = "XKS_PROXY_INVALID_TLS_CONFIGURATION".asInstanceOf[XKS_PROXY_INVALID_TLS_CONFIGURATION]
  
  @js.native
  sealed trait XKS_PROXY_NOT_REACHABLE
    extends StObject
       with ConnectionErrorCodeType
  inline def XKS_PROXY_NOT_REACHABLE: XKS_PROXY_NOT_REACHABLE = "XKS_PROXY_NOT_REACHABLE".asInstanceOf[XKS_PROXY_NOT_REACHABLE]
  
  @js.native
  sealed trait XKS_PROXY_TIMED_OUT
    extends StObject
       with ConnectionErrorCodeType
  inline def XKS_PROXY_TIMED_OUT: XKS_PROXY_TIMED_OUT = "XKS_PROXY_TIMED_OUT".asInstanceOf[XKS_PROXY_TIMED_OUT]
  
  @js.native
  sealed trait XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION
    extends StObject
       with ConnectionErrorCodeType
  inline def XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION: XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION = "XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION".asInstanceOf[XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION]
  
  @js.native
  sealed trait XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND
    extends StObject
       with ConnectionErrorCodeType
  inline def XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND: XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND = "XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND".asInstanceOf[XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND]
  
  @js.native
  sealed trait XksKeyAlreadyInUseException extends StObject
  inline def XksKeyAlreadyInUseException: XksKeyAlreadyInUseException = "XksKeyAlreadyInUseException".asInstanceOf[XksKeyAlreadyInUseException]
  
  @js.native
  sealed trait XksKeyInvalidConfigurationException extends StObject
  inline def XksKeyInvalidConfigurationException: XksKeyInvalidConfigurationException = "XksKeyInvalidConfigurationException".asInstanceOf[XksKeyInvalidConfigurationException]
  
  @js.native
  sealed trait XksKeyNotFoundException extends StObject
  inline def XksKeyNotFoundException: XksKeyNotFoundException = "XksKeyNotFoundException".asInstanceOf[XksKeyNotFoundException]
  
  @js.native
  sealed trait XksProxyIncorrectAuthenticationCredentialException extends StObject
  inline def XksProxyIncorrectAuthenticationCredentialException: XksProxyIncorrectAuthenticationCredentialException = "XksProxyIncorrectAuthenticationCredentialException".asInstanceOf[XksProxyIncorrectAuthenticationCredentialException]
  
  @js.native
  sealed trait XksProxyInvalidConfigurationException extends StObject
  inline def XksProxyInvalidConfigurationException: XksProxyInvalidConfigurationException = "XksProxyInvalidConfigurationException".asInstanceOf[XksProxyInvalidConfigurationException]
  
  @js.native
  sealed trait XksProxyInvalidResponseException extends StObject
  inline def XksProxyInvalidResponseException: XksProxyInvalidResponseException = "XksProxyInvalidResponseException".asInstanceOf[XksProxyInvalidResponseException]
  
  @js.native
  sealed trait XksProxyUriEndpointInUseException extends StObject
  inline def XksProxyUriEndpointInUseException: XksProxyUriEndpointInUseException = "XksProxyUriEndpointInUseException".asInstanceOf[XksProxyUriEndpointInUseException]
  
  @js.native
  sealed trait XksProxyUriInUseException extends StObject
  inline def XksProxyUriInUseException: XksProxyUriInUseException = "XksProxyUriInUseException".asInstanceOf[XksProxyUriInUseException]
  
  @js.native
  sealed trait XksProxyUriUnreachableException extends StObject
  inline def XksProxyUriUnreachableException: XksProxyUriUnreachableException = "XksProxyUriUnreachableException".asInstanceOf[XksProxyUriUnreachableException]
  
  @js.native
  sealed trait XksProxyVpcEndpointServiceInUseException extends StObject
  inline def XksProxyVpcEndpointServiceInUseException: XksProxyVpcEndpointServiceInUseException = "XksProxyVpcEndpointServiceInUseException".asInstanceOf[XksProxyVpcEndpointServiceInUseException]
  
  @js.native
  sealed trait XksProxyVpcEndpointServiceInvalidConfigurationException extends StObject
  inline def XksProxyVpcEndpointServiceInvalidConfigurationException: XksProxyVpcEndpointServiceInvalidConfigurationException = "XksProxyVpcEndpointServiceInvalidConfigurationException".asInstanceOf[XksProxyVpcEndpointServiceInvalidConfigurationException]
  
  @js.native
  sealed trait XksProxyVpcEndpointServiceNotFoundException extends StObject
  inline def XksProxyVpcEndpointServiceNotFoundException: XksProxyVpcEndpointServiceNotFoundException = "XksProxyVpcEndpointServiceNotFoundException".asInstanceOf[XksProxyVpcEndpointServiceNotFoundException]
  
  @js.native
  sealed trait client extends StObject
  inline def client: client = "client".asInstanceOf[client]
  
  @js.native
  sealed trait server extends StObject
  inline def server: server = "server".asInstanceOf[server]
}
