package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEventDetailsForOrganizationRequest extends StObject {
  
  /**
    * The locale (language) to return information in. English (en) is the default and the only supported value at this time.
    */
  var locale: js.UndefOr[typings.awsSdk.healthMod.locale] = js.native
  
  /**
    * A set of JSON elements that includes the awsAccountId and the eventArn.
    */
  var organizationEventDetailFilters: OrganizationEventDetailFiltersList = js.native
}
object DescribeEventDetailsForOrganizationRequest {
  
  @scala.inline
  def apply(organizationEventDetailFilters: OrganizationEventDetailFiltersList): DescribeEventDetailsForOrganizationRequest = {
    val __obj = js.Dynamic.literal(organizationEventDetailFilters = organizationEventDetailFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventDetailsForOrganizationRequest]
  }
  
  @scala.inline
  implicit class DescribeEventDetailsForOrganizationRequestMutableBuilder[Self <: DescribeEventDetailsForOrganizationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setOrganizationEventDetailFilters(value: OrganizationEventDetailFiltersList): Self = StObject.set(x, "organizationEventDetailFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationEventDetailFiltersVarargs(value: EventAccountFilter*): Self = StObject.set(x, "organizationEventDetailFilters", js.Array(value :_*))
  }
}
