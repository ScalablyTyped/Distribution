package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheParameterGroupStatus extends StObject {
  
  /**
    * A list of the cache node IDs which need to be rebooted for parameter changes to be applied. A node ID is a numeric identifier (0001, 0002, etc.).
    */
  var CacheNodeIdsToReboot: js.UndefOr[CacheNodeIdsList] = js.undefined
  
  /**
    * The name of the cache parameter group.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of parameter updates.
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.undefined
}
object CacheParameterGroupStatus {
  
  @scala.inline
  def apply(): CacheParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheParameterGroupStatus]
  }
  
  @scala.inline
  implicit class CacheParameterGroupStatusMutableBuilder[Self <: CacheParameterGroupStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheNodeIdsToReboot(value: CacheNodeIdsList): Self = StObject.set(x, "CacheNodeIdsToReboot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeIdsToRebootUndefined: Self = StObject.set(x, "CacheNodeIdsToReboot", js.undefined)
    
    @scala.inline
    def setCacheNodeIdsToRebootVarargs(value: String*): Self = StObject.set(x, "CacheNodeIdsToReboot", js.Array(value :_*))
    
    @scala.inline
    def setCacheParameterGroupName(value: String): Self = StObject.set(x, "CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheParameterGroupNameUndefined: Self = StObject.set(x, "CacheParameterGroupName", js.undefined)
    
    @scala.inline
    def setParameterApplyStatus(value: String): Self = StObject.set(x, "ParameterApplyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterApplyStatusUndefined: Self = StObject.set(x, "ParameterApplyStatus", js.undefined)
  }
}
