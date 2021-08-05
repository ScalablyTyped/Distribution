package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyGlobalReplicationGroupMessage extends StObject {
  
  /**
    * This parameter causes the modifications in this request and any pending modifications to be applied, asynchronously and as soon as possible. Modifications to Global Replication Groups cannot be requested to be applied in PreferredMaintenceWindow. 
    */
  var ApplyImmediately: Boolean
  
  /**
    * Determines whether a read replica is automatically promoted to read/write primary if the existing primary encounters a failure. 
    */
  var AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A valid cache node type that you want to scale this Global Datastore to.
    */
  var CacheNodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The upgraded version of the cache engine to be run on the clusters in the Global Datastore. 
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the Global Datastore
    */
  var GlobalReplicationGroupDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String
}
object ModifyGlobalReplicationGroupMessage {
  
  inline def apply(ApplyImmediately: Boolean, GlobalReplicationGroupId: String): ModifyGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyGlobalReplicationGroupMessage]
  }
  
  extension [Self <: ModifyGlobalReplicationGroupMessage](x: Self) {
    
    inline def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    inline def setAutomaticFailoverEnabled(value: BooleanOptional): Self = StObject.set(x, "AutomaticFailoverEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutomaticFailoverEnabledUndefined: Self = StObject.set(x, "AutomaticFailoverEnabled", js.undefined)
    
    inline def setCacheNodeType(value: String): Self = StObject.set(x, "CacheNodeType", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeTypeUndefined: Self = StObject.set(x, "CacheNodeType", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setGlobalReplicationGroupDescription(value: String): Self = StObject.set(x, "GlobalReplicationGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setGlobalReplicationGroupDescriptionUndefined: Self = StObject.set(x, "GlobalReplicationGroupDescription", js.undefined)
    
    inline def setGlobalReplicationGroupId(value: String): Self = StObject.set(x, "GlobalReplicationGroupId", value.asInstanceOf[js.Any])
  }
}
