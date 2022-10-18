package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Rectangle")
@js.native
open class Rectangle ()
  extends typings.blackEngine.geomRectangleMod.Rectangle {
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
}
/* static members */
object Rectangle {
  
  @JSImport("black-engine", "Rectangle")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("black-engine", "Rectangle.__cache")
  @js.native
  val cache: typings.blackEngine.geomRectangleMod.Rectangle = js.native
  
  inline def fromPoints(points: js.Array[typings.blackEngine.geomVectorMod.Vector]): typings.blackEngine.geomRectangleMod.Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(points.asInstanceOf[js.Any]).asInstanceOf[typings.blackEngine.geomRectangleMod.Rectangle]
  
  inline def fromPointsXY(points: js.Array[Double]): typings.blackEngine.geomRectangleMod.Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointsXY")(points.asInstanceOf[js.Any]).asInstanceOf[typings.blackEngine.geomRectangleMod.Rectangle]
  
  @JSImport("black-engine", "Rectangle.pool")
  @js.native
  val pool: typings.blackEngine.utilsObjectPoolMod.ObjectPool = js.native
}
