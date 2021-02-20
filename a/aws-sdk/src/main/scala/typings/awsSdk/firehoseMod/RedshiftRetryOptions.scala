package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftRetryOptions extends StObject {
  
  /**
    * The length of time during which Kinesis Data Firehose retries delivery after a failure, starting from the initial request and including the first attempt. The default value is 3600 seconds (60 minutes). Kinesis Data Firehose does not retry if the value of DurationInSeconds is 0 (zero) or if the first delivery attempt takes longer than the current value.
    */
  var DurationInSeconds: js.UndefOr[RedshiftRetryDurationInSeconds] = js.native
}
object RedshiftRetryOptions {
  
  @scala.inline
  def apply(): RedshiftRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedshiftRetryOptions]
  }
  
  @scala.inline
  implicit class RedshiftRetryOptionsMutableBuilder[Self <: RedshiftRetryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationInSeconds(value: RedshiftRetryDurationInSeconds): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInSecondsUndefined: Self = StObject.set(x, "DurationInSeconds", js.undefined)
  }
}
