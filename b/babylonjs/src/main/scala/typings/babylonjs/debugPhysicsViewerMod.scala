package typings.babylonjs

import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.physicsV1IphysicsenginepluginMod.IPhysicsEnginePlugin
import typings.babylonjs.physicsV1PhysicsImpostorMod.PhysicsImpostor
import typings.babylonjs.physicsV2IphysicsenginepluginMod.IPhysicsEnginePluginV2
import typings.babylonjs.physicsV2PhysicsBodyMod.PhysicsBody
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugPhysicsViewerMod {
  
  @JSImport("babylonjs/Debug/physicsViewer", "PhysicsViewer")
  @js.native
  /**
    * Creates a new PhysicsViewer
    * @param scene defines the hosting scene
    */
  open class PhysicsViewer () extends StObject {
    def this(scene: Scene) = this()
    
    /** @internal */
    /* protected */ var _bodies: js.Array[Nullable[PhysicsBody]] = js.native
    
    /** @internal */
    /* protected */ var _bodyMeshes: js.Array[Nullable[AbstractMesh]] = js.native
    
    /* private */ var _debugBoxMesh: Any = js.native
    
    /* private */ var _debugCapsuleMesh: Any = js.native
    
    /* private */ var _debugCylinderMesh: Any = js.native
    
    /* private */ var _debugMaterial: Any = js.native
    
    /* private */ var _debugMeshMeshes: Any = js.native
    
    /* private */ var _debugSphereMesh: Any = js.native
    
    /**
      * Creates a debug mesh for a given physics body
      * @param body The physics body to create the debug mesh for
      * @returns The created debug mesh or null if the utility layer is not available
      *
      * This code is useful for creating a debug mesh for a given physics body.
      * It creates a Mesh object with a VertexData object containing the positions and indices
      * of the geometry of the body. The mesh is then assigned a debug material from the utility layer scene.
      * This allows for visualizing the physics body in the scene.
      */
    /* private */ var _getDebugBodyMesh: Any = js.native
    
    /* private */ var _getDebugBoxMesh: Any = js.native
    
    /* private */ var _getDebugCapsuleMesh: Any = js.native
    
    /* private */ var _getDebugCylinderMesh: Any = js.native
    
    /* private */ var _getDebugMaterial: Any = js.native
    
    /* private */ var _getDebugMesh: Any = js.native
    
    /* private */ var _getDebugMeshMesh: Any = js.native
    
    /* private */ var _getDebugSphereMesh: Any = js.native
    
    /** @internal */
    /* protected */ var _impostors: js.Array[Nullable[PhysicsImpostor]] = js.native
    
    /** @internal */
    /* protected */ var _meshes: js.Array[Nullable[AbstractMesh]] = js.native
    
    /** @internal */
    /* protected */ var _numBodies: Double = js.native
    
    /** @internal */
    /* protected */ var _numMeshes: Double = js.native
    
    /** @internal */
    /* protected */ var _physicsEnginePlugin: IPhysicsEnginePlugin | IPhysicsEnginePluginV2 | Null = js.native
    
    /* private */ var _renderFunction: Any = js.native
    
    /** @internal */
    /* protected */ var _scene: Nullable[Scene] = js.native
    
    /**
      * Updates the debug meshes of the physics engine.
      *
      * This code is useful for synchronizing the debug meshes of the physics engine with the physics impostor and mesh.
      * It checks if the impostor is disposed and if the plugin version is 1, then it syncs the mesh with the impostor.
      * This ensures that the debug meshes are up to date with the physics engine.
      */
    /* protected */ def _updateDebugMeshes(): Unit = js.native
    
    /**
      * Updates the debug meshes of the physics engine.
      *
      * This method is useful for synchronizing the debug meshes with the physics impostors.
      * It iterates through the impostors and meshes, and if the plugin version is 1, it syncs the mesh with the impostor.
      * This ensures that the debug meshes accurately reflect the physics impostors, which is important for debugging the physics engine.
      */
    /* protected */ def _updateDebugMeshesV1(): Unit = js.native
    
    /**
      * Updates the debug meshes of the physics engine for V2 plugin.
      *
      * This method is useful for synchronizing the debug meshes of the physics engine with the current state of the bodies.
      * It iterates through the bodies array and updates the debug meshes with the current transform of each body.
      * This ensures that the debug meshes accurately reflect the current state of the physics engine.
      */
    /* protected */ def _updateDebugMeshesV2(): Unit = js.native
    
    /* private */ var _utilityLayer: Any = js.native
    
    /**
      * Clean up physics debug display
      */
    def dispose(): Unit = js.native
    
    /**
      * Hides a body from the physics engine.
      * @param body - The body to hide.
      *
      * This function is useful for hiding a body from the physics engine.
      * It removes the body from the utility layer scene and disposes the mesh associated with it.
      * It also unregisters the render function if the number of bodies is 0.
      * This is useful for hiding a body from the physics engine without deleting it.
      */
    def hideBody(body: Nullable[PhysicsBody]): Unit = js.native
    
    /**
      * Hides an impostor from the scene.
      * @param impostor - The impostor to hide.
      *
      * This method is useful for hiding an impostor from the scene. It removes the
      * impostor from the utility layer scene, disposes the mesh, and removes the
      * impostor from the list of impostors. If the impostor is the last one in the
      * list, it also unregisters the render function.
      */
    def hideImpostor(impostor: Nullable[PhysicsImpostor]): Unit = js.native
    
    /**
      * Shows a debug mesh for a given physics body.
      * @param body The physics body to show.
      * @returns The debug mesh, or null if the body is already shown.
      *
      * This function is useful for visualizing the physics body in the scene.
      * It creates a debug mesh for the given body and adds it to the scene.
      * It also registers a before render function to update the debug mesh position and rotation.
      */
    def showBody(body: PhysicsBody): Nullable[AbstractMesh] = js.native
    
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
