package typings.azureMsalCommon.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsonTypes extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "JsonTypes")
@js.native
object JsonTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JsonTypes & String] = js.native
  
  @js.native
  sealed trait Jwk
    extends StObject
       with JsonTypes
  /* "JWK" */ val Jwk: typings.azureMsalCommon.constantsMod.JsonTypes.Jwk & String = js.native
  
  @js.native
  sealed trait Jwt
    extends StObject
       with JsonTypes
  /* "JWT" */ val Jwt: typings.azureMsalCommon.constantsMod.JsonTypes.Jwt & String = js.native
}
