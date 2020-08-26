package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroup extends js.Object {
  /**
    * Indicates whether this option group can be applied to both VPC and non-VPC instances. The value true indicates the option group can be applied to both VPC and non-VPC instances. 
    */
  var AllowsVpcAndNonVpcInstanceMemberships: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the name of the engine that this option group can be applied to.
    */
  var EngineName: js.UndefOr[String] = js.native
  /**
    * Indicates the major engine version associated with this option group.
    */
  var MajorEngineVersion: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the option group.
    */
  var OptionGroupArn: js.UndefOr[String] = js.native
  /**
    * Provides a description of the option group.
    */
  var OptionGroupDescription: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the option group.
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  /**
    * Indicates what options are available in the option group.
    */
  var Options: js.UndefOr[OptionsList] = js.native
  /**
    * If AllowsVpcAndNonVpcInstanceMemberships is false, this field is blank. If AllowsVpcAndNonVpcInstanceMemberships is true and this field is blank, then this option group can be applied to both VPC and non-VPC instances. If this field contains a value, then this option group can only be applied to instances that are in the VPC indicated by this field. 
    */
  var VpcId: js.UndefOr[String] = js.native
}

object OptionGroup {
  @scala.inline
  def apply(): OptionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionGroup]
  }
  @scala.inline
  implicit class OptionGroupOps[Self <: OptionGroup] (val x: Self) extends AnyVal {
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
    def setAllowsVpcAndNonVpcInstanceMemberships(value: Boolean): Self = this.set("AllowsVpcAndNonVpcInstanceMemberships", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowsVpcAndNonVpcInstanceMemberships: Self = this.set("AllowsVpcAndNonVpcInstanceMemberships", js.undefined)
    @scala.inline
    def setEngineName(value: String): Self = this.set("EngineName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineName: Self = this.set("EngineName", js.undefined)
    @scala.inline
    def setMajorEngineVersion(value: String): Self = this.set("MajorEngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorEngineVersion: Self = this.set("MajorEngineVersion", js.undefined)
    @scala.inline
    def setOptionGroupArn(value: String): Self = this.set("OptionGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionGroupArn: Self = this.set("OptionGroupArn", js.undefined)
    @scala.inline
    def setOptionGroupDescription(value: String): Self = this.set("OptionGroupDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionGroupDescription: Self = this.set("OptionGroupDescription", js.undefined)
    @scala.inline
    def setOptionGroupName(value: String): Self = this.set("OptionGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionGroupName: Self = this.set("OptionGroupName", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: Option*): Self = this.set("Options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: OptionsList): Self = this.set("Options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("Options", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

