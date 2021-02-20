package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerListenerDescription extends StObject {
  
  /**
    * Information about the listener.
    */
  var Listener: js.UndefOr[AwsElbLoadBalancerListener] = js.native
  
  /**
    * The policies enabled for the listener.
    */
  var PolicyNames: js.UndefOr[StringList] = js.native
}
object AwsElbLoadBalancerListenerDescription {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerListenerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerListenerDescription]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerListenerDescriptionMutableBuilder[Self <: AwsElbLoadBalancerListenerDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListener(value: AwsElbLoadBalancerListener): Self = StObject.set(x, "Listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerUndefined: Self = StObject.set(x, "Listener", js.undefined)
    
    @scala.inline
    def setPolicyNames(value: StringList): Self = StObject.set(x, "PolicyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNamesUndefined: Self = StObject.set(x, "PolicyNames", js.undefined)
    
    @scala.inline
    def setPolicyNamesVarargs(value: NonEmptyString*): Self = StObject.set(x, "PolicyNames", js.Array(value :_*))
  }
}
