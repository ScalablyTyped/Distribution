package typings.bingmaps.Microsoft.Maps.SpatialDataService

import typings.bingmaps.Microsoft.Maps.IPolygonOptions
import typings.bingmaps.Microsoft.Maps.Location
import typings.bingmaps.Microsoft.Maps.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager")
@js.native
object GeoDataAPIManager extends js.Object {
  def getBoundary(
    locations: String,
    request: IGetBoundaryRequestOptions,
    credentials: String,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
  ): Unit = js.native
  def getBoundary(
    locations: String,
    request: IGetBoundaryRequestOptions,
    credentials: String,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
    styles: IPolygonOptions
  ): Unit = js.native
  def getBoundary(
    locations: String,
    request: IGetBoundaryRequestOptions,
    credentials: String,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
    styles: IPolygonOptions,
    errorCallback: js.Function2[
      /* callbackState */ js.UndefOr[String | Location], 
      /* networkStatus */ js.UndefOr[String], 
      Unit
    ]
  ): Unit = js.native
  def getBoundary(
    locations: String,
    request: IGetBoundaryRequestOptions,
    credentials: Map,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
  ): Unit = js.native
  def getBoundary(
    locations: String,
    request: IGetBoundaryRequestOptions,
    credentials: Map,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
    styles: IPolygonOptions
  ): Unit = js.native
  def getBoundary(
    locations: String,
    request: IGetBoundaryRequestOptions,
    credentials: Map,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
    styles: IPolygonOptions,
    errorCallback: js.Function2[
      /* callbackState */ js.UndefOr[String | Location], 
      /* networkStatus */ js.UndefOr[String], 
      Unit
    ]
  ): Unit = js.native
  def getBoundary(
    locations: js.Array[String | Location],
    request: IGetBoundaryRequestOptions,
    credentials: String,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
  ): Unit = js.native
  def getBoundary(
    locations: js.Array[String | Location],
    request: IGetBoundaryRequestOptions,
    credentials: String,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
    styles: IPolygonOptions
  ): Unit = js.native
  def getBoundary(
    locations: js.Array[String | Location],
    request: IGetBoundaryRequestOptions,
    credentials: String,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
    styles: IPolygonOptions,
    errorCallback: js.Function2[
      /* callbackState */ js.UndefOr[String | Location], 
      /* networkStatus */ js.UndefOr[String], 
      Unit
    ]
  ): Unit = js.native
  def getBoundary(
    locations: js.Array[String | Location],
    request: IGetBoundaryRequestOptions,
    credentials: Map,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
  ): Unit = js.native
  def getBoundary(
    locations: js.Array[String | Location],
    request: IGetBoundaryRequestOptions,
    credentials: Map,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
    styles: IPolygonOptions
  ): Unit = js.native
  def getBoundary(
    locations: js.Array[String | Location],
    request: IGetBoundaryRequestOptions,
    credentials: Map,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
    styles: IPolygonOptions,
    errorCallback: js.Function2[
      /* callbackState */ js.UndefOr[String | Location], 
      /* networkStatus */ js.UndefOr[String], 
      Unit
    ]
  ): Unit = js.native
  def getBoundary(
    locations: Location,
    request: IGetBoundaryRequestOptions,
    credentials: String,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
  ): Unit = js.native
  def getBoundary(
    locations: Location,
    request: IGetBoundaryRequestOptions,
    credentials: String,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
    styles: IPolygonOptions
  ): Unit = js.native
  def getBoundary(
    locations: Location,
    request: IGetBoundaryRequestOptions,
    credentials: String,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
    styles: IPolygonOptions,
    errorCallback: js.Function2[
      /* callbackState */ js.UndefOr[String | Location], 
      /* networkStatus */ js.UndefOr[String], 
      Unit
    ]
  ): Unit = js.native
  def getBoundary(
    locations: Location,
    request: IGetBoundaryRequestOptions,
    credentials: Map,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
  ): Unit = js.native
  def getBoundary(
    locations: Location,
    request: IGetBoundaryRequestOptions,
    credentials: Map,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
    styles: IPolygonOptions
  ): Unit = js.native
  def getBoundary(
    locations: Location,
    request: IGetBoundaryRequestOptions,
    credentials: Map,
    callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
    styles: IPolygonOptions,
    errorCallback: js.Function2[
      /* callbackState */ js.UndefOr[String | Location], 
      /* networkStatus */ js.UndefOr[String], 
      Unit
    ]
  ): Unit = js.native
}

