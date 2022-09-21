package typings.azureMsalCommon.mod

import typings.azureMsalCommon.icryptoMod.ICrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "CacheManager")
@js.native
abstract class CacheManager protected ()
  extends typings.azureMsalCommon.cacheManagerMod.CacheManager {
  def this(clientId: String, cryptoImpl: ICrypto) = this()
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
