package typings.azureMsalCommon.mod

import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "PopTokenGenerator")
@js.native
open class PopTokenGenerator protected ()
  extends typings.azureMsalCommon.distCryptoPopTokenGeneratorMod.PopTokenGenerator {
  def this(cryptoUtils: ICrypto) = this()
  def this(cryptoUtils: ICrypto, performanceClient: IPerformanceClient) = this()
}
