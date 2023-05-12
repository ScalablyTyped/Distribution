package typings.azureMsalCommon.mod

import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@azure/msal-common", "CacheManager")
@js.native
open class CacheManager protected ()
  extends typings.azureMsalCommon.distCacheCacheManagerMod.CacheManager {
  def this(clientId: String, cryptoImpl: ICrypto, logger: typings.azureMsalCommon.distLoggerLoggerMod.Logger) = this()
}
/* static members */
object CacheManager {
  
  @JSImport("@azure/msal-common", "CacheManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper to convert serialized data to object
    * @param obj
    * @param json
    */
  inline def toObject[T](obj: T, json: js.Object): T = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(obj.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[T]
}
