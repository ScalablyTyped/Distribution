package typings.babylonjs

import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.transformNodeMod.TransformNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trailMeshMod {
  
  @JSImport("babylonjs/Meshes/trailMesh", "TrailMesh")
  @js.native
  class TrailMesh protected () extends Mesh {
    /**
      * @constructor
      * @param name The value used by scene.getMeshByName() to do a lookup.
      * @param generator The mesh or transform node to generate a trail.
      * @param scene The scene to add this mesh to.
      * @param diameter Diameter of trailing mesh. Default is 1.
      * @param length Length of trailing mesh. Default is 60.
      * @param autoStart Automatically start trailing mesh. Default true.
      */
    def this(name: String, generator: TransformNode, scene: Scene) = this()
    def this(name: String, generator: TransformNode, scene: Scene, diameter: Double) = this()
    def this(
      name: String,
      generator: TransformNode,
      scene: Scene,
      diameter: js.UndefOr[scala.Nothing],
      length: Double
    ) = this()
    def this(name: String, generator: TransformNode, scene: Scene, diameter: Double, length: Double) = this()
    def this(
      name: String,
      generator: TransformNode,
      scene: Scene,
      diameter: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      autoStart: Boolean
    ) = this()
    def this(
      name: String,
      generator: TransformNode,
      scene: Scene,
      diameter: js.UndefOr[scala.Nothing],
      length: Double,
      autoStart: Boolean
    ) = this()
    def this(
      name: String,
      generator: TransformNode,
      scene: Scene,
      diameter: Double,
      length: js.UndefOr[scala.Nothing],
      autoStart: Boolean
    ) = this()
    def this(
      name: String,
      generator: TransformNode,
      scene: Scene,
      diameter: Double,
      length: Double,
      autoStart: Boolean
    ) = this()
    
    var _autoStart: js.Any = js.native
    
    var _beforeRenderObserver: js.Any = js.native
    
    var _createMesh: js.Any = js.native
    
    var _diameter: js.Any = js.native
    
    var _generator: js.Any = js.native
    
    var _length: js.Any = js.native
    
    var _running: js.Any = js.native
    
    var _sectionNormalVectors: js.Any = js.native
    
    var _sectionPolygonPointsCount: js.Any = js.native
    
    var _sectionVectors: js.Any = js.native
    
    def clone(name: js.UndefOr[scala.Nothing], newGenerator: TransformNode): TrailMesh = js.native
    /**
      * Returns a new TrailMesh object.
      * @param name is a string, the name given to the new mesh
      * @param newGenerator use new generator object for cloned trail mesh
      * @returns a new mesh
      */
    def clone(name: String, newGenerator: TransformNode): TrailMesh = js.native
    
    /**
      * Start trailing mesh.
      */
    def start(): Unit = js.native
    
    /**
      * Stop trailing mesh.
      */
    def stop(): Unit = js.native
    
    /**
      * Update trailing mesh geometry.
      */
    def update(): Unit = js.native
  }
  /* static members */
  object TrailMesh {
    
    /**
      * Parses a serialized trail mesh
      * @param parsedMesh the serialized mesh
      * @param scene the scene to create the trail mesh in
      * @returns the created trail mesh
      */
    @JSImport("babylonjs/Meshes/trailMesh", "TrailMesh.Parse")
    @js.native
    def Parse(parsedMesh: js.Any, scene: Scene): TrailMesh = js.native
  }
}
