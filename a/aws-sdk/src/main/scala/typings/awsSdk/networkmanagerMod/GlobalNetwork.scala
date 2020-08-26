package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalNetwork extends js.Object {
  /**
    * The date and time that the global network was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  /**
    * The description of the global network.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the global network.
    */
  var GlobalNetworkArn: js.UndefOr[String] = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  /**
    * The state of the global network.
    */
  var State: js.UndefOr[GlobalNetworkState] = js.native
  /**
    * The tags for the global network.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object GlobalNetwork {
  @scala.inline
  def apply(): GlobalNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalNetwork]
  }
  @scala.inline
  implicit class GlobalNetworkOps[Self <: GlobalNetwork] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: DateTime): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setGlobalNetworkArn(value: String): Self = this.set("GlobalNetworkArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalNetworkArn: Self = this.set("GlobalNetworkArn", js.undefined)
    @scala.inline
    def setGlobalNetworkId(value: String): Self = this.set("GlobalNetworkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalNetworkId: Self = this.set("GlobalNetworkId", js.undefined)
    @scala.inline
    def setState(value: GlobalNetworkState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

