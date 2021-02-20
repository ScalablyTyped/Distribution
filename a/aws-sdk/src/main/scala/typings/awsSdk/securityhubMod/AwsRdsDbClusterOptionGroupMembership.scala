package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbClusterOptionGroupMembership extends StObject {
  
  /**
    * The name of the DB cluster option group.
    */
  var DbClusterOptionGroupName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of the DB cluster option group.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbClusterOptionGroupMembership {
  
  @scala.inline
  def apply(): AwsRdsDbClusterOptionGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbClusterOptionGroupMembership]
  }
  
  @scala.inline
  implicit class AwsRdsDbClusterOptionGroupMembershipMutableBuilder[Self <: AwsRdsDbClusterOptionGroupMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDbClusterOptionGroupName(value: NonEmptyString): Self = StObject.set(x, "DbClusterOptionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterOptionGroupNameUndefined: Self = StObject.set(x, "DbClusterOptionGroupName", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
