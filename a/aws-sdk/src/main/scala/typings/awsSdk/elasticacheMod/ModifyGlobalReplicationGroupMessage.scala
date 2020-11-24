package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(ApplyImmediately: Boolean, GlobalReplicationGroupId: String): ModifyGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyGlobalReplicationGroupMessage]
  }
  
  @scala.inline
  implicit class ModifyGlobalReplicationGroupMessageOps[Self <: ModifyGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
    
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
    def setApplyImmediately(value: Boolean): Self = this.set("ApplyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalReplicationGroupId(value: String): Self = this.set("GlobalReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticFailoverEnabled(value: BooleanOptional): Self = this.set("AutomaticFailoverEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticFailoverEnabled: Self = this.set("AutomaticFailoverEnabled", js.undefined)
    
    @scala.inline
    def setCacheNodeType(value: String): Self = this.set("CacheNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodeType: Self = this.set("CacheNodeType", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setGlobalReplicationGroupDescription(value: String): Self = this.set("GlobalReplicationGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalReplicationGroupDescription: Self = this.set("GlobalReplicationGroupDescription", js.undefined)
  }
}
