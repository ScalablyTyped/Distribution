package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KnownKeyOperations extends StObject
@JSImport("@azure/keyvault-keys", "KnownKeyOperations")
@js.native
object KnownKeyOperations extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[KnownKeyOperations & String] = js.native
  
  /** Key operation - decrypt */
  @js.native
  sealed trait Decrypt
    extends StObject
       with KnownKeyOperations
  /* "decrypt" */ val Decrypt: typings.azureKeyvaultKeys.mod.KnownKeyOperations.Decrypt & String = js.native
  
  /** Key operation - encrypt */
  @js.native
  sealed trait Encrypt
    extends StObject
       with KnownKeyOperations
  /* "encrypt" */ val Encrypt: typings.azureKeyvaultKeys.mod.KnownKeyOperations.Encrypt & String = js.native
  
  /** Key operation - import */
  @js.native
  sealed trait Import
    extends StObject
       with KnownKeyOperations
  /* "import" */ val Import: typings.azureKeyvaultKeys.mod.KnownKeyOperations.Import & String = js.native
  
  /** Key operation - sign */
  @js.native
  sealed trait Sign
    extends StObject
       with KnownKeyOperations
  /* "sign" */ val Sign: typings.azureKeyvaultKeys.mod.KnownKeyOperations.Sign & String = js.native
  
  /** Key operation - unwrapKey */
  @js.native
  sealed trait UnwrapKey
    extends StObject
       with KnownKeyOperations
  /* "unwrapKey" */ val UnwrapKey: typings.azureKeyvaultKeys.mod.KnownKeyOperations.UnwrapKey & String = js.native
  
  /** Key operation - verify */
  @js.native
  sealed trait Verify
    extends StObject
       with KnownKeyOperations
  /* "verify" */ val Verify: typings.azureKeyvaultKeys.mod.KnownKeyOperations.Verify & String = js.native
  
  /** Key operation - wrapKey */
  @js.native
  sealed trait WrapKey
    extends StObject
       with KnownKeyOperations
  /* "wrapKey" */ val WrapKey: typings.azureKeyvaultKeys.mod.KnownKeyOperations.WrapKey & String = js.native
}
