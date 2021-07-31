package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeListenerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the listener to describe.
    */
  var ListenerArn: GenericString
}
object DescribeListenerRequest {
  
  @scala.inline
  def apply(ListenerArn: GenericString): DescribeListenerRequest = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeListenerRequest]
  }
  
  @scala.inline
  implicit class DescribeListenerRequestMutableBuilder[Self <: DescribeListenerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListenerArn(value: GenericString): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
  }
}
