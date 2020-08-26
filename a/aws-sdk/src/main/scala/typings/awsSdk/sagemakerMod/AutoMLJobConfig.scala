package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLJobConfig extends js.Object {
  /**
    * How long a job is allowed to run, or how many candidates a job is allowed to generate.
    */
  var CompletionCriteria: js.UndefOr[AutoMLJobCompletionCriteria] = js.native
  /**
    * Security configuration for traffic encryption or Amazon VPC settings.
    */
  var SecurityConfig: js.UndefOr[AutoMLSecurityConfig] = js.native
}

object AutoMLJobConfig {
  @scala.inline
  def apply(): AutoMLJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLJobConfig]
  }
  @scala.inline
  implicit class AutoMLJobConfigOps[Self <: AutoMLJobConfig] (val x: Self) extends AnyVal {
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
    def setCompletionCriteria(value: AutoMLJobCompletionCriteria): Self = this.set("CompletionCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletionCriteria: Self = this.set("CompletionCriteria", js.undefined)
    @scala.inline
    def setSecurityConfig(value: AutoMLSecurityConfig): Self = this.set("SecurityConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityConfig: Self = this.set("SecurityConfig", js.undefined)
  }
  
}

