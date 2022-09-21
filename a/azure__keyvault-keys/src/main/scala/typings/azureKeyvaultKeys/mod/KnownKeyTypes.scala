package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KnownKeyTypes extends StObject
@JSImport("@azure/keyvault-keys", "KnownKeyTypes")
@js.native
object KnownKeyTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[KnownKeyTypes & String] = js.native
  
  /** Elliptic Curve. */
  @js.native
  sealed trait EC
    extends StObject
       with KnownKeyTypes
  /* "EC" */ val EC: typings.azureKeyvaultKeys.mod.KnownKeyTypes.EC & String = js.native
  
  /** Elliptic Curve with a private key which is stored in the HSM. */
  @js.native
  sealed trait ECHSM
    extends StObject
       with KnownKeyTypes
  /* "EC-HSM" */ val ECHSM: typings.azureKeyvaultKeys.mod.KnownKeyTypes.ECHSM & String = js.native
  
  /** Octet sequence (used to represent symmetric keys) */
  @js.native
  sealed trait Oct
    extends StObject
       with KnownKeyTypes
  /* "oct" */ val Oct: typings.azureKeyvaultKeys.mod.KnownKeyTypes.Oct & String = js.native
  
  /** Octet sequence (used to represent symmetric keys) which is stored the HSM. */
  @js.native
  sealed trait OctHSM
    extends StObject
       with KnownKeyTypes
  /* "oct-HSM" */ val OctHSM: typings.azureKeyvaultKeys.mod.KnownKeyTypes.OctHSM & String = js.native
  
  /** RSA (https://tools.ietf.org/html/rfc3447) */
  @js.native
  sealed trait RSA
    extends StObject
       with KnownKeyTypes
  /* "RSA" */ val RSA: typings.azureKeyvaultKeys.mod.KnownKeyTypes.RSA & String = js.native
  
  /** RSA with a private key which is stored in the HSM. */
  @js.native
  sealed trait RSAHSM
    extends StObject
       with KnownKeyTypes
  /* "RSA-HSM" */ val RSAHSM: typings.azureKeyvaultKeys.mod.KnownKeyTypes.RSAHSM & String = js.native
}
