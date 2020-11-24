package typings.cesium.mod

import typings.cesium.anon.Category
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ProviderViewModel")
@js.native
class ProviderViewModel protected () extends js.Object {
  def this(options: Category) = this()
  
  var creationCommand: Command = js.native
  
  var iconUrl: String = js.native
  
  var name: String = js.native
  
  var tooltip: String = js.native
}
@JSImport("cesium", "ProviderViewModel")
@js.native
object ProviderViewModel extends js.Object {
  
  type CreationFunction = js.Function0[
    ImageryProvider | TerrainProvider | (js.Array[ImageryProvider | TerrainProvider])
  ]
}
