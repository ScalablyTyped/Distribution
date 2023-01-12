package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAuditStreamConfigurationResponse extends StObject {
  
  /**
    * The ARN of the Amazon Kinesis data stream that will receive the audit events.
    */
  var AuditStreamArn: js.UndefOr[typings.awsSdk.clientsWorklinkMod.AuditStreamArn] = js.undefined
}
object DescribeAuditStreamConfigurationResponse {
  
  inline def apply(): DescribeAuditStreamConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuditStreamConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAuditStreamConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setAuditStreamArn(value: AuditStreamArn): Self = StObject.set(x, "AuditStreamArn", value.asInstanceOf[js.Any])
    
    inline def setAuditStreamArnUndefined: Self = StObject.set(x, "AuditStreamArn", js.undefined)
  }
}
