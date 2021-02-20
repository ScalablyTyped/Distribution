package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAuditStreamConfigurationResponse extends StObject {
  
  /**
    * The ARN of the Amazon Kinesis data stream that will receive the audit events.
    */
  var AuditStreamArn: js.UndefOr[typings.awsSdk.worklinkMod.AuditStreamArn] = js.native
}
object DescribeAuditStreamConfigurationResponse {
  
  @scala.inline
  def apply(): DescribeAuditStreamConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuditStreamConfigurationResponse]
  }
  
  @scala.inline
  implicit class DescribeAuditStreamConfigurationResponseMutableBuilder[Self <: DescribeAuditStreamConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuditStreamArn(value: AuditStreamArn): Self = StObject.set(x, "AuditStreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditStreamArnUndefined: Self = StObject.set(x, "AuditStreamArn", js.undefined)
  }
}
