package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.Data
import typings.babylonjs.anon.NewSourcedMesh
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesInstancedMeshMod {
  
  @JSImport("babylonjs/Meshes/instancedMesh", "InstancedMesh")
  @js.native
  open class InstancedMesh protected () extends AbstractMesh {
    def this(name: String, source: Mesh) = this()
    
    /* private */ var _billboardWorldMatrix: Any = js.native
    
    /* private */ var _currentLOD: Any = js.native
    
    /** @internal */
    var _distanceToCamera: Double = js.native
    
    /** @internal */
    var _indexInSourceMeshInstanceArray: Double = js.native
    
    /** @internal */
    var _previousWorldMatrix: Nullable[Matrix] = js.native
    
    def _removeLightSource(): Unit = js.native
    
    def _resyncLightSource(): Unit = js.native
    
    /* private */ var _sourceMesh: Any = js.native
    
    /** @internal */
    def _syncSubMeshes(): InstancedMesh = js.native
    
    /**
      * Creates a new InstancedMesh from the current mesh.
      *
      * Returns the clone.
      * @param name the cloned mesh name
      * @param newParent the optional Node to parent the clone to.
      * @param doNotCloneChildren if `true` the model children aren't cloned.
      * @param newSourceMesh if set this mesh will be used as the source mesh instead of ths instance's one
      * @returns the clone
      */
    def clone(name: String): InstancedMesh = js.native
    def clone(name: String, newParent: Unit, doNotCloneChildren: Boolean): InstancedMesh = js.native
    def clone(name: String, newParent: Unit, doNotCloneChildren: Boolean, newSourceMesh: Mesh): InstancedMesh = js.native
    def clone(name: String, newParent: Unit, doNotCloneChildren: Unit, newSourceMesh: Mesh): InstancedMesh = js.native
    def clone(name: String, newParent: Nullable[Node], doNotCloneChildren: Boolean, newSourceMesh: Mesh): InstancedMesh = js.native
    def clone(name: String, newParent: Nullable[Node], doNotCloneChildren: Unit, newSourceMesh: Mesh): InstancedMesh = js.native
    
    /**
      * Creates a new InstancedMesh object from the mesh model.
      * @see https://doc.babylonjs.com/how_to/how_to_use_instances
      * @param name defines the name of the new instance
      * @returns a new InstancedMesh
      */
    def createInstance(name: String): InstancedMesh = js.native
    
    def instantiateHierarchy(newParent: Unit, options: NewSourcedMesh): Nullable[TransformNode] = js.native
    def instantiateHierarchy(
      newParent: Unit,
      options: NewSourcedMesh,
      onNewNodeCreated: js.Function2[/* source */ TransformNode, /* clone */ TransformNode, Unit]
    ): Nullable[TransformNode] = js.native
    def instantiateHierarchy(newParent: Nullable[TransformNode], options: NewSourcedMesh): Nullable[TransformNode] = js.native
    def instantiateHierarchy(
      newParent: Nullable[TransformNode],
      options: NewSourcedMesh,
      onNewNodeCreated: js.Function2[/* source */ TransformNode, /* clone */ TransformNode, Unit]
    ): Nullable[TransformNode] = js.native
    
    /**
      * Sets the mesh indices.
      * Expects an array populated with integers or a typed array (Int32Array, Uint32Array, Uint16Array).
      * If the mesh has no geometry, a new Geometry object is created and set to the mesh.
      * This method creates a new index buffer each call.
      * Returns the Mesh.
      * @param indices
      * @param totalVertices
      */
    def setIndices(indices: IndicesArray): Mesh = js.native
    
    /**
      * The source mesh of the instance
      */
    def sourceMesh: Mesh = js.native
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    trait AbstractMesh extends StObject {
      
      /**
        * Object used to store instanced buffers defined by user
        * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
        */
      var instancedBuffers: StringDictionary[Any]
    }
    object AbstractMesh {
      
      inline def apply(instancedBuffers: StringDictionary[Any]): typings.babylonjs.meshesInstancedMeshMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = {
        val __obj = js.Dynamic.literal(instancedBuffers = instancedBuffers.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babylonjs.meshesInstancedMeshMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.babylonjs.meshesInstancedMeshMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh] (val x: Self) extends AnyVal {
        
        inline def setInstancedBuffers(value: StringDictionary[Any]): Self = StObject.set(x, "instancedBuffers", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object babylonjsMeshesMeshAugmentingMod {
    
    trait Mesh extends StObject {
      
      /**
        * Invalidate VertexArrayObjects belonging to the mesh (but not to the Geometry of the mesh).
        */
      def _invalidateInstanceVertexArrayObject(): Unit
      
      /** @internal */
      var _userInstancedBuffersStorage: Data
      
      /**
        * true to use the edge renderer for all instances of this mesh
        */
      var edgesShareWithInstances: Boolean
      
      /**
        * Register a custom buffer that will be instanced
        * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
        * @param kind defines the buffer kind
        * @param stride defines the stride in floats
        */
      def registerInstancedBuffer(kind: String, stride: Double): Unit
    }
    object Mesh {
      
      inline def apply(
        _invalidateInstanceVertexArrayObject: () => Unit,
        _userInstancedBuffersStorage: Data,
        edgesShareWithInstances: Boolean,
        registerInstancedBuffer: (String, Double) => Unit
      ): typings.babylonjs.meshesInstancedMeshMod.babylonjsMeshesMeshAugmentingMod.Mesh = {
        val __obj = js.Dynamic.literal(_invalidateInstanceVertexArrayObject = js.Any.fromFunction0(_invalidateInstanceVertexArrayObject), _userInstancedBuffersStorage = _userInstancedBuffersStorage.asInstanceOf[js.Any], edgesShareWithInstances = edgesShareWithInstances.asInstanceOf[js.Any], registerInstancedBuffer = js.Any.fromFunction2(registerInstancedBuffer))
        __obj.asInstanceOf[typings.babylonjs.meshesInstancedMeshMod.babylonjsMeshesMeshAugmentingMod.Mesh]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.babylonjs.meshesInstancedMeshMod.babylonjsMeshesMeshAugmentingMod.Mesh] (val x: Self) extends AnyVal {
        
        inline def setEdgesShareWithInstances(value: Boolean): Self = StObject.set(x, "edgesShareWithInstances", value.asInstanceOf[js.Any])
        
        inline def setRegisterInstancedBuffer(value: (String, Double) => Unit): Self = StObject.set(x, "registerInstancedBuffer", js.Any.fromFunction2(value))
        
        inline def set_invalidateInstanceVertexArrayObject(value: () => Unit): Self = StObject.set(x, "_invalidateInstanceVertexArrayObject", js.Any.fromFunction0(value))
        
        inline def set_userInstancedBuffersStorage(value: Data): Self = StObject.set(x, "_userInstancedBuffersStorage", value.asInstanceOf[js.Any])
      }
    }
  }
}
