package typings.azureCoreHttp

import typings.azureCoreHttp.userAgentPolicyMod.TelemetryInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object msRestUserAgentPolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/msRestUserAgentPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultUserAgentKey(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultUserAgentKey")().asInstanceOf[String]
  
  inline def getPlatformSpecificData(): js.Array[TelemetryInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatformSpecificData")().asInstanceOf[js.Array[TelemetryInfo]]
}
