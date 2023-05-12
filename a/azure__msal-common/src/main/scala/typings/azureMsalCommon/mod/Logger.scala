package typings.azureMsalCommon.mod

import typings.azureMsalCommon.distConfigClientConfigurationMod.LoggerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "Logger")
@js.native
open class Logger protected ()
  extends typings.azureMsalCommon.distLoggerLoggerMod.Logger {
  def this(loggerOptions: LoggerOptions) = this()
  def this(loggerOptions: LoggerOptions, packageName: String) = this()
  def this(loggerOptions: LoggerOptions, packageName: String, packageVersion: String) = this()
  def this(loggerOptions: LoggerOptions, packageName: Unit, packageVersion: String) = this()
}
/* static members */
object Logger {
  
  @JSImport("@azure/msal-common", "Logger")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/msal-common", "Logger.createDefaultLoggerOptions")
  @js.native
  def createDefaultLoggerOptions: Any = js.native
  inline def createDefaultLoggerOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createDefaultLoggerOptions")(x.asInstanceOf[js.Any])
}
