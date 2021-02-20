package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.Data
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.typesMod.IndicesArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instancedMeshMod {
  
  @JSImport("babylonjs/Meshes/instancedMesh", "InstancedMesh")
  @js.native
  class InstancedMesh protected () extends AbstractMesh {
    def this(name: String, source: Mesh) = this()
    
    var _currentLOD: js.Any = js.native
    
    /** @hidden */
    var _indexInSourceMeshInstanceArray: Double = js.native
    
    var _sourceMesh: js.Any = js.native
    
    /** @hidden */
    def _syncSubMeshes(): InstancedMesh = js.native
    
    /**
      * Creates a new InstancedMesh from the current mesh.
      * - name (string) : the cloned mesh name
      * - newParent (optional Node) : the optional Node to parent the clone to.
      * - doNotCloneChildren (optional boolean, default `false`) : if `true` the model children aren't cloned.
      *
      * Returns the clone.
      */
    def clone(name: String): InstancedMesh = js.native
    
    /**
      * Creates a new InstancedMesh object from the mesh model.
      * @see https://doc.babylonjs.com/how_to/how_to_use_instances
      * @param name defines the name of the new instance
      * @returns a new InstancedMesh
      */
    def createInstance(name: String): InstancedMesh = js.native
    
    /**
      * Sets the mesh indices.
      * Expects an array populated with integers or a typed array (Int32Array, Uint32Array, Uint16Array).
      * If the mesh has no geometry, a new Geometry object is created and set to the mesh.
      * This method creates a new index buffer each call.
      * Returns the Mesh.
      */
    def setIndices(indices: IndicesArray): Mesh = js.native
    
    /**
      * The source mesh of the instance
      */
    def sourceMesh: Mesh = js.native
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    @js.native
    trait AbstractMesh extends StObject {
      
      /**
        * Object used to store instanced buffers defined by user
        * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
        */
      var instancedBuffers: StringDictionary[js.Any] = js.native
    }
    object AbstractMesh {
      
      @scala.inline
      def apply(instancedBuffers: StringDictionary[js.Any]): typings.babylonjs.instancedMeshMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = {
        val __obj = js.Dynamic.literal(instancedBuffers = instancedBuffers.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babylonjs.instancedMeshMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh]
      }
      
      @scala.inline
      implicit class AbstractMeshMutableBuilder[Self <: typings.babylonjs.instancedMeshMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInstancedBuffers(value: StringDictionary[js.Any]): Self = StObject.set(x, "instancedBuffers", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object babylonjsMeshesMeshAugmentingMod {
    
    @js.native
    trait Mesh extends StObject {
      
      /** @hidden */
      var _userInstancedBuffersStorage: Data = js.native
      
      /**
        * true to use the edge renderer for all instances of this mesh
        */
      var edgesShareWithInstances: Boolean = js.native
      
      /**
        * Register a custom buffer that will be instanced
        * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
        * @param kind defines the buffer kind
        * @param stride defines the stride in floats
        */
      def registerInstancedBuffer(kind: String, stride: Double): Unit = js.native
    }
    object Mesh {
      
      @scala.inline
      def apply(
        _userInstancedBuffersStorage: Data,
        edgesShareWithInstances: Boolean,
        registerInstancedBuffer: (String, Double) => Unit
      ): typings.babylonjs.instancedMeshMod.babylonjsMeshesMeshAugmentingMod.Mesh = {
        val __obj = js.Dynamic.literal(_userInstancedBuffersStorage = _userInstancedBuffersStorage.asInstanceOf[js.Any], edgesShareWithInstances = edgesShareWithInstances.asInstanceOf[js.Any], registerInstancedBuffer = js.Any.fromFunction2(registerInstancedBuffer))
        __obj.asInstanceOf[typings.babylonjs.instancedMeshMod.babylonjsMeshesMeshAugmentingMod.Mesh]
      }
      
      @scala.inline
      implicit class MeshMutableBuilder[Self <: typings.babylonjs.instancedMeshMod.babylonjsMeshesMeshAugmentingMod.Mesh] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEdgesShareWithInstances(value: Boolean): Self = StObject.set(x, "edgesShareWithInstances", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegisterInstancedBuffer(value: (String, Double) => Unit): Self = StObject.set(x, "registerInstancedBuffer", js.Any.fromFunction2(value))
        
        @scala.inline
        def set_userInstancedBuffersStorage(value: Data): Self = StObject.set(x, "_userInstancedBuffersStorage", value.asInstanceOf[js.Any])
      }
    }
  }
}
