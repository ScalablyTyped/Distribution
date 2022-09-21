package typings.azureKeyvaultKeys

import typings.azureKeyvaultKeys.mod.AesCbcEncryptionAlgorithm
import typings.azureKeyvaultKeys.mod.AesGcmEncryptionAlgorithm
import typings.azureKeyvaultKeys.mod.KeyRotationPolicyAction
import typings.azureKeyvaultKeys.mod.KeyWrapAlgorithm
import typings.azureKeyvaultKeys.mod.RsaEncryptionAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object azureKeyvaultKeysStrings {
  
  @js.native
  sealed trait A128CBC
    extends StObject
       with AesCbcEncryptionAlgorithm
  inline def A128CBC: A128CBC = "A128CBC".asInstanceOf[A128CBC]
  
  @js.native
  sealed trait A128CBCPAD
    extends StObject
       with AesCbcEncryptionAlgorithm
  inline def A128CBCPAD: A128CBCPAD = "A128CBCPAD".asInstanceOf[A128CBCPAD]
  
  @js.native
  sealed trait A128GCM
    extends StObject
       with AesGcmEncryptionAlgorithm
  inline def A128GCM: A128GCM = "A128GCM".asInstanceOf[A128GCM]
  
  @js.native
  sealed trait A128KW
    extends StObject
       with KeyWrapAlgorithm
  inline def A128KW: A128KW = "A128KW".asInstanceOf[A128KW]
  
  @js.native
  sealed trait A192CBC
    extends StObject
       with AesCbcEncryptionAlgorithm
  inline def A192CBC: A192CBC = "A192CBC".asInstanceOf[A192CBC]
  
  @js.native
  sealed trait A192CBCPAD
    extends StObject
       with AesCbcEncryptionAlgorithm
  inline def A192CBCPAD: A192CBCPAD = "A192CBCPAD".asInstanceOf[A192CBCPAD]
  
  @js.native
  sealed trait A192GCM
    extends StObject
       with AesGcmEncryptionAlgorithm
  inline def A192GCM: A192GCM = "A192GCM".asInstanceOf[A192GCM]
  
  @js.native
  sealed trait A192KW
    extends StObject
       with KeyWrapAlgorithm
  inline def A192KW: A192KW = "A192KW".asInstanceOf[A192KW]
  
  @js.native
  sealed trait A256CBC
    extends StObject
       with AesCbcEncryptionAlgorithm
  inline def A256CBC: A256CBC = "A256CBC".asInstanceOf[A256CBC]
  
  @js.native
  sealed trait A256CBCPAD
    extends StObject
       with AesCbcEncryptionAlgorithm
  inline def A256CBCPAD: A256CBCPAD = "A256CBCPAD".asInstanceOf[A256CBCPAD]
  
  @js.native
  sealed trait A256GCM
    extends StObject
       with AesGcmEncryptionAlgorithm
  inline def A256GCM: A256GCM = "A256GCM".asInstanceOf[A256GCM]
  
  @js.native
  sealed trait A256KW
    extends StObject
       with KeyWrapAlgorithm
  inline def A256KW: A256KW = "A256KW".asInstanceOf[A256KW]
  
  @js.native
  sealed trait Notify
    extends StObject
       with KeyRotationPolicyAction
  inline def Notify: Notify = "Notify".asInstanceOf[Notify]
  
  @js.native
  sealed trait `RSA-OAEP`
    extends StObject
       with KeyWrapAlgorithm
       with RsaEncryptionAlgorithm
  inline def `RSA-OAEP`: `RSA-OAEP` = "RSA-OAEP".asInstanceOf[`RSA-OAEP`]
  
  @js.native
  sealed trait `RSA-OAEP-256`
    extends StObject
       with KeyWrapAlgorithm
       with RsaEncryptionAlgorithm
  inline def `RSA-OAEP-256`: `RSA-OAEP-256` = "RSA-OAEP-256".asInstanceOf[`RSA-OAEP-256`]
  
  @js.native
  sealed trait RSA1_5
    extends StObject
       with KeyWrapAlgorithm
       with RsaEncryptionAlgorithm
  inline def RSA1_5: RSA1_5 = "RSA1_5".asInstanceOf[RSA1_5]
  
  @js.native
  sealed trait Rotate
    extends StObject
       with KeyRotationPolicyAction
  inline def Rotate: Rotate = "Rotate".asInstanceOf[Rotate]
}
