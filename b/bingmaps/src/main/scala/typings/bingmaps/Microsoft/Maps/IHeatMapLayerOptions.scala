package typings.bingmaps.Microsoft.Maps

import typings.bingmaps.bingmapsStrings.meters
import typings.bingmaps.bingmapsStrings.pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHeatMapLayerOptions extends js.Object {
  /**
    * The temperature gradient that is used to colorize the map. Default gradient:
    *    {
    *        '0.00': 'rgb(255,0,255)', // Magenta
    *        '0.25': 'rgb(0,0,255)', // Blue
    *        '0.50': 'rgb(0,255,0)', // Green
    *        '0.75': 'rgb(255,255,0)', // Yellow
    *        '1.00': 'rgb(255,0,0)' // Red
    *    }
    */
  var colorGradient: js.UndefOr[IDictionary[String]] = js.native
  /**
    * The intensity of each heat point. This is a decimal value between 0 and 1. This is used to specify how "hot" a single data point should be. Default: 0.5
    */
  var intensity: js.UndefOr[Double] = js.native
  /**
    * The opacity of the HeatMapLayer canvas. Value should be a decimal between 0 and 1. Default: 1
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * The radius to draw each data point on the map. Default: 10
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * The distance units of the radius. Possible values are:
    * 
    * • 'pixels' (defualt)
    * • 'meters'
    *
    * When set to pixels the size of each data point will always be the same radius, regardless of zoom level. When set to meters, the size of the data points
    * will scale based on zoom level so as to ensure that the radius is spatially accurate.
    */
  var unit: js.UndefOr[meters | pixel] = js.native
  /** A boolean indicating if the heat map layer is visible or not. **/
  var visible: js.UndefOr[Boolean] = js.native
}

object IHeatMapLayerOptions {
  @scala.inline
  def apply(): IHeatMapLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHeatMapLayerOptions]
  }
  @scala.inline
  implicit class IHeatMapLayerOptionsOps[Self <: IHeatMapLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColorGradient(value: IDictionary[String]): Self = this.set("colorGradient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorGradient: Self = this.set("colorGradient", js.undefined)
    @scala.inline
    def setIntensity(value: Double): Self = this.set("intensity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntensity: Self = this.set("intensity", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setUnit(value: meters | pixel): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

