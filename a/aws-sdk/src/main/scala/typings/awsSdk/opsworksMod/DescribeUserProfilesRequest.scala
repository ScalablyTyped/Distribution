package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserProfilesRequest extends StObject {
  
  /**
    * An array of IAM or federated user ARNs that identify the users to be described.
    */
  var IamUserArns: js.UndefOr[Strings] = js.native
}
object DescribeUserProfilesRequest {
  
  @scala.inline
  def apply(): DescribeUserProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserProfilesRequest]
  }
  
  @scala.inline
  implicit class DescribeUserProfilesRequestMutableBuilder[Self <: DescribeUserProfilesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIamUserArns(value: Strings): Self = StObject.set(x, "IamUserArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamUserArnsUndefined: Self = StObject.set(x, "IamUserArns", js.undefined)
    
    @scala.inline
    def setIamUserArnsVarargs(value: String*): Self = StObject.set(x, "IamUserArns", js.Array(value :_*))
  }
}
