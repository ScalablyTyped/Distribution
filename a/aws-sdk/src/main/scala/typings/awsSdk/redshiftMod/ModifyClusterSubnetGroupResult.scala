package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterSubnetGroupResult extends StObject {
  
  var ClusterSubnetGroup: js.UndefOr[typings.awsSdk.redshiftMod.ClusterSubnetGroup] = js.undefined
}
object ModifyClusterSubnetGroupResult {
  
  inline def apply(): ModifyClusterSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyClusterSubnetGroupResult]
  }
  
  extension [Self <: ModifyClusterSubnetGroupResult](x: Self) {
    
    inline def setClusterSubnetGroup(value: ClusterSubnetGroup): Self = StObject.set(x, "ClusterSubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setClusterSubnetGroupUndefined: Self = StObject.set(x, "ClusterSubnetGroup", js.undefined)
  }
}
