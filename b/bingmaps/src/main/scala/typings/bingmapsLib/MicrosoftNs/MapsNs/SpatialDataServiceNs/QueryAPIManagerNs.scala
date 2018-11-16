package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.SpatialDataService.QueryAPIManager")
@js.native
object QueryAPIManagerNs extends js.Object {
  def search(
    queryOptions: bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.IQueryAPIOptions,
    credentials: bingmapsLib.MicrosoftNs.MapsNs.Map,
    callback: js.Function2[
      /* data */ js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive], 
      /* inlineCount */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def search(
    queryOptions: bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.IQueryAPIOptions,
    credentials: bingmapsLib.MicrosoftNs.MapsNs.Map,
    callback: js.Function2[
      /* data */ js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive], 
      /* inlineCount */ js.UndefOr[scala.Double], 
      scala.Unit
    ],
    styles: bingmapsLib.MicrosoftNs.MapsNs.IStylesOptions
  ): scala.Unit = js.native
  def search(
    queryOptions: bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.IQueryAPIOptions,
    credentials: bingmapsLib.MicrosoftNs.MapsNs.Map,
    callback: js.Function2[
      /* data */ js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive], 
      /* inlineCount */ js.UndefOr[scala.Double], 
      scala.Unit
    ],
    styles: bingmapsLib.MicrosoftNs.MapsNs.IStylesOptions,
    errorCallback: js.Function2[
      /* networkStatus */ js.UndefOr[java.lang.String], 
      /* statusMessage */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def search(
    queryOptions: bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.IQueryAPIOptions,
    credentials: java.lang.String,
    callback: js.Function2[
      /* data */ js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive], 
      /* inlineCount */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def search(
    queryOptions: bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.IQueryAPIOptions,
    credentials: java.lang.String,
    callback: js.Function2[
      /* data */ js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive], 
      /* inlineCount */ js.UndefOr[scala.Double], 
      scala.Unit
    ],
    styles: bingmapsLib.MicrosoftNs.MapsNs.IStylesOptions
  ): scala.Unit = js.native
  def search(
    queryOptions: bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.IQueryAPIOptions,
    credentials: java.lang.String,
    callback: js.Function2[
      /* data */ js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive], 
      /* inlineCount */ js.UndefOr[scala.Double], 
      scala.Unit
    ],
    styles: bingmapsLib.MicrosoftNs.MapsNs.IStylesOptions,
    errorCallback: js.Function2[
      /* networkStatus */ js.UndefOr[java.lang.String], 
      /* statusMessage */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

