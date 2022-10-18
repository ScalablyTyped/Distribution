package typings.azureMsalCommon

import typings.azureMsalCommon.distErrorAuthErrorMod.AuthError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorServerErrorMod {
  
  @JSImport("@azure/msal-common/dist/error/ServerError", "ServerError")
  @js.native
  open class ServerError () extends AuthError {
    def this(errorCode: String) = this()
    def this(errorCode: String, errorMessage: String) = this()
    def this(errorCode: Unit, errorMessage: String) = this()
    def this(errorCode: String, errorMessage: String, subError: String) = this()
    def this(errorCode: String, errorMessage: Unit, subError: String) = this()
    def this(errorCode: Unit, errorMessage: String, subError: String) = this()
    def this(errorCode: Unit, errorMessage: Unit, subError: String) = this()
  }
}
