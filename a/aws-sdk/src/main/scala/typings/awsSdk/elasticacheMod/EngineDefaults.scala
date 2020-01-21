package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EngineDefaults extends js.Object {
  /**
    * A list of parameters specific to a particular cache node type. Each element in the list contains detailed information about one parameter.
    */
  var CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.native
  /**
    * Specifies the name of the cache parameter group family to which the engine default parameters apply. Valid values are: memcached1.4 | memcached1.5 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | 
    */
  var CacheParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * Contains a list of engine default parameters.
    */
  var Parameters: js.UndefOr[ParametersList] = js.native
}

object EngineDefaults {
  @scala.inline
  def apply(
    CacheNodeTypeSpecificParameters: CacheNodeTypeSpecificParametersList = null,
    CacheParameterGroupFamily: String = null,
    Marker: String = null,
    Parameters: ParametersList = null
  ): EngineDefaults = {
    val __obj = js.Dynamic.literal()
    if (CacheNodeTypeSpecificParameters != null) __obj.updateDynamic("CacheNodeTypeSpecificParameters")(CacheNodeTypeSpecificParameters.asInstanceOf[js.Any])
    if (CacheParameterGroupFamily != null) __obj.updateDynamic("CacheParameterGroupFamily")(CacheParameterGroupFamily.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineDefaults]
  }
}

