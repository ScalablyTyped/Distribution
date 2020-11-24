package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationVersionLifecycleConfig extends js.Object {
  
  /**
    * Specify a max age rule to restrict the length of time that application versions are retained for an application.
    */
  var MaxAgeRule: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.MaxAgeRule] = js.native
  
  /**
    * Specify a max count rule to restrict the number of application versions that are retained for an application.
    */
  var MaxCountRule: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.MaxCountRule] = js.native
}
object ApplicationVersionLifecycleConfig {
  
  @scala.inline
  def apply(): ApplicationVersionLifecycleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationVersionLifecycleConfig]
  }
  
  @scala.inline
  implicit class ApplicationVersionLifecycleConfigOps[Self <: ApplicationVersionLifecycleConfig] (val x: Self) extends AnyVal {
    
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
    def setMaxAgeRule(value: MaxAgeRule): Self = this.set("MaxAgeRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAgeRule: Self = this.set("MaxAgeRule", js.undefined)
    
    @scala.inline
    def setMaxCountRule(value: MaxCountRule): Self = this.set("MaxCountRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCountRule: Self = this.set("MaxCountRule", js.undefined)
  }
}
