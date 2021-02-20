package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IGeoJsonObject
import typings.bingmaps.Microsoft.Maps.IPrimitive
import typings.bingmaps.Microsoft.Maps.IStylesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeoJson {
  
  @JSGlobal("Microsoft.Maps.GeoJson.read")
  @js.native
  def read(geoJson: String): IPrimitive | js.Array[IPrimitive] = js.native
  @JSGlobal("Microsoft.Maps.GeoJson.read")
  @js.native
  def read(geoJson: String, styles: IStylesOptions): IPrimitive | js.Array[IPrimitive] = js.native
  @JSGlobal("Microsoft.Maps.GeoJson.read")
  @js.native
  def read(geoJson: IGeoJsonObject): IPrimitive | js.Array[IPrimitive] = js.native
  @JSGlobal("Microsoft.Maps.GeoJson.read")
  @js.native
  def read(geoJson: IGeoJsonObject, styles: IStylesOptions): IPrimitive | js.Array[IPrimitive] = js.native
  
  @JSGlobal("Microsoft.Maps.GeoJson.readFromUrl")
  @js.native
  def readFromUrl(url: String, callback: js.Function1[/* data */ IPrimitive | js.Array[IPrimitive], Unit]): Unit = js.native
  @JSGlobal("Microsoft.Maps.GeoJson.readFromUrl")
  @js.native
  def readFromUrl(
    url: String,
    callback: js.Function1[/* data */ IPrimitive | js.Array[IPrimitive], Unit],
    jsonpQueryParam: js.UndefOr[scala.Nothing],
    styles: IStylesOptions
  ): Unit = js.native
  @JSGlobal("Microsoft.Maps.GeoJson.readFromUrl")
  @js.native
  def readFromUrl(
    url: String,
    callback: js.Function1[/* data */ IPrimitive | js.Array[IPrimitive], Unit],
    jsonpQueryParam: String
  ): Unit = js.native
  @JSGlobal("Microsoft.Maps.GeoJson.readFromUrl")
  @js.native
  def readFromUrl(
    url: String,
    callback: js.Function1[/* data */ IPrimitive | js.Array[IPrimitive], Unit],
    jsonpQueryParam: String,
    styles: IStylesOptions
  ): Unit = js.native
  
  @JSGlobal("Microsoft.Maps.GeoJson.write")
  @js.native
  def write(data: js.Array[IPrimitive]): IGeoJsonObject = js.native
  @JSGlobal("Microsoft.Maps.GeoJson.write")
  @js.native
  def write(data: IPrimitive): IGeoJsonObject = js.native
}
