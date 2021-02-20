package typings.bingmaps.Microsoft.Maps.SpatialDataService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGetBoundaryRequestOptions extends StObject {
  
  /**
    * Specifies the preferred language to use for any metadata text about the entity or polygons. Defaults to the culture used by the map control, which
    * usually automatically detected based on user's browser settings. Setting this property will override the default value.
    */
  var culture: js.UndefOr[String] = js.native
  
  /**
    * The entity type to return. Default: CountryRegion
    * Supported entity types:
    * AdminDivision1, AdminDivision2, CountryRegion, eighborhood, PopulatedPlace, Postcode1, Postcode2, Postcode3, Postcode4
    * Note: Not all entity types are available in all areas.
    */
  var entityType: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether the response should include all of the boundary polygons for the requested entity or just return a single polygon that represents
    * the main outline of the entity. Default: false
    */
  var getAllPolygons: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether the response should include metadata about the entity, such as AreaSqKm and others. Default: false
    */
  var getEntityMetadata: js.UndefOr[Boolean] = js.native
  
  /**
    * The level of detail for the boundary polygons returned. An integer between 0 and 3, where 0 specifies the coarsest level of boundary detail and 3
    * specifies the best. Default: 0
    */
  var lod: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the user’s home country or region.Defaults to the region setting of the user who loads the map.
    * Warning: Setting this property will override the default value, which is the region the user is actually in, and will allow the user to see boundaries
    * which may not align with the views of their region.This could result in geopolitically sensitive borders being returned.
    */
  var userRegion: js.UndefOr[String] = js.native
}
object IGetBoundaryRequestOptions {
  
  @scala.inline
  def apply(): IGetBoundaryRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetBoundaryRequestOptions]
  }
  
  @scala.inline
  implicit class IGetBoundaryRequestOptionsMutableBuilder[Self <: IGetBoundaryRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    @scala.inline
    def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    @scala.inline
    def setGetAllPolygons(value: Boolean): Self = StObject.set(x, "getAllPolygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllPolygonsUndefined: Self = StObject.set(x, "getAllPolygons", js.undefined)
    
    @scala.inline
    def setGetEntityMetadata(value: Boolean): Self = StObject.set(x, "getEntityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEntityMetadataUndefined: Self = StObject.set(x, "getEntityMetadata", js.undefined)
    
    @scala.inline
    def setLod(value: Double): Self = StObject.set(x, "lod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLodUndefined: Self = StObject.set(x, "lod", js.undefined)
    
    @scala.inline
    def setUserRegion(value: String): Self = StObject.set(x, "userRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRegionUndefined: Self = StObject.set(x, "userRegion", js.undefined)
  }
}
