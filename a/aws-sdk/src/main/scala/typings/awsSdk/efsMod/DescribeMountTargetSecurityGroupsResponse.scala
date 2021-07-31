package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMountTargetSecurityGroupsResponse extends StObject {
  
  /**
    * An array of security groups.
    */
  var SecurityGroups: typings.awsSdk.efsMod.SecurityGroups
}
object DescribeMountTargetSecurityGroupsResponse {
  
  @scala.inline
  def apply(SecurityGroups: SecurityGroups): DescribeMountTargetSecurityGroupsResponse = {
    val __obj = js.Dynamic.literal(SecurityGroups = SecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMountTargetSecurityGroupsResponse]
  }
  
  @scala.inline
  implicit class DescribeMountTargetSecurityGroupsResponseMutableBuilder[Self <: DescribeMountTargetSecurityGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroup*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
  }
}
