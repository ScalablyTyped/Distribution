package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayMulticastDomain extends js.Object {
  /**
    * The time the transit gateway multicast domain was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  /**
    * The state of the transit gateway multicast domain.
    */
  var State: js.UndefOr[TransitGatewayMulticastDomainState] = js.native
  /**
    * The tags for the transit gateway multicast domain.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[String] = js.native
}

object TransitGatewayMulticastDomain {
  @scala.inline
  def apply(): TransitGatewayMulticastDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayMulticastDomain]
  }
  @scala.inline
  implicit class TransitGatewayMulticastDomainOps[Self <: TransitGatewayMulticastDomain] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: DateTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setState(value: TransitGatewayMulticastDomainState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTransitGatewayId(value: String): Self = this.set("TransitGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayId: Self = this.set("TransitGatewayId", js.undefined)
    @scala.inline
    def setTransitGatewayMulticastDomainId(value: String): Self = this.set("TransitGatewayMulticastDomainId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayMulticastDomainId: Self = this.set("TransitGatewayMulticastDomainId", js.undefined)
  }
  
}

