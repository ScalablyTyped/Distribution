package typings.azureKeyvaultKeys.mod

import typings.azureCoreClient.mod.OperationOptions
import typings.azureKeyvaultKeys.mod.^
import typings.azureLogger.mod.AzureLogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def logger: AzureLogger = ^.asInstanceOf[js.Dynamic].selectDynamic("logger").asInstanceOf[AzureLogger]

inline def parseKeyVaultKeyIdentifier(id: String): KeyVaultKeyIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKeyVaultKeyIdentifier")(id.asInstanceOf[js.Any]).asInstanceOf[KeyVaultKeyIdentifier]

type BackupKeyOptions = OperationOptions

type BeginDeleteKeyOptions = KeyPollerOptions

type BeginRecoverDeletedKeyOptions = KeyPollerOptions

type CreateEcKeyOptions = CreateKeyOptions

type CreateOctKeyOptions = CreateKeyOptions

type CryptographyClientOptions = KeyClientOptions

type CryptographyOptions = OperationOptions

type DecryptOptions = CryptographyOptions

type DeletionRecoveryLevel = String

type EncryptOptions = CryptographyOptions

type EncryptionAlgorithm = String

type GetDeletedKeyOptions = OperationOptions

type GetKeyRotationPolicyOptions = OperationOptions

type GetRandomBytesOptions = OperationOptions

type KeyCurveName = String

type KeyExportEncryptionAlgorithm = String

type KeyOperation = String

/**
  * Defines values for JsonWebKeyType. \
  * {@link KnownJsonWebKeyType} can be used interchangeably with JsonWebKeyType,
  *  this enum contains the known values that the service supports.
  * ### Known values supported by the service
  * **EC**: Elliptic Curve. \
  * **EC-HSM**: Elliptic Curve with a private key which is stored in the HSM. \
  * **RSA**: RSA (https:\/\/tools.ietf.org\/html\/rfc3447) \
  * **RSA-HSM**: RSA with a private key which is stored in the HSM. \
  * **oct**: Octet sequence (used to represent symmetric keys) \
  * **oct-HSM**: Octet sequence (used to represent symmetric keys) which is stored the HSM.
  */
type KeyType2 = String

type ListDeletedKeysOptions = OperationOptions

type ListPropertiesOfKeyVersionsOptions = OperationOptions

type ListPropertiesOfKeysOptions = OperationOptions

type PurgeDeletedKeyOptions = OperationOptions

type RestoreKeyBackupOptions = OperationOptions

type RotateKeyOptions = OperationOptions

type SignOptions = CryptographyOptions

type SignatureAlgorithm = String

type UnwrapKeyOptions = CryptographyOptions

type UpdateKeyRotationPolicyOptions = OperationOptions

type VerifyDataOptions = CryptographyOptions

type VerifyOptions = CryptographyOptions

type WrapKeyOptions = CryptographyOptions
