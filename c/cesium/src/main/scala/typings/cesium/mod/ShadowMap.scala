package typings.cesium.mod

import typings.cesium.anon.CascadesEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ShadowMap")
@js.native
class ShadowMap protected () extends js.Object {
  def this(obtions: CascadesEnabled) = this()
  var darkness: Double = js.native
  var enabled: Boolean = js.native
  var maximumDistance: Double = js.native
  var normalOffset: Boolean = js.native
  var size: Double = js.native
  var softShadows: Boolean = js.native
}

