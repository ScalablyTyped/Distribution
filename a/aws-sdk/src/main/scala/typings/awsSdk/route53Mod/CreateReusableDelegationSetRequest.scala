package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReusableDelegationSetRequest extends js.Object {
  
  /**
    * A unique string that identifies the request, and that allows you to retry failed CreateReusableDelegationSet requests without the risk of executing the operation twice. You must use a unique CallerReference string every time you submit a CreateReusableDelegationSet request. CallerReference can be any unique string, for example a date/time stamp.
    */
  var CallerReference: Nonce = js.native
  
  /**
    * If you want to mark the delegation set for an existing hosted zone as reusable, the ID for that hosted zone.
    */
  var HostedZoneId: js.UndefOr[ResourceId] = js.native
}
object CreateReusableDelegationSetRequest {
  
  @scala.inline
  def apply(CallerReference: Nonce): CreateReusableDelegationSetRequest = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReusableDelegationSetRequest]
  }
  
  @scala.inline
  implicit class CreateReusableDelegationSetRequestOps[Self <: CreateReusableDelegationSetRequest] (val x: Self) extends AnyVal {
    
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
    def setCallerReference(value: Nonce): Self = this.set("CallerReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneId(value: ResourceId): Self = this.set("HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostedZoneId: Self = this.set("HostedZoneId", js.undefined)
  }
}
