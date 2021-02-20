package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationResourceLifecycleConfig extends StObject {
  
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
  implicit class ApplicationResourceLifecycleConfigMutableBuilder[Self <: ApplicationResourceLifecycleConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceRole(value: String): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleUndefined: Self = StObject.set(x, "ServiceRole", js.undefined)
    
    @scala.inline
    def setVersionLifecycleConfig(value: ApplicationVersionLifecycleConfig): Self = StObject.set(x, "VersionLifecycleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionLifecycleConfigUndefined: Self = StObject.set(x, "VersionLifecycleConfig", js.undefined)
  }
}
