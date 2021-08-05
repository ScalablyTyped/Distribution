package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationResourceLifecycleMessage extends StObject {
  
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName
  
  /**
    * The lifecycle configuration.
    */
  var ResourceLifecycleConfig: ApplicationResourceLifecycleConfig
}
object UpdateApplicationResourceLifecycleMessage {
  
  inline def apply(ApplicationName: ApplicationName, ResourceLifecycleConfig: ApplicationResourceLifecycleConfig): UpdateApplicationResourceLifecycleMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], ResourceLifecycleConfig = ResourceLifecycleConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationResourceLifecycleMessage]
  }
  
  extension [Self <: UpdateApplicationResourceLifecycleMessage](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setResourceLifecycleConfig(value: ApplicationResourceLifecycleConfig): Self = StObject.set(x, "ResourceLifecycleConfig", value.asInstanceOf[js.Any])
  }
}
