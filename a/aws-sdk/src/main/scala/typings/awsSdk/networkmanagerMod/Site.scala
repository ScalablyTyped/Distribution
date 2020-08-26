package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Site extends js.Object {
  /**
    * The date and time that the site was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  /**
    * The description of the site.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  /**
    * The location of the site.
    */
  var Location: js.UndefOr[typings.awsSdk.networkmanagerMod.Location] = js.native
  /**
    * The Amazon Resource Name (ARN) of the site.
    */
  var SiteArn: js.UndefOr[String] = js.native
  /**
    * The ID of the site.
    */
  var SiteId: js.UndefOr[String] = js.native
  /**
    * The state of the site.
    */
  var State: js.UndefOr[SiteState] = js.native
  /**
    * The tags for the site.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object Site {
  @scala.inline
  def apply(): Site = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Site]
  }
  @scala.inline
  implicit class SiteOps[Self <: Site] (val x: Self) extends AnyVal {
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
    def setGlobalNetworkId(value: String): Self = this.set("GlobalNetworkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalNetworkId: Self = this.set("GlobalNetworkId", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    @scala.inline
    def setSiteArn(value: String): Self = this.set("SiteArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteArn: Self = this.set("SiteArn", js.undefined)
    @scala.inline
    def setSiteId(value: String): Self = this.set("SiteId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteId: Self = this.set("SiteId", js.undefined)
    @scala.inline
    def setState(value: SiteState): Self = this.set("State", value.asInstanceOf[js.Any])
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

