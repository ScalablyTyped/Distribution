package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationResourceLifecycleConfig extends js.Object {
  
  /**
    * The ARN of an IAM service role that Elastic Beanstalk has permission to assume. The ServiceRole property is required the first time that you provide a VersionLifecycleConfig for the application in one of the supporting calls (CreateApplication or UpdateApplicationResourceLifecycle). After you provide it once, in either one of the calls, Elastic Beanstalk persists the Service Role with the application, and you don't need to specify it again in subsequent UpdateApplicationResourceLifecycle calls. You can, however, specify it in subsequent calls to change the Service Role to another value.
    */
  var ServiceRole: js.UndefOr[String] = js.native
  
  /**
    * Defines lifecycle settings for application versions.
    */
  var VersionLifecycleConfig: js.UndefOr[ApplicationVersionLifecycleConfig] = js.native
}
object ApplicationResourceLifecycleConfig {
  
  @scala.inline
  def apply(): ApplicationResourceLifecycleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationResourceLifecycleConfig]
  }
  
  @scala.inline
  implicit class ApplicationResourceLifecycleConfigOps[Self <: ApplicationResourceLifecycleConfig] (val x: Self) extends AnyVal {
    
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
    def setServiceRole(value: String): Self = this.set("ServiceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceRole: Self = this.set("ServiceRole", js.undefined)
    
    @scala.inline
    def setVersionLifecycleConfig(value: ApplicationVersionLifecycleConfig): Self = this.set("VersionLifecycleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionLifecycleConfig: Self = this.set("VersionLifecycleConfig", js.undefined)
  }
}
