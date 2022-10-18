package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScheduledQueryRequest extends StObject {
  
  /**
    * The ARN of the scheduled query.
    */
  var ScheduledQueryArn: AmazonResourceName
}
object DescribeScheduledQueryRequest {
  
  inline def apply(ScheduledQueryArn: AmazonResourceName): DescribeScheduledQueryRequest = {
    val __obj = js.Dynamic.literal(ScheduledQueryArn = ScheduledQueryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduledQueryRequest]
  }
  
  extension [Self <: DescribeScheduledQueryRequest](x: Self) {
    
    inline def setScheduledQueryArn(value: AmazonResourceName): Self = StObject.set(x, "ScheduledQueryArn", value.asInstanceOf[js.Any])
  }
}
