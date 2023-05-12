package typings.cesium.mod

import typings.cesium.anon.Category
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ProviderViewModel")
@js.native
open class ProviderViewModel protected () extends StObject {
  def this(options: Category) = this()
  
  /**
    * Gets the category
    */
  val category: String = js.native
  
  /**
    * Gets the Command that creates one or more providers which will be added to
    * the globe when this item is selected.
    */
  val creationCommand: Command = js.native
  
  /**
    * Gets the icon.  This property is observable.
    */
  var iconUrl: String = js.native
  
  /**
    * Gets the display name.  This property is observable.
    */
  var name: String = js.native
  
  /**
    * Gets the tooltip.  This property is observable.
    */
  var tooltip: String = js.native
}
object ProviderViewModel {
  
  /**
    * A function which creates one or more providers.
    */
  type CreationFunction = js.Function0[
    ImageryProvider | TerrainProvider | (js.Array[ImageryProvider | TerrainProvider]) | (js.Promise[js.Array[TerrainProvider] | TerrainProvider])
  ]
}
