package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyGlobalReplicationGroupMessage extends js.Object {
  /**
    * This parameter causes the modifications in this request and any pending modifications to be applied, asynchronously and as soon as possible. Modifications to Global Replication Groups cannot be requested to be applied in PreferredMaintenceWindow. 
    */
  var ApplyImmediately: Boolean = js.native
  /**
    * Determines whether a read replica is automatically promoted to read/write primary if the existing primary encounters a failure. 
    */
  var AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.native
  /**
    * A valid cache node type that you want to scale this Global Datastore to.
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  /**
    * The upgraded version of the cache engine to be run on the clusters in the Global Datastore. 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * A description of the Global Datastore
    */
  var GlobalReplicationGroupDescription: js.UndefOr[String] = js.native
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
}

object ModifyGlobalReplicationGroupMessage {
  @scala.inline
  def apply(
    ApplyImmediately: Boolean,
    GlobalReplicationGroupId: String,
    AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.undefined,
    CacheNodeType: String = null,
    EngineVersion: String = null,
    GlobalReplicationGroupDescription: String = null
  ): ModifyGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any])
    if (!js.isUndefined(AutomaticFailoverEnabled)) __obj.updateDynamic("AutomaticFailoverEnabled")(AutomaticFailoverEnabled.get.asInstanceOf[js.Any])
    if (CacheNodeType != null) __obj.updateDynamic("CacheNodeType")(CacheNodeType.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (GlobalReplicationGroupDescription != null) __obj.updateDynamic("GlobalReplicationGroupDescription")(GlobalReplicationGroupDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyGlobalReplicationGroupMessage]
  }
}

