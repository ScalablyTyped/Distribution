package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcClassicLink extends js.Object {
  /**
    * Indicates whether the VPC is enabled for ClassicLink.
    */
  var ClassicLinkEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Any tags assigned to the VPC.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object VpcClassicLink {
  @scala.inline
  def apply(ClassicLinkEnabled: js.UndefOr[Boolean] = js.undefined, Tags: TagList = null, VpcId: String = null): VpcClassicLink = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ClassicLinkEnabled)) __obj.updateDynamic("ClassicLinkEnabled")(ClassicLinkEnabled.get.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcClassicLink]
  }
}

