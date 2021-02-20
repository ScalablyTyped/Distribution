package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIPSetResponse extends StObject {
  
  /**
    * The ID of the IPSet resource.
    */
  var IpSetId: String = js.native
}
object CreateIPSetResponse {
  
  @scala.inline
  def apply(IpSetId: String): CreateIPSetResponse = {
    val __obj = js.Dynamic.literal(IpSetId = IpSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIPSetResponse]
  }
  
  @scala.inline
  implicit class CreateIPSetResponseMutableBuilder[Self <: CreateIPSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpSetId(value: String): Self = StObject.set(x, "IpSetId", value.asInstanceOf[js.Any])
  }
}
