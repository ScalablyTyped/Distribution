package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAuditStreamConfigurationResponse extends StObject {
  
  /**
    * The ARN of the Amazon Kinesis data stream that will receive the audit events.
    */
  var AuditStreamArn: js.UndefOr[typings.awsSdk.worklinkMod.AuditStreamArn] = js.undefined
}
object DescribeAuditStreamConfigurationResponse {
  
  inline def apply(): DescribeAuditStreamConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuditStreamConfigurationResponse]
  }
  
  extension [Self <: DescribeAuditStreamConfigurationResponse](x: Self) {
    
    inline def setAuditStreamArn(value: AuditStreamArn): Self = StObject.set(x, "AuditStreamArn", value.asInstanceOf[js.Any])
    
    inline def setAuditStreamArnUndefined: Self = StObject.set(x, "AuditStreamArn", js.undefined)
  }
}
