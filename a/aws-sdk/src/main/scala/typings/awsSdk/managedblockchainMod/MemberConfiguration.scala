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
  def apply(FrameworkConfiguration: MemberFrameworkConfiguration, Name: NetworkMemberNameString): MemberConfiguration = {
    val __obj = js.Dynamic.literal(FrameworkConfiguration = FrameworkConfiguration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberConfiguration]
  }
  @scala.inline
  implicit class MemberConfigurationOps[Self <: MemberConfiguration] (val x: Self) extends AnyVal {
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
    def setFrameworkConfiguration(value: MemberFrameworkConfiguration): Self = this.set("FrameworkConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: NetworkMemberNameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setLogPublishingConfiguration(value: MemberLogPublishingConfiguration): Self = this.set("LogPublishingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogPublishingConfiguration: Self = this.set("LogPublishingConfiguration", js.undefined)
  }
  
}

