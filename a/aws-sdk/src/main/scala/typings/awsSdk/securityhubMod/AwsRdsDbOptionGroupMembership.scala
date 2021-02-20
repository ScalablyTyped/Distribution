package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbOptionGroupMembership extends StObject {
  
  /**
    * 
    */
  var OptionGroupName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbOptionGroupMembership {
  
  @scala.inline
  def apply(): AwsRdsDbOptionGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbOptionGroupMembership]
  }
  
  @scala.inline
  implicit class AwsRdsDbOptionGroupMembershipMutableBuilder[Self <: AwsRdsDbOptionGroupMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptionGroupName(value: NonEmptyString): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
