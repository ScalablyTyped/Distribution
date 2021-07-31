package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountAttributesRequest extends StObject {
  
  /**
    * The account attribute names.
    */
  var AttributeNames: js.UndefOr[AccountAttributeNameStringList] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object DescribeAccountAttributesRequest {
  
  @scala.inline
  def apply(): DescribeAccountAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesRequest]
  }
  
  @scala.inline
  implicit class DescribeAccountAttributesRequestMutableBuilder[Self <: DescribeAccountAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeNames(value: AccountAttributeNameStringList): Self = StObject.set(x, "AttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNamesUndefined: Self = StObject.set(x, "AttributeNames", js.undefined)
    
    @scala.inline
    def setAttributeNamesVarargs(value: AccountAttributeName*): Self = StObject.set(x, "AttributeNames", js.Array(value :_*))
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
