package typings.azureKeyvaultKeys.mod

import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/keyvault-keys", "CryptographyClient")
@js.native
open class CryptographyClient protected () extends StObject {
  /**
    * Constructs a new instance of the Cryptography client for the given key in local mode.
    *
    * Example usage:
    * ```ts
    * import { CryptographyClient } from "@azure/keyvault-keys";
    *
    * const jsonWebKey: JsonWebKey = {
    *   // ...
    * };
    * const client = new CryptographyClient(jsonWebKey);
    * ```
    * @param key - The JsonWebKey to use during cryptography operations.
    */
  def this(key: JsonWebKey2) = this()
  /**
    * Constructs a new instance of the Cryptography client for the given key
    *
    * Example usage:
    * ```ts
    * import { KeyClient, CryptographyClient } from "@azure/keyvault-keys";
    * import { DefaultAzureCredential } from "@azure/identity";
    *
    * let vaultUrl = `https://<MY KEYVAULT HERE>.vault.azure.net`;
    * let credentials = new DefaultAzureCredential();
    *
    * let keyClient = new KeyClient(vaultUrl, credentials);
    * let keyVaultKey = await keyClient.getKey("MyKey");
    *
    * let client = new CryptographyClient(keyVaultKey.id, credentials);
    * // or
    * let client = new CryptographyClient(keyVaultKey, credentials);
    * ```
    * @param key - The key to use during cryptography tasks. You can also pass the identifier of the key i.e its url here.
    * @param credential - An object that implements the `TokenCredential` interface used to authenticate requests to the service. Use the \@azure/identity package to create a credential that suits your needs.
    * @param pipelineOptions - Pipeline options used to configure Key Vault API requests.
    *                          Omit this parameter to use the default pipeline configuration.
    */
  def this(key: String, credential: TokenCredential) = this()
  def this(key: KeyVaultKey, credential: TokenCredential) = this()
  def this(key: String, credential: TokenCredential, pipelineOptions: CryptographyClientOptions) = this()
  def this(key: KeyVaultKey, credential: TokenCredential, pipelineOptions: CryptographyClientOptions) = this()
  
  /**
    * Decrypts the given ciphertext with the specified cryptography algorithm
    *
    * Example usage:
    * ```ts
    * let client = new CryptographyClient(keyVaultKey, credentials);
    * let result = await client.decrypt("RSA1_5", encryptedBuffer);
    * ```
    *
    * Microsoft recommends you not use CBC without first ensuring the integrity of the ciphertext using, for example, an HMAC. See https://docs.microsoft.com/dotnet/standard/security/vulnerabilities-cbc-mode for more information.
    *
    * @param algorithm - The algorithm to use.
    * @param ciphertext - The text to decrypt.
    * @param options - Additional options.
    * @deprecated Use `decrypt({ algorithm, ciphertext }, options)` instead.
    */
  def decrypt(algorithm: EncryptionAlgorithm, ciphertext: js.typedarray.Uint8Array): js.Promise[DecryptResult] = js.native
  def decrypt(algorithm: EncryptionAlgorithm, ciphertext: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[DecryptResult] = js.native
  /**
    * Decrypts the given ciphertext with the specified decryption parameters.
    * Depending on the algorithm used in the decryption parameters, the set of possible decryption parameters will change.
    *
    * Microsoft recommends you not use CBC without first ensuring the integrity of the ciphertext using, for example, an HMAC. See https://docs.microsoft.com/dotnet/standard/security/vulnerabilities-cbc-mode for more information.
    *
    * Example usage:
    * ```ts
    * let client = new CryptographyClient(keyVaultKey, credentials);
    * let result = await client.decrypt({ algorithm: "RSA1_5", ciphertext: encryptedBuffer });
    * let result = await client.decrypt({ algorithm: "A256GCM", iv: ivFromEncryptResult, authenticationTag: tagFromEncryptResult });
    * ```
    * @param decryptParameters - The decryption parameters.
    * @param options - Additional options.
    */
  def decrypt(decryptParameters: DecryptParameters): js.Promise[DecryptResult] = js.native
  def decrypt(decryptParameters: DecryptParameters, options: DecryptOptions): js.Promise[DecryptResult] = js.native
  
  /**
    * Standardizes the arguments of multiple overloads into a single shape.
    * @param args - The decrypt arguments
    */
  /* private */ var disambiguateDecryptArguments: Any = js.native
  
  /**
    * Standardizes the arguments of multiple overloads into a single shape.
    * @param args - The encrypt arguments
    */
  /* private */ var disambiguateEncryptArguments: Any = js.native
  
  /**
    * Encrypts the given plaintext with the specified cryptography algorithm
    *
    * Example usage:
    * ```ts
    * let client = new CryptographyClient(keyVaultKey, credentials);
    * let result = await client.encrypt("RSA1_5", Buffer.from("My Message"));
    * ```
    * @param algorithm - The algorithm to use.
    * @param plaintext - The text to encrypt.
    * @param options - Additional options.
    * @deprecated Use `encrypt({ algorithm, plaintext }, options)` instead.
    */
  def encrypt(algorithm: EncryptionAlgorithm, plaintext: js.typedarray.Uint8Array): js.Promise[EncryptResult] = js.native
  def encrypt(algorithm: EncryptionAlgorithm, plaintext: js.typedarray.Uint8Array, options: EncryptOptions): js.Promise[EncryptResult] = js.native
  /**
    * Encrypts the given plaintext with the specified encryption parameters.
    * Depending on the algorithm set in the encryption parameters, the set of possible encryption parameters will change.
    *
    * Example usage:
    * ```ts
    * let client = new CryptographyClient(keyVaultKey, credentials);
    * let result = await client.encrypt({ algorithm: "RSA1_5", plaintext: Buffer.from("My Message")});
    * let result = await client.encrypt({ algorithm: "A256GCM", plaintext: Buffer.from("My Message"), additionalAuthenticatedData: Buffer.from("My authenticated data")});
    * ```
    * @param encryptParameters - The encryption parameters, keyed on the encryption algorithm chosen.
    * @param options - Additional options.
    */
  def encrypt(encryptParameters: EncryptParameters): js.Promise[EncryptResult] = js.native
  def encrypt(encryptParameters: EncryptParameters, options: EncryptOptions): js.Promise[EncryptResult] = js.native
  
  /* private */ var ensureValid: Any = js.native
  
  /**
    * Returns the underlying key used for cryptographic operations.
    * If needed, fetches the key from KeyVault and exchanges the ID for the actual key.
    * @param options - The additional options.
    */
  /* private */ var fetchKey: Any = js.native
  
  /**
    * Retrieves the {@link JsonWebKey} from the Key Vault.
    *
    * Example usage:
    * ```ts
    * let client = new CryptographyClient(keyVaultKey, credentials);
    * let result = await client.getKeyMaterial();
    * ```
    */
  /* private */ var getKeyMaterial: Any = js.native
  
  /**
    * Gets the provider that support this algorithm and operation.
    * The available providers are ordered by priority such that the first provider that supports this
    * operation is the one we should use.
    * @param operation - The {@link KeyOperation}.
    * @param algorithm - The algorithm to use.
    */
  /* private */ var getProvider: Any = js.native
  
  /* private */ var initializeIV: Any = js.native
  
  /**
    * The key the CryptographyClient currently holds.
    */
  /* private */ var key: Any = js.native
  
  /**
    * The ID of the key used to perform cryptographic operations for the client.
    */
  def keyID: js.UndefOr[String] = js.native
  
  /* private */ var providers: Any = js.native
  
  /**
    * The remote provider, which would be undefined if used in local mode.
    */
  /* private */ var remoteProvider: Any = js.native
  
  /**
    * Cryptographically sign the digest of a message
    *
    * Example usage:
    * ```ts
    * let client = new CryptographyClient(keyVaultKey, credentials);
    * let result = await client.sign("RS256", digest);
    * ```
    * @param algorithm - The signing algorithm to use.
    * @param digest - The digest of the data to sign.
    * @param options - Additional options.
    */
  def sign(algorithm: SignatureAlgorithm, digest: js.typedarray.Uint8Array): js.Promise[SignResult] = js.native
  def sign(algorithm: SignatureAlgorithm, digest: js.typedarray.Uint8Array, options: SignOptions): js.Promise[SignResult] = js.native
  
  /**
    * Cryptographically sign a block of data
    *
    * Example usage:
    * ```ts
    * let client = new CryptographyClient(keyVaultKey, credentials);
    * let result = await client.signData("RS256", message);
    * ```
    * @param algorithm - The signing algorithm to use.
    * @param data - The data to sign.
    * @param options - Additional options.
    */
  def signData(algorithm: SignatureAlgorithm, data: js.typedarray.Uint8Array): js.Promise[SignResult] = js.native
  def signData(algorithm: SignatureAlgorithm, data: js.typedarray.Uint8Array, options: SignOptions): js.Promise[SignResult] = js.native
  
  /**
    * Unwraps the given wrapped key using the specified cryptography algorithm
    *
    * Example usage:
    * ```ts
    * let client = new CryptographyClient(keyVaultKey, credentials);
    * let result = await client.unwrapKey("RSA1_5", keyToUnwrap);
    * ```
    * @param algorithm - The decryption algorithm to use to unwrap the key.
    * @param encryptedKey - The encrypted key to unwrap.
    * @param options - Additional options.
    */
  def unwrapKey(algorithm: KeyWrapAlgorithm, encryptedKey: js.typedarray.Uint8Array): js.Promise[UnwrapResult] = js.native
  def unwrapKey(algorithm: KeyWrapAlgorithm, encryptedKey: js.typedarray.Uint8Array, options: UnwrapKeyOptions): js.Promise[UnwrapResult] = js.native
  
  /**
    * The base URL to the vault. If a local {@link JsonWebKey} is used vaultUrl will be empty.
    */
  def vaultUrl: String = js.native
  
  /**
    * Verify the signed message digest
    *
    * Example usage:
    * ```ts
    * let client = new CryptographyClient(keyVaultKey, credentials);
    * let result = await client.verify("RS256", signedDigest, signature);
    * ```
    * @param algorithm - The signing algorithm to use to verify with.
    * @param digest - The digest to verify.
    * @param signature - The signature to verify the digest against.
    * @param options - Additional options.
    */
  def verify(
    algorithm: SignatureAlgorithm,
    digest: js.typedarray.Uint8Array,
    signature: js.typedarray.Uint8Array
  ): js.Promise[VerifyResult] = js.native
  def verify(
    algorithm: SignatureAlgorithm,
    digest: js.typedarray.Uint8Array,
    signature: js.typedarray.Uint8Array,
    options: VerifyOptions
  ): js.Promise[VerifyResult] = js.native
  
  /**
    * Verify the signed block of data
    *
    * Example usage:
    * ```ts
    * let client = new CryptographyClient(keyVaultKey, credentials);
    * let result = await client.verifyData("RS256", signedMessage, signature);
    * ```
    * @param algorithm - The algorithm to use to verify with.
    * @param data - The signed block of data to verify.
    * @param signature - The signature to verify the block against.
    * @param options - Additional options.
    */
  def verifyData(algorithm: SignatureAlgorithm, data: js.typedarray.Uint8Array, signature: js.typedarray.Uint8Array): js.Promise[VerifyResult] = js.native
  def verifyData(
    algorithm: SignatureAlgorithm,
    data: js.typedarray.Uint8Array,
    signature: js.typedarray.Uint8Array,
    options: VerifyOptions
  ): js.Promise[VerifyResult] = js.native
  
  /**
    * Wraps the given key using the specified cryptography algorithm
    *
    * Example usage:
    * ```ts
    * let client = new CryptographyClient(keyVaultKey, credentials);
    * let result = await client.wrapKey("RSA1_5", keyToWrap);
    * ```
    * @param algorithm - The encryption algorithm to use to wrap the given key.
    * @param key - The key to wrap.
    * @param options - Additional options.
    */
  def wrapKey(algorithm: KeyWrapAlgorithm, key: js.typedarray.Uint8Array): js.Promise[WrapResult] = js.native
  def wrapKey(algorithm: KeyWrapAlgorithm, key: js.typedarray.Uint8Array, options: WrapKeyOptions): js.Promise[WrapResult] = js.native
}
