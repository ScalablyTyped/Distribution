package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateGlobalReplicationGroupResult extends StObject {
  
  var GlobalReplicationGroup: js.UndefOr[typings.awsSdk.elasticacheMod.GlobalReplicationGroup] = js.undefined
}
object DisassociateGlobalReplicationGroupResult {
  
  @scala.inline
  def apply(): DisassociateGlobalReplicationGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateGlobalReplicationGroupResult]
  }
  
  @scala.inline
  implicit class DisassociateGlobalReplicationGroupResultMutableBuilder[Self <: DisassociateGlobalReplicationGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalReplicationGroup(value: GlobalReplicationGroup): Self = StObject.set(x, "GlobalReplicationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalReplicationGroupUndefined: Self = StObject.set(x, "GlobalReplicationGroup", js.undefined)
  }
}
