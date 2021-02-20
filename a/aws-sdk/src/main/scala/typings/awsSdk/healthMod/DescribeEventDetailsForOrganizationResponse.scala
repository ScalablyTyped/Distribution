package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEventDetailsForOrganizationResponse extends StObject {
  
  /**
    * Error messages for any events that could not be retrieved.
    */
  var failedSet: js.UndefOr[DescribeEventDetailsForOrganizationFailedSet] = js.native
  
  /**
    * Information about the events that could be retrieved.
    */
  var successfulSet: js.UndefOr[DescribeEventDetailsForOrganizationSuccessfulSet] = js.native
}
object DescribeEventDetailsForOrganizationResponse {
  
  @scala.inline
  def apply(): DescribeEventDetailsForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventDetailsForOrganizationResponse]
  }
  
  @scala.inline
  implicit class DescribeEventDetailsForOrganizationResponseMutableBuilder[Self <: DescribeEventDetailsForOrganizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedSet(value: DescribeEventDetailsForOrganizationFailedSet): Self = StObject.set(x, "failedSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedSetUndefined: Self = StObject.set(x, "failedSet", js.undefined)
    
    @scala.inline
    def setFailedSetVarargs(value: OrganizationEventDetailsErrorItem*): Self = StObject.set(x, "failedSet", js.Array(value :_*))
    
    @scala.inline
    def setSuccessfulSet(value: DescribeEventDetailsForOrganizationSuccessfulSet): Self = StObject.set(x, "successfulSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulSetUndefined: Self = StObject.set(x, "successfulSet", js.undefined)
    
    @scala.inline
    def setSuccessfulSetVarargs(value: OrganizationEventDetails*): Self = StObject.set(x, "successfulSet", js.Array(value :_*))
  }
}
