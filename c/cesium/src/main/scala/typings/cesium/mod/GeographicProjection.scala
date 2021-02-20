package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GeographicProjection")
@js.native
class GeographicProjection () extends StObject {
  def this(ellipsoid: Ellipsoid) = this()
  
  var ellipsoid: Ellipsoid = js.native
  
  def project(cartographic: Cartographic): Cartesian3 = js.native
  def project(cartographic: Cartographic, result: Cartesian3): Cartesian3 = js.native
  
  def unproject(cartesian: Cartesian3): Cartographic = js.native
  def unproject(cartesian: Cartesian3, result: Cartographic): Cartographic = js.native
}
