package typings.bingmaps.MicrosoftNs.MapsNs.SpatialDataServiceNs

import typings.bingmaps.MicrosoftNs.MapsNs.IPrimitive
import typings.bingmaps.MicrosoftNs.MapsNs.IStylesOptions
import typings.bingmaps.MicrosoftNs.MapsNs.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.SpatialDataService.QueryAPIManager")
@js.native
object QueryAPIManagerNs extends js.Object {
  def search(
    queryOptions: IQueryAPIOptions,
    credentials: String,
    callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit]
  ): Unit = js.native
  def search(
    queryOptions: IQueryAPIOptions,
    credentials: String,
    callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
    styles: IStylesOptions
  ): Unit = js.native
  def search(
    queryOptions: IQueryAPIOptions,
    credentials: String,
    callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
    styles: IStylesOptions,
    errorCallback: js.Function2[/* networkStatus */ js.UndefOr[String], /* statusMessage */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def search(
    queryOptions: IQueryAPIOptions,
    credentials: Map,
    callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit]
  ): Unit = js.native
  def search(
    queryOptions: IQueryAPIOptions,
    credentials: Map,
    callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
    styles: IStylesOptions
  ): Unit = js.native
  def search(
    queryOptions: IQueryAPIOptions,
    credentials: Map,
    callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
    styles: IStylesOptions,
    errorCallback: js.Function2[/* networkStatus */ js.UndefOr[String], /* statusMessage */ js.UndefOr[String], Unit]
  ): Unit = js.native
}

