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
  def apply(): EngineDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineDefaults]
  }
  @scala.inline
  implicit class EngineDefaultsOps[Self <: EngineDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCacheNodeTypeSpecificParametersVarargs(value: CacheNodeTypeSpecificParameter*): Self = this.set("CacheNodeTypeSpecificParameters", js.Array(value :_*))
    @scala.inline
    def setCacheNodeTypeSpecificParameters(value: CacheNodeTypeSpecificParametersList): Self = this.set("CacheNodeTypeSpecificParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheNodeTypeSpecificParameters: Self = this.set("CacheNodeTypeSpecificParameters", js.undefined)
    @scala.inline
    def setCacheParameterGroupFamily(value: String): Self = this.set("CacheParameterGroupFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheParameterGroupFamily: Self = this.set("CacheParameterGroupFamily", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = this.set("Parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: ParametersList): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
  }
  
}

