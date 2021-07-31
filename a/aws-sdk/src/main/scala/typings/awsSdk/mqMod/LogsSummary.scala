package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogsSummary extends StObject {
  
  /**
    * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
    */
  var Audit: js.UndefOr[boolean] = js.undefined
  
  /**
    * The location of the CloudWatch Logs log group where audit logs are sent.
    */
  var AuditLogGroup: js.UndefOr[string] = js.undefined
  
  /**
    * Enables general logging.
    */
  var General: js.UndefOr[boolean] = js.undefined
  
  /**
    * The location of the CloudWatch Logs log group where general logs are sent.
    */
  var GeneralLogGroup: js.UndefOr[string] = js.undefined
  
  /**
    * The list of information about logs pending to be deployed for the specified broker.
    */
  var Pending: js.UndefOr[PendingLogs] = js.undefined
}
object LogsSummary {
  
  @scala.inline
  def apply(): LogsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogsSummary]
  }
  
  @scala.inline
  implicit class LogsSummaryMutableBuilder[Self <: LogsSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudit(value: boolean): Self = StObject.set(x, "Audit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditLogGroup(value: string): Self = StObject.set(x, "AuditLogGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditLogGroupUndefined: Self = StObject.set(x, "AuditLogGroup", js.undefined)
    
    @scala.inline
    def setAuditUndefined: Self = StObject.set(x, "Audit", js.undefined)
    
    @scala.inline
    def setGeneral(value: boolean): Self = StObject.set(x, "General", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneralLogGroup(value: string): Self = StObject.set(x, "GeneralLogGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneralLogGroupUndefined: Self = StObject.set(x, "GeneralLogGroup", js.undefined)
    
    @scala.inline
    def setGeneralUndefined: Self = StObject.set(x, "General", js.undefined)
    
    @scala.inline
    def setPending(value: PendingLogs): Self = StObject.set(x, "Pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUndefined: Self = StObject.set(x, "Pending", js.undefined)
  }
}
