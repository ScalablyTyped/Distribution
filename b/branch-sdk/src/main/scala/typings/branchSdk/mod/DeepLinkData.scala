package typings.branchSdk.mod

import typings.branchSdk.anon.Dictcustomkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepLinkData extends js.Object {
  /**
    * Use this field to organize the links by actual campaign. For example, if you launched a new feature or product and want to run a campaign around that
    */
  var campaign: js.UndefOr[String] = js.undefined
  // Analytical labels
  /**
    * Use channel to tag the route that your link reaches users. For example, tag links with 'Facebook' or 'LinkedIn' to help track clicks and installs through those paths separately
    */
  var channel: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[Dictcustomkey] = js.undefined
  /**
    * This is the feature of your app that the link might be associated with. For example, if you had built a referral program, you would label links with the feature 'referral'
    */
  var feature: js.UndefOr[String] = js.undefined
  /**
    * Use this to categorize the progress or category of a user when the link was generated.
    * For example, if you had an invite system accessible on level 1, level 3 and 5, you could differentiate links generated at each level with this parameter.
    */
  var stage: js.UndefOr[String] = js.undefined
  /**
    * This is a free form entry with unlimited values ['string']. Use it to organize your link data with labels that don't fit within the bounds of the above
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object DeepLinkData {
  @scala.inline
  def apply(
    campaign: String = null,
    channel: String = null,
    data: Dictcustomkey = null,
    feature: String = null,
    stage: String = null,
    tags: js.Array[String] = null
  ): DeepLinkData = {
    val __obj = js.Dynamic.literal()
    if (campaign != null) __obj.updateDynamic("campaign")(campaign.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (feature != null) __obj.updateDynamic("feature")(feature.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepLinkData]
  }
}

