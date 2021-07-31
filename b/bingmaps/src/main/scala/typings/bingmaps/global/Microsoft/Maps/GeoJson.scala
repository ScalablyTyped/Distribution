package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IGeoJsonObject
import typings.bingmaps.Microsoft.Maps.IPrimitive
import typings.bingmaps.Microsoft.Maps.IStylesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeoJson {
  
  @JSGlobal("Microsoft.Maps.GeoJson")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def read(geoJson: String): IPrimitive | js.Array[IPrimitive] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(geoJson.asInstanceOf[js.Any]).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
  @scala.inline
  def read(geoJson: String, styles: IStylesOptions): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(geoJson.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
  @scala.inline
  def read(geoJson: IGeoJsonObject): IPrimitive | js.Array[IPrimitive] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(geoJson.asInstanceOf[js.Any]).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
  @scala.inline
  def read(geoJson: IGeoJsonObject, styles: IStylesOptions): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(geoJson.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
  
  @scala.inline
  def readFromUrl(url: String, callback: js.Function1[/* data */ IPrimitive | js.Array[IPrimitive], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFromUrl")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readFromUrl(
    url: String,
    callback: js.Function1[/* data */ IPrimitive | js.Array[IPrimitive], Unit],
    jsonpQueryParam: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFromUrl")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], jsonpQueryParam.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readFromUrl(
    url: String,
    callback: js.Function1[/* data */ IPrimitive | js.Array[IPrimitive], Unit],
    jsonpQueryParam: String,
    styles: IStylesOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFromUrl")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], jsonpQueryParam.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readFromUrl(
    url: String,
    callback: js.Function1[/* data */ IPrimitive | js.Array[IPrimitive], Unit],
    jsonpQueryParam: Unit,
    styles: IStylesOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFromUrl")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], jsonpQueryParam.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def write(data: js.Array[IPrimitive]): IGeoJsonObject = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(data.asInstanceOf[js.Any]).asInstanceOf[IGeoJsonObject]
  @scala.inline
  def write(data: IPrimitive): IGeoJsonObject = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(data.asInstanceOf[js.Any]).asInstanceOf[IGeoJsonObject]
}
