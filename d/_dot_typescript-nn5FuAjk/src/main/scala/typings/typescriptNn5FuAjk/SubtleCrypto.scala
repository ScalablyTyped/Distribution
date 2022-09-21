package typings.typescriptNn5FuAjk

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.jwk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Web Crypto API interface provides a number of low-level cryptographic functions. It is accessed via the Crypto.subtle properties available in a window context (via Window.crypto).
  * Available only in secure contexts.
  */
@js.native
trait SubtleCrypto extends StObject {
  
  def decrypt(algorithm: AesCbcParams, key: CryptoKey, data: BufferSource): Promise[Any] = js.native
  def decrypt(algorithm: AesCtrParams, key: CryptoKey, data: BufferSource): Promise[Any] = js.native
  def decrypt(algorithm: AesGcmParams, key: CryptoKey, data: BufferSource): Promise[Any] = js.native
  def decrypt(algorithm: AlgorithmIdentifier, key: CryptoKey, data: BufferSource): Promise[Any] = js.native
  def decrypt(algorithm: RsaOaepParams, key: CryptoKey, data: BufferSource): Promise[Any] = js.native
  
  def deriveBits(algorithm: AlgorithmIdentifier, baseKey: CryptoKey, length: Double): Promise[ArrayBuffer] = js.native
  def deriveBits(algorithm: EcdhKeyDeriveParams, baseKey: CryptoKey, length: Double): Promise[ArrayBuffer] = js.native
  def deriveBits(algorithm: HkdfParams, baseKey: CryptoKey, length: Double): Promise[ArrayBuffer] = js.native
  def deriveBits(algorithm: Pbkdf2Params, baseKey: CryptoKey, length: Double): Promise[ArrayBuffer] = js.native
  
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyType: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyType: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  
  def digest(algorithm: AlgorithmIdentifier, data: BufferSource): Promise[ArrayBuffer] = js.native
  
  def encrypt(algorithm: AesCbcParams, key: CryptoKey, data: BufferSource): Promise[Any] = js.native
  def encrypt(algorithm: AesCtrParams, key: CryptoKey, data: BufferSource): Promise[Any] = js.native
  def encrypt(algorithm: AesGcmParams, key: CryptoKey, data: BufferSource): Promise[Any] = js.native
  def encrypt(algorithm: AlgorithmIdentifier, key: CryptoKey, data: BufferSource): Promise[Any] = js.native
  def encrypt(algorithm: RsaOaepParams, key: CryptoKey, data: BufferSource): Promise[Any] = js.native
  
  @JSName("exportKey")
  def exportKey_jwk(format: Exclude[KeyFormat, jwk], key: CryptoKey): Promise[ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_jwk(format: jwk, key: CryptoKey): Promise[JsonWebKey] = js.native
  
  def generateKey(algorithm: AesKeyGenParams, extractable: scala.Boolean, keyUsages: ReadonlyArray[KeyUsage]): Promise[CryptoKey] = js.native
  def generateKey(algorithm: AlgorithmIdentifier, extractable: scala.Boolean, keyUsages: Array[KeyUsage]): Promise[CryptoKeyPair | CryptoKey] = js.native
  def generateKey(algorithm: AlgorithmIdentifier, extractable: scala.Boolean, keyUsages: Iterable[KeyUsage]): Promise[CryptoKeyPair | CryptoKey] = js.native
  def generateKey(algorithm: EcKeyGenParams, extractable: scala.Boolean, keyUsages: ReadonlyArray[KeyUsage]): Promise[CryptoKeyPair] = js.native
  def generateKey(algorithm: HmacKeyGenParams, extractable: scala.Boolean, keyUsages: ReadonlyArray[KeyUsage]): Promise[CryptoKey] = js.native
  def generateKey(algorithm: Pbkdf2Params, extractable: scala.Boolean, keyUsages: ReadonlyArray[KeyUsage]): Promise[CryptoKey] = js.native
  def generateKey(algorithm: RsaHashedKeyGenParams, extractable: scala.Boolean, keyUsages: ReadonlyArray[KeyUsage]): Promise[CryptoKeyPair] = js.native
  
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: ReadonlyArray[KeyUsage]
  ): Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: ReadonlyArray[KeyUsage]
  ): Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: ReadonlyArray[KeyUsage]
  ): Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: ReadonlyArray[KeyUsage]
  ): Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: ReadonlyArray[KeyUsage]
  ): Promise[CryptoKey] = js.native
  
  def sign(algorithm: AlgorithmIdentifier, key: CryptoKey, data: BufferSource): Promise[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: BufferSource): Promise[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: BufferSource): Promise[ArrayBuffer] = js.native
  
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: Array[KeyUsage]
  ): Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: Iterable[KeyUsage]
  ): Promise[CryptoKey] = js.native
  
  def verify(algorithm: AlgorithmIdentifier, key: CryptoKey, signature: BufferSource, data: BufferSource): Promise[scala.Boolean] = js.native
  def verify(algorithm: EcdsaParams, key: CryptoKey, signature: BufferSource, data: BufferSource): Promise[scala.Boolean] = js.native
  def verify(algorithm: RsaPssParams, key: CryptoKey, signature: BufferSource, data: BufferSource): Promise[scala.Boolean] = js.native
  
  def wrapKey(format: KeyFormat, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCbcParams): Promise[ArrayBuffer] = js.native
  def wrapKey(format: KeyFormat, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCtrParams): Promise[ArrayBuffer] = js.native
  def wrapKey(format: KeyFormat, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesGcmParams): Promise[ArrayBuffer] = js.native
  def wrapKey(format: KeyFormat, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AlgorithmIdentifier): Promise[ArrayBuffer] = js.native
  def wrapKey(format: KeyFormat, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: RsaOaepParams): Promise[ArrayBuffer] = js.native
}
