package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReusableDelegationSetResponse extends js.Object {
  /**
    * A complex type that contains name server information.
    */
  var DelegationSet: typings.awsSdk.route53Mod.DelegationSet = js.native
  /**
    * The unique URL representing the new reusable delegation set.
    */
  var Location: ResourceURI = js.native
}

object CreateReusableDelegationSetResponse {
  @scala.inline
  def apply(DelegationSet: DelegationSet, Location: ResourceURI): CreateReusableDelegationSetResponse = {
    val __obj = js.Dynamic.literal(DelegationSet = DelegationSet.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReusableDelegationSetResponse]
  }
  @scala.inline
  implicit class CreateReusableDelegationSetResponseOps[Self <: CreateReusableDelegationSetResponse] (val x: Self) extends AnyVal {
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
    def setDelegationSet(value: DelegationSet): Self = this.set("DelegationSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: ResourceURI): Self = this.set("Location", value.asInstanceOf[js.Any])
  }
  
}

