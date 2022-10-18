package typings.blackEngine

import typings.blackEngine.geomCircleMod.Circle
import typings.blackEngine.geomRectangleMod.Rectangle
import typings.blackEngine.geomVectorMod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomPolygonMod {
  
  @JSImport("black-engine/geom/Polygon", "Polygon")
  @js.native
  open class Polygon () extends StObject {
    def this(vertices: js.Array[Vector]) = this()
    
    def center: Vector = js.native
    
    def collide(polygon: Polygon): Boolean = js.native
    
    def collideCircle(circle: Circle): Boolean = js.native
    
    def collideRectangle(rectangle: Rectangle): Boolean = js.native
    
    def contains(vector: Vector): Boolean = js.native
    
    def containsXY(x: Double, y: Double): Boolean = js.native
    
    def copyFrom(polygon: Polygon): Polygon = js.native
    
    def copyTo(polygon: Polygon): Polygon = js.native
    
    def height: Double = js.native
    
    /* private */ var mBounds: Any = js.native
    
    /* private */ var mCenter: Any = js.native
    
    /* private */ var mLines: Any = js.native
    
    /* private */ var mVertices: Any = js.native
    
    def overlap(polygon: Polygon): Boolean = js.native
    
    def overlapCircle(circle: Circle): Boolean = js.native
    
    def overlapRectangle(rectangle: Rectangle): Boolean = js.native
    
    def perimeter: Double = js.native
    
    def refresh(): Polygon = js.native
    
    def refreshBounds(): Polygon = js.native
    
    def refreshCenter(): Polygon = js.native
    
    def refreshLines(): Polygon = js.native
    
    def set(vertices: js.Array[Vector]): Polygon = js.native
    
    def setRotation(rotation: Double): Polygon = js.native
    
    def setTranslation(point: Vector): Polygon = js.native
    
    def toString(digits: Double): String = js.native
    
    def vertices: js.Array[Vector] = js.native
    
    def width: Double = js.native
  }
  /* static members */
  object Polygon {
    
    @JSImport("black-engine/geom/Polygon", "Polygon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("black-engine/geom/Polygon", "Polygon.__cache")
    @js.native
    val cache: Polygon = js.native
    
    inline def fromPath(path: String): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPath")(path.asInstanceOf[js.Any]).asInstanceOf[Polygon]
  }
}
