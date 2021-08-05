package typings.bingmaps.Microsoft.Maps.SpatialDataService

import typings.bingmaps.Microsoft.Maps.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoDataResult extends StObject {
  
  /** Copyright information for the returned boundary data. */
  var Copyright: ICopyright
  
  /** A unique ID number associated with this entity. */
  var EntityID: String
  
  /**
    * A collection of metadata information associated with the entity. The getEntityMetadata option of the request must be set
    * to true. Note, not all boundaries will return this metadata.
    */
  var EntityMetadata: IMetadata
  
  /** Information about the name of the boundary location. */
  var Name: IName
  
  /** A Polygon object that has been generated from the data in the Primitives property. */
  var Polygons: js.Array[Polygon]
  
  /** An array of objects that contain the polygon information for the boundary. */
  var Primitives: js.Array[IGeoDataPrimitive]
}
object IGeoDataResult {
  
  inline def apply(
    Copyright: ICopyright,
    EntityID: String,
    EntityMetadata: IMetadata,
    Name: IName,
    Polygons: js.Array[Polygon],
    Primitives: js.Array[IGeoDataPrimitive]
  ): IGeoDataResult = {
    val __obj = js.Dynamic.literal(Copyright = Copyright.asInstanceOf[js.Any], EntityID = EntityID.asInstanceOf[js.Any], EntityMetadata = EntityMetadata.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Polygons = Polygons.asInstanceOf[js.Any], Primitives = Primitives.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoDataResult]
  }
  
  extension [Self <: IGeoDataResult](x: Self) {
    
    inline def setCopyright(value: ICopyright): Self = StObject.set(x, "Copyright", value.asInstanceOf[js.Any])
    
    inline def setEntityID(value: String): Self = StObject.set(x, "EntityID", value.asInstanceOf[js.Any])
    
    inline def setEntityMetadata(value: IMetadata): Self = StObject.set(x, "EntityMetadata", value.asInstanceOf[js.Any])
    
    inline def setName(value: IName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPolygons(value: js.Array[Polygon]): Self = StObject.set(x, "Polygons", value.asInstanceOf[js.Any])
    
    inline def setPolygonsVarargs(value: Polygon*): Self = StObject.set(x, "Polygons", js.Array(value :_*))
    
    inline def setPrimitives(value: js.Array[IGeoDataPrimitive]): Self = StObject.set(x, "Primitives", value.asInstanceOf[js.Any])
    
    inline def setPrimitivesVarargs(value: IGeoDataPrimitive*): Self = StObject.set(x, "Primitives", js.Array(value :_*))
  }
}
