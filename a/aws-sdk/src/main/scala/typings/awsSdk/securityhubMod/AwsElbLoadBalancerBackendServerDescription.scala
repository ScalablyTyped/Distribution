package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbLoadBalancerBackendServerDescription extends StObject {
  
  /**
    * The port on which the EC2 instance is listening.
    */
  var InstancePort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The names of the policies that are enabled for the EC2 instance.
    */
  var PolicyNames: js.UndefOr[StringList] = js.undefined
}
object AwsElbLoadBalancerBackendServerDescription {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerBackendServerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerBackendServerDescription]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerBackendServerDescriptionMutableBuilder[Self <: AwsElbLoadBalancerBackendServerDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstancePort(value: Integer): Self = StObject.set(x, "InstancePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancePortUndefined: Self = StObject.set(x, "InstancePort", js.undefined)
    
    @scala.inline
    def setPolicyNames(value: StringList): Self = StObject.set(x, "PolicyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNamesUndefined: Self = StObject.set(x, "PolicyNames", js.undefined)
    
    @scala.inline
    def setPolicyNamesVarargs(value: NonEmptyString*): Self = StObject.set(x, "PolicyNames", js.Array(value :_*))
  }
}
