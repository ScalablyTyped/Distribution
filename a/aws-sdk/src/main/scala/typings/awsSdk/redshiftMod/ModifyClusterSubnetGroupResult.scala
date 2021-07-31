package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterSubnetGroupResult extends StObject {
  
  var ClusterSubnetGroup: js.UndefOr[typings.awsSdk.redshiftMod.ClusterSubnetGroup] = js.undefined
}
object ModifyClusterSubnetGroupResult {
  
  @scala.inline
  def apply(): ModifyClusterSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyClusterSubnetGroupResult]
  }
  
  @scala.inline
  implicit class ModifyClusterSubnetGroupResultMutableBuilder[Self <: ModifyClusterSubnetGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterSubnetGroup(value: ClusterSubnetGroup): Self = StObject.set(x, "ClusterSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterSubnetGroupUndefined: Self = StObject.set(x, "ClusterSubnetGroup", js.undefined)
  }
}
