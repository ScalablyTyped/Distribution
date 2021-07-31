package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2InstanceViolation extends StObject {
  
  /**
    * Violations for network interfaces associated with the EC2 instance.
    */
  var AwsEc2NetworkInterfaceViolations: js.UndefOr[typings.awsSdk.fmsMod.AwsEc2NetworkInterfaceViolations] = js.undefined
  
  /**
    * The resource ID of the EC2 instance.
    */
  var ViolationTarget: js.UndefOr[typings.awsSdk.fmsMod.ViolationTarget] = js.undefined
}
object AwsEc2InstanceViolation {
  
  @scala.inline
  def apply(): AwsEc2InstanceViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2InstanceViolation]
  }
  
  @scala.inline
  implicit class AwsEc2InstanceViolationMutableBuilder[Self <: AwsEc2InstanceViolation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsEc2NetworkInterfaceViolations(value: AwsEc2NetworkInterfaceViolations): Self = StObject.set(x, "AwsEc2NetworkInterfaceViolations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsEc2NetworkInterfaceViolationsUndefined: Self = StObject.set(x, "AwsEc2NetworkInterfaceViolations", js.undefined)
    
    @scala.inline
    def setAwsEc2NetworkInterfaceViolationsVarargs(value: AwsEc2NetworkInterfaceViolation*): Self = StObject.set(x, "AwsEc2NetworkInterfaceViolations", js.Array(value :_*))
    
    @scala.inline
    def setViolationTarget(value: ViolationTarget): Self = StObject.set(x, "ViolationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolationTargetUndefined: Self = StObject.set(x, "ViolationTarget", js.undefined)
  }
}
