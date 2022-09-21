package typings.cesium

import typings.cesium.anon.Appearance
import typings.cesium.mod.GroundPolylinePrimitive
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groundPolylinePrimitiveMod {
  
  @JSImport("cesium/Source/Scene/GroundPolylinePrimitive", JSImport.Default)
  @js.native
  open class default () extends GroundPolylinePrimitive {
    def this(options: Appearance) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Scene/GroundPolylinePrimitive", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Initializes the minimum and maximum terrain heights. This only needs to be called if you are creating the
      * GroundPolylinePrimitive synchronously.
      * @returns A promise that will resolve once the terrain heights have been loaded.
      */
    inline def initializeTerrainHeights(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeTerrainHeights")().asInstanceOf[js.Promise[Unit]]
    
    /**
      * Checks if the given Scene supports GroundPolylinePrimitives.
      * GroundPolylinePrimitives require support for the WEBGL_depth_texture extension.
      * @param scene - The current scene.
      * @returns Whether or not the current scene supports GroundPolylinePrimitives.
      */
    inline def isSupported(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
