package typings.cesium

import typings.cesium.anon.BackFaceCulling
import typings.cesium.mod.Cesium3DTileset
import typings.cesium.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cesium3DTilesetMod {
  
  @JSImport("cesium/Source/Scene/Cesium3DTileset", JSImport.Default)
  @js.native
  open class default protected () extends Cesium3DTileset {
    def this(options: BackFaceCulling) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Scene/Cesium3DTileset", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def loadJson(tilesetUrl: String): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadJson")(tilesetUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
    /**
      * Provides a hook to override the method used to request the tileset json
      * useful when fetching tilesets from remote servers
      * @param tilesetUrl - The url of the json file to be fetched
      * @returns A promise that resolves with the fetched json data
      */
    inline def loadJson(tilesetUrl: Resource): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadJson")(tilesetUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  }
}
