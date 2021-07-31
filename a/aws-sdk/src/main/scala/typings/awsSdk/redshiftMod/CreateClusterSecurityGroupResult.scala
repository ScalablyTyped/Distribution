package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterSecurityGroupResult extends StObject {
  
  var ClusterSecurityGroup: js.UndefOr[typings.awsSdk.redshiftMod.ClusterSecurityGroup] = js.undefined
}
object CreateClusterSecurityGroupResult {
  
  @scala.inline
  def apply(): CreateClusterSecurityGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterSecurityGroupResult]
  }
  
  @scala.inline
  implicit class CreateClusterSecurityGroupResultMutableBuilder[Self <: CreateClusterSecurityGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterSecurityGroup(value: ClusterSecurityGroup): Self = StObject.set(x, "ClusterSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterSecurityGroupUndefined: Self = StObject.set(x, "ClusterSecurityGroup", js.undefined)
  }
}
