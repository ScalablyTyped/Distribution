package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContactFlowResponse extends StObject {
  
  /**
    * Information about the contact flow.
    */
  var ContactFlow: js.UndefOr[typings.awsSdk.connectMod.ContactFlow] = js.undefined
}
object DescribeContactFlowResponse {
  
  @scala.inline
  def apply(): DescribeContactFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContactFlowResponse]
  }
  
  @scala.inline
  implicit class DescribeContactFlowResponseMutableBuilder[Self <: DescribeContactFlowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactFlow(value: ContactFlow): Self = StObject.set(x, "ContactFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactFlowUndefined: Self = StObject.set(x, "ContactFlow", js.undefined)
  }
}
