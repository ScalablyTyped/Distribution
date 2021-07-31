package typings.cesium.mod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ColorGeometryInstanceAttribute")
@js.native
class ColorGeometryInstanceAttribute () extends StObject {
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
  
  var componentDatatype: ComponentDatatype = js.native
  
  var componentsPerAttribute: Double = js.native
  
  var normalize: Boolean = js.native
  
  var value: Uint8Array = js.native
}
object ColorGeometryInstanceAttribute {
  
  @JSImport("cesium", "ColorGeometryInstanceAttribute")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def fromColor(color: Color): ColorGeometryInstanceAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("fromColor")(color.asInstanceOf[js.Any]).asInstanceOf[ColorGeometryInstanceAttribute]
  
  /* static member */
  @scala.inline
  def toValue(color: Color): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toValue")(color.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  @scala.inline
  def toValue(color: Color, result: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toValue")(color.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
}
