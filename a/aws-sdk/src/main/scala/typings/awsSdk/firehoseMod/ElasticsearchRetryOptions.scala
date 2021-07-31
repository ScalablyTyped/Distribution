package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticsearchRetryOptions extends StObject {
  
  /**
    * After an initial failure to deliver to Amazon ES, the total amount of time during which Kinesis Data Firehose retries delivery (including the first attempt). After this time has elapsed, the failed documents are written to Amazon S3. Default value is 300 seconds (5 minutes). A value of 0 (zero) results in no retries.
    */
  var DurationInSeconds: js.UndefOr[ElasticsearchRetryDurationInSeconds] = js.undefined
}
object ElasticsearchRetryOptions {
  
  @scala.inline
  def apply(): ElasticsearchRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticsearchRetryOptions]
  }
  
  @scala.inline
  implicit class ElasticsearchRetryOptionsMutableBuilder[Self <: ElasticsearchRetryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationInSeconds(value: ElasticsearchRetryDurationInSeconds): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInSecondsUndefined: Self = StObject.set(x, "DurationInSeconds", js.undefined)
  }
}
