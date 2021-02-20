package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceSecurityGroup extends StObject {
  
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[SecurityGroupName] = js.native
  
  /**
    * The owner of the security group.
    */
  var OwnerAlias: js.UndefOr[SecurityGroupOwnerAlias] = js.native
}
object SourceSecurityGroup {
  
  @scala.inline
  def apply(): SourceSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSecurityGroup]
  }
  
  @scala.inline
  implicit class SourceSecurityGroupMutableBuilder[Self <: SourceSecurityGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupName(value: SecurityGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setOwnerAlias(value: SecurityGroupOwnerAlias): Self = StObject.set(x, "OwnerAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAliasUndefined: Self = StObject.set(x, "OwnerAlias", js.undefined)
  }
}
