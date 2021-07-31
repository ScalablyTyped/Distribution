package typings.awsSdk.stsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyDescriptorType extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM managed policy to use as a session policy for the role. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var arn: js.UndefOr[arnType] = js.undefined
}
object PolicyDescriptorType {
  
  @scala.inline
  def apply(): PolicyDescriptorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDescriptorType]
  }
  
  @scala.inline
  implicit class PolicyDescriptorTypeMutableBuilder[Self <: PolicyDescriptorType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: arnType): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
  }
}
