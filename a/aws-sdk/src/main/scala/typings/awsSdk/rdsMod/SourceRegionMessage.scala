package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceRegionMessage extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of SourceRegion instances that contains each source AWS Region that the current AWS Region can get a read replica or a DB snapshot from.
    */
  var SourceRegions: js.UndefOr[SourceRegionList] = js.native
}

object SourceRegionMessage {
  @scala.inline
  def apply(Marker: String = null, SourceRegions: SourceRegionList = null): SourceRegionMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (SourceRegions != null) __obj.updateDynamic("SourceRegions")(SourceRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRegionMessage]
  }
}

