package typings.bingmaps.Microsoft.Maps.SpatialDataService

import typings.bingmaps.Microsoft.Maps.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoDataResult extends js.Object {
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
  @scala.inline
  def apply(
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
}

