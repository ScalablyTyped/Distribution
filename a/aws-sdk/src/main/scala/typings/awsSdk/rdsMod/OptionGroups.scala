package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroups extends js.Object {
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * List of option groups.
    */
  var OptionGroupsList: js.UndefOr[typings.awsSdk.rdsMod.OptionGroupsList] = js.native
}

object OptionGroups {
  @scala.inline
  def apply(Marker: String = null, OptionGroupsList: OptionGroupsList = null): OptionGroups = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (OptionGroupsList != null) __obj.updateDynamic("OptionGroupsList")(OptionGroupsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionGroups]
  }
}

