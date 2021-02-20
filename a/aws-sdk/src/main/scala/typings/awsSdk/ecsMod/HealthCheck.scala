package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthCheck extends StObject {
  
  /**
    * A string array representing the command that the container runs to determine if it is healthy. The string array must start with CMD to execute the command arguments directly, or CMD-SHELL to run the command with the container's default shell. For example:  [ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]  An exit code of 0 indicates success, and non-zero exit code indicates failure. For more information, see HealthCheck in the Create a container section of the Docker Remote API.
    */
  var command: StringList = js.native
  
  /**
    * The time period in seconds between each health check execution. You may specify between 5 and 300 seconds. The default value is 30 seconds.
    */
  var interval: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * The number of times to retry a failed health check before the container is considered unhealthy. You may specify between 1 and 10 retries. The default value is 3.
    */
  var retries: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * The optional grace period within which to provide containers time to bootstrap before failed health checks count towards the maximum number of retries. You may specify between 0 and 300 seconds. The startPeriod is disabled by default.  If a health check succeeds within the startPeriod, then the container is considered healthy and any subsequent failures count toward the maximum number of retries. 
    */
  var startPeriod: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * The time period in seconds to wait for a health check to succeed before it is considered a failure. You may specify between 2 and 60 seconds. The default value is 5.
    */
  var timeout: js.UndefOr[BoxedInteger] = js.native
}
object HealthCheck {
  
  @scala.inline
  def apply(command: StringList): HealthCheck = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheck]
  }
  
  @scala.inline
  implicit class HealthCheckMutableBuilder[Self <: HealthCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: StringList): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value :_*))
    
    @scala.inline
    def setInterval(value: BoxedInteger): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setRetries(value: BoxedInteger): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    
    @scala.inline
    def setStartPeriod(value: BoxedInteger): Self = StObject.set(x, "startPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPeriodUndefined: Self = StObject.set(x, "startPeriod", js.undefined)
    
    @scala.inline
    def setTimeout(value: BoxedInteger): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
