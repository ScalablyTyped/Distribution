package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlarmIdentifier extends StObject {
  
  /**
    * The name of the CloudWatch alarm that you want Amazon Route 53 health checkers to use to determine whether this health check is healthy.  Route 53 supports CloudWatch alarms with the following features:   Standard-resolution metrics. High-resolution metrics aren't supported. For more information, see High-Resolution Metrics in the Amazon CloudWatch User Guide.   Statistics: Average, Minimum, Maximum, Sum, and SampleCount. Extended statistics aren't supported.   
    */
  var Name: AlarmName = js.native
  
  /**
    * For the CloudWatch alarm that you want Route 53 health checkers to use to determine whether this health check is healthy, the region that the alarm was created in. For the current list of CloudWatch regions, see Amazon CloudWatch in the AWS Service Endpoints chapter of the Amazon Web Services General Reference.
    */
  var Region: CloudWatchRegion = js.native
}
object AlarmIdentifier {
  
  @scala.inline
  def apply(Name: AlarmName, Region: CloudWatchRegion): AlarmIdentifier = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlarmIdentifier]
  }
  
  @scala.inline
  implicit class AlarmIdentifierMutableBuilder[Self <: AlarmIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: AlarmName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: CloudWatchRegion): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
  }
}
