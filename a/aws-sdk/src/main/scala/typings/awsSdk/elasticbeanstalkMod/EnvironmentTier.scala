package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentTier extends js.Object {
  /**
    * The name of this environment tier. Valid values:   For Web server tier – WebServer    For Worker tier – Worker   
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The type of this environment tier. Valid values:   For Web server tier – Standard    For Worker tier – SQS/HTTP   
    */
  var Type: js.UndefOr[String] = js.native
  /**
    * The version of this environment tier. When you don't set a value to it, Elastic Beanstalk uses the latest compatible worker tier version.  This member is deprecated. Any specific version that you set may become out of date. We recommend leaving it unspecified. 
    */
  var Version: js.UndefOr[String] = js.native
}

object EnvironmentTier {
  @scala.inline
  def apply(): EnvironmentTier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentTier]
  }
  @scala.inline
  implicit class EnvironmentTierOps[Self <: EnvironmentTier] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

