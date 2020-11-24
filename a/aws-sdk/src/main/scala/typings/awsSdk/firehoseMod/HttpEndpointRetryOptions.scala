package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpEndpointRetryOptions extends js.Object {
  
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
  implicit class HttpEndpointRetryOptionsOps[Self <: HttpEndpointRetryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDurationInSeconds(value: HttpEndpointRetryDurationInSeconds): Self = this.set("DurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationInSeconds: Self = this.set("DurationInSeconds", js.undefined)
  }
}
