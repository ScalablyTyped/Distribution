package typings.babylonjs

import typings.babylonjs.materialsMaterialMod.Material
import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.meshesInstancedMeshMod.InstancedMesh
import typings.babylonjs.meshesMeshMod.Mesh
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
  open class LinesMesh protected () extends Mesh {
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
    
    /* private */ var _isShaderMaterial: Any = js.native
    
    /* private */ var _lineMaterial: Any = js.native
    
    /**
      * Alpha of the line (Default: 1)
      */
    var alpha: Double = js.native
    
    /**
      * Color of the line (Default: White)
      */
    var color: Color3 = js.native
    
    /**
      * The intersection Threshold is the margin applied when intersection a segment of the LinesMesh with a Ray.
      * This margin is expressed in world space coordinates, so its value may vary.
      * Default value is 0.1
      */
    var intersectionThreshold: Double = js.native
    
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
