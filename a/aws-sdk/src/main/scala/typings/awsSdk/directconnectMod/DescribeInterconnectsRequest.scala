package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInterconnectsRequest extends StObject {
  
  /**
    * The ID of the interconnect.
    */
  var interconnectId: js.UndefOr[InterconnectId] = js.native
}
object DescribeInterconnectsRequest {
  
  @scala.inline
  def apply(): DescribeInterconnectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInterconnectsRequest]
  }
  
  @scala.inline
  implicit class DescribeInterconnectsRequestMutableBuilder[Self <: DescribeInterconnectsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterconnectId(value: InterconnectId): Self = StObject.set(x, "interconnectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterconnectIdUndefined: Self = StObject.set(x, "interconnectId", js.undefined)
  }
}
