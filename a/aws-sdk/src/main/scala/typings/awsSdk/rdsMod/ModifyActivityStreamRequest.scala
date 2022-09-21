package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyActivityStreamRequest extends StObject {
  
  /**
    * The audit policy state. When a policy is unlocked, it is read/write. When it is locked, it is read-only. You can edit your audit policy only when the activity stream is unlocked or stopped.
    */
  var AuditPolicyState: js.UndefOr[typings.awsSdk.rdsMod.AuditPolicyState] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the RDS for Oracle DB instance, for example, arn:aws:rds:us-east-1:12345667890:instance:my-orcl-db.
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
}
object ModifyActivityStreamRequest {
  
  inline def apply(): ModifyActivityStreamRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyActivityStreamRequest]
  }
  
  extension [Self <: ModifyActivityStreamRequest](x: Self) {
    
    inline def setAuditPolicyState(value: AuditPolicyState): Self = StObject.set(x, "AuditPolicyState", value.asInstanceOf[js.Any])
    
    inline def setAuditPolicyStateUndefined: Self = StObject.set(x, "AuditPolicyState", js.undefined)
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
