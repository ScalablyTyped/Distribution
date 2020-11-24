package typings.branchSdk.mod

import typings.branchSdk.anon.Dictcustomkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeepLinkData extends js.Object {
  
  /**
    * Use this field to organize the links by actual campaign. For example, if you launched a new feature or product and want to run a campaign around that
    */
  var campaign: js.UndefOr[String] = js.native
  
  // Analytical labels
  /**
    * Use channel to tag the route that your link reaches users. For example, tag links with 'Facebook' or 'LinkedIn' to help track clicks and installs through those paths separately
    */
  var channel: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[Dictcustomkey] = js.native
  
  /**
    * This is the feature of your app that the link might be associated with. For example, if you had built a referral program, you would label links with the feature 'referral'
    */
  var feature: js.UndefOr[String] = js.native
  
  /**
    * Use this to categorize the progress or category of a user when the link was generated.
    * For example, if you had an invite system accessible on level 1, level 3 and 5, you could differentiate links generated at each level with this parameter.
    */
  var stage: js.UndefOr[String] = js.native
  
  /**
    * This is a free form entry with unlimited values ['string']. Use it to organize your link data with labels that don't fit within the bounds of the above
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object DeepLinkData {
  
  @scala.inline
  def apply(): DeepLinkData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepLinkData]
  }
  
  @scala.inline
  implicit class DeepLinkDataOps[Self <: DeepLinkData] (val x: Self) extends AnyVal {
    
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
    def setCampaign(value: String): Self = this.set("campaign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaign: Self = this.set("campaign", js.undefined)
    
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setData(value: Dictcustomkey): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFeature(value: String): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeature: Self = this.set("feature", js.undefined)
    
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
