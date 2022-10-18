package typings.canvg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBoundingBoxMod {
  
  @JSImport("canvg/dist/BoundingBox", "BoundingBox")
  @js.native
  open class BoundingBox () extends StObject {
    def this(x1: Double) = this()
    def this(x1: Double, y1: Double) = this()
    def this(x1: Unit, y1: Double) = this()
    def this(x1: Double, y1: Double, x2: Double) = this()
    def this(x1: Double, y1: Unit, x2: Double) = this()
    def this(x1: Unit, y1: Double, x2: Double) = this()
    def this(x1: Unit, y1: Unit, x2: Double) = this()
    def this(x1: Double, y1: Double, x2: Double, y2: Double) = this()
    def this(x1: Double, y1: Double, x2: Unit, y2: Double) = this()
    def this(x1: Double, y1: Unit, x2: Double, y2: Double) = this()
    def this(x1: Double, y1: Unit, x2: Unit, y2: Double) = this()
    def this(x1: Unit, y1: Double, x2: Double, y2: Double) = this()
    def this(x1: Unit, y1: Double, x2: Unit, y2: Double) = this()
    def this(x1: Unit, y1: Unit, x2: Double, y2: Double) = this()
    def this(x1: Unit, y1: Unit, x2: Unit, y2: Double) = this()
    
    def addBezierCurve(
      p0x: Double,
      p0y: Double,
      p1x: Double,
      p1y: Double,
      p2x: Double,
      p2y: Double,
      p3x: Double,
      p3y: Double
    ): Unit = js.native
    
    def addBoundingBox(): Unit = js.native
    def addBoundingBox(boundingBox: BoundingBox): Unit = js.native
    
    def addPoint(): Unit = js.native
    def addPoint(x: Double): Unit = js.native
    def addPoint(x: Double, y: Double): Unit = js.native
    def addPoint(x: Unit, y: Double): Unit = js.native
    
    def addQuadraticCurve(p0x: Double, p0y: Double, p1x: Double, p1y: Double, p2x: Double, p2y: Double): Unit = js.native
    
    def addX(x: Double): Unit = js.native
    
    def addY(y: Double): Unit = js.native
    
    /* private */ var bezierCurveAdd: Any = js.native
    
    def height: Double = js.native
    
    def isPointInBox(x: Double, y: Double): Boolean = js.native
    
    /* private */ var sumCubic: Any = js.native
    
    def width: Double = js.native
    
    def x: Double = js.native
    
    var x1: Double = js.native
    
    var x2: Double = js.native
    
    def y: Double = js.native
    
    var y1: Double = js.native
    
    var y2: Double = js.native
  }
}
