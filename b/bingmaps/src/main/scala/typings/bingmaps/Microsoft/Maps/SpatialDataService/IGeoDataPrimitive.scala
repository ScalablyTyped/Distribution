package typings.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoDataPrimitive extends js.Object {
  /** The number of vertex points used to define the polygon. */
  var NumPoints: String = js.native
  /** A unique ID associated with this polygon primitive. */
  var PrimitiveID: String = js.native
  /**
    * A comma-delimited sequence starting with the version number of the polygon set followed by a list of compressed polygon
    * "rings" (closed paths represented by sequences of latitude and-longitude points).
    */
  var Shape: String = js.native
  /**
    * An ID identifying the data provider that supplied the data. This ID number will reference one of the sources listed in the
    * array of CopyrightSources in the Copyright property of the GeoDataResultSet object.
    */
  var SourceID: String = js.native
}

object IGeoDataPrimitive {
  @scala.inline
  def apply(NumPoints: String, PrimitiveID: String, Shape: String, SourceID: String): IGeoDataPrimitive = {
    val __obj = js.Dynamic.literal(NumPoints = NumPoints.asInstanceOf[js.Any], PrimitiveID = PrimitiveID.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], SourceID = SourceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoDataPrimitive]
  }
  @scala.inline
  implicit class IGeoDataPrimitiveOps[Self <: IGeoDataPrimitive] (val x: Self) extends AnyVal {
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
    def setNumPoints(value: String): Self = this.set("NumPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimitiveID(value: String): Self = this.set("PrimitiveID", value.asInstanceOf[js.Any])
    @scala.inline
    def setShape(value: String): Self = this.set("Shape", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceID(value: String): Self = this.set("SourceID", value.asInstanceOf[js.Any])
  }
  
}

