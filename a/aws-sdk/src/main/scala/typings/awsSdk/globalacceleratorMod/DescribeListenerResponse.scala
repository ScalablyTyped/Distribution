package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeListenerResponse extends StObject {
  
  /**
    * The description of a listener.
    */
  var Listener: js.UndefOr[typings.awsSdk.globalacceleratorMod.Listener] = js.native
}
object DescribeListenerResponse {
  
  @scala.inline
  def apply(): DescribeListenerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeListenerResponse]
  }
  
  @scala.inline
  implicit class DescribeListenerResponseMutableBuilder[Self <: DescribeListenerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListener(value: Listener): Self = StObject.set(x, "Listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerUndefined: Self = StObject.set(x, "Listener", js.undefined)
  }
}
