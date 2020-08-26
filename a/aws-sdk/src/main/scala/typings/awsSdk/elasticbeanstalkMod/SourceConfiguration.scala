package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceConfiguration extends js.Object {
  /**
    * The name of the application associated with the configuration.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  /**
    * The name of the configuration template.
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.native
}

object SourceConfiguration {
  @scala.inline
  def apply(): SourceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceConfiguration]
  }
  @scala.inline
  implicit class SourceConfigurationOps[Self <: SourceConfiguration] (val x: Self) extends AnyVal {
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
    def setTemplateName(value: ConfigurationTemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateName: Self = this.set("TemplateName", js.undefined)
  }
  
}

