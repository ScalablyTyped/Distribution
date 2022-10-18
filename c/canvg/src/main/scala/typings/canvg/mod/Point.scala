package typings.canvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg", "Point")
@js.native
open class Point protected ()
  extends typings.canvg.distPointMod.Point {
  def this(x: Double, y: Double) = this()
}
/* static members */
object Point {
  
  @JSImport("canvg", "Point")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(point: String): typings.canvg.distPointMod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(point.asInstanceOf[js.Any]).asInstanceOf[typings.canvg.distPointMod.Point]
  inline def parse(point: String, defaultValue: Double): typings.canvg.distPointMod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(point.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[typings.canvg.distPointMod.Point]
  
  inline def parsePath(path: String): js.Array[typings.canvg.distPointMod.Point] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.canvg.distPointMod.Point]]
  
  inline def parseScale(scale: String): typings.canvg.distPointMod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("parseScale")(scale.asInstanceOf[js.Any]).asInstanceOf[typings.canvg.distPointMod.Point]
  inline def parseScale(scale: String, defaultValue: Double): typings.canvg.distPointMod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("parseScale")(scale.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[typings.canvg.distPointMod.Point]
}
