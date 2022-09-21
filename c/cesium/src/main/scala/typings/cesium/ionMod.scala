package typings.cesium

import typings.cesium.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionMod {
  
  object default {
    
    @JSImport("cesium/Source/Core/Ion", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets or sets the default Cesium ion access token.
      */
    @JSImport("cesium/Source/Core/Ion", "default.defaultAccessToken")
    @js.native
    def defaultAccessToken: String = js.native
    inline def defaultAccessToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultAccessToken")(x.asInstanceOf[js.Any])
    
    /**
      * Gets or sets the default Cesium ion server.
      */
    @JSImport("cesium/Source/Core/Ion", "default.defaultServer")
    @js.native
    def defaultServer: String | Resource = js.native
    inline def defaultServer_=(x: String | Resource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultServer")(x.asInstanceOf[js.Any])
  }
}
