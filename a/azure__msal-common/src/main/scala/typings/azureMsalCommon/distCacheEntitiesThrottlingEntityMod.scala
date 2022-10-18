package typings.azureMsalCommon

import typings.azureMsalCommon.distCacheUtilsCacheTypesMod._ValidCacheType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheEntitiesThrottlingEntityMod {
  
  @JSImport("@azure/msal-common/dist/cache/entities/ThrottlingEntity", "ThrottlingEntity")
  @js.native
  open class ThrottlingEntity ()
    extends StObject
       with _ValidCacheType {
    
    var error: js.UndefOr[String] = js.native
    
    var errorCodes: js.UndefOr[js.Array[String]] = js.native
    
    var errorMessage: js.UndefOr[String] = js.native
    
    var subError: js.UndefOr[String] = js.native
    
    var throttleTime: Double = js.native
  }
  /* static members */
  object ThrottlingEntity {
    
    @JSImport("@azure/msal-common/dist/cache/entities/ThrottlingEntity", "ThrottlingEntity")
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
}
