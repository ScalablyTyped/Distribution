package typings.azureMsalCommon

import typings.azureMsalCommon.cacheTypesMod._ValidCacheType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverTelemetryEntityMod {
  
  @JSImport("@azure/msal-common/dist/cache/entities/ServerTelemetryEntity", "ServerTelemetryEntity")
  @js.native
  open class ServerTelemetryEntity ()
    extends StObject
       with _ValidCacheType {
    
    var cacheHits: Double = js.native
    
    var errors: js.Array[String] = js.native
    
    var failedRequests: js.Array[String | Double] = js.native
  }
  /* static members */
  object ServerTelemetryEntity {
    
    @JSImport("@azure/msal-common/dist/cache/entities/ServerTelemetryEntity", "ServerTelemetryEntity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * validates if a given cache entry is "Telemetry", parses <key,value>
      * @param key
      * @param entity
      */
    inline def isServerTelemetryEntity(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isServerTelemetryEntity")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isServerTelemetryEntity(key: String, entity: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isServerTelemetryEntity")(key.asInstanceOf[js.Any], entity.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
