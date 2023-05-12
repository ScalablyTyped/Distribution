package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTargetGroupResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var arn: js.UndefOr[TargetGroupArn] = js.undefined
  
  /**
    * The target group configuration.
    */
  var config: js.UndefOr[TargetGroupConfig] = js.undefined
  
  /**
    * The date and time that the target group was created, specified in ISO-8601 format.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The failure code.
    */
  var failureCode: js.UndefOr[String] = js.undefined
  
  /**
    * The failure message.
    */
  var failureMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the target group.
    */
  var id: js.UndefOr[TargetGroupId] = js.undefined
  
  /**
    * The date and time that the target group was last updated, specified in ISO-8601 format.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the target group.
    */
  var name: js.UndefOr[TargetGroupName] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the service.
    */
  var serviceArns: js.UndefOr[ServiceArnList] = js.undefined
  
  /**
    * The status.
    */
  var status: js.UndefOr[TargetGroupStatus] = js.undefined
  
  /**
    * The target group type.
    */
  var `type`: js.UndefOr[TargetGroupType] = js.undefined
}
object GetTargetGroupResponse {
  
  inline def apply(): GetTargetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTargetGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTargetGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: TargetGroupArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setConfig(value: TargetGroupConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setFailureCode(value: String): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "failureMessage", js.undefined)
    
    inline def setId(value: TargetGroupId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setName(value: TargetGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServiceArns(value: ServiceArnList): Self = StObject.set(x, "serviceArns", value.asInstanceOf[js.Any])
    
    inline def setServiceArnsUndefined: Self = StObject.set(x, "serviceArns", js.undefined)
    
    inline def setServiceArnsVarargs(value: ServiceArn*): Self = StObject.set(x, "serviceArns", js.Array(value*))
    
    inline def setStatus(value: TargetGroupStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: TargetGroupType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
