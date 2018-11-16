package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.GeoJson")
@js.native
object GeoJsonNs extends js.Object {
  def read(geoJson: bingmapsLib.MicrosoftNs.MapsNs.IGeoJsonObject): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def read(
    geoJson: bingmapsLib.MicrosoftNs.MapsNs.IGeoJsonObject,
    styles: bingmapsLib.MicrosoftNs.MapsNs.IStylesOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def read(geoJson: java.lang.String): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def read(geoJson: java.lang.String, styles: bingmapsLib.MicrosoftNs.MapsNs.IStylesOptions): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def readFromUrl(
    url: java.lang.String,
    callback: js.Function1[
      /* data */ bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFromUrl(
    url: java.lang.String,
    callback: js.Function1[
      /* data */ bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive], 
      scala.Unit
    ],
    jsonpQueryParam: java.lang.String
  ): scala.Unit = js.native
  def readFromUrl(
    url: java.lang.String,
    callback: js.Function1[
      /* data */ bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive], 
      scala.Unit
    ],
    jsonpQueryParam: java.lang.String,
    styles: bingmapsLib.MicrosoftNs.MapsNs.IStylesOptions
  ): scala.Unit = js.native
  def write(data: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): bingmapsLib.MicrosoftNs.MapsNs.IGeoJsonObject = js.native
  def write(data: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]): bingmapsLib.MicrosoftNs.MapsNs.IGeoJsonObject = js.native
}

