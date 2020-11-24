package typings.cesium.mod

import typings.cesium.anon.Intensity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "DirectionalLight")
@js.native
class DirectionalLight protected () extends Light {
  def this(option: Intensity) = this()
  
  var direction: Cartesian3 = js.native
}
