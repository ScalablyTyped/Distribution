package typings.azureMsalCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "ServerTelemetryEntity")
@js.native
open class ServerTelemetryEntity ()
  extends typings.azureMsalCommon.distCacheEntitiesServerTelemetryEntityMod.ServerTelemetryEntity
/* static members */
object ServerTelemetryEntity {
  
  @JSImport("@azure/msal-common", "ServerTelemetryEntity")
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
