package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoDataResult extends js.Object {
  /** Copyright information for the returned boundary data. */
  var Copyright: ICopyright
  /** A unique ID number associated with this entity. */
  var EntityID: java.lang.String
  /**
    * A collection of metadata information associated with the entity. The getEntityMetadata option of the request must be set
    * to true. Note, not all boundaries will return this metadata.
    */
  var EntityMetadata: IMetadata
  /** Information about the name of the boundary location. */
  var Name: IName
  /** A Polygon object that has been generated from the data in the Primitives property. */
  var Polygons: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon]
  /** An array of objects that contain the polygon information for the boundary. */
  var Primitives: js.Array[IGeoDataPrimitive]
}

object IGeoDataResult {
  @scala.inline
  def apply(
    Copyright: ICopyright,
    EntityID: java.lang.String,
    EntityMetadata: IMetadata,
    Name: IName,
    Polygons: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon],
    Primitives: js.Array[IGeoDataPrimitive]
  ): IGeoDataResult = {
    val __obj = js.Dynamic.literal(Copyright = Copyright, EntityID = EntityID, EntityMetadata = EntityMetadata, Name = Name, Polygons = Polygons, Primitives = Primitives)
  
    __obj.asInstanceOf[IGeoDataResult]
  }
}

