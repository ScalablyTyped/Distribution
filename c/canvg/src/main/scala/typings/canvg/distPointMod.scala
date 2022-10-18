package typings.canvg

import typings.canvg.distTypesMod.MatrixValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPointMod {
  
  @JSImport("canvg/dist/Point", "Point")
  @js.native
  open class Point protected () extends StObject {
    def this(x: Double, y: Double) = this()
    
    def angleTo(point: Point): Double = js.native
    
    def applyTransform(transform: MatrixValue): Unit = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  /* static members */
  object Point {
    
    @JSImport("canvg/dist/Point", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(point: String): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(point.asInstanceOf[js.Any]).asInstanceOf[Point]
    inline def parse(point: String, defaultValue: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(point.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def parsePath(path: String): js.Array[Point] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Point]]
    
    inline def parseScale(scale: String): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("parseScale")(scale.asInstanceOf[js.Any]).asInstanceOf[Point]
    inline def parseScale(scale: String, defaultValue: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("parseScale")(scale.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Point]
  }
}
