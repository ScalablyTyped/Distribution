package typings.cesium

import typings.cesium.mod.Entity
import typings.cesium.mod.Entity.ConstructorOptions
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityMod {
  
  @JSImport("cesium/Source/DataSources/Entity", JSImport.Default)
  @js.native
  open class default () extends Entity {
    def this(options: ConstructorOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/DataSources/Entity", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Checks if the given Scene supports materials besides Color on Entities draped on terrain or 3D Tiles.
      * If this feature is not supported, Entities with non-color materials but no `height` will
      * instead be rendered as if height is 0.
      * @param scene - The current scene.
      * @returns Whether or not the current scene supports materials for entities on terrain.
      */
    inline def supportsMaterialsforEntitiesOnTerrain(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsMaterialsforEntitiesOnTerrain")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Checks if the given Scene supports polylines clamped to terrain or 3D Tiles.
      * If this feature is not supported, Entities with PolylineGraphics will be rendered with vertices at
      * the provided heights and using the `arcType` parameter instead of clamped to the ground.
      * @param scene - The current scene.
      * @returns Whether or not the current scene supports polylines on terrain or 3D TIles.
      */
    inline def supportsPolylinesOnTerrain(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsPolylinesOnTerrain")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
