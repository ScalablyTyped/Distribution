package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingModifiedValues extends js.Object {
  /**
    * The auth token status
    */
  var AuthTokenStatus: js.UndefOr[AuthTokenUpdateStatus] = js.native
  /**
    * A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a 4-digit numeric identifier (0001, 0002, etc.).
    */
  var CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList] = js.native
  /**
    * The cache node type that this cluster or replication group is scaled to.
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  /**
    * The new cache engine version that the cluster runs.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The new number of cache nodes for the cluster. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 20.
    */
  var NumCacheNodes: js.UndefOr[IntegerOptional] = js.native
}

object PendingModifiedValues {
  @scala.inline
  def apply(
    AuthTokenStatus: AuthTokenUpdateStatus = null,
    CacheNodeIdsToRemove: CacheNodeIdsList = null,
    CacheNodeType: String = null,
    EngineVersion: String = null,
    NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined
  ): PendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    if (AuthTokenStatus != null) __obj.updateDynamic("AuthTokenStatus")(AuthTokenStatus.asInstanceOf[js.Any])
    if (CacheNodeIdsToRemove != null) __obj.updateDynamic("CacheNodeIdsToRemove")(CacheNodeIdsToRemove.asInstanceOf[js.Any])
    if (CacheNodeType != null) __obj.updateDynamic("CacheNodeType")(CacheNodeType.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(NumCacheNodes)) __obj.updateDynamic("NumCacheNodes")(NumCacheNodes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingModifiedValues]
  }
}

