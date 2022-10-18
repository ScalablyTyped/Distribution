package typings.babylonjs

import typings.babylonjs.materialsMaterialMod.Material
import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesInstancedMeshMod.InstancedMesh
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesLinesMeshMod {
  
  @JSImport("babylonjs/Meshes/linesMesh", "InstancedLinesMesh")
  @js.native
  open class InstancedLinesMesh protected () extends InstancedMesh {
    def this(name: String, source: LinesMesh) = this()
    
    /**
      * The intersection Threshold is the margin applied when intersection a segment of the LinesMesh with a Ray.
      * This margin is expressed in world space coordinates, so its value may vary.
      * Initialized with the intersectionThreshold value of the source LinesMesh
      */
    var intersectionThreshold: Double = js.native
  }
  
  @JSImport("babylonjs/Meshes/linesMesh", "LinesMesh")
  @js.native
  open class LinesMesh protected ()
    extends StObject
       with Mesh {
    /**
      * Creates a new LinesMesh
      * @param name defines the name
      * @param scene defines the hosting scene
      * @param parent defines the parent mesh if any
      * @param source defines the optional source LinesMesh used to clone data from
      * @param doNotCloneChildren When cloning, skip cloning child meshes of source, default False.
      * When false, achieved by calling a clone(), also passing False.
      * This will make creation of children, recursive.
      * @param useVertexColor defines if this LinesMesh supports vertex color
      * @param useVertexAlpha defines if this LinesMesh supports vertex alpha
      * @param material material to use to draw the line. If not provided, will create a new one
      */
    def this(
      name: String,
      scene: js.UndefOr[Nullable[Scene]],
      parent: js.UndefOr[Nullable[Node]],
      source: js.UndefOr[Nullable[LinesMesh]],
      doNotCloneChildren: js.UndefOr[Boolean],
      /**
      * If vertex color should be applied to the mesh
      */
    useVertexColor: js.UndefOr[Boolean],
      /**
      * If vertex alpha should be applied to the mesh
      */
    useVertexAlpha: js.UndefOr[Boolean],
      material: js.UndefOr[Material]
    ) = this()
    
    /**
      * @internal
      */
    def _bind(): Mesh = js.native
    
    /* private */ var _color4: Any = js.native
    
    /**
      * @internal
      */
    def _draw(subMesh: SubMesh, fillMode: Double): Mesh = js.native
    def _draw(subMesh: SubMesh, fillMode: Double, instancesCount: Double): Mesh = js.native
    
    /* private */ var _isShaderMaterial: Any = js.native
    
    /* private */ var _lineMaterial: Any = js.native
    
    /**
      * Alpha of the line (Default: 1)
      */
    var alpha: Double = js.native
    
    /**
      * @internal
      */
    def checkCollisions: Boolean = js.native
    def checkCollisions_=(value: Boolean): Unit = js.native
    
    /**
      * Returns a new LineMesh object cloned from the current one.
      * @param name
      * @param newParent
      * @param doNotCloneChildren
      */
    def clone(name: String): LinesMesh = js.native
    def clone(name: String, newParent: Unit, doNotCloneChildren: Boolean): LinesMesh = js.native
    def clone(name: String, newParent: Nullable[Node]): LinesMesh = js.native
    def clone(name: String, newParent: Nullable[Node], doNotCloneChildren: Boolean): LinesMesh = js.native
    
    /**
      * Color of the line (Default: White)
      */
    var color: Color3 = js.native
    
    /**
      * Creates a new InstancedLinesMesh object from the mesh model.
      * @see https://doc.babylonjs.com/divingDeeper/mesh/copies/instances
      * @param name defines the name of the new instance
      * @returns a new InstancedLinesMesh
      */
    def createInstance(name: String): InstancedLinesMesh = js.native
    
    /**
      * Disposes of the line mesh
      * @param doNotRecurse If children should be disposed
      */
    def dispose(): Unit = js.native
    def dispose(doNotRecurse: Boolean): Unit = js.native
    
    /**
      * Enables the edge rendering mode on the mesh.
      * This mode makes the mesh edges visible
      * @param epsilon defines the maximal distance between two angles to detect a face
      * @param checkVerticesInsteadOfIndices indicates that we should check vertex list directly instead of faces
      * @returns the currentAbstractMesh
      * @see https://www.babylonjs-playground.com/#19O9TU#0
      */
    def enableEdgesRendering(): AbstractMesh = js.native
    def enableEdgesRendering(epsilon: Double): AbstractMesh = js.native
    def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean): AbstractMesh = js.native
    def enableEdgesRendering(epsilon: Unit, checkVerticesInsteadOfIndices: Boolean): AbstractMesh = js.native
    
    /**
      * Returns the string "LineMesh"
      */
    def getClassName(): String = js.native
    
    /**
      * The intersection Threshold is the margin applied when intersection a segment of the LinesMesh with a Ray.
      * This margin is expressed in world space coordinates, so its value may vary.
      * Default value is 0.1
      */
    var intersectionThreshold: Double = js.native
    
    def isReady(): Boolean = js.native
    
    /**
      * @internal
      */
    def material: Material = js.native
    /**
      * @internal
      */
    def material_=(value: Material): Unit = js.native
    
    /**
      * Serializes this ground mesh
      * @param serializationObject object to write serialization to
      */
    def serialize(serializationObject: Any): Unit = js.native
    
    /**
      * If vertex alpha should be applied to the mesh
      */
    val useVertexAlpha: js.UndefOr[Boolean] = js.native
    
    /**
      * If vertex color should be applied to the mesh
      */
    val useVertexColor: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  object LinesMesh {
    
    @JSImport("babylonjs/Meshes/linesMesh", "LinesMesh")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses a serialized ground mesh
      * @param parsedMesh the serialized mesh
      * @param scene the scene to create the ground mesh in
      * @returns the created ground mesh
      */
    inline def Parse(parsedMesh: Any, scene: Scene): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
  }
}
