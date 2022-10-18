package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Circle")
@js.native
open class Circle ()
  extends typings.blackEngine.geomCircleMod.Circle {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, r: Double) = this()
  def this(x: Double, y: Unit, r: Double) = this()
  def this(x: Unit, y: Double, r: Double) = this()
  def this(x: Unit, y: Unit, r: Double) = this()
}
/* static members */
object Circle {
  
  @JSImport("black-engine", "Circle")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("black-engine", "Circle.__cache")
  @js.native
  val cache: typings.blackEngine.geomCircleMod.Circle = js.native
  
  inline def getCircumferencePoint(x: Any, y: Any, r: Any, angle: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getCircumferencePoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], r.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getCircumferencePoint(x: Any, y: Any, r: Any, angle: Any, outVector: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getCircumferencePoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], r.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], outVector.asInstanceOf[js.Any])).asInstanceOf[Any]
}
