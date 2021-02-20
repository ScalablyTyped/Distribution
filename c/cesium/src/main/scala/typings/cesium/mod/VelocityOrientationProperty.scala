package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "VelocityOrientationProperty")
@js.native
class VelocityOrientationProperty () extends Property {
  def this(position: Property) = this()
  def this(position: js.UndefOr[scala.Nothing], ellipsoid: Ellipsoid) = this()
  def this(position: Property, ellipsoid: Ellipsoid) = this()
  
  var ellipsoid: Property = js.native
  
  def getValue(time: js.UndefOr[scala.Nothing], result: Quaternion): Quaternion = js.native
  def getValue(time: JulianDate, result: Quaternion): Quaternion = js.native
  
  var position: Property = js.native
}
