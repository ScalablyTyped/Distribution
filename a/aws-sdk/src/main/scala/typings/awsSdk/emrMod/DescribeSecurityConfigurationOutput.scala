package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSecurityConfigurationOutput extends js.Object {
  /**
    * The date and time the security configuration was created
    */
  var CreationDateTime: js.UndefOr[Date] = js.native
  /**
    * The name of the security configuration.
    */
  var Name: js.UndefOr[XmlString] = js.native
  /**
    * The security configuration details in JSON format.
    */
  var SecurityConfiguration: js.UndefOr[String] = js.native
}

object DescribeSecurityConfigurationOutput {
  @scala.inline
  def apply(): DescribeSecurityConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecurityConfigurationOutput]
  }
  @scala.inline
  implicit class DescribeSecurityConfigurationOutputOps[Self <: DescribeSecurityConfigurationOutput] (val x: Self) extends AnyVal {
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
    def setCreationDateTime(value: Date): Self = this.set("CreationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDateTime: Self = this.set("CreationDateTime", js.undefined)
    @scala.inline
    def setName(value: XmlString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setSecurityConfiguration(value: String): Self = this.set("SecurityConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityConfiguration: Self = this.set("SecurityConfiguration", js.undefined)
  }
  
}

