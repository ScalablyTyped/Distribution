package typings.blackEngine

import typings.blackEngine.geomVectorMod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomCircleMod {
  
  @JSImport("black-engine/geom/Circle", "Circle")
  @js.native
  open class Circle () extends StObject {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, r: Double) = this()
    def this(x: Double, y: Unit, r: Double) = this()
    def this(x: Unit, y: Double, r: Double) = this()
    def this(x: Unit, y: Unit, r: Double) = this()
    
    def bottom: Double = js.native
    
    def bottomPoint: Vector = js.native
    
    def center(): Vector = js.native
    def center(outVector: Vector): Vector = js.native
    
    def collide(circle: Circle): Boolean = js.native
    
    def contains(vector: Vector): Boolean = js.native
    
    def containsXY(x: Double, y: Double): Boolean = js.native
    
    def copyFrom(circle: Circle): Circle = js.native
    
    def copyTo(circle: Circle): Circle = js.native
    
    def equals(circle: Circle): Boolean = js.native
    def equals(circle: Circle, epsilon: Double): Boolean = js.native
    
    def intersects(circle: Circle): Boolean = js.native
    
    def left: Double = js.native
    
    def overlap(circle: Circle): Boolean = js.native
    
    def perimeter: Double = js.native
    
    /* private */ var r: Any = js.native
    
    def right: Double = js.native
    
    def set(x: Double, y: Double, r: Double): Circle = js.native
    
    def toString(digits: Double): String = js.native
    
    def top: Double = js.native
    
    def topPoint: Vector = js.native
    
    def volume: Double = js.native
    
    /* private */ var x: Any = js.native
    
    /* private */ var y: Any = js.native
    
    def zero(): Circle = js.native
  }
  /* static members */
  object Circle {
    
    @JSImport("black-engine/geom/Circle", "Circle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("black-engine/geom/Circle", "Circle.__cache")
    @js.native
    val cache: Circle = js.native
    
    inline def getCircumferencePoint(x: Any, y: Any, r: Any, angle: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getCircumferencePoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], r.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getCircumferencePoint(x: Any, y: Any, r: Any, angle: Any, outVector: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getCircumferencePoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], r.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], outVector.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
