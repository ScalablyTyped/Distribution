package typings.cesium

import typings.cesium.anon.AllowPicking
import typings.cesium.mod.GroundPrimitive
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneGroundPrimitiveMod {
  
  @JSImport("cesium/Source/Scene/GroundPrimitive", JSImport.Default)
  @js.native
  open class default () extends GroundPrimitive {
    def this(options: AllowPicking) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Scene/GroundPrimitive", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Initializes the minimum and maximum terrain heights. This only needs to be called if you are creating the
      * GroundPrimitive synchronously.
      * @returns A promise that will resolve once the terrain heights have been loaded.
      */
    inline def initializeTerrainHeights(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeTerrainHeights")().asInstanceOf[js.Promise[Unit]]
    
    /**
      * Determines if GroundPrimitive rendering is supported.
      * @param scene - The scene.
      * @returns <code>true</code> if GroundPrimitives are supported; otherwise, returns <code>false</code>
      */
    inline def isSupported(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Checks if the given Scene supports materials on GroundPrimitives.
      * Materials on GroundPrimitives require support for the WEBGL_depth_texture extension.
      * @param scene - The current scene.
      * @returns Whether or not the current scene supports materials on GroundPrimitives.
      */
    inline def supportsMaterials(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsMaterials")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
