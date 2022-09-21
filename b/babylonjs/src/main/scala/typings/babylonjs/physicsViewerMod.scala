package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.physicsImpostorMod.PhysicsImpostor
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsViewerMod {
  
  @JSImport("babylonjs/Debug/physicsViewer", "PhysicsViewer")
  @js.native
  /**
    * Creates a new PhysicsViewer
    * @param scene defines the hosting scene
    */
  open class PhysicsViewer () extends StObject {
    def this(scene: Scene) = this()
    
    /* private */ var _debugBoxMesh: Any = js.native
    
    /* private */ var _debugCapsuleMesh: Any = js.native
    
    /* private */ var _debugCylinderMesh: Any = js.native
    
    /* private */ var _debugMaterial: Any = js.native
    
    /* private */ var _debugMeshMeshes: Any = js.native
    
    /* private */ var _debugSphereMesh: Any = js.native
    
    /* private */ var _getDebugBoxMesh: Any = js.native
    
    /* private */ var _getDebugCapsuleMesh: Any = js.native
    
    /* private */ var _getDebugCylinderMesh: Any = js.native
    
    /* private */ var _getDebugMaterial: Any = js.native
    
    /* private */ var _getDebugMesh: Any = js.native
    
    /* private */ var _getDebugMeshMesh: Any = js.native
    
    /* private */ var _getDebugSphereMesh: Any = js.native
    
    /** @hidden */
    /* protected */ var _impostors: js.Array[Nullable[PhysicsImpostor]] = js.native
    
    /** @hidden */
    /* protected */ var _meshes: js.Array[Nullable[AbstractMesh]] = js.native
    
    /** @hidden */
    /* protected */ var _numMeshes: Double = js.native
    
    /** @hidden */
    /* protected */ var _physicsEnginePlugin: Nullable[IPhysicsEnginePlugin] = js.native
    
    /* private */ var _renderFunction: Any = js.native
    
    /** @hidden */
    /* protected */ var _scene: Nullable[Scene] = js.native
    
    /** @hidden */
    /* protected */ def _updateDebugMeshes(): Unit = js.native
    
    /* private */ var _utilityLayer: Any = js.native
    
    /** Releases all resources */
    def dispose(): Unit = js.native
    
    /**
      * Hides a specified physic impostor
      * @param impostor defines the impostor to hide
      */
    def hideImpostor(impostor: Nullable[PhysicsImpostor]): Unit = js.native
    
    /**
      * Renders a specified physic impostor
      * @param impostor defines the impostor to render
      * @param targetMesh defines the mesh represented by the impostor
      * @returns the new debug mesh used to render the impostor
      */
    def showImpostor(impostor: PhysicsImpostor): Nullable[AbstractMesh] = js.native
    def showImpostor(impostor: PhysicsImpostor, targetMesh: Mesh): Nullable[AbstractMesh] = js.native
  }
}
