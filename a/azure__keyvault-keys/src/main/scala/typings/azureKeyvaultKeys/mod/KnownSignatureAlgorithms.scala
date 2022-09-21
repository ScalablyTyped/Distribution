package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KnownSignatureAlgorithms extends StObject
@JSImport("@azure/keyvault-keys", "KnownSignatureAlgorithms")
@js.native
object KnownSignatureAlgorithms extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[KnownSignatureAlgorithms & String] = js.native
  
  /** ECDSA using P-256 and SHA-256, as described in https://tools.ietf.org/html/rfc7518. */
  @js.native
  sealed trait ES256
    extends StObject
       with KnownSignatureAlgorithms
  /* "ES256" */ val ES256: typings.azureKeyvaultKeys.mod.KnownSignatureAlgorithms.ES256 & String = js.native
  
  /** ECDSA using P-256K and SHA-256, as described in https://tools.ietf.org/html/rfc7518 */
  @js.native
  sealed trait ES256K
    extends StObject
       with KnownSignatureAlgorithms
  /* "ES256K" */ val ES256K: typings.azureKeyvaultKeys.mod.KnownSignatureAlgorithms.ES256K & String = js.native
  
  /** ECDSA using P-384 and SHA-384, as described in https://tools.ietf.org/html/rfc7518 */
  @js.native
  sealed trait ES384
    extends StObject
       with KnownSignatureAlgorithms
  /* "ES384" */ val ES384: typings.azureKeyvaultKeys.mod.KnownSignatureAlgorithms.ES384 & String = js.native
  
  /** ECDSA using P-521 and SHA-512, as described in https://tools.ietf.org/html/rfc7518 */
  @js.native
  sealed trait ES512
    extends StObject
       with KnownSignatureAlgorithms
  /* "ES512" */ val ES512: typings.azureKeyvaultKeys.mod.KnownSignatureAlgorithms.ES512 & String = js.native
  
  /** RSASSA-PSS using SHA-256 and MGF1 with SHA-256, as described in https://tools.ietf.org/html/rfc7518 */
  @js.native
  sealed trait PS256
    extends StObject
       with KnownSignatureAlgorithms
  /* "PS256" */ val PS256: typings.azureKeyvaultKeys.mod.KnownSignatureAlgorithms.PS256 & String = js.native
  
  /** RSASSA-PSS using SHA-384 and MGF1 with SHA-384, as described in https://tools.ietf.org/html/rfc7518 */
  @js.native
  sealed trait PS384
    extends StObject
       with KnownSignatureAlgorithms
  /* "PS384" */ val PS384: typings.azureKeyvaultKeys.mod.KnownSignatureAlgorithms.PS384 & String = js.native
  
  /** RSASSA-PSS using SHA-512 and MGF1 with SHA-512, as described in https://tools.ietf.org/html/rfc7518 */
  @js.native
  sealed trait PS512
    extends StObject
       with KnownSignatureAlgorithms
  /* "PS512" */ val PS512: typings.azureKeyvaultKeys.mod.KnownSignatureAlgorithms.PS512 & String = js.native
  
  /** RSASSA-PKCS1-v1_5 using SHA-256, as described in https://tools.ietf.org/html/rfc7518 */
  @js.native
  sealed trait RS256
    extends StObject
       with KnownSignatureAlgorithms
  /* "RS256" */ val RS256: typings.azureKeyvaultKeys.mod.KnownSignatureAlgorithms.RS256 & String = js.native
  
  /** RSASSA-PKCS1-v1_5 using SHA-384, as described in https://tools.ietf.org/html/rfc7518 */
  @js.native
  sealed trait RS384
    extends StObject
       with KnownSignatureAlgorithms
  /* "RS384" */ val RS384: typings.azureKeyvaultKeys.mod.KnownSignatureAlgorithms.RS384 & String = js.native
  
  /** RSASSA-PKCS1-v1_5 using SHA-512, as described in https://tools.ietf.org/html/rfc7518 */
  @js.native
  sealed trait RS512
    extends StObject
       with KnownSignatureAlgorithms
  /* "RS512" */ val RS512: typings.azureKeyvaultKeys.mod.KnownSignatureAlgorithms.RS512 & String = js.native
  
  /** Reserved */
  @js.native
  sealed trait Rsnull
    extends StObject
       with KnownSignatureAlgorithms
  /* "RSNULL" */ val Rsnull: typings.azureKeyvaultKeys.mod.KnownSignatureAlgorithms.Rsnull & String = js.native
}
