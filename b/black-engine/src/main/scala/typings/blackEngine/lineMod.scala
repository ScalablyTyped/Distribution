package typings.blackEngine

import typings.blackEngine.circleMod.Circle
import typings.blackEngine.vectorMod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineMod {
  
  @JSImport("black-engine/geom/Line", "Line")
  @js.native
  open class Line protected () extends StObject {
    def this(start: Vector, end: Vector) = this()
    
    def __isInBoundsXY(x: Any, y: Any): Boolean = js.native
    
    def bottom: Double = js.native
    
    def center(): Vector = js.native
    def center(outVector: Vector): Vector = js.native
    
    def contains(vector: Vector): Boolean = js.native
    
    def containsXY(x: Double, y: Double): Boolean = js.native
    
    def copyFrom(line: Line): Line = js.native
    
    def copyTo(line: Line): Line = js.native
    
    var end: Vector = js.native
    
    def equals(line: Line): Boolean = js.native
    def equals(line: Line, epsilon: Double): Boolean = js.native
    
    def intersects(line: Line): Boolean = js.native
    
    def intersectsCircle(circle: Circle): Boolean = js.native
    
    def left: Double = js.native
    
    def length(): Double = js.native
    
    def normalize(): Line = js.native
    
    def reverse(): Line = js.native
    
    def right: Double = js.native
    
    def scale(multiplier: Any): Line = js.native
    
    def set(start: Vector, end: Vector): Line = js.native
    
    var start: Vector = js.native
    
    def toString(digits: Double): String = js.native
    
    def top: Double = js.native
    
    def `type`: String = js.native
    
    def zero(): Line = js.native
  }
  object Line {
    
    @JSImport("black-engine/geom/Line", "Line.__cache")
    @js.native
    val cache: Line = js.native
  }
}
