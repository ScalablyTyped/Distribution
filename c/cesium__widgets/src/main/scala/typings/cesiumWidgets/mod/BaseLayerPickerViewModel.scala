package typings.cesiumWidgets.mod

import typings.cesiumWidgets.anon.Globe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/widgets", "BaseLayerPickerViewModel")
@js.native
open class BaseLayerPickerViewModel protected () extends StObject {
  def this(options: Globe) = this()
  
  /**
    * Gets the button background image.  This property is observable.
    */
  var buttonImageUrl: String = js.native
  
  /**
    * Gets the button tooltip.  This property is observable.
    */
  var buttonTooltip: String = js.native
  
  /**
    * Gets or sets whether the imagery selection drop-down is currently visible.
    */
  var dropDownVisible: Boolean = js.native
  
  /**
    * Gets the globe.
    */
  var globe: typings.cesiumEngine.mod.Globe = js.native
  
  /**
    * Gets or sets an array of ProviderViewModel instances available for imagery selection.
    * This property is observable.
    */
  var imageryProviderViewModels: js.Array[ProviderViewModel] = js.native
  
  /**
    * Gets or sets the currently selected imagery.  This property is observable.
    */
  var selectedImagery: ProviderViewModel = js.native
  
  /**
    * Gets or sets the currently selected terrain.  This property is observable.
    */
  var selectedTerrain: ProviderViewModel = js.native
  
  /**
    * Gets or sets an array of ProviderViewModel instances available for terrain selection.
    * This property is observable.
    */
  var terrainProviderViewModels: js.Array[ProviderViewModel] = js.native
  
  /**
    * Gets the command to toggle the visibility of the drop down.
    */
  var toggleDropDown: Command = js.native
}
