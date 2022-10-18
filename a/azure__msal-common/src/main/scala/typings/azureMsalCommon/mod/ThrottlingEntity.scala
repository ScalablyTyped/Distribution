package typings.azureMsalCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "ThrottlingEntity")
@js.native
open class ThrottlingEntity ()
  extends typings.azureMsalCommon.distCacheEntitiesThrottlingEntityMod.ThrottlingEntity
/* static members */
object ThrottlingEntity {
  
  @JSImport("@azure/msal-common", "ThrottlingEntity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * validates if a given cache entry is "Throttling", parses <key,value>
    * @param key
    * @param entity
    */
  inline def isThrottlingEntity(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThrottlingEntity")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isThrottlingEntity(key: String, entity: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThrottlingEntity")(key.asInstanceOf[js.Any], entity.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
