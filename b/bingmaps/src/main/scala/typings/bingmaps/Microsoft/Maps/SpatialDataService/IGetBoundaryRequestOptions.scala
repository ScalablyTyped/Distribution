package typings.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGetBoundaryRequestOptions extends js.Object {
  /**
    * Specifies the preferred language to use for any metadata text about the entity or polygons. Defaults to the culture used by the map control, which
    * usually automatically detected based on user's browser settings. Setting this property will override the default value.
    */
  var culture: js.UndefOr[String] = js.undefined
  /**
    * The entity type to return. Default: CountryRegion
    * Supported entity types:
    * AdminDivision1, AdminDivision2, CountryRegion, eighborhood, PopulatedPlace, Postcode1, Postcode2, Postcode3, Postcode4
    * Note: Not all entity types are available in all areas.
    */
  var entityType: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether the response should include all of the boundary polygons for the requested entity or just return a single polygon that represents
    * the main outline of the entity. Default: false
    */
  var getAllPolygons: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether the response should include metadata about the entity, such as AreaSqKm and others. Default: false
    */
  var getEntityMetadata: js.UndefOr[Boolean] = js.undefined
  /**
    * The level of detail for the boundary polygons returned. An integer between 0 and 3, where 0 specifies the coarsest level of boundary detail and 3
    * specifies the best. Default: 0
    */
  var lod: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the user’s home country or region.Defaults to the region setting of the user who loads the map.
    * Warning: Setting this property will override the default value, which is the region the user is actually in, and will allow the user to see boundaries
    * which may not align with the views of their region.This could result in geopolitically sensitive borders being returned.
    */
  var userRegion: js.UndefOr[String] = js.undefined
}

object IGetBoundaryRequestOptions {
  @scala.inline
  def apply(
    culture: String = null,
    entityType: String = null,
    getAllPolygons: js.UndefOr[Boolean] = js.undefined,
    getEntityMetadata: js.UndefOr[Boolean] = js.undefined,
    lod: js.UndefOr[Double] = js.undefined,
    userRegion: String = null
  ): IGetBoundaryRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (!js.isUndefined(getAllPolygons)) __obj.updateDynamic("getAllPolygons")(getAllPolygons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(getEntityMetadata)) __obj.updateDynamic("getEntityMetadata")(getEntityMetadata.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lod)) __obj.updateDynamic("lod")(lod.get.asInstanceOf[js.Any])
    if (userRegion != null) __obj.updateDynamic("userRegion")(userRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetBoundaryRequestOptions]
  }
}

