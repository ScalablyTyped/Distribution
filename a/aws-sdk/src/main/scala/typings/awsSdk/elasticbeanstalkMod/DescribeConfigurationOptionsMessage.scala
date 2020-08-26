package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationOptionsMessage extends js.Object {
  /**
    * The name of the application associated with the configuration template or environment. Only needed if you want to describe the configuration options associated with either the configuration template or environment.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  /**
    * The name of the environment whose configuration options you want to describe.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * If specified, restricts the descriptions to only the specified options.
    */
  var Options: js.UndefOr[OptionsSpecifierList] = js.native
  /**
    * The ARN of the custom platform.
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  /**
    * The name of the solution stack whose configuration options you want to describe.
    */
  var SolutionStackName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
  /**
    * The name of the configuration template whose configuration options you want to describe.
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.native
}

object DescribeConfigurationOptionsMessage {
  @scala.inline
  def apply(): DescribeConfigurationOptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationOptionsMessage]
  }
  @scala.inline
  implicit class DescribeConfigurationOptionsMessageOps[Self <: DescribeConfigurationOptionsMessage] (val x: Self) extends AnyVal {
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
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationName: Self = this.set("ApplicationName", js.undefined)
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = this.set("EnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentName: Self = this.set("EnvironmentName", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: OptionSpecification*): Self = this.set("Options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: OptionsSpecifierList): Self = this.set("Options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("Options", js.undefined)
    @scala.inline
    def setPlatformArn(value: PlatformArn): Self = this.set("PlatformArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformArn: Self = this.set("PlatformArn", js.undefined)
    @scala.inline
    def setSolutionStackName(value: SolutionStackName): Self = this.set("SolutionStackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolutionStackName: Self = this.set("SolutionStackName", js.undefined)
    @scala.inline
    def setTemplateName(value: ConfigurationTemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateName: Self = this.set("TemplateName", js.undefined)
  }
  
}

