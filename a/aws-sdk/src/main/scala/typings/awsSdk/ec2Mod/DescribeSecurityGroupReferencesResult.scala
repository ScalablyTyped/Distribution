package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSecurityGroupReferencesResult extends js.Object {
  
  /**
    * Information about the VPCs with the referencing security groups.
    */
  var SecurityGroupReferenceSet: js.UndefOr[SecurityGroupReferences] = js.native
}
object DescribeSecurityGroupReferencesResult {
  
  @scala.inline
  def apply(): DescribeSecurityGroupReferencesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecurityGroupReferencesResult]
  }
  
  @scala.inline
  implicit class DescribeSecurityGroupReferencesResultOps[Self <: DescribeSecurityGroupReferencesResult] (val x: Self) extends AnyVal {
    
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
    def setSecurityGroupReferenceSetVarargs(value: SecurityGroupReference*): Self = this.set("SecurityGroupReferenceSet", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupReferenceSet(value: SecurityGroupReferences): Self = this.set("SecurityGroupReferenceSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupReferenceSet: Self = this.set("SecurityGroupReferenceSet", js.undefined)
  }
}
