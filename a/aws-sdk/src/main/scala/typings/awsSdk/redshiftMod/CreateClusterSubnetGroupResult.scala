package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClusterSubnetGroupResult extends StObject {
  
  var ClusterSubnetGroup: js.UndefOr[typings.awsSdk.redshiftMod.ClusterSubnetGroup] = js.native
}
object CreateClusterSubnetGroupResult {
  
  @scala.inline
  def apply(): CreateClusterSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterSubnetGroupResult]
  }
  
  @scala.inline
  implicit class CreateClusterSubnetGroupResultMutableBuilder[Self <: CreateClusterSubnetGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterSubnetGroup(value: ClusterSubnetGroup): Self = StObject.set(x, "ClusterSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterSubnetGroupUndefined: Self = StObject.set(x, "ClusterSubnetGroup", js.undefined)
  }
}
