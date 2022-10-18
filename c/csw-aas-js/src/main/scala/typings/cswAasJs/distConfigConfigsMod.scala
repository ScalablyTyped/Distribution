package typings.cswAasJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigConfigsMod {
  
  object AASConfig {
    
    @JSImport("csw-aas-js/dist/config/configs", "AASConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("csw-aas-js/dist/config/configs", "AASConfig.ssl-required")
    @js.native
    def sslRequired: String = js.native
    
    inline def sslRequired_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ssl-required")(x.asInstanceOf[js.Any])
    
    @JSImport("csw-aas-js/dist/config/configs", "AASConfig.use-resource-role-mappings")
    @js.native
    def useResourceRoleMappings: Boolean = js.native
    
    inline def useResourceRoleMappings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("use-resource-role-mappings")(x.asInstanceOf[js.Any])
    
    @JSImport("csw-aas-js/dist/config/configs", "AASConfig.verify-token-audience")
    @js.native
    def verifyTokenAudience: Boolean = js.native
    
    inline def verifyTokenAudience_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verify-token-audience")(x.asInstanceOf[js.Any])
  }
  
  object Config {
    
    @JSImport("csw-aas-js/dist/config/configs", "Config")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("csw-aas-js/dist/config/configs", "Config.AAS-server-name")
    @js.native
    def AASServerName: String = js.native
    
    inline def AASServerName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AAS-server-name")(x.asInstanceOf[js.Any])
    
    @JSImport("csw-aas-js/dist/config/configs", "Config.AAS-server-url")
    @js.native
    def AASServerUrl: String = js.native
    
    inline def AASServerUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AAS-server-url")(x.asInstanceOf[js.Any])
    
    @JSImport("csw-aas-js/dist/config/configs", "Config.location-server-url")
    @js.native
    def locationServerUrl: String = js.native
    
    inline def locationServerUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("location-server-url")(x.asInstanceOf[js.Any])
  }
}
