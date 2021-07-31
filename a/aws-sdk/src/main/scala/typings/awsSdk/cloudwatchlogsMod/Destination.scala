package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destination extends StObject {
  
  /**
    * An IAM policy document that governs which AWS accounts can create subscription filters against this destination.
    */
  var accessPolicy: js.UndefOr[AccessPolicy] = js.undefined
  
  /**
    * The ARN of this destination.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The creation time of the destination, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the destination.
    */
  var destinationName: js.UndefOr[DestinationName] = js.undefined
  
  /**
    * A role for impersonation, used when delivering log events to the target.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the physical target where the log events are delivered (for example, a Kinesis stream).
    */
  var targetArn: js.UndefOr[TargetArn] = js.undefined
}
object Destination {
  
  @scala.inline
  def apply(): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destination]
  }
  
  @scala.inline
  implicit class DestinationMutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPolicy(value: AccessPolicy): Self = StObject.set(x, "accessPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyUndefined: Self = StObject.set(x, "accessPolicy", js.undefined)
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDestinationName(value: DestinationName): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    @scala.inline
    def setTargetArn(value: TargetArn): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetArnUndefined: Self = StObject.set(x, "targetArn", js.undefined)
  }
}
