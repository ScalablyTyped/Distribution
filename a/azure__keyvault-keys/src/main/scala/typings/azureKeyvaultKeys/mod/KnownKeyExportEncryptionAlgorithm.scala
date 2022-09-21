package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KnownKeyExportEncryptionAlgorithm extends StObject
@JSImport("@azure/keyvault-keys", "KnownKeyExportEncryptionAlgorithm")
@js.native
object KnownKeyExportEncryptionAlgorithm extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[KnownKeyExportEncryptionAlgorithm & String] = js.native
  
  /** CKM_RSA_AES_KEY_WRAP Key Export Encryption Algorithm */
  @js.native
  sealed trait CkmRsaAesKeyWrap
    extends StObject
       with KnownKeyExportEncryptionAlgorithm
  /* "CKM_RSA_AES_KEY_WRAP" */ val CkmRsaAesKeyWrap: typings.azureKeyvaultKeys.mod.KnownKeyExportEncryptionAlgorithm.CkmRsaAesKeyWrap & String = js.native
  
  /** RSA_AES_KEY_WRAP_256 Key Export Encryption Algorithm */
  @js.native
  sealed trait RsaAesKeyWrap256
    extends StObject
       with KnownKeyExportEncryptionAlgorithm
  /* "RSA_AES_KEY_WRAP_256" */ val RsaAesKeyWrap256: typings.azureKeyvaultKeys.mod.KnownKeyExportEncryptionAlgorithm.RsaAesKeyWrap256 & String = js.native
  
  /** RSA_AES_KEY_WRAP_384 Key Export Encryption Algorithm */
  @js.native
  sealed trait RsaAesKeyWrap384
    extends StObject
       with KnownKeyExportEncryptionAlgorithm
  /* "RSA_AES_KEY_WRAP_384" */ val RsaAesKeyWrap384: typings.azureKeyvaultKeys.mod.KnownKeyExportEncryptionAlgorithm.RsaAesKeyWrap384 & String = js.native
}
