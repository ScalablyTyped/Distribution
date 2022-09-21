package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KnownEncryptionAlgorithms extends StObject
@JSImport("@azure/keyvault-keys", "KnownEncryptionAlgorithms")
@js.native
object KnownEncryptionAlgorithms extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[KnownEncryptionAlgorithms & String] = js.native
  
  /** Encryption Algorithm - A128CBC */
  @js.native
  sealed trait A128CBC
    extends StObject
       with KnownEncryptionAlgorithms
  /* "A128CBC" */ val A128CBC: typings.azureKeyvaultKeys.mod.KnownEncryptionAlgorithms.A128CBC & String = js.native
  
  /** Encryption Algorithm - A128CBCPAD */
  @js.native
  sealed trait A128Cbcpad
    extends StObject
       with KnownEncryptionAlgorithms
  /* "A128CBCPAD" */ val A128Cbcpad: typings.azureKeyvaultKeys.mod.KnownEncryptionAlgorithms.A128Cbcpad & String = js.native
  
  /** Encryption Algorithm - A128GCM */
  @js.native
  sealed trait A128GCM
    extends StObject
       with KnownEncryptionAlgorithms
  /* "A128GCM" */ val A128GCM: typings.azureKeyvaultKeys.mod.KnownEncryptionAlgorithms.A128GCM & String = js.native
  
  /** Encryption Algorithm - A128KW */
  @js.native
  sealed trait A128KW
    extends StObject
       with KnownEncryptionAlgorithms
  /* "A128KW" */ val A128KW: typings.azureKeyvaultKeys.mod.KnownEncryptionAlgorithms.A128KW & String = js.native
  
  /** Encryption Algorithm - A192CBC */
  @js.native
  sealed trait A192CBC
    extends StObject
       with KnownEncryptionAlgorithms
  /* "A192CBC" */ val A192CBC: typings.azureKeyvaultKeys.mod.KnownEncryptionAlgorithms.A192CBC & String = js.native
  
  /** Encryption Algorithm - A192CBCPAD */
  @js.native
  sealed trait A192Cbcpad
    extends StObject
       with KnownEncryptionAlgorithms
  /* "A192CBCPAD" */ val A192Cbcpad: typings.azureKeyvaultKeys.mod.KnownEncryptionAlgorithms.A192Cbcpad & String = js.native
  
  /** Encryption Algorithm - A192GCM */
  @js.native
  sealed trait A192GCM
    extends StObject
       with KnownEncryptionAlgorithms
  /* "A192GCM" */ val A192GCM: typings.azureKeyvaultKeys.mod.KnownEncryptionAlgorithms.A192GCM & String = js.native
  
  /** Encryption Algorithm - A192KW */
  @js.native
  sealed trait A192KW
    extends StObject
       with KnownEncryptionAlgorithms
  /* "A192KW" */ val A192KW: typings.azureKeyvaultKeys.mod.KnownEncryptionAlgorithms.A192KW & String = js.native
  
  /** Encryption Algorithm - A256CBC */
  @js.native
  sealed trait A256CBC
    extends StObject
       with KnownEncryptionAlgorithms
  /* "A256CBC" */ val A256CBC: typings.azureKeyvaultKeys.mod.KnownEncryptionAlgorithms.A256CBC & String = js.native
  
  /** Encryption Algorithm - A256CBCPAD */
  @js.native
  sealed trait A256Cbcpad
    extends StObject
       with KnownEncryptionAlgorithms
  /* "A256CBCPAD" */ val A256Cbcpad: typings.azureKeyvaultKeys.mod.KnownEncryptionAlgorithms.A256Cbcpad & String = js.native
  
  /** Encryption Algorithm - A256GCM */
  @js.native
  sealed trait A256GCM
    extends StObject
       with KnownEncryptionAlgorithms
  /* "A256GCM" */ val A256GCM: typings.azureKeyvaultKeys.mod.KnownEncryptionAlgorithms.A256GCM & String = js.native
  
  /** Encryption Algorithm - A256KW */
  @js.native
  sealed trait A256KW
    extends StObject
       with KnownEncryptionAlgorithms
  /* "A256KW" */ val A256KW: typings.azureKeyvaultKeys.mod.KnownEncryptionAlgorithms.A256KW & String = js.native
  
  /** Encryption Algorithm - RSA1_5 */
  @js.native
  sealed trait RSA15
    extends StObject
       with KnownEncryptionAlgorithms
  /* "RSA1_5" */ val RSA15: typings.azureKeyvaultKeys.mod.KnownEncryptionAlgorithms.RSA15 & String = js.native
  
  /** Encryption Algorithm - RSA-OAEP */
  @js.native
  sealed trait RSAOaep
    extends StObject
       with KnownEncryptionAlgorithms
  /* "RSA-OAEP" */ val RSAOaep: typings.azureKeyvaultKeys.mod.KnownEncryptionAlgorithms.RSAOaep & String = js.native
  
  /** Encryption Algorithm - RSA-OAEP-256 */
  @js.native
  sealed trait RSAOaep256
    extends StObject
       with KnownEncryptionAlgorithms
  /* "RSA-OAEP-256" */ val RSAOaep256: typings.azureKeyvaultKeys.mod.KnownEncryptionAlgorithms.RSAOaep256 & String = js.native
}
