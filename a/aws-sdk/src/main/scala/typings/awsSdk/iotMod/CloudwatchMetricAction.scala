package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudwatchMetricAction extends StObject {
  
  /**
    * The CloudWatch metric name.
    */
  var metricName: String = js.native
  
  /**
    * The CloudWatch metric namespace name.
    */
  var metricNamespace: String = js.native
  
  /**
    * An optional Unix timestamp.
    */
  var metricTimestamp: js.UndefOr[String] = js.native
  
  /**
    * The metric unit supported by CloudWatch.
    */
  var metricUnit: String = js.native
  
  /**
    * The CloudWatch metric value.
    */
  var metricValue: String = js.native
  
  /**
    * The IAM role that allows access to the CloudWatch metric.
    */
  var roleArn: AwsArn = js.native
}
object CloudwatchMetricAction {
  
  @scala.inline
  def apply(
    metricName: String,
    metricNamespace: String,
    metricUnit: String,
    metricValue: String,
    roleArn: AwsArn
  ): CloudwatchMetricAction = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricNamespace = metricNamespace.asInstanceOf[js.Any], metricUnit = metricUnit.asInstanceOf[js.Any], metricValue = metricValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchMetricAction]
  }
  
  @scala.inline
  implicit class CloudwatchMetricActionMutableBuilder[Self <: CloudwatchMetricAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNamespace(value: String): Self = StObject.set(x, "metricNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricTimestamp(value: String): Self = StObject.set(x, "metricTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricTimestampUndefined: Self = StObject.set(x, "metricTimestamp", js.undefined)
    
    @scala.inline
    def setMetricUnit(value: String): Self = StObject.set(x, "metricUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricValue(value: String): Self = StObject.set(x, "metricValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
