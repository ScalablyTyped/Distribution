package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpEndpointRetryOptions extends StObject {
  
  /**
    * The total amount of time that Kinesis Data Firehose spends on retries. This duration starts after the initial attempt to send data to the custom destination via HTTPS endpoint fails. It doesn't include the periods during which Kinesis Data Firehose waits for acknowledgment from the specified destination after each attempt. 
    */
  var DurationInSeconds: js.UndefOr[HttpEndpointRetryDurationInSeconds] = js.native
}
object HttpEndpointRetryOptions {
  
  @scala.inline
  def apply(): HttpEndpointRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpEndpointRetryOptions]
  }
  
  @scala.inline
  implicit class HttpEndpointRetryOptionsMutableBuilder[Self <: HttpEndpointRetryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationInSeconds(value: HttpEndpointRetryDurationInSeconds): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInSecondsUndefined: Self = StObject.set(x, "DurationInSeconds", js.undefined)
  }
}
