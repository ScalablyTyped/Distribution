package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EngineDefaults extends js.Object {
  /**
    * Specifies the name of the DB parameter group family that the engine default parameters apply to.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    *  An optional pagination token provided by a previous EngineDefaults request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords .
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * Contains a list of engine default parameters.
    */
  var Parameters: js.UndefOr[ParametersList] = js.native
}

object EngineDefaults {
  @scala.inline
  def apply(DBParameterGroupFamily: String = null, Marker: String = null, Parameters: ParametersList = null): EngineDefaults = {
    val __obj = js.Dynamic.literal()
    if (DBParameterGroupFamily != null) __obj.updateDynamic("DBParameterGroupFamily")(DBParameterGroupFamily.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineDefaults]
  }
}

