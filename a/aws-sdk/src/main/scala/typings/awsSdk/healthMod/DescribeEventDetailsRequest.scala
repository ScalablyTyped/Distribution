package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventDetailsRequest extends StObject {
  
  /**
    * A list of event ARNs (unique identifiers). For example: "arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101" 
    */
  var eventArns: eventArnList
  
  /**
    * The locale (language) to return information in. English (en) is the default and the only supported value at this time.
    */
  var locale: js.UndefOr[typings.awsSdk.healthMod.locale] = js.undefined
}
object DescribeEventDetailsRequest {
  
  @scala.inline
  def apply(eventArns: eventArnList): DescribeEventDetailsRequest = {
    val __obj = js.Dynamic.literal(eventArns = eventArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventDetailsRequest]
  }
  
  @scala.inline
  implicit class DescribeEventDetailsRequestMutableBuilder[Self <: DescribeEventDetailsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventArns(value: eventArnList): Self = StObject.set(x, "eventArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventArnsVarargs(value: eventArn*): Self = StObject.set(x, "eventArns", js.Array(value :_*))
    
    @scala.inline
    def setLocale(value: locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
