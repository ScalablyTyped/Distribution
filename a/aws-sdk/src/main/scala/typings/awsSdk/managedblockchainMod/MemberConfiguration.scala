package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberConfiguration extends js.Object {
  /**
    * An optional description of the member.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * Configuration properties of the blockchain framework relevant to the member.
    */
  var FrameworkConfiguration: MemberFrameworkConfiguration = js.native
  /**
    * 
    */
  var LogPublishingConfiguration: js.UndefOr[MemberLogPublishingConfiguration] = js.native
  /**
    * The name of the member.
    */
  var Name: NetworkMemberNameString = js.native
}

object MemberConfiguration {
  @scala.inline
  def apply(
    FrameworkConfiguration: MemberFrameworkConfiguration,
    Name: NetworkMemberNameString,
    Description: DescriptionString = null,
    LogPublishingConfiguration: MemberLogPublishingConfiguration = null
  ): MemberConfiguration = {
    val __obj = js.Dynamic.literal(FrameworkConfiguration = FrameworkConfiguration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LogPublishingConfiguration != null) __obj.updateDynamic("LogPublishingConfiguration")(LogPublishingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberConfiguration]
  }
}

