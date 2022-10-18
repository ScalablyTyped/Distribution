package typings.babylonjs

import typings.babylonjs.mathsMathDotpathMod.Path2
import typings.babylonjs.mathsMathDotvectorMod.Vector2
import typings.babylonjs.meshesMeshDotvertexDataMod.VertexData
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesPolygonMeshMod {
  
  @JSImport("babylonjs/Meshes/polygonMesh", "Polygon")
  @js.native
  open class Polygon () extends StObject
  /* static members */
  object Polygon {
    
    @JSImport("babylonjs/Meshes/polygonMesh", "Polygon")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a circle
      * @param radius radius of circle
      * @param cx scale in x
      * @param cy scale in y
      * @param numberOfSides number of sides that make up the circle
      * @returns points that make the resulting circle
      */
    inline def Circle(radius: Double): js.Array[Vector2] = ^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(radius.asInstanceOf[js.Any]).asInstanceOf[js.Array[Vector2]]
    inline def Circle(radius: Double, cx: Double): js.Array[Vector2] = (^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(radius.asInstanceOf[js.Any], cx.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector2]]
    inline def Circle(radius: Double, cx: Double, cy: Double): js.Array[Vector2] = (^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(radius.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector2]]
    inline def Circle(radius: Double, cx: Double, cy: Double, numberOfSides: Double): js.Array[Vector2] = (^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(radius.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], numberOfSides.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector2]]
    inline def Circle(radius: Double, cx: Double, cy: Unit, numberOfSides: Double): js.Array[Vector2] = (^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(radius.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], numberOfSides.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector2]]
    inline def Circle(radius: Double, cx: Unit, cy: Double): js.Array[Vector2] = (^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(radius.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector2]]
    inline def Circle(radius: Double, cx: Unit, cy: Double, numberOfSides: Double): js.Array[Vector2] = (^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(radius.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], numberOfSides.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector2]]
    inline def Circle(radius: Double, cx: Unit, cy: Unit, numberOfSides: Double): js.Array[Vector2] = (^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(radius.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], numberOfSides.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector2]]
    
    /**
      * Creates a polygon from input string
      * @param input Input polygon data
      * @returns the parsed points
      */
    inline def Parse(input: String): js.Array[Vector2] = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Vector2]]
    
    /**
      * Creates a rectangle
      * @param xmin bottom X coord
      * @param ymin bottom Y coord
      * @param xmax top X coord
      * @param ymax top Y coord
      * @returns points that make the resulting rectangle
      */
    inline def Rectangle(xmin: Double, ymin: Double, xmax: Double, ymax: Double): js.Array[Vector2] = (^.asInstanceOf[js.Dynamic].applyDynamic("Rectangle")(xmin.asInstanceOf[js.Any], ymin.asInstanceOf[js.Any], xmax.asInstanceOf[js.Any], ymax.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector2]]
    
    /**
      * Starts building a polygon from x and y coordinates
      * @param x x coordinate
      * @param y y coordinate
      * @returns the started path2
      */
    inline def StartingAt(x: Double, y: Double): Path2 = (^.asInstanceOf[js.Dynamic].applyDynamic("StartingAt")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Path2]
  }
  
  @JSImport("babylonjs/Meshes/polygonMesh", "PolygonMeshBuilder")
  @js.native
  open class PolygonMeshBuilder protected () extends StObject {
    def this(name: String, contours: js.Array[Vector2]) = this()
    def this(name: String, contours: Any) = this()
    /**
      * Creates a PolygonMeshBuilder
      * @param name name of the builder
      * @param contours Path of the polygon
      * @param scene scene to add to when creating the mesh
      * @param earcutInjection can be used to inject your own earcut reference
      */
    def this(name: String, contours: Path2) = this()
    def this(name: String, contours: js.Array[Vector2], scene: Scene) = this()
    def this(name: String, contours: Any, scene: Scene) = this()
    def this(name: String, contours: Path2, scene: Scene) = this()
    def this(name: String, contours: js.Array[Vector2], scene: Unit, earcutInjection: Any) = this()
    def this(name: String, contours: js.Array[Vector2], scene: Scene, earcutInjection: Any) = this()
    def this(name: String, contours: Any, scene: Unit, earcutInjection: Any) = this()
    def this(name: String, contours: Any, scene: Scene, earcutInjection: Any) = this()
    def this(name: String, contours: Path2, scene: Unit, earcutInjection: Any) = this()
    def this(name: String, contours: Path2, scene: Scene, earcutInjection: Any) = this()
    
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
      * @param smoothingThreshold
      */
    /* private */ var _addSide: Any = js.native
    
    /* private */ var _addToepoint: Any = js.native
    
    /* private */ var _eholes: Any = js.native
    
    /* private */ var _epoints: Any = js.native
    
    /* private */ var _holes: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    /* private */ var _outlinepoints: Any = js.native
    
    /* private */ var _points: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /**
      * Adds a hole within the polygon
      * @param hole Array of points defining the hole
      * @returns this
      */
    def addHole(hole: js.Array[Vector2]): PolygonMeshBuilder = js.native
    
    /**
      * Babylon reference to the earcut plugin.
      */
    var bjsEarcut: Any = js.native
    
    /**
      * Creates the polygon
      * @param updatable If the mesh should be updatable
      * @param depth The depth of the mesh created
      * @param smoothingThreshold Dot product threshold for smoothed normals
      * @returns the created mesh
      */
    def build(): Mesh = js.native
    def build(updatable: Boolean): Mesh = js.native
    def build(updatable: Boolean, depth: Double): Mesh = js.native
    def build(updatable: Boolean, depth: Double, smoothingThreshold: Double): Mesh = js.native
    def build(updatable: Boolean, depth: Unit, smoothingThreshold: Double): Mesh = js.native
    def build(updatable: Unit, depth: Double): Mesh = js.native
    def build(updatable: Unit, depth: Double, smoothingThreshold: Double): Mesh = js.native
    def build(updatable: Unit, depth: Unit, smoothingThreshold: Double): Mesh = js.native
    
    /**
      * Creates the polygon
      * @param depth The depth of the mesh created
      * @param smoothingThreshold Dot product threshold for smoothed normals
      * @returns the created VertexData
      */
    def buildVertexData(): VertexData = js.native
    def buildVertexData(depth: Double): VertexData = js.native
    def buildVertexData(depth: Double, smoothingThreshold: Double): VertexData = js.native
    def buildVertexData(depth: Unit, smoothingThreshold: Double): VertexData = js.native
  }
}
