package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutDestinationPolicyRequest extends js.Object {
  
  /**
    * An IAM policy document that authorizes cross-account users to deliver their log events to the associated destination. This can be up to 5120 bytes.
    */
  var accessPolicy: AccessPolicy = js.native
  
  /**
    * A name for an existing destination.
    */
  var destinationName: DestinationName = js.native
}
object PutDestinationPolicyRequest {
  
  @scala.inline
  def apply(accessPolicy: AccessPolicy, destinationName: DestinationName): PutDestinationPolicyRequest = {
    val __obj = js.Dynamic.literal(accessPolicy = accessPolicy.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDestinationPolicyRequest]
  }
  
  @scala.inline
  implicit class PutDestinationPolicyRequestOps[Self <: PutDestinationPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessPolicy(value: AccessPolicy): Self = this.set("accessPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationName(value: DestinationName): Self = this.set("destinationName", value.asInstanceOf[js.Any])
  }
}
