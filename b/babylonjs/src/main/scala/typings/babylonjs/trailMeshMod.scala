package typings.babylonjs

import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.transformNodeMod.TransformNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    def this(name: String, generator: TransformNode, scene: Scene, diameter: Double, length: Double) = this()
    def this(name: String, generator: TransformNode, scene: Scene, diameter: Unit, length: Double) = this()
    def this(
      name: String,
      generator: TransformNode,
      scene: Scene,
      diameter: Double,
      length: Double,
      autoStart: Boolean
    ) = this()
    def this(
      name: String,
      generator: TransformNode,
      scene: Scene,
      diameter: Double,
      length: Unit,
      autoStart: Boolean
    ) = this()
    def this(
      name: String,
      generator: TransformNode,
      scene: Scene,
      diameter: Unit,
      length: Double,
      autoStart: Boolean
    ) = this()
    def this(
      name: String,
      generator: TransformNode,
      scene: Scene,
      diameter: Unit,
      length: Unit,
      autoStart: Boolean
    ) = this()
    
    /* private */ var _autoStart: js.Any = js.native
    
    /* private */ var _beforeRenderObserver: js.Any = js.native
    
    /* private */ var _createMesh: js.Any = js.native
    
    /* private */ var _diameter: js.Any = js.native
    
    /* private */ var _generator: js.Any = js.native
    
    /* private */ var _length: js.Any = js.native
    
    /* private */ var _running: js.Any = js.native
    
    /* private */ var _sectionNormalVectors: js.Any = js.native
    
    /* private */ var _sectionPolygonPointsCount: js.Any = js.native
    
    /* private */ var _sectionVectors: js.Any = js.native
    
    /**
      * Returns a new TrailMesh object.
      * @param name is a string, the name given to the new mesh
      * @param newGenerator use new generator object for cloned trail mesh
      * @returns a new mesh
      */
    def clone(name: String, newGenerator: TransformNode): TrailMesh = js.native
    def clone(name: Unit, newGenerator: TransformNode): TrailMesh = js.native
    
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
    
    @JSImport("babylonjs/Meshes/trailMesh", "TrailMesh")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses a serialized trail mesh
      * @param parsedMesh the serialized mesh
      * @param scene the scene to create the trail mesh in
      * @returns the created trail mesh
      */
    inline def Parse(parsedMesh: js.Any, scene: Scene): TrailMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[TrailMesh]
  }
}
