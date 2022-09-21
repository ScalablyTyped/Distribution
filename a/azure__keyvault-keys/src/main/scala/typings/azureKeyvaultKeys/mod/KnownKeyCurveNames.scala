package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KnownKeyCurveNames extends StObject
@JSImport("@azure/keyvault-keys", "KnownKeyCurveNames")
@js.native
object KnownKeyCurveNames extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[KnownKeyCurveNames & String] = js.native
  
  /** The NIST P-256 elliptic curve, AKA SECG curve SECP256R1. */
  @js.native
  sealed trait P256
    extends StObject
       with KnownKeyCurveNames
  /* "P-256" */ val P256: typings.azureKeyvaultKeys.mod.KnownKeyCurveNames.P256 & String = js.native
  
  /** The SECG SECP256K1 elliptic curve. */
  @js.native
  sealed trait P256K
    extends StObject
       with KnownKeyCurveNames
  /* "P-256K" */ val P256K: typings.azureKeyvaultKeys.mod.KnownKeyCurveNames.P256K & String = js.native
  
  /** The NIST P-384 elliptic curve, AKA SECG curve SECP384R1. */
  @js.native
  sealed trait P384
    extends StObject
       with KnownKeyCurveNames
  /* "P-384" */ val P384: typings.azureKeyvaultKeys.mod.KnownKeyCurveNames.P384 & String = js.native
  
  /** The NIST P-521 elliptic curve, AKA SECG curve SECP521R1. */
  @js.native
  sealed trait P521
    extends StObject
       with KnownKeyCurveNames
  /* "P-521" */ val P521: typings.azureKeyvaultKeys.mod.KnownKeyCurveNames.P521 & String = js.native
}
