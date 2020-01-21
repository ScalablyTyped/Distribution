package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultClusterParameters extends js.Object {
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The name of the cluster parameter group family to which the engine default parameters apply.
    */
  var ParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * The list of cluster default parameters.
    */
  var Parameters: js.UndefOr[ParametersList] = js.native
}

object DefaultClusterParameters {
  @scala.inline
  def apply(Marker: String = null, ParameterGroupFamily: String = null, Parameters: ParametersList = null): DefaultClusterParameters = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (ParameterGroupFamily != null) __obj.updateDynamic("ParameterGroupFamily")(ParameterGroupFamily.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultClusterParameters]
  }
}

