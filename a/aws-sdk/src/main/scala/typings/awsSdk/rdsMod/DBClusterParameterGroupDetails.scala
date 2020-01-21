package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterParameterGroupDetails extends js.Object {
  /**
    *  An optional pagination token provided by a previous DescribeDBClusterParameters request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * Provides a list of parameters for the DB cluster parameter group.
    */
  var Parameters: js.UndefOr[ParametersList] = js.native
}

object DBClusterParameterGroupDetails {
  @scala.inline
  def apply(Marker: String = null, Parameters: ParametersList = null): DBClusterParameterGroupDetails = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBClusterParameterGroupDetails]
  }
}

