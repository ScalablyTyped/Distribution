package typings.cesium

import typings.cesium.mod.GoogleEarthEnterpriseMapsProvider
import typings.cesium.mod.GoogleEarthEnterpriseMapsProvider.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneGoogleEarthEnterpriseMapsProviderMod {
  
  @JSImport("cesium/Source/Scene/GoogleEarthEnterpriseMapsProvider", JSImport.Default)
  @js.native
  open class default protected () extends GoogleEarthEnterpriseMapsProvider {
    def this(options: ConstructorOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Scene/GoogleEarthEnterpriseMapsProvider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets or sets the URL to the Google Earth logo for display in the credit.
      */
    @JSImport("cesium/Source/Scene/GoogleEarthEnterpriseMapsProvider", "default.logoUrl")
    @js.native
    def logoUrl: String = js.native
    inline def logoUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logoUrl")(x.asInstanceOf[js.Any])
  }
}
