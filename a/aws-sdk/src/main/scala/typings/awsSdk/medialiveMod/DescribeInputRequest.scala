package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInputRequest extends StObject {
  
  /**
    * Unique ID of the input
    */
  var InputId: string = js.native
}
object DescribeInputRequest {
  
  @scala.inline
  def apply(InputId: string): DescribeInputRequest = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInputRequest]
  }
  
  @scala.inline
  implicit class DescribeInputRequestMutableBuilder[Self <: DescribeInputRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputId(value: string): Self = StObject.set(x, "InputId", value.asInstanceOf[js.Any])
  }
}
