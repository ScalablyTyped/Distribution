package typings.cesium.mod

import typings.cesium.anon.Container
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Geocoder")
@js.native
class Geocoder protected () extends js.Object {
  def this(options: Container) = this()
  
  var container: Element = js.native
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var viewModel: GeocoderViewModel = js.native
}
