package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheParameterGroup extends js.Object {
  /**
    * The name of the cache parameter group family that this cache parameter group is compatible with. Valid values are: memcached1.4 | memcached1.5 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | 
    */
  var CacheParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * The name of the cache parameter group.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.native
  /**
    * The description for this cache parameter group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Indicates whether the parameter group is associated with a Global Datastore
    */
  var IsGlobal: js.UndefOr[Boolean] = js.native
}

object CacheParameterGroup {
  @scala.inline
  def apply(
    CacheParameterGroupFamily: String = null,
    CacheParameterGroupName: String = null,
    Description: String = null,
    IsGlobal: js.UndefOr[Boolean] = js.undefined
  ): CacheParameterGroup = {
    val __obj = js.Dynamic.literal()
    if (CacheParameterGroupFamily != null) __obj.updateDynamic("CacheParameterGroupFamily")(CacheParameterGroupFamily.asInstanceOf[js.Any])
    if (CacheParameterGroupName != null) __obj.updateDynamic("CacheParameterGroupName")(CacheParameterGroupName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(IsGlobal)) __obj.updateDynamic("IsGlobal")(IsGlobal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheParameterGroup]
  }
}

