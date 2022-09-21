package typings.azureMsalCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "ServerError")
@js.native
open class ServerError ()
  extends typings.azureMsalCommon.serverErrorMod.ServerError {
  def this(errorCode: String) = this()
  def this(errorCode: String, errorMessage: String) = this()
  def this(errorCode: Unit, errorMessage: String) = this()
  def this(errorCode: String, errorMessage: String, subError: String) = this()
  def this(errorCode: String, errorMessage: Unit, subError: String) = this()
  def this(errorCode: Unit, errorMessage: String, subError: String) = this()
  def this(errorCode: Unit, errorMessage: Unit, subError: String) = this()
}
