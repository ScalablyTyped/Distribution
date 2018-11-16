package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


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
  var colorGradient: js.UndefOr[IDictionary[java.lang.String]] = js.undefined
  /**
          * The intensity of each heat point. This is a decimal value between 0 and 1. This is used to specify how "hot" a single data point should be. Default: 0.5
          */
  var intensity: js.UndefOr[scala.Double] = js.undefined
  /**
          * The opacity of the HeatMapLayer canvas. Value should be a decimal between 0 and 1. Default: 1
          */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
          * The radius to draw each data point on the map. Default: 10
          */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /**
          * The distance units of the radius. Possible values are:
          * 
          * • 'pixels' (defualt)
          * • 'meters'
          *
          * When set to pixels the size of each data point will always be the same radius, regardless of zoom level. When set to meters, the size of the data points
          * will scale based on zoom level so as to ensure that the radius is spatially accurate.
          */
  var unit: js.UndefOr[bingmapsLib.bingmapsLibStrings.meters | bingmapsLib.bingmapsLibStrings.pixel] = js.undefined
  /** A boolean indicating if the heat map layer is visible or not. **/
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

