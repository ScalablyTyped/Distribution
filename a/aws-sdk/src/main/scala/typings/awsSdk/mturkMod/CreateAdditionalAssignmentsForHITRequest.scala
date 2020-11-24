package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAdditionalAssignmentsForHITRequest extends js.Object {
  
  /**
    * The ID of the HIT to extend.
    */
  var HITId: EntityId = js.native
  
  /**
    * The number of additional assignments to request for this HIT.
    */
  var NumberOfAdditionalAssignments: Integer = js.native
  
  /**
    *  A unique identifier for this request, which allows you to retry the call on error without extending the HIT multiple times. This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded on the server. If the extend HIT already exists in the system from a previous call using the same UniqueRequestToken, subsequent calls will return an error with a message containing the request ID. 
    */
  var UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.native
}
object CreateAdditionalAssignmentsForHITRequest {
  
  @scala.inline
  def apply(HITId: EntityId, NumberOfAdditionalAssignments: Integer): CreateAdditionalAssignmentsForHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any], NumberOfAdditionalAssignments = NumberOfAdditionalAssignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAdditionalAssignmentsForHITRequest]
  }
  
  @scala.inline
  implicit class CreateAdditionalAssignmentsForHITRequestOps[Self <: CreateAdditionalAssignmentsForHITRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHITId(value: EntityId): Self = this.set("HITId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfAdditionalAssignments(value: Integer): Self = this.set("NumberOfAdditionalAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueRequestToken(value: IdempotencyToken): Self = this.set("UniqueRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueRequestToken: Self = this.set("UniqueRequestToken", js.undefined)
  }
}
