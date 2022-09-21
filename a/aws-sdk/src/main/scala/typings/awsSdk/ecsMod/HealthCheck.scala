package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthCheck extends StObject {
  
  /**
    * A string array representing the command that the container runs to determine if it is healthy. The string array must start with CMD to run the command arguments directly, or CMD-SHELL to run the command with the container's default shell.   When you use the Amazon Web Services Management Console JSON panel, the Command Line Interface, or the APIs, enclose the list of commands in brackets.  [ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]  You don't need to include the brackets when you use the Amazon Web Services Management Console.   "CMD-SHELL", "curl -f http://localhost/ || exit 1"   An exit code of 0 indicates success, and non-zero exit code indicates failure. For more information, see HealthCheck in the Create a container section of the Docker Remote API.
    */
  var command: StringList
  
  /**
    * The time period in seconds between each health check execution. You may specify between 5 and 300 seconds. The default value is 30 seconds.
    */
  var interval: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The number of times to retry a failed health check before the container is considered unhealthy. You may specify between 1 and 10 retries. The default value is 3.
    */
  var retries: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The optional grace period to provide containers time to bootstrap before failed health checks count towards the maximum number of retries. You can specify between 0 and 300 seconds. By default, the startPeriod is disabled.  If a health check succeeds within the startPeriod, then the container is considered healthy and any subsequent failures count toward the maximum number of retries. 
    */
  var startPeriod: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The time period in seconds to wait for a health check to succeed before it is considered a failure. You may specify between 2 and 60 seconds. The default value is 5.
    */
  var timeout: js.UndefOr[BoxedInteger] = js.undefined
}
object HealthCheck {
  
  inline def apply(command: StringList): HealthCheck = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheck]
  }
  
  extension [Self <: HealthCheck](x: Self) {
    
    inline def setCommand(value: StringList): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value*))
    
    inline def setInterval(value: BoxedInteger): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setRetries(value: BoxedInteger): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    
    inline def setStartPeriod(value: BoxedInteger): Self = StObject.set(x, "startPeriod", value.asInstanceOf[js.Any])
    
    inline def setStartPeriodUndefined: Self = StObject.set(x, "startPeriod", js.undefined)
    
    inline def setTimeout(value: BoxedInteger): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
