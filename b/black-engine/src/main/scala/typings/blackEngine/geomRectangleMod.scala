package typings.blackEngine

import typings.blackEngine.geomLineMod.Line
import typings.blackEngine.geomVectorMod.Vector
import typings.blackEngine.utilsObjectPoolMod.ObjectPool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomRectangleMod {
  
  @JSImport("black-engine/geom/Rectangle", "Rectangle")
  @js.native
  open class Rectangle () extends StObject {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, w: Double) = this()
    def this(x: Double, y: Unit, w: Double) = this()
    def this(x: Unit, y: Double, w: Double) = this()
    def this(x: Unit, y: Unit, w: Double) = this()
    def this(x: Double, y: Double, w: Double, h: Double) = this()
    def this(x: Double, y: Double, w: Unit, h: Double) = this()
    def this(x: Double, y: Unit, w: Double, h: Double) = this()
    def this(x: Double, y: Unit, w: Unit, h: Double) = this()
    def this(x: Unit, y: Double, w: Double, h: Double) = this()
    def this(x: Unit, y: Double, w: Unit, h: Double) = this()
    def this(x: Unit, y: Unit, w: Double, h: Double) = this()
    def this(x: Unit, y: Unit, w: Unit, h: Double) = this()
    
    def bottom: Double = js.native
    
    def bottomLeft: Vector = js.native
    def bottomLeft_=(arg: Vector): Unit = js.native
    
    def bottomRight: Vector = js.native
    def bottomRight_=(arg: Vector): Unit = js.native
    
    def bottom_=(arg: Double): Unit = js.native
    
    def center(): Vector = js.native
    def center(outVector: Vector): Vector = js.native
    
    def contains(rect: Rectangle): Boolean = js.native
    
    def containsXY(x: Double, y: Double): Boolean = js.native
    
    def copyFrom(rect: Rectangle): Rectangle = js.native
    
    def copyTo(rect: Rectangle): Rectangle = js.native
    
    def equals(rect: Rectangle): Boolean = js.native
    def equals(rect: Rectangle, epsilon: Double): Boolean = js.native
    
    def expand(x: Double, y: Double, width: Double, height: Double): Rectangle = js.native
    
    def expandXY(x: Double, y: Double): Rectangle = js.native
    
    var height: Double = js.native
    
    def inflate(): Rectangle = js.native
    def inflate(x: Double): Rectangle = js.native
    def inflate(x: Double, y: Double): Rectangle = js.native
    def inflate(x: Unit, y: Double): Rectangle = js.native
    
    def intersection(toIntersect: Rectangle): Rectangle = js.native
    def intersection(toIntersect: Rectangle, outRect: Rectangle): Rectangle = js.native
    
    def intersects(rect: Rectangle): Boolean = js.native
    
    def isEmpty: Boolean = js.native
    
    def left: Double = js.native
    def left_=(arg: Double): Unit = js.native
    
    def lines: js.Array[Line] = js.native
    
    def perimeter: Double = js.native
    
    def random: Vector = js.native
    
    def right: Double = js.native
    def right_=(arg: Double): Unit = js.native
    
    def scale(x: Double, y: Double): Rectangle = js.native
    
    def set(x: Double, y: Double, w: Double, h: Double): Rectangle = js.native
    
    def size(): Vector = js.native
    def size(outVector: Vector): Vector = js.native
    
    def toString(digits: Double): String = js.native
    
    def top: Double = js.native
    
    def topLeft: Vector = js.native
    def topLeft_=(arg: Vector): Unit = js.native
    
    def topRight: Vector = js.native
    def topRight_=(arg: Vector): Unit = js.native
    
    def top_=(arg: Double): Unit = js.native
    
    def union(toUnion: Rectangle): Rectangle = js.native
    
    def volume: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    def zero(): Rectangle = js.native
  }
  /* static members */
  object Rectangle {
    
    @JSImport("black-engine/geom/Rectangle", "Rectangle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("black-engine/geom/Rectangle", "Rectangle.__cache")
    @js.native
    val cache: Rectangle = js.native
    
    inline def fromPoints(points: js.Array[Vector]): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(points.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
    
    inline def fromPointsXY(points: js.Array[Double]): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointsXY")(points.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
    
    @JSImport("black-engine/geom/Rectangle", "Rectangle.pool")
    @js.native
    val pool: ObjectPool = js.native
  }
}
