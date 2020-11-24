package typings.babylonjs

import typings.babylonjs.mathPathMod.Path2
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.meshVertexDataMod.VertexData
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/polygonMesh", JSImport.Namespace)
@js.native
object polygonMeshMod extends js.Object {
  
  @js.native
  class Polygon () extends js.Object
  /* static members */
  @js.native
  object Polygon extends js.Object {
    
    /**
      * Creates a circle
      * @param radius radius of circle
      * @param cx scale in x
      * @param cy scale in y
      * @param numberOfSides number of sides that make up the circle
      * @returns points that make the resulting circle
      */
    def Circle(radius: Double): js.Array[Vector2] = js.native
    def Circle(
      radius: Double,
      cx: js.UndefOr[scala.Nothing],
      cy: js.UndefOr[scala.Nothing],
      numberOfSides: Double
    ): js.Array[Vector2] = js.native
    def Circle(radius: Double, cx: js.UndefOr[scala.Nothing], cy: Double): js.Array[Vector2] = js.native
    def Circle(radius: Double, cx: js.UndefOr[scala.Nothing], cy: Double, numberOfSides: Double): js.Array[Vector2] = js.native
    def Circle(radius: Double, cx: Double): js.Array[Vector2] = js.native
    def Circle(radius: Double, cx: Double, cy: js.UndefOr[scala.Nothing], numberOfSides: Double): js.Array[Vector2] = js.native
    def Circle(radius: Double, cx: Double, cy: Double): js.Array[Vector2] = js.native
    def Circle(radius: Double, cx: Double, cy: Double, numberOfSides: Double): js.Array[Vector2] = js.native
    
    /**
      * Creates a polygon from input string
      * @param input Input polygon data
      * @returns the parsed points
      */
    def Parse(input: String): js.Array[Vector2] = js.native
    
    /**
      * Creates a rectangle
      * @param xmin bottom X coord
      * @param ymin bottom Y coord
      * @param xmax top X coord
      * @param ymax top Y coord
      * @returns points that make the resulting rectation
      */
    def Rectangle(xmin: Double, ymin: Double, xmax: Double, ymax: Double): js.Array[Vector2] = js.native
    
    /**
      * Starts building a polygon from x and y coordinates
      * @param x x coordinate
      * @param y y coordinate
      * @returns the started path2
      */
    def StartingAt(x: Double, y: Double): Path2 = js.native
  }
  
  @js.native
  class PolygonMeshBuilder protected () extends js.Object {
    def this(name: String, contours: js.Any) = this()
    def this(name: String, contours: js.Array[Vector2]) = this()
    /**
      * Creates a PolygonMeshBuilder
      * @param name name of the builder
      * @param contours Path of the polygon
      * @param scene scene to add to when creating the mesh
      * @param earcutInjection can be used to inject your own earcut reference
      */
    def this(name: String, contours: Path2) = this()
    def this(name: String, contours: js.Any, scene: Scene) = this()
    def this(name: String, contours: js.Array[Vector2], scene: Scene) = this()
    def this(name: String, contours: Path2, scene: Scene) = this()
    def this(name: String, contours: js.Any, scene: js.UndefOr[scala.Nothing], earcutInjection: js.Any) = this()
    def this(name: String, contours: js.Any, scene: Scene, earcutInjection: js.Any) = this()
    def this(
      name: String,
      contours: js.Array[Vector2],
      scene: js.UndefOr[scala.Nothing],
      earcutInjection: js.Any
    ) = this()
    def this(name: String, contours: js.Array[Vector2], scene: Scene, earcutInjection: js.Any) = this()
    def this(name: String, contours: Path2, scene: js.UndefOr[scala.Nothing], earcutInjection: js.Any) = this()
    def this(name: String, contours: Path2, scene: Scene, earcutInjection: js.Any) = this()
    
    var _addToepoint: js.Any = js.native
    
    var _eholes: js.Any = js.native
    
    var _epoints: js.Any = js.native
    
    var _holes: js.Any = js.native
    
    var _name: js.Any = js.native
    
    var _outlinepoints: js.Any = js.native
    
    var _points: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    /**
      * Adds a whole within the polygon
      * @param hole Array of points defining the hole
      * @returns this
      */
    def addHole(hole: js.Array[Vector2]): PolygonMeshBuilder = js.native
    
    /**
      * Adds a side to the polygon
      * @param positions points that make the polygon
      * @param normals normals of the polygon
      * @param uvs uvs of the polygon
      * @param indices indices of the polygon
      * @param bounds bounds of the polygon
      * @param points points of the polygon
      * @param depth depth of the polygon
      * @param flip flip of the polygon
      */
    var addSide: js.Any = js.native
    
    /**
      * Babylon reference to the earcut plugin.
      */
    var bjsEarcut: js.Any = js.native
    
    /**
      * Creates the polygon
      * @param updatable If the mesh should be updatable
      * @param depth The depth of the mesh created
      * @returns the created mesh
      */
    def build(): Mesh = js.native
    def build(updatable: js.UndefOr[scala.Nothing], depth: Double): Mesh = js.native
    def build(updatable: Boolean): Mesh = js.native
    def build(updatable: Boolean, depth: Double): Mesh = js.native
    
    /**
      * Creates the polygon
      * @param depth The depth of the mesh created
      * @returns the created VertexData
      */
    def buildVertexData(): VertexData = js.native
    def buildVertexData(depth: Double): VertexData = js.native
  }
}
