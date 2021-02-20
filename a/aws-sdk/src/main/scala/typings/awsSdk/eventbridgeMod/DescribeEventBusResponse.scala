package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEventBusResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the account permitted to write events to the current account.
    */
  var Arn: js.UndefOr[String] = js.native
  
  /**
    * The name of the event bus. Currently, this is always default.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The policy that enables the external account to send events to your account.
    */
  var Policy: js.UndefOr[String] = js.native
}
object DescribeEventBusResponse {
  
  @scala.inline
  def apply(): DescribeEventBusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventBusResponse]
  }
  
  @scala.inline
  implicit class DescribeEventBusResponseMutableBuilder[Self <: DescribeEventBusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
