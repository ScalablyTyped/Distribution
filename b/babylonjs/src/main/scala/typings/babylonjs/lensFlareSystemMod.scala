package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.lensFlareMod.LensFlare
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.mathViewportMod.Viewport
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lensFlareSystemMod {
  
  @JSImport("babylonjs/LensFlares/lensFlareSystem", "LensFlareSystem")
  @js.native
  class LensFlareSystem protected () extends StObject {
    /**
      * Instantiates a lens flare system.
      * This represents a Lens Flare System or the shiny effect created by the light reflection on the  camera lenses.
      * It is usually composed of several `lensFlare`.
      * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
      * @param name Define the name of the lens flare system in the scene
      * @param emitter Define the source (the emitter) of the lens flares (it can be a camera, a light or a mesh).
      * @param scene Define the scene the lens flare system belongs to
      */
    def this(/**
      * Define the name of the lens flare system
      */
    name: String, emitter: js.Any, scene: Scene) = this()
    
    /* private */ var _effect: js.Any = js.native
    
    /* private */ var _emitter: js.Any = js.native
    
    /* private */ var _indexBuffer: js.Any = js.native
    
    /* private */ var _isEnabled: js.Any = js.native
    
    /** @hidden */
    def _isVisible(): Boolean = js.native
    
    /* private */ var _positionX: js.Any = js.native
    
    /* private */ var _positionY: js.Any = js.native
    
    /* private */ var _scene: js.Any = js.native
    
    /* private */ var _vertexBuffers: js.Any = js.native
    
    /**
      * Define a limit from the border the lens flare can be visible.
      */
    var borderLimit: Double = js.native
    
    /**
      * @hidden
      */
    def computeEffectivePosition(globalViewport: Viewport): Boolean = js.native
    
    /**
      * Dispose and release the lens flare with its associated resources.
      */
    def dispose(): Unit = js.native
    
    /**
      * Get the emitter of the lens flare system.
      * It defines the source of the lens flares (it can be a camera, a light or a mesh).
      * @returns the emitter of the lens flare system
      */
    def getEmitter(): js.Any = js.native
    
    /**
      * Get the lens flare system emitter position.
      * The emitter defines the source of the lens flares (it can be a camera, a light or a mesh).
      * @returns the position
      */
    def getEmitterPosition(): Vector3 = js.native
    
    /**
      * Get the scene the effects belongs to.
      * @returns the scene holding the lens flare system
      */
    def getScene(): Scene = js.native
    
    /**
      * Define the id of the lens flare system in the scene.
      * (equal to name by default)
      */
    var id: String = js.native
    
    /**
      * Define if the lens flare system is enabled.
      */
    def isEnabled: Boolean = js.native
    def isEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Restricts the rendering of the effect to only the camera rendering this layer mask.
      */
    var layerMask: Double = js.native
    
    /**
      * List of lens flares used in this system.
      */
    var lensFlares: js.Array[LensFlare] = js.native
    
    /**
      * Define a predicate which could limit the list of meshes able to occlude the effect.
      */
    def meshesSelectionPredicate(mesh: AbstractMesh): Boolean = js.native
    
    /**
      * Define the name of the lens flare system
      */
    var name: String = js.native
    
    /**
      * @hidden
      */
    def render(): Boolean = js.native
    
    /**
      * Serialize the current Lens Flare System into a JSON representation.
      * @returns the serialized JSON
      */
    def serialize(): js.Any = js.native
    
    /**
      * Set the emitter of the lens flare system.
      * It defines the source of the lens flares (it can be a camera, a light or a mesh).
      * @param newEmitter Define the new emitter of the system
      */
    def setEmitter(newEmitter: js.Any): Unit = js.native
    
    /**
      * Define a viewport border we do not want to see the lens flare in.
      */
    var viewportBorder: Double = js.native
  }
  /* static members */
  object LensFlareSystem {
    
    @JSImport("babylonjs/LensFlares/lensFlareSystem", "LensFlareSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parse a lens flare system from a JSON repressentation
      * @param parsedLensFlareSystem Define the JSON to parse
      * @param scene Define the scene the parsed system should be instantiated in
      * @param rootUrl Define the rootUrl of the load sequence to easily find a load relative dependencies such as textures
      * @returns the parsed system
      */
    inline def Parse(parsedLensFlareSystem: js.Any, scene: Scene, rootUrl: String): LensFlareSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedLensFlareSystem.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[LensFlareSystem]
    
    /** @hidden */
    inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
