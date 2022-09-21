package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IHeatMapLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.HeatMapLayer")
@js.native
open class HeatMapLayer protected ()
  extends StObject
     with typings.bingmaps.Microsoft.Maps.HeatMapLayer {
  /**
    * @constructor
    * @requires The Microsoft.Maps.Heatmap module.
    * @param locations Set of locations to visualize as a heat map.
    * @param options Options for customizing how the heat map is rendered.
    */
  def this(locations: js.Array[
        typings.bingmaps.Microsoft.Maps.Location | typings.bingmaps.Microsoft.Maps.Pushpin
      ]) = this()
  def this(
    locations: js.Array[
        typings.bingmaps.Microsoft.Maps.Location | typings.bingmaps.Microsoft.Maps.Pushpin
      ],
    options: IHeatMapLayerOptions
  ) = this()
  
  /** Clears all data in the layer. */
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /** Disposes the heat map layer. */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Gets a boolean indicating if the heat map layer is visible or not.
    * @returns A boolean indicating if the heat map layer is visible or not.
    */
  /* CompleteClass */
  override def getVisible(): Boolean = js.native
  
  /** 
    * @deprecated
    * Hides the heat map layer.
    */
  /* CompleteClass */
  override def hide(): Unit = js.native
  
  /**
    * Specifies the locations to use when generating the heat map.
    * @param locations Set of locations.
    */
  /* CompleteClass */
  override def setLocations(
    locations: js.Array[
      typings.bingmaps.Microsoft.Maps.Location | typings.bingmaps.Microsoft.Maps.Pushpin
    ]
  ): Unit = js.native
  
  /**
    * Sets the options to use with the heat map layer.
    * @param options Set of heat map layer options.
    */
  /* CompleteClass */
  override def setOptions(options: IHeatMapLayerOptions): Unit = js.native
  
  /**
    * Sets the visibility of the heat map layer.
    * @param visible A boolean indicating if the heat map layer is visible or not.
    */
  /* CompleteClass */
  override def setVisible(visible: Boolean): Unit = js.native
  
  /** 
    * @deprecated
    * Shows the heat map layer.
    */
  /* CompleteClass */
  override def show(): Unit = js.native
}
