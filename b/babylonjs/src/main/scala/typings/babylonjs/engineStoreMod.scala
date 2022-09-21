package typings.babylonjs

import typings.babylonjs.engineMod.Engine
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineStoreMod {
  
  @JSImport("babylonjs/Engines/engineStore", "EngineStore")
  @js.native
  open class EngineStore () extends StObject
  /* static members */
  object EngineStore {
    
    @JSImport("babylonjs/Engines/engineStore", "EngineStore")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Texture content used if a texture cannot loaded
      * @ignorenaming
      */
    @JSImport("babylonjs/Engines/engineStore", "EngineStore.FallbackTexture")
    @js.native
    def FallbackTexture: String = js.native
    inline def FallbackTexture_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FallbackTexture")(x.asInstanceOf[js.Any])
    
    /** Gets the list of created engines */
    @JSImport("babylonjs/Engines/engineStore", "EngineStore.Instances")
    @js.native
    def Instances: js.Array[Engine] = js.native
    inline def Instances_=(x: js.Array[Engine]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instances")(x.asInstanceOf[js.Any])
    
    /**
      * Gets or sets a global variable indicating if fallback texture must be used when a texture cannot be loaded
      * @ignorenaming
      */
    @JSImport("babylonjs/Engines/engineStore", "EngineStore.UseFallbackTexture")
    @js.native
    def UseFallbackTexture: Boolean = js.native
    inline def UseFallbackTexture_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseFallbackTexture")(x.asInstanceOf[js.Any])
    
    /** @hidden */
    @JSImport("babylonjs/Engines/engineStore", "EngineStore._LastCreatedScene")
    @js.native
    def _LastCreatedScene: Nullable[Scene] = js.native
    inline def _LastCreatedScene_=(x: Nullable[Scene]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LastCreatedScene")(x.asInstanceOf[js.Any])
  }
}
