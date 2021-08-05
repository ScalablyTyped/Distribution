package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationResourceLifecycleConfig extends StObject {
  
  /**
    * The ARN of an IAM service role that Elastic Beanstalk has permission to assume. The ServiceRole property is required the first time that you provide a VersionLifecycleConfig for the application in one of the supporting calls (CreateApplication or UpdateApplicationResourceLifecycle). After you provide it once, in either one of the calls, Elastic Beanstalk persists the Service Role with the application, and you don't need to specify it again in subsequent UpdateApplicationResourceLifecycle calls. You can, however, specify it in subsequent calls to change the Service Role to another value.
    */
  var ServiceRole: js.UndefOr[String] = js.undefined
  
  /**
    * Defines lifecycle settings for application versions.
    */
  var VersionLifecycleConfig: js.UndefOr[ApplicationVersionLifecycleConfig] = js.undefined
}
object ApplicationResourceLifecycleConfig {
  
  inline def apply(): ApplicationResourceLifecycleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationResourceLifecycleConfig]
  }
  
  extension [Self <: ApplicationResourceLifecycleConfig](x: Self) {
    
    inline def setServiceRole(value: String): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleUndefined: Self = StObject.set(x, "ServiceRole", js.undefined)
    
    inline def setVersionLifecycleConfig(value: ApplicationVersionLifecycleConfig): Self = StObject.set(x, "VersionLifecycleConfig", value.asInstanceOf[js.Any])
    
    inline def setVersionLifecycleConfigUndefined: Self = StObject.set(x, "VersionLifecycleConfig", js.undefined)
  }
}
