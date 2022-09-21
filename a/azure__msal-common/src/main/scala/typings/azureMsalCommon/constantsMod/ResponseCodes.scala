package typings.azureMsalCommon.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResponseCodes extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "ResponseCodes")
@js.native
object ResponseCodes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponseCodes & Double] = js.native
  
  @js.native
  sealed trait httpBadRequest
    extends StObject
       with ResponseCodes
  /* 400 */ val httpBadRequest: typings.azureMsalCommon.constantsMod.ResponseCodes.httpBadRequest & Double = js.native
  
  @js.native
  sealed trait httpSuccess
    extends StObject
       with ResponseCodes
  /* 200 */ val httpSuccess: typings.azureMsalCommon.constantsMod.ResponseCodes.httpSuccess & Double = js.native
}
