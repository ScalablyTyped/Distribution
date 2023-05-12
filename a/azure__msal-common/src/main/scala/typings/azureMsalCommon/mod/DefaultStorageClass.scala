package typings.azureMsalCommon.mod

import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "DefaultStorageClass")
@js.native
open class DefaultStorageClass protected ()
  extends typings.azureMsalCommon.distCacheCacheManagerMod.DefaultStorageClass {
  def this(clientId: String, cryptoImpl: ICrypto, logger: typings.azureMsalCommon.distLoggerLoggerMod.Logger) = this()
}
