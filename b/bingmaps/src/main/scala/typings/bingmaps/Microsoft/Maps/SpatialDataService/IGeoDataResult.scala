package typings.bingmaps.Microsoft.Maps.SpatialDataService

import typings.bingmaps.Microsoft.Maps.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoDataResult extends js.Object {
  /** Copyright information for the returned boundary data. */
  var Copyright: ICopyright = js.native
  /** A unique ID number associated with this entity. */
  var EntityID: String = js.native
  /**
    * A collection of metadata information associated with the entity. The getEntityMetadata option of the request must be set
    * to true. Note, not all boundaries will return this metadata.
    */
  var EntityMetadata: IMetadata = js.native
  /** Information about the name of the boundary location. */
  var Name: IName = js.native
  /** A Polygon object that has been generated from the data in the Primitives property. */
  var Polygons: js.Array[Polygon] = js.native
  /** An array of objects that contain the polygon information for the boundary. */
  var Primitives: js.Array[IGeoDataPrimitive] = js.native
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
  @scala.inline
  implicit class IGeoDataResultOps[Self <: IGeoDataResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCopyright(value: ICopyright): Self = this.set("Copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityID(value: String): Self = this.set("EntityID", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityMetadata(value: IMetadata): Self = this.set("EntityMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: IName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolygonsVarargs(value: Polygon*): Self = this.set("Polygons", js.Array(value :_*))
    @scala.inline
    def setPolygons(value: js.Array[Polygon]): Self = this.set("Polygons", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimitivesVarargs(value: IGeoDataPrimitive*): Self = this.set("Primitives", js.Array(value :_*))
    @scala.inline
    def setPrimitives(value: js.Array[IGeoDataPrimitive]): Self = this.set("Primitives", value.asInstanceOf[js.Any])
  }
  
}

