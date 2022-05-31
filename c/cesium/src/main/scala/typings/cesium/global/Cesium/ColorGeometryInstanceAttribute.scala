package typings.cesium.global.Cesium

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.ColorGeometryInstanceAttribute")
@js.native
class ColorGeometryInstanceAttribute ()
  extends typings.cesium.mod.ColorGeometryInstanceAttribute {
  def this(red: Double) = this()
  def this(red: Double, green: Double) = this()
  def this(red: Unit, green: Double) = this()
  def this(red: Double, green: Double, blue: Double) = this()
  def this(red: Double, green: Unit, blue: Double) = this()
  def this(red: Unit, green: Double, blue: Double) = this()
  def this(red: Unit, green: Unit, blue: Double) = this()
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
  def this(red: Double, green: Double, blue: Unit, alpha: Double) = this()
  def this(red: Double, green: Unit, blue: Double, alpha: Double) = this()
  def this(red: Double, green: Unit, blue: Unit, alpha: Double) = this()
  def this(red: Unit, green: Double, blue: Double, alpha: Double) = this()
  def this(red: Unit, green: Double, blue: Unit, alpha: Double) = this()
  def this(red: Unit, green: Unit, blue: Double, alpha: Double) = this()
  def this(red: Unit, green: Unit, blue: Unit, alpha: Double) = this()
}
object ColorGeometryInstanceAttribute {
  
  @JSGlobal("Cesium.ColorGeometryInstanceAttribute")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromColor(color: typings.cesium.mod.Color): typings.cesium.mod.ColorGeometryInstanceAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("fromColor")(color.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.ColorGeometryInstanceAttribute]
  
  /* static member */
  inline def toValue(color: typings.cesium.mod.Color): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toValue")(color.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  inline def toValue(color: typings.cesium.mod.Color, result: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toValue")(color.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
}
