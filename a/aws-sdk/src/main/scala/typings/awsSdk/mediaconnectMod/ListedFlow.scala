package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListedFlow extends StObject {
  
  /**
    * The Availability Zone that the flow was created in.
    */
  var AvailabilityZone: string = js.native
  
  /**
    * A description of the flow.
    */
  var Description: string = js.native
  
  /**
    * The ARN of the flow.
    */
  var FlowArn: string = js.native
  
  /**
    * The name of the flow.
    */
  var Name: string = js.native
  
  /**
    * The type of source. This value is either owned (originated somewhere other than an AWS Elemental MediaConnect flow owned by another AWS account) or entitled (originated at an AWS Elemental MediaConnect flow owned by another AWS account).
    */
  var SourceType: typings.awsSdk.mediaconnectMod.SourceType = js.native
  
  /**
    * The current status of the flow.
    */
  var Status: typings.awsSdk.mediaconnectMod.Status = js.native
}
object ListedFlow {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ListedFlowMutableBuilder[Self <: ListedFlow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: string): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
