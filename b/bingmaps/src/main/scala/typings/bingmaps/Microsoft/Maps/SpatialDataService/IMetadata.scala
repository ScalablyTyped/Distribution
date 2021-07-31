package typings.bingmaps.Microsoft.Maps.SpatialDataService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadata extends StObject {
  
  /** The approximate total surface area (in square kilometers) covered by all the polygons that comprise this entity. */
  var AreaSqKm: String
  
  /**
    * An area on the Earth that provides the best map view for this entity. This area is defined as a bounding box in the format of a
    * “MULTIPOINT ((WestLongitude SouthLatitude), (EastLongitude NorthLatitude))”.
    */
  var BestMapViewBox: String
  
  /** The culture associated with this entity. Example: en */
  var OfficialCulture: String
  
  /** The approximate population within this entity. Example: PopClass20000to99999 */
  var PopulationClass: String
  
  /** The regional culture associated with this entity. */
  var RegionalCulture: String
}
object IMetadata {
  
  @scala.inline
  def apply(
    AreaSqKm: String,
    BestMapViewBox: String,
    OfficialCulture: String,
    PopulationClass: String,
    RegionalCulture: String
  ): IMetadata = {
    val __obj = js.Dynamic.literal(AreaSqKm = AreaSqKm.asInstanceOf[js.Any], BestMapViewBox = BestMapViewBox.asInstanceOf[js.Any], OfficialCulture = OfficialCulture.asInstanceOf[js.Any], PopulationClass = PopulationClass.asInstanceOf[js.Any], RegionalCulture = RegionalCulture.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadata]
  }
  
  @scala.inline
  implicit class IMetadataMutableBuilder[Self <: IMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAreaSqKm(value: String): Self = StObject.set(x, "AreaSqKm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestMapViewBox(value: String): Self = StObject.set(x, "BestMapViewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficialCulture(value: String): Self = StObject.set(x, "OfficialCulture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopulationClass(value: String): Self = StObject.set(x, "PopulationClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalCulture(value: String): Self = StObject.set(x, "RegionalCulture", value.asInstanceOf[js.Any])
  }
}
