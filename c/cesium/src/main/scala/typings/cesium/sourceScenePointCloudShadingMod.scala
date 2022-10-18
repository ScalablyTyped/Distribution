package typings.cesium

import typings.cesium.anon.Attenuation
import typings.cesium.mod.PointCloudShading
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceScenePointCloudShadingMod {
  
  @JSImport("cesium/Source/Scene/PointCloudShading", JSImport.Default)
  @js.native
  open class default () extends PointCloudShading {
    def this(options: Attenuation) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Scene/PointCloudShading", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Determines if point cloud shading is supported.
      * @param scene - The scene.
      * @returns <code>true</code> if point cloud shading is supported; otherwise, returns <code>false</code>
      */
    inline def isSupported(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
