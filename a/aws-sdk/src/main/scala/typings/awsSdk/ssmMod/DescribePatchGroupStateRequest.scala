package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePatchGroupStateRequest extends StObject {
  
  /**
    * The name of the patch group whose patch snapshot should be retrieved.
    */
  var PatchGroup: typings.awsSdk.ssmMod.PatchGroup = js.native
}
object DescribePatchGroupStateRequest {
  
  @scala.inline
  def apply(PatchGroup: PatchGroup): DescribePatchGroupStateRequest = {
    val __obj = js.Dynamic.literal(PatchGroup = PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePatchGroupStateRequest]
  }
  
  @scala.inline
  implicit class DescribePatchGroupStateRequestMutableBuilder[Self <: DescribePatchGroupStateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPatchGroup(value: PatchGroup): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
  }
}
