package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListedFlow extends StObject {
  
  /**
    * The Availability Zone that the flow was created in.
    */
  var AvailabilityZone: string
  
  /**
    * A description of the flow.
    */
  var Description: string
  
  /**
    * The ARN of the flow.
    */
  var FlowArn: string
  
  /**
    * The name of the flow.
    */
  var Name: string
  
  /**
    * The type of source. This value is either owned (originated somewhere other than an AWS Elemental MediaConnect flow owned by another AWS account) or entitled (originated at an AWS Elemental MediaConnect flow owned by another AWS account).
    */
  var SourceType: typings.awsSdk.mediaconnectMod.SourceType
  
  /**
    * The current status of the flow.
    */
  var Status: typings.awsSdk.mediaconnectMod.Status
}
object ListedFlow {
  
  inline def apply(
    AvailabilityZone: string,
    Description: string,
    FlowArn: string,
    Name: string,
    SourceType: SourceType,
    Status: Status
  ): ListedFlow = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedFlow]
  }
  
  extension [Self <: ListedFlow](x: Self) {
    
    inline def setAvailabilityZone(value: string): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
